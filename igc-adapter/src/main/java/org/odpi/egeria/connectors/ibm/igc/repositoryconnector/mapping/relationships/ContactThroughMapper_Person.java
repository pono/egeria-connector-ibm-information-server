/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.relationships;

import org.odpi.egeria.connectors.ibm.igc.clientlibrary.IGCVersionEnum;
import org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.entities.ContactDetailsMapper;

/**
 * Singleton to map the OMRS "ContactThrough" relationship for IGC "user" assets.
 */
public class ContactThroughMapper_Person extends RelationshipMapping {

    private static class Singleton {
        private static final ContactThroughMapper_Person INSTANCE = new ContactThroughMapper_Person();
    }
    public static ContactThroughMapper_Person getInstance(IGCVersionEnum version) {
        return Singleton.INSTANCE;
    }

    private ContactThroughMapper_Person() {
        super(
                "user",
                "user",
                SELF_REFERENCE_SENTINEL,
                SELF_REFERENCE_SENTINEL,
                "ContactThrough",
                "contactDetails",
                "contacts",
                null,
                ContactDetailsMapper.IGC_RID_PREFIX
        );
    }

}
