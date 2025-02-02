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
 * POJO for the {@code stage_data_rule_definition} asset type in IGC, displayed as '{@literal Stage Data Rule Definition}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("stage_data_rule_definition")
public class StageDataRuleDefinition extends Reference {

    public static String getIgcTypeDisplayName() { return "Stage Data Rule Definition"; }

    /**
     * The {@code name} property, displayed as '{@literal Name}' in the IGC UI.
     */
    protected String name;

    /**
     * The {@code stage} property, displayed as '{@literal Stage}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Stage} object.
     */
    protected Reference stage;

    /**
     * The {@code stage_logic} property, displayed as '{@literal Stage Logic}' in the IGC UI.
     */
    protected String stage_logic;

    /**
     * The {@code based_on_rule} property, displayed as '{@literal Based on Rule}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link PublishedDataRuleDefinition} object.
     */
    protected Reference based_on_rule;

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

    /** @see #stage */ @JsonProperty("stage")  public Reference getStage() { return this.stage; }
    /** @see #stage */ @JsonProperty("stage")  public void setStage(Reference stage) { this.stage = stage; }

    /** @see #stage_logic */ @JsonProperty("stage_logic")  public String getStageLogic() { return this.stage_logic; }
    /** @see #stage_logic */ @JsonProperty("stage_logic")  public void setStageLogic(String stage_logic) { this.stage_logic = stage_logic; }

    /** @see #based_on_rule */ @JsonProperty("based_on_rule")  public Reference getBasedOnRule() { return this.based_on_rule; }
    /** @see #based_on_rule */ @JsonProperty("based_on_rule")  public void setBasedOnRule(Reference based_on_rule) { this.based_on_rule = based_on_rule; }

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
        "stage_logic",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    private static final List<String> STRING_PROPERTIES = Arrays.asList(
        "name",
        "stage_logic",
        "created_by",
        "modified_by"
    );
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = new ArrayList<>();
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "name",
        "stage",
        "stage_logic",
        "based_on_rule",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isStageDataRuleDefinition(Object obj) { return (obj.getClass() == StageDataRuleDefinition.class); }

}
