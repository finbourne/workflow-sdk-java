/*
 * FINBOURNE Workflow API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.workflow.model;

import java.util.Objects;
import com.finbourne.workflow.model.ActionDefinitionResponse;
import com.finbourne.workflow.model.InitialState;
import com.finbourne.workflow.model.ResourceId;
import com.finbourne.workflow.model.TaskFieldDefinition;
import com.finbourne.workflow.model.TaskStateDefinition;
import com.finbourne.workflow.model.TaskTransitionDefinition;
import com.finbourne.workflow.model.TransitionTriggerDefinition;
import com.finbourne.workflow.model.VersionInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.workflow.JSON;

/**
 * Task Definition
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TaskDefinition {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private VersionInfo version;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATES = "states";
  @SerializedName(SERIALIZED_NAME_STATES)
  private List<TaskStateDefinition> states = new ArrayList<>();

  public static final String SERIALIZED_NAME_FIELD_SCHEMA = "fieldSchema";
  @SerializedName(SERIALIZED_NAME_FIELD_SCHEMA)
  private List<TaskFieldDefinition> fieldSchema;

  public static final String SERIALIZED_NAME_INITIAL_STATE = "initialState";
  @SerializedName(SERIALIZED_NAME_INITIAL_STATE)
  private InitialState initialState;

  public static final String SERIALIZED_NAME_TRIGGERS = "triggers";
  @SerializedName(SERIALIZED_NAME_TRIGGERS)
  private List<TransitionTriggerDefinition> triggers;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<ActionDefinitionResponse> actions;

  public static final String SERIALIZED_NAME_TRANSITIONS = "transitions";
  @SerializedName(SERIALIZED_NAME_TRANSITIONS)
  private List<TaskTransitionDefinition> transitions;

  public TaskDefinition() {
  }

  public TaskDefinition id(ResourceId id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getId() {
    return id;
  }


  public void setId(ResourceId id) {
    this.id = id;
  }


  public TaskDefinition version(VersionInfo version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  public VersionInfo getVersion() {
    return version;
  }


  public void setVersion(VersionInfo version) {
    this.version = version;
  }


  public TaskDefinition displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Human readable name
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public TaskDefinition description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Human readable description
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TaskDefinition states(List<TaskStateDefinition> states) {
    
    this.states = states;
    return this;
  }

  public TaskDefinition addStatesItem(TaskStateDefinition statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    return this;
  }

   /**
   * The states this Task Definition operates over
   * @return states
  **/
  @jakarta.annotation.Nonnull
  public List<TaskStateDefinition> getStates() {
    return states;
  }


  public void setStates(List<TaskStateDefinition> states) {
    this.states = states;
  }


  public TaskDefinition fieldSchema(List<TaskFieldDefinition> fieldSchema) {
    
    this.fieldSchema = fieldSchema;
    return this;
  }

  public TaskDefinition addFieldSchemaItem(TaskFieldDefinition fieldSchemaItem) {
    if (this.fieldSchema == null) {
      this.fieldSchema = new ArrayList<>();
    }
    this.fieldSchema.add(fieldSchemaItem);
    return this;
  }

   /**
   * The Fields that this Task Definition operates on
   * @return fieldSchema
  **/
  @jakarta.annotation.Nullable
  public List<TaskFieldDefinition> getFieldSchema() {
    return fieldSchema;
  }


  public void setFieldSchema(List<TaskFieldDefinition> fieldSchema) {
    this.fieldSchema = fieldSchema;
  }


  public TaskDefinition initialState(InitialState initialState) {
    
    this.initialState = initialState;
    return this;
  }

   /**
   * Get initialState
   * @return initialState
  **/
  @jakarta.annotation.Nonnull
  public InitialState getInitialState() {
    return initialState;
  }


  public void setInitialState(InitialState initialState) {
    this.initialState = initialState;
  }


  public TaskDefinition triggers(List<TransitionTriggerDefinition> triggers) {
    
    this.triggers = triggers;
    return this;
  }

  public TaskDefinition addTriggersItem(TransitionTriggerDefinition triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<>();
    }
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * The Triggers for State transition
   * @return triggers
  **/
  @jakarta.annotation.Nullable
  public List<TransitionTriggerDefinition> getTriggers() {
    return triggers;
  }


  public void setTriggers(List<TransitionTriggerDefinition> triggers) {
    this.triggers = triggers;
  }


  public TaskDefinition actions(List<ActionDefinitionResponse> actions) {
    
    this.actions = actions;
    return this;
  }

  public TaskDefinition addActionsItem(ActionDefinitionResponse actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * The Actions of this Task - executed after a Transition completion
   * @return actions
  **/
  @jakarta.annotation.Nullable
  public List<ActionDefinitionResponse> getActions() {
    return actions;
  }


  public void setActions(List<ActionDefinitionResponse> actions) {
    this.actions = actions;
  }


  public TaskDefinition transitions(List<TaskTransitionDefinition> transitions) {
    
    this.transitions = transitions;
    return this;
  }

  public TaskDefinition addTransitionsItem(TaskTransitionDefinition transitionsItem) {
    if (this.transitions == null) {
      this.transitions = new ArrayList<>();
    }
    this.transitions.add(transitionsItem);
    return this;
  }

   /**
   * The Transitions between States
   * @return transitions
  **/
  @jakarta.annotation.Nullable
  public List<TaskTransitionDefinition> getTransitions() {
    return transitions;
  }


  public void setTransitions(List<TaskTransitionDefinition> transitions) {
    this.transitions = transitions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDefinition taskDefinition = (TaskDefinition) o;
    return Objects.equals(this.id, taskDefinition.id) &&
        Objects.equals(this.version, taskDefinition.version) &&
        Objects.equals(this.displayName, taskDefinition.displayName) &&
        Objects.equals(this.description, taskDefinition.description) &&
        Objects.equals(this.states, taskDefinition.states) &&
        Objects.equals(this.fieldSchema, taskDefinition.fieldSchema) &&
        Objects.equals(this.initialState, taskDefinition.initialState) &&
        Objects.equals(this.triggers, taskDefinition.triggers) &&
        Objects.equals(this.actions, taskDefinition.actions) &&
        Objects.equals(this.transitions, taskDefinition.transitions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, displayName, description, states, fieldSchema, initialState, triggers, actions, transitions);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDefinition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    fieldSchema: ").append(toIndentedString(fieldSchema)).append("\n");
    sb.append("    initialState: ").append(toIndentedString(initialState)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("version");
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("states");
    openapiFields.add("fieldSchema");
    openapiFields.add("initialState");
    openapiFields.add("triggers");
    openapiFields.add("actions");
    openapiFields.add("transitions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("states");
    openapiRequiredFields.add("initialState");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TaskDefinition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaskDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskDefinition is not found in the empty JSON string", TaskDefinition.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaskDefinition.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      ResourceId.validateJsonElement(jsonObj.get("id"));
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        VersionInfo.validateJsonElement(jsonObj.get("version"));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("states").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `states` to be an array in the JSON string but got `%s`", jsonObj.get("states").toString()));
      }

      JsonArray jsonArraystates = jsonObj.getAsJsonArray("states");
      // validate the required field `states` (array)
      for (int i = 0; i < jsonArraystates.size(); i++) {
        TaskStateDefinition.validateJsonElement(jsonArraystates.get(i));
      };
      if (jsonObj.get("fieldSchema") != null && !jsonObj.get("fieldSchema").isJsonNull()) {
        JsonArray jsonArrayfieldSchema = jsonObj.getAsJsonArray("fieldSchema");
        if (jsonArrayfieldSchema != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fieldSchema").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fieldSchema` to be an array in the JSON string but got `%s`", jsonObj.get("fieldSchema").toString()));
          }

          // validate the optional field `fieldSchema` (array)
          for (int i = 0; i < jsonArrayfieldSchema.size(); i++) {
            TaskFieldDefinition.validateJsonElement(jsonArrayfieldSchema.get(i));
          };
        }
      }
      // validate the required field `initialState`
      InitialState.validateJsonElement(jsonObj.get("initialState"));
      if (jsonObj.get("triggers") != null && !jsonObj.get("triggers").isJsonNull()) {
        JsonArray jsonArraytriggers = jsonObj.getAsJsonArray("triggers");
        if (jsonArraytriggers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("triggers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `triggers` to be an array in the JSON string but got `%s`", jsonObj.get("triggers").toString()));
          }

          // validate the optional field `triggers` (array)
          for (int i = 0; i < jsonArraytriggers.size(); i++) {
            TransitionTriggerDefinition.validateJsonElement(jsonArraytriggers.get(i));
          };
        }
      }
      if (jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull()) {
        JsonArray jsonArrayactions = jsonObj.getAsJsonArray("actions");
        if (jsonArrayactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("actions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
          }

          // validate the optional field `actions` (array)
          for (int i = 0; i < jsonArrayactions.size(); i++) {
            ActionDefinitionResponse.validateJsonElement(jsonArrayactions.get(i));
          };
        }
      }
      if (jsonObj.get("transitions") != null && !jsonObj.get("transitions").isJsonNull()) {
        JsonArray jsonArraytransitions = jsonObj.getAsJsonArray("transitions");
        if (jsonArraytransitions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("transitions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `transitions` to be an array in the JSON string but got `%s`", jsonObj.get("transitions").toString()));
          }

          // validate the optional field `transitions` (array)
          for (int i = 0; i < jsonArraytransitions.size(); i++) {
            TaskTransitionDefinition.validateJsonElement(jsonArraytransitions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskDefinition>() {
           @Override
           public void write(JsonWriter out, TaskDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaskDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaskDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskDefinition
  * @throws IOException if the JSON string is invalid with respect to TaskDefinition
  */
  public static TaskDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskDefinition.class);
  }

 /**
  * Convert an instance of TaskDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
