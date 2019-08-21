/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.ia.clientlibrary.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InputLink {

    @JacksonXmlProperty(isAttribute = true) private String name;
    @JacksonXmlProperty(isAttribute = true) private Integer order;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getOrder() { return order; }
    public void setOrder(Integer order) { this.order = order; }

    @Override
    public String toString() {
        return "{ \"name\": \"" + name
                + "\", \"order\": " + order
                + " }";
    }

}
