/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.relationships;

import org.odpi.egeria.connectors.ibm.igc.clientlibrary.IGCVersionEnum;

/**
 * Singleton to map the OMRS "AttributeForSchema" relationship between IGC "data_file_record" and "data_file_field" assets.
 */
public class AttributeForSchemaMapper_RecordField extends RelationshipMapping {

    private static class Singleton {
        private static final AttributeForSchemaMapper_RecordField INSTANCE = new AttributeForSchemaMapper_RecordField();
    }
    public static AttributeForSchemaMapper_RecordField getInstance(IGCVersionEnum version) {
        return Singleton.INSTANCE;
    }

    private AttributeForSchemaMapper_RecordField() {
        super(
                "data_file_record",
                "data_file_field",
                "data_file_fields",
                "data_file_record",
                "AttributeForSchema",
                "parentSchemas",
                "attributes"
        );
    }

}
