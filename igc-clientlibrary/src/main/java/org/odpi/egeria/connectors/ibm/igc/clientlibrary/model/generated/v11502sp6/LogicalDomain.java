/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.generated.v11502sp6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.annotation.Generated;
import org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * POJO for the {@code logical_domain} asset type in IGC, displayed as '{@literal Logical Domain}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("logical_domain")
public class LogicalDomain extends Reference {

    public static String getIgcTypeDisplayName() { return "Logical Domain"; }

    /**
     * The {@code name} property, displayed as '{@literal Name}' in the IGC UI.
     */
    protected String name;

    /**
     * The {@code short_description} property, displayed as '{@literal Short Description}' in the IGC UI.
     */
    protected String short_description;

    /**
     * The {@code long_description} property, displayed as '{@literal Long Description}' in the IGC UI.
     */
    protected String long_description;

    /**
     * The {@code logical_data_model} property, displayed as '{@literal Logical Data Model}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link LogicalDataModel} object.
     */
    protected Reference logical_data_model;

    /**
     * The {@code entity_attributes} property, displayed as '{@literal Entity Attributes}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link EntityAttribute} objects.
     */
    protected ReferenceList entity_attributes;

    /**
     * The {@code parent_domain} property, displayed as '{@literal Parent Domain}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link LogicalDomain} object.
     */
    protected Reference parent_domain;

    /**
     * The {@code child_domains} property, displayed as '{@literal Child Domains}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link LogicalDomain} objects.
     */
    protected ReferenceList child_domains;

    /**
     * The {@code data_type} property, displayed as '{@literal Data Type}' in the IGC UI.
     */
    protected String data_type;

    /**
     * The {@code native_type} property, displayed as '{@literal Native Type}' in the IGC UI.
     */
    protected String native_type;

    /**
     * The {@code default_value} property, displayed as '{@literal Default Value}' in the IGC UI.
     */
    protected String default_value;

    /**
     * The {@code null_value} property, displayed as '{@literal Null Value}' in the IGC UI.
     */
    protected String null_value;

    /**
     * The {@code length} property, displayed as '{@literal Length}' in the IGC UI.
     */
    protected Number length;

    /**
     * The {@code scale} property, displayed as '{@literal Scale}' in the IGC UI.
     */
    protected Number scale;

    /**
     * The {@code created_by} property, displayed as '{@literal Created By}' in the IGC UI.
     */
    protected String created_by;

    /**
     * The {@code created_on} property, displayed as '{@literal Created On}' in the IGC UI.
     */
    protected Date created_on;

    /**
     * The {@code modified_by} property, displayed as '{@literal Modified By}' in the IGC UI.
     */
    protected String modified_by;

    /**
     * The {@code modified_on} property, displayed as '{@literal Modified On}' in the IGC UI.
     */
    protected Date modified_on;


    /** @see #name */ @JsonProperty("name")  public String getTheName() { return this.name; }
    /** @see #name */ @JsonProperty("name")  public void setTheName(String name) { this.name = name; }

    /** @see #short_description */ @JsonProperty("short_description")  public String getShortDescription() { return this.short_description; }
    /** @see #short_description */ @JsonProperty("short_description")  public void setShortDescription(String short_description) { this.short_description = short_description; }

    /** @see #long_description */ @JsonProperty("long_description")  public String getLongDescription() { return this.long_description; }
    /** @see #long_description */ @JsonProperty("long_description")  public void setLongDescription(String long_description) { this.long_description = long_description; }

    /** @see #logical_data_model */ @JsonProperty("logical_data_model")  public Reference getLogicalDataModel() { return this.logical_data_model; }
    /** @see #logical_data_model */ @JsonProperty("logical_data_model")  public void setLogicalDataModel(Reference logical_data_model) { this.logical_data_model = logical_data_model; }

    /** @see #entity_attributes */ @JsonProperty("entity_attributes")  public ReferenceList getEntityAttributes() { return this.entity_attributes; }
    /** @see #entity_attributes */ @JsonProperty("entity_attributes")  public void setEntityAttributes(ReferenceList entity_attributes) { this.entity_attributes = entity_attributes; }

