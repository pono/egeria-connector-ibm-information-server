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
 * POJO for the {@code data_item_properties} asset type in IGC, displayed as '{@literal Data Item Properties}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("data_item_properties")
public class DataItemProperties extends Reference {

    public static String getIgcTypeDisplayName() { return "Data Item Properties"; }

    /**
     * The {@code belonging_to_parameter_definition} property, displayed as '{@literal Belonging to Parameter Definition}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Parameter} object.
     */
    protected Reference belonging_to_parameter_definition;

    /**
     * The {@code flow_variable} property, displayed as '{@literal Flow Variable}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link DataItem} object.
     */
    protected Reference flow_variable;

    /**
     * The {@code column_definition} property, displayed as '{@literal Column Definition}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link ColumnDefinition} object.
     */
    protected Reference column_definition;

    /**
     * The {@code filler_parents} property, displayed as '{@literal Filler Parents}' in the IGC UI.
     */
    protected String filler_parents;

    /**
     * The {@code nls_map} property, displayed as '{@literal NLS Map}' in the IGC UI.
     */
    protected String nls_map;

    /**
     * The {@code sync_indicator} property, displayed as '{@literal Sync Indicator}' in the IGC UI.
     */
    protected Boolean sync_indicator;

    /**
     * The {@code redefined_field} property, displayed as '{@literal Redefined Field}' in the IGC UI.
     */
    protected String redefined_field;

    /**
     * The {@code association} property, displayed as '{@literal Association}' in the IGC UI.
     */
    protected String association;

    /**
     * The {@code depend_field} property, displayed as '{@literal Depend Field}' in the IGC UI.
     */
    protected String depend_field;

    /**
     * The {@code scd_purpose} property, displayed as '{@literal SCD Purpose}' in the IGC UI.
     */
    protected Number scd_purpose;

    /**
     * The {@code field_type} property, displayed as '{@literal Field Type}' in the IGC UI.
     */
    protected String field_type;

    /**
     * The {@code date_mask} property, displayed as '{@literal Date Mask}' in the IGC UI.
     */
    protected String date_mask;

    /**
     * The {@code apt_field_prop} property, displayed as '{@literal APT Field Prop}' in the IGC UI.
     */
    protected String apt_field_prop;

    /**
     * The {@code has_sign_indicator} property, displayed as '{@literal Has Sign Indicator}' in the IGC UI.
     */
    protected Boolean has_sign_indicator;

    /**
     * The {@code usage} property, displayed as '{@literal Usage}' in the IGC UI.
     */
    protected String usage;

    /**
     * The {@code scale} property, displayed as '{@literal Scale}' in the IGC UI.
     */
    protected Number scale;

    /**
     * The {@code is_u_string} property, displayed as '{@literal Is U String}' in the IGC UI.
     */
    protected Boolean is_u_string;

    /**
     * The {@code sign_option} property, displayed as '{@literal Sign Option}' in the IGC UI.
     */
    protected Number sign_option;

    /**
     * The {@code pad_char} property, displayed as '{@literal Pad Char}' in the IGC UI.
     */
    protected String pad_char;


    /** @see #belonging_to_parameter_definition */ @JsonProperty("belonging_to_parameter_definition")  public Reference getBelongingToParameterDefinition() { return this.belonging_to_parameter_definition; }
    /** @see #belonging_to_parameter_definition */ @JsonProperty("belonging_to_parameter_definition")  public void setBelongingToParameterDefinition(Reference belonging_to_parameter_definition) { this.belonging_to_parameter_definition = belonging_to_parameter_definition; }

    /** @see #flow_variable */ @JsonProperty("flow_variable")  public Reference getFlowVariable() { return this.flow_variable; }
    /** @see #flow_variable */ @JsonProperty("flow_variable")  public void setFlowVariable(Reference flow_variable) { this.flow_variable = flow_variable; }

    /** @see #column_definition */ @JsonProperty("column_definition")  public Reference getColumnDefinition() { return this.column_definition; }
    /** @see #column_definition */ @JsonProperty("column_definition")  public void setColumnDefinition(Reference column_definition) { this.column_definition = column_definition; }

    /** @see #filler_parents */ @JsonProperty("filler_parents")  public String getFillerParents() { return this.filler_parents; }
    /** @see #filler_parents */ @JsonProperty("filler_parents")  public void setFillerParents(String filler_parents) { this.filler_parents = filler_parents; }

    /** @see #nls_map */ @JsonProperty("nls_map")  public String getNlsMap() { return this.nls_map; }
    /** @see #nls_map */ @JsonProperty("nls_map")  public void setNlsMap(String nls_map) { this.nls_map = nls_map; }

    /** @see #sync_indicator */ @JsonProperty("sync_indicator")  public Boolean getSyncIndicator() { return this.sync_indicator; }
    /** @see #sync_indicator */ @JsonProperty("sync_indicator")  public void setSyncIndicator(Boolean sync_indicator) { this.sync_indicator = sync_indicator; }

