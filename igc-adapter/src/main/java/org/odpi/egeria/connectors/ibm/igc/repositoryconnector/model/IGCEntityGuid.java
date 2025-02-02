/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.repositoryconnector.model;

import java.util.Objects;

/**
 * Captures the meaning and translation of the various components of an IGC entity's GUID.
 *
 * This is necessary as internally IGC only uses a Repository ID ("RID") that is unique within a single instance of
 * IGC -- but not globally unique.  As these are not proper GUIDs, we need to provide a mechanism to automatically
 * ensure these are GUIDs with minimal impact on persistence, etc.
 *
 * Furthermore, there are some types in OMRS that have no separate type in IGC, but are rather generated by a type in
 * IGC that is already used for another OMRS type.  For these, we need to add a further prefix to ensure the GUID for
 * the generated entity from IGC is unique from the non-generated entity.
 *
 * Finally, given we are already embedding meaning such as that above in the GUID, for optimization purposes we have
 * decided to also encode the IGC data type into the GUID.  This will allow faster lookups of the IGC entities when
 * receiving a GUID vs. needing to first lookup the GUID to determine its type and only then be able to run another
 * query to retrieve all the properties relevant to that type.
 */
public class IGCEntityGuid extends IGCGuidHeader {

    private static final String GENERATED_TYPE_POSTFIX = "!";
    private static final String IGC_TYPE_POSTFIX = "@";

    private String assetType;
    private String generatedPrefix;
    private String rid;

    /**
     * Create a new IGC GUID that has no generated prefix (for an OMRS entity type that exists in IGC and is not
     * generated)
     *
     * @param metadataCollectionId the metadata collection ID of the IGC repository
     * @param assetType the IGC asset type
     * @param rid the Repository ID (RID) of the IGC asset
     */
    public IGCEntityGuid(String metadataCollectionId, String assetType, String rid) {
        this(metadataCollectionId, assetType, null, rid);
    }

    /**
     * Create a new IGC GUID that has a prefix (for an OMRS entity type that does not actually exist in IGC but is
     * generated from another entity type in IGC)
     *
     * @param metadataCollectionId the metadata collection ID of the IGC repository
     * @param assetType the IGC asset type
     * @param prefix the prefix to use to uniquely identify this generated entity's GUID
     * @param rid the Repository ID (RID) of the IGC asset
     */
    public IGCEntityGuid(String metadataCollectionId, String assetType, String prefix, String rid) {
        super(metadataCollectionId);
        this.assetType = assetType;
        this.generatedPrefix = prefix;
        this.rid = rid;
    }

    /**
     * Turn this IGC GUID into a unique String representation of the GUID.
     *
     * @return String
     */
    public String asGuid() {
        return toString();
    }

    /**
     * Turn this IGC GUID into a unique String representation of the GUID.
     *
     * The string representation will be something like the following:
     * {@literal database_schema@5e74232d-92df-4b81-a401-b100dbfea73a:RDBST!6662c0f2.ee6a64fe.o1h6eveh1.gbvjvq0.ols3j6.0oadmdn8gknhjvmojr3pt}
     *
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(assetType);
        sb.append(IGC_TYPE_POSTFIX);
        sb.append(super.toString());
        if (generatedPrefix != null) {
            sb.append(generatedPrefix);
            sb.append(GENERATED_TYPE_POSTFIX);
        }
        sb.append(rid);
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof IGCEntityGuid)) return false;
        IGCEntityGuid that = (IGCEntityGuid) obj;
        return Objects.equals(getMetadataCollectionId(), that.getMetadataCollectionId()) &&
                Objects.equals(getAssetType(), that.getAssetType()) &&
                Objects.equals(getGeneratedPrefix(), that.getGeneratedPrefix()) &&
                Objects.equals(getRid(), that.getRid());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(getMetadataCollectionId(), getAssetType(), getGeneratedPrefix(), getRid());
    }

    /**
     * Attempt to create a new IGC GUID from the provided GUID.
     *
     * @param guid the IGC GUID representation of the provided GUID, or null if it does not appear to be a valid IGC GUID
     */
    public static IGCEntityGuid fromGuid(String guid) {

        if (guid == null) {
            return null;
        }

        int indexOfTypePostfix = guid.indexOf(IGC_TYPE_POSTFIX);
        int indexOfMetadataColPostfix = guid.indexOf(METADATA_COL_POSTFIX);

        if (indexOfTypePostfix > 0 && indexOfMetadataColPostfix > indexOfTypePostfix) {
            String assetType = guid.substring(0, indexOfTypePostfix);
            String metadataCollectionId = guid.substring(indexOfTypePostfix + 1, indexOfMetadataColPostfix);
            String rid;
            String generatedPrefix = null;
            int indexOfGeneratedPostfix = guid.indexOf(GENERATED_TYPE_POSTFIX);
            if (indexOfGeneratedPostfix > indexOfMetadataColPostfix) {
                generatedPrefix = guid.substring(indexOfMetadataColPostfix + 1, indexOfGeneratedPostfix);
                rid = guid.substring(indexOfGeneratedPostfix + 1);
            } else {
                rid = guid.substring(indexOfMetadataColPostfix + 1);
            }
            return new IGCEntityGuid(metadataCollectionId, assetType, generatedPrefix, rid);
        }

        return null;

    }

    /**
     * Retrieve the IGC asset type component of this IGC GUID.
     *
     * @return String
     */
    public String getAssetType() { return assetType; }

    /**
     * Retrieve the generated prefix component of this IGC GUID, if it is for a generated entity (or null if the entity
     * is not generated).
     *
     * @return String
     */
    public String getGeneratedPrefix() { return generatedPrefix; }

    /**
     * Indicates whether this IGC GUID represents a generated entity (true) or not (false).
     *
     * @return boolean
     */
    public boolean isGeneratedEntityGuid() { return generatedPrefix != null; }

    /**
     * Retrieve the IGC Repository ID (RID) component of this IGC GUID.
     *
     * @return String
     */
    public String getRid() { return rid; }

}
