/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.relationships;

import org.odpi.egeria.connectors.ibm.igc.clientlibrary.IGCVersionEnum;

/**
 * Singleton to map the OMRS "ConnectionToAssetMapper" relationship between IGC "data_connection" and "data_file_folder" assets.
 */
public class ConnectionToAssetMapper_FileFolder extends RelationshipMapping {

    private static class Singleton {
        private static final ConnectionToAssetMapper_FileFolder INSTANCE = new ConnectionToAssetMapper_FileFolder();
    }
    public static ConnectionToAssetMapper_FileFolder getInstance(IGCVersionEnum version) {
        return Singleton.INSTANCE;
    }

    private ConnectionToAssetMapper_FileFolder() {
        super(
                "data_connection",
                "data_file_folder",
                "",
                "data_connection",
                "ConnectionToAsset",
                "connections",
                "asset"
        );
        // There is no way to traverse the relationship from data_connection, so ensure that any relationship
        // mapping starts from the second proxy (the data_file_folder)
        setOptimalStart(OptimalStart.TWO);
    }

}
