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
 * POJO for the {@code valid_value_list} asset type in IGC, displayed as '{@literal Valid Value List}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("valid_value_list")
public class ValidValueList extends Reference {

    public static String getIgcTypeDisplayName() { return "Valid Value List"; }

    /**
     * The {@code valid_values} property, displayed as '{@literal Valid Values}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link DataItemValue} objects.
     */
    protected ReferenceList valid_values;

    /**
     * The {@code name} property, displayed as '{@literal Name}' in the IGC UI.
     */
    protected String name;

    /**
     * The {@code short_description} property, displayed as '{@literal Short Description}' in the IGC UI.
     */
    protected String short_description;

    /**
     * The {@code valid_value_list} property, displayed as '{@literal Valid Value List}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link ValidValueList} object.
     */
    protected Reference valid_value_list;

    /**
     * The {@code design_column} property, displayed as '{@literal Design Column}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link DataItem} objects.
     */
    protected ReferenceList design_column;


    /** @see #valid_values */ @JsonProperty("valid_values")  public ReferenceList getValidValues() { return this.valid_values; }
    /** @see #valid_values */ @JsonProperty("valid_values")  public void setValidValues(ReferenceList valid_values) { this.valid_values = valid_values; }

    /** @see #name */ @JsonProperty("name")  public String getTheName() { return this.name; }
    /** @see #name */ @JsonProperty("name")  public void setTheName(String name) { this.name = name; }

    /** @see #short_description */ @JsonProperty("short_description")  public String getShortDescription() { return this.short_description; }
    /** @see #short_description */ @JsonProperty("short_description")  public void setShortDescription(String short_description) { this.short_description = short_description; }

    /** @see #valid_value_list */ @JsonProperty("valid_value_list")  public Reference getValidValueList() { return this.valid_value_list; }
    /** @see #valid_value_list */ @JsonProperty("valid_value_list")  public void setValidValueList(Reference valid_value_list) { this.valid_value_list = valid_value_list; }

    /** @see #design_column */ @JsonProperty("design_column")  public ReferenceList getDesignColumn() { return this.design_column; }
    /** @see #design_column */ @JsonProperty("design_column")  public void setDesignColumn(ReferenceList design_column) { this.design_column = design_column; }

    public static Boolean canBeCreated() { return false; }
    public static Boolean includesModificationDetails() { return false; }
    private static final List<String> NON_RELATIONAL_PROPERTIES = Arrays.asList(
        "name",
        "short_description"
    );
    private static final List<String> STRING_PROPERTIES = Arrays.asList(
        "name",
        "short_description"
    );
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = Arrays.asList(
        "valid_values",
        "design_column"
    );
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "valid_values",
        "name",
        "short_description",
        "valid_value_list",
        "design_column"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isValidValueList(Object obj) { return (obj.getClass() == ValidValueList.class); }

}
