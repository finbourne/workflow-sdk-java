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
import com.finbourne.workflow.model.ResourceId;
import com.finbourne.workflow.model.TaskDefinitionVersion;
import com.finbourne.workflow.model.TaskInstanceField;
import com.finbourne.workflow.model.TaskSummary;
import com.finbourne.workflow.model.VersionInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
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
 * Defines a Task created based on a Task Definition
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Task {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TASK_DEFINITION_ID = "taskDefinitionId";
  @SerializedName(SERIALIZED_NAME_TASK_DEFINITION_ID)
  private ResourceId taskDefinitionId;

  public static final String SERIALIZED_NAME_TASK_DEFINITION_VERSION = "taskDefinitionVersion";
  @SerializedName(SERIALIZED_NAME_TASK_DEFINITION_VERSION)
  private TaskDefinitionVersion taskDefinitionVersion;

  public static final String SERIALIZED_NAME_TASK_DEFINITION_DISPLAY_NAME = "taskDefinitionDisplayName";
  @SerializedName(SERIALIZED_NAME_TASK_DEFINITION_DISPLAY_NAME)
  private String taskDefinitionDisplayName;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ULTIMATE_PARENT_TASK = "ultimateParentTask";
  @SerializedName(SERIALIZED_NAME_ULTIMATE_PARENT_TASK)
  private TaskSummary ultimateParentTask;

  public static final String SERIALIZED_NAME_PARENT_TASK = "parentTask";
  @SerializedName(SERIALIZED_NAME_PARENT_TASK)
  private TaskSummary parentTask;

  public static final String SERIALIZED_NAME_CHILD_TASKS = "childTasks";
  @SerializedName(SERIALIZED_NAME_CHILD_TASKS)
  private List<TaskSummary> childTasks;

  public static final String SERIALIZED_NAME_CORRELATION_IDS = "correlationIds";
  @SerializedName(SERIALIZED_NAME_CORRELATION_IDS)
  private List<String> correlationIds;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private VersionInfo version;

  public static final String SERIALIZED_NAME_TERMINAL_STATE = "terminalState";
  @SerializedName(SERIALIZED_NAME_TERMINAL_STATE)
  private Boolean terminalState;

  public static final String SERIALIZED_NAME_AS_AT_LAST_TRANSITION = "asAtLastTransition";
  @SerializedName(SERIALIZED_NAME_AS_AT_LAST_TRANSITION)
  private OffsetDateTime asAtLastTransition;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<TaskInstanceField> fields;

  public Task() {
  }

  public Task id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique id for this Task
   * @return id
  **/
  @jakarta.annotation.Nonnull
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Task taskDefinitionId(ResourceId taskDefinitionId) {
    
    this.taskDefinitionId = taskDefinitionId;
    return this;
  }

   /**
   * Get taskDefinitionId
   * @return taskDefinitionId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getTaskDefinitionId() {
    return taskDefinitionId;
  }


  public void setTaskDefinitionId(ResourceId taskDefinitionId) {
    this.taskDefinitionId = taskDefinitionId;
  }


  public Task taskDefinitionVersion(TaskDefinitionVersion taskDefinitionVersion) {
    
    this.taskDefinitionVersion = taskDefinitionVersion;
    return this;
  }

   /**
   * Get taskDefinitionVersion
   * @return taskDefinitionVersion
  **/
  @jakarta.annotation.Nonnull
  public TaskDefinitionVersion getTaskDefinitionVersion() {
    return taskDefinitionVersion;
  }


  public void setTaskDefinitionVersion(TaskDefinitionVersion taskDefinitionVersion) {
    this.taskDefinitionVersion = taskDefinitionVersion;
  }


  public Task taskDefinitionDisplayName(String taskDefinitionDisplayName) {
    
    this.taskDefinitionDisplayName = taskDefinitionDisplayName;
    return this;
  }

   /**
   * The display name of the Task Definition used by this Task
   * @return taskDefinitionDisplayName
  **/
  @jakarta.annotation.Nonnull
  public String getTaskDefinitionDisplayName() {
    return taskDefinitionDisplayName;
  }


  public void setTaskDefinitionDisplayName(String taskDefinitionDisplayName) {
    this.taskDefinitionDisplayName = taskDefinitionDisplayName;
  }


  public Task state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Current State
   * @return state
  **/
  @jakarta.annotation.Nonnull
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Task ultimateParentTask(TaskSummary ultimateParentTask) {
    
    this.ultimateParentTask = ultimateParentTask;
    return this;
  }

   /**
   * Get ultimateParentTask
   * @return ultimateParentTask
  **/
  @jakarta.annotation.Nonnull
  public TaskSummary getUltimateParentTask() {
    return ultimateParentTask;
  }


  public void setUltimateParentTask(TaskSummary ultimateParentTask) {
    this.ultimateParentTask = ultimateParentTask;
  }


  public Task parentTask(TaskSummary parentTask) {
    
    this.parentTask = parentTask;
    return this;
  }

   /**
   * Get parentTask
   * @return parentTask
  **/
  @jakarta.annotation.Nullable
  public TaskSummary getParentTask() {
    return parentTask;
  }


  public void setParentTask(TaskSummary parentTask) {
    this.parentTask = parentTask;
  }


  public Task childTasks(List<TaskSummary> childTasks) {
    
    this.childTasks = childTasks;
    return this;
  }

  public Task addChildTasksItem(TaskSummary childTasksItem) {
    if (this.childTasks == null) {
      this.childTasks = new ArrayList<>();
    }
    this.childTasks.add(childTasksItem);
    return this;
  }

   /**
   * This Task&#39;s child tasks
   * @return childTasks
  **/
  @jakarta.annotation.Nullable
  public List<TaskSummary> getChildTasks() {
    return childTasks;
  }


  public void setChildTasks(List<TaskSummary> childTasks) {
    this.childTasks = childTasks;
  }


  public Task correlationIds(List<String> correlationIds) {
    
    this.correlationIds = correlationIds;
    return this;
  }

  public Task addCorrelationIdsItem(String correlationIdsItem) {
    if (this.correlationIds == null) {
      this.correlationIds = new ArrayList<>();
    }
    this.correlationIds.add(correlationIdsItem);
    return this;
  }

   /**
   * User-provided ID used to link entities and tasks
   * @return correlationIds
  **/
  @jakarta.annotation.Nullable
  public List<String> getCorrelationIds() {
    return correlationIds;
  }


  public void setCorrelationIds(List<String> correlationIds) {
    this.correlationIds = correlationIds;
  }


  public Task version(VersionInfo version) {
    
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


  public Task terminalState(Boolean terminalState) {
    
    this.terminalState = terminalState;
    return this;
  }

   /**
   * True if no onward transitions are possible
   * @return terminalState
  **/
  @jakarta.annotation.Nonnull
  public Boolean getTerminalState() {
    return terminalState;
  }


  public void setTerminalState(Boolean terminalState) {
    this.terminalState = terminalState;
  }


  public Task asAtLastTransition(OffsetDateTime asAtLastTransition) {
    
    this.asAtLastTransition = asAtLastTransition;
    return this;
  }

   /**
   * Last Transition timestamp
   * @return asAtLastTransition
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getAsAtLastTransition() {
    return asAtLastTransition;
  }


  public void setAsAtLastTransition(OffsetDateTime asAtLastTransition) {
    this.asAtLastTransition = asAtLastTransition;
  }


  public Task fields(List<TaskInstanceField> fields) {
    
    this.fields = fields;
    return this;
  }

  public Task addFieldsItem(TaskInstanceField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields and their latest values - should correspond with the Task Definition field schema
   * @return fields
  **/
  @jakarta.annotation.Nullable
  public List<TaskInstanceField> getFields() {
    return fields;
  }


  public void setFields(List<TaskInstanceField> fields) {
    this.fields = fields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.id, task.id) &&
        Objects.equals(this.taskDefinitionId, task.taskDefinitionId) &&
        Objects.equals(this.taskDefinitionVersion, task.taskDefinitionVersion) &&
        Objects.equals(this.taskDefinitionDisplayName, task.taskDefinitionDisplayName) &&
        Objects.equals(this.state, task.state) &&
        Objects.equals(this.ultimateParentTask, task.ultimateParentTask) &&
        Objects.equals(this.parentTask, task.parentTask) &&
        Objects.equals(this.childTasks, task.childTasks) &&
        Objects.equals(this.correlationIds, task.correlationIds) &&
        Objects.equals(this.version, task.version) &&
        Objects.equals(this.terminalState, task.terminalState) &&
        Objects.equals(this.asAtLastTransition, task.asAtLastTransition) &&
        Objects.equals(this.fields, task.fields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskDefinitionId, taskDefinitionVersion, taskDefinitionDisplayName, state, ultimateParentTask, parentTask, childTasks, correlationIds, version, terminalState, asAtLastTransition, fields);
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
    sb.append("class Task {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskDefinitionId: ").append(toIndentedString(taskDefinitionId)).append("\n");
    sb.append("    taskDefinitionVersion: ").append(toIndentedString(taskDefinitionVersion)).append("\n");
    sb.append("    taskDefinitionDisplayName: ").append(toIndentedString(taskDefinitionDisplayName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    ultimateParentTask: ").append(toIndentedString(ultimateParentTask)).append("\n");
    sb.append("    parentTask: ").append(toIndentedString(parentTask)).append("\n");
    sb.append("    childTasks: ").append(toIndentedString(childTasks)).append("\n");
    sb.append("    correlationIds: ").append(toIndentedString(correlationIds)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    terminalState: ").append(toIndentedString(terminalState)).append("\n");
    sb.append("    asAtLastTransition: ").append(toIndentedString(asAtLastTransition)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
    openapiFields.add("taskDefinitionId");
    openapiFields.add("taskDefinitionVersion");
    openapiFields.add("taskDefinitionDisplayName");
    openapiFields.add("state");
    openapiFields.add("ultimateParentTask");
    openapiFields.add("parentTask");
    openapiFields.add("childTasks");
    openapiFields.add("correlationIds");
    openapiFields.add("version");
    openapiFields.add("terminalState");
    openapiFields.add("asAtLastTransition");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("taskDefinitionId");
    openapiRequiredFields.add("taskDefinitionVersion");
    openapiRequiredFields.add("taskDefinitionDisplayName");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("ultimateParentTask");
    openapiRequiredFields.add("terminalState");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Task
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Task.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Task is not found in the empty JSON string", Task.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Task.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `taskDefinitionId`
      ResourceId.validateJsonElement(jsonObj.get("taskDefinitionId"));
      // validate the required field `taskDefinitionVersion`
      TaskDefinitionVersion.validateJsonElement(jsonObj.get("taskDefinitionVersion"));
      if (!jsonObj.get("taskDefinitionDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskDefinitionDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taskDefinitionDisplayName").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `ultimateParentTask`
      TaskSummary.validateJsonElement(jsonObj.get("ultimateParentTask"));
      // validate the optional field `parentTask`
      if (jsonObj.get("parentTask") != null && !jsonObj.get("parentTask").isJsonNull()) {
        TaskSummary.validateJsonElement(jsonObj.get("parentTask"));
      }
      if (jsonObj.get("childTasks") != null && !jsonObj.get("childTasks").isJsonNull()) {
        JsonArray jsonArraychildTasks = jsonObj.getAsJsonArray("childTasks");
        if (jsonArraychildTasks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("childTasks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `childTasks` to be an array in the JSON string but got `%s`", jsonObj.get("childTasks").toString()));
          }

          // validate the optional field `childTasks` (array)
          for (int i = 0; i < jsonArraychildTasks.size(); i++) {
            TaskSummary.validateJsonElement(jsonArraychildTasks.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("correlationIds") != null && !jsonObj.get("correlationIds").isJsonNull() && !jsonObj.get("correlationIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlationIds` to be an array in the JSON string but got `%s`", jsonObj.get("correlationIds").toString()));
      }
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        VersionInfo.validateJsonElement(jsonObj.get("version"));
      }
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            TaskInstanceField.validateJsonElement(jsonArrayfields.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Task.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Task' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Task> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Task.class));

       return (TypeAdapter<T>) new TypeAdapter<Task>() {
           @Override
           public void write(JsonWriter out, Task value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Task read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Task given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Task
  * @throws IOException if the JSON string is invalid with respect to Task
  */
  public static Task fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Task.class);
  }

 /**
  * Convert an instance of Task to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