    /** @see #parent_domain */ @JsonProperty("parent_domain")  public Reference getParentDomain() { return this.parent_domain; }
    /** @see #parent_domain */ @JsonProperty("parent_domain")  public void setParentDomain(Reference parent_domain) { this.parent_domain = parent_domain; }

    /** @see #child_domains */ @JsonProperty("child_domains")  public ReferenceList getChildDomains() { return this.child_domains; }
    /** @see #child_domains */ @JsonProperty("child_domains")  public void setChildDomains(ReferenceList child_domains) { this.child_domains = child_domains; }

    /** @see #data_type */ @JsonProperty("data_type")  public String getDataType() { return this.data_type; }
    /** @see #data_type */ @JsonProperty("data_type")  public void setDataType(String data_type) { this.data_type = data_type; }

    /** @see #native_type */ @JsonProperty("native_type")  public String getNativeType() { return this.native_type; }
    /** @see #native_type */ @JsonProperty("native_type")  public void setNativeType(String native_type) { this.native_type = native_type; }

    /** @see #default_value */ @JsonProperty("default_value")  public String getDefaultValue() { return this.default_value; }
    /** @see #default_value */ @JsonProperty("default_value")  public void setDefaultValue(String default_value) { this.default_value = default_value; }

    /** @see #null_value */ @JsonProperty("null_value")  public String getNullValue() { return this.null_value; }
    /** @see #null_value */ @JsonProperty("null_value")  public void setNullValue(String null_value) { this.null_value = null_value; }

    /** @see #length */ @JsonProperty("length")  public Number getLength() { return this.length; }
    /** @see #length */ @JsonProperty("length")  public void setLength(Number length) { this.length = length; }

    /** @see #scale */ @JsonProperty("scale")  public Number getScale() { return this.scale; }
    /** @see #scale */ @JsonProperty("scale")  public void setScale(Number scale) { this.scale = scale; }

    /** @see #created_by */ @JsonProperty("created_by")  public String getCreatedBy() { return this.created_by; }
    /** @see #created_by */ @JsonProperty("created_by")  public void setCreatedBy(String created_by) { this.created_by = created_by; }

    /** @see #created_on */ @JsonProperty("created_on")  public Date getCreatedOn() { return this.created_on; }
    /** @see #created_on */ @JsonProperty("created_on")  public void setCreatedOn(Date created_on) { this.created_on = created_on; }

    /** @see #modified_by */ @JsonProperty("modified_by")  public String getModifiedBy() { return this.modified_by; }
    /** @see #modified_by */ @JsonProperty("modified_by")  public void setModifiedBy(String modified_by) { this.modified_by = modified_by; }

    /** @see #modified_on */ @JsonProperty("modified_on")  public Date getModifiedOn() { return this.modified_on; }
    /** @see #modified_on */ @JsonProperty("modified_on")  public void setModifiedOn(Date modified_on) { this.modified_on = modified_on; }

    public static Boolean canBeCreated() { return false; }
    public static Boolean includesModificationDetails() { return true; }
    private static final List<String> NON_RELATIONAL_PROPERTIES = Arrays.asList(
        "name",
        "short_description",
        "long_description",
        "data_type",
        "native_type",
        "default_value",
        "null_value",
        "length",
        "scale",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    private static final List<String> STRING_PROPERTIES = Arrays.asList(
        "name",
        "short_description",
        "long_description",
        "data_type",
        "native_type",
        "default_value",
        "null_value",
        "created_by",
        "modified_by"
    );
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = Arrays.asList(
        "entity_attributes",
        "child_domains"
    );
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "name",
        "short_description",
        "long_description",
        "logical_data_model",
        "entity_attributes",
        "parent_domain",
        "child_domains",
        "data_type",
        "native_type",
        "default_value",
        "null_value",
        "length",
        "scale",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isLogicalDomain(Object obj) { return (obj.getClass() == LogicalDomain.class); }

}
