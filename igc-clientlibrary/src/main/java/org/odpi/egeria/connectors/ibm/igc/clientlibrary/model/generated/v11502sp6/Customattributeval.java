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
 * POJO for the {@code customattributeval} asset type in IGC, displayed as '{@literal CustomAttributeVal}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("customattributeval")
public class Customattributeval extends Reference {

    public static String getIgcTypeDisplayName() { return "CustomAttributeVal"; }

    /**
     * The {@code x_custom_attribute_name} property, displayed as '{@literal X Custom Attribute Name}' in the IGC UI.
     */
    protected String x_custom_attribute_name;

    /**
     * The {@code value} property, displayed as '{@literal Value}' in the IGC UI.
     */
    protected String value;


    /** @see #x_custom_attribute_name */ @JsonProperty("x_custom_attribute_name")  public String getXCustomAttributeName() { return this.x_custom_attribute_name; }
    /** @see #x_custom_attribute_name */ @JsonProperty("x_custom_attribute_name")  public void setXCustomAttributeName(String x_custom_attribute_name) { this.x_custom_attribute_name = x_custom_attribute_name; }

    /** @see #value */ @JsonProperty("value")  public String getValue() { return this.value; }
    /** @see #value */ @JsonProperty("value")  public void setValue(String value) { this.value = value; }

    public static Boolean canBeCreated() { return false; }
    public static Boolean includesModificationDetails() { return false; }
    private static final List<String> NON_RELATIONAL_PROPERTIES = Arrays.asList(
        "x_custom_attribute_name",
        "value"
    );
    private static final List<String> STRING_PROPERTIES = Arrays.asList(
        "x_custom_attribute_name",
        "value"
    );
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = new ArrayList<>();
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "x_custom_attribute_name",
        "value"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isCustomattributeval(Object obj) { return (obj.getClass() == Customattributeval.class); }

}