    /** @see #redefined_field */ @JsonProperty("redefined_field")  public String getRedefinedField() { return this.redefined_field; }
    /** @see #redefined_field */ @JsonProperty("redefined_field")  public void setRedefinedField(String redefined_field) { this.redefined_field = redefined_field; }

    /** @see #association */ @JsonProperty("association")  public String getAssociation() { return this.association; }
    /** @see #association */ @JsonProperty("association")  public void setAssociation(String association) { this.association = association; }

    /** @see #depend_field */ @JsonProperty("depend_field")  public String getDependField() { return this.depend_field; }
    /** @see #depend_field */ @JsonProperty("depend_field")  public void setDependField(String depend_field) { this.depend_field = depend_field; }

    /** @see #scd_purpose */ @JsonProperty("scd_purpose")  public Number getScdPurpose() { return this.scd_purpose; }
    /** @see #scd_purpose */ @JsonProperty("scd_purpose")  public void setScdPurpose(Number scd_purpose) { this.scd_purpose = scd_purpose; }

    /** @see #field_type */ @JsonProperty("field_type")  public String getFieldType() { return this.field_type; }
    /** @see #field_type */ @JsonProperty("field_type")  public void setFieldType(String field_type) { this.field_type = field_type; }

    /** @see #date_mask */ @JsonProperty("date_mask")  public String getDateMask() { return this.date_mask; }
    /** @see #date_mask */ @JsonProperty("date_mask")  public void setDateMask(String date_mask) { this.date_mask = date_mask; }

    /** @see #apt_field_prop */ @JsonProperty("apt_field_prop")  public String getAptFieldProp() { return this.apt_field_prop; }
    /** @see #apt_field_prop */ @JsonProperty("apt_field_prop")  public void setAptFieldProp(String apt_field_prop) { this.apt_field_prop = apt_field_prop; }

    /** @see #has_sign_indicator */ @JsonProperty("has_sign_indicator")  public Boolean getHasSignIndicator() { return this.has_sign_indicator; }
    /** @see #has_sign_indicator */ @JsonProperty("has_sign_indicator")  public void setHasSignIndicator(Boolean has_sign_indicator) { this.has_sign_indicator = has_sign_indicator; }

    /** @see #usage */ @JsonProperty("usage")  public String getUsage() { return this.usage; }
    /** @see #usage */ @JsonProperty("usage")  public void setUsage(String usage) { this.usage = usage; }

    /** @see #scale */ @JsonProperty("scale")  public Number getScale() { return this.scale; }
    /** @see #scale */ @JsonProperty("scale")  public void setScale(Number scale) { this.scale = scale; }

    /** @see #is_u_string */ @JsonProperty("is_u_string")  public Boolean getIsUString() { return this.is_u_string; }
    /** @see #is_u_string */ @JsonProperty("is_u_string")  public void setIsUString(Boolean is_u_string) { this.is_u_string = is_u_string; }

    /** @see #sign_option */ @JsonProperty("sign_option")  public Number getSignOption() { return this.sign_option; }
    /** @see #sign_option */ @JsonProperty("sign_option")  public void setSignOption(Number sign_option) { this.sign_option = sign_option; }

    /** @see #pad_char */ @JsonProperty("pad_char")  public String getPadChar() { return this.pad_char; }
    /** @see #pad_char */ @JsonProperty("pad_char")  public void setPadChar(String pad_char) { this.pad_char = pad_char; }

    public static Boolean canBeCreated() { return false; }
    public static Boolean includesModificationDetails() { return false; }
    private static final List<String> NON_RELATIONAL_PROPERTIES = Arrays.asList(
        "filler_parents",
        "nls_map",
        "sync_indicator",
        "redefined_field",
        "association",
        "depend_field",
        "scd_purpose",
        "field_type",
        "date_mask",
        "apt_field_prop",
        "has_sign_indicator",
        "usage",
        "scale",
        "is_u_string",
        "sign_option",
        "pad_char"
    );
    private static final List<String> STRING_PROPERTIES = Arrays.asList(
        "filler_parents",
        "nls_map",
        "redefined_field",
        "association",
        "depend_field",
        "field_type",
        "date_mask",
        "apt_field_prop",
        "usage",
        "pad_char"
    );
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = new ArrayList<>();
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "belonging_to_parameter_definition",
        "flow_variable",
        "column_definition",
        "filler_parents",
        "nls_map",
        "sync_indicator",
        "redefined_field",
        "association",
        "depend_field",
        "scd_purpose",
        "field_type",
        "date_mask",
        "apt_field_prop",
        "has_sign_indicator",
        "usage",
        "scale",
        "is_u_string",
        "sign_option",
        "pad_char"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isDataItemProperties(Object obj) { return (obj.getClass() == DataItemProperties.class); }

}
