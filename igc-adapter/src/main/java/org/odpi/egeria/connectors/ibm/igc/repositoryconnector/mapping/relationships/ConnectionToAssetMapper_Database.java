/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.relationships;

import org.odpi.egeria.connectors.ibm.igc.clientlibrary.IGCVersionEnum;

/**
 * Singleton to map the OMRS "ConnectionToAsset" relationship between IGC "data_connection" and "database" assets.
 */
public class ConnectionToAssetMapper_Database extends RelationshipMapping {

    private static class Singleton {
        private static final ConnectionToAssetMapper_Database INSTANCE = new ConnectionToAssetMapper_Database();
    }
    public static ConnectionToAssetMapper_Database getInstance(IGCVersionEnum version) {
        return Singleton.INSTANCE;
    }

    private ConnectionToAssetMapper_Database() {
        super(
                "data_connection",
                "database",
                "imports_database",
                "data_connections",
                "ConnectionToAsset",
                "connections",
                "asset"
        );
    }

}
