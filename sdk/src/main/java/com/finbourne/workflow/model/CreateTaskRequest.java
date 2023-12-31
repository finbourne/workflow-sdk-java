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
import com.finbourne.workflow.model.TaskInstanceField;
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
 * Contains required info to create a new Task
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTaskRequest {
  public static final String SERIALIZED_NAME_TASK_DEFINITION_ID = "taskDefinitionId";
  @SerializedName(SERIALIZED_NAME_TASK_DEFINITION_ID)
  private ResourceId taskDefinitionId;

  public static final String SERIALIZED_NAME_CORRELATION_IDS = "correlationIds";
  @SerializedName(SERIALIZED_NAME_CORRELATION_IDS)
  private List<String> correlationIds;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<TaskInstanceField> fields;

  public static final String SERIALIZED_NAME_STACKING_KEY = "stackingKey";
  @SerializedName(SERIALIZED_NAME_STACKING_KEY)
  private String stackingKey;

  public CreateTaskRequest() {
  }

  public CreateTaskRequest taskDefinitionId(ResourceId taskDefinitionId) {
    
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


  public CreateTaskRequest correlationIds(List<String> correlationIds) {
    
    this.correlationIds = correlationIds;
    return this;
  }

  public CreateTaskRequest addCorrelationIdsItem(String correlationIdsItem) {
    if (this.correlationIds == null) {
      this.correlationIds = new ArrayList<>();
    }
    this.correlationIds.add(correlationIdsItem);
    return this;
  }

   /**
   * A set of guid identifiers that allow correlation across the application tier
   * @return correlationIds
  **/
  @jakarta.annotation.Nullable
  public List<String> getCorrelationIds() {
    return correlationIds;
  }


  public void setCorrelationIds(List<String> correlationIds) {
    this.correlationIds = correlationIds;
  }


  public CreateTaskRequest fields(List<TaskInstanceField> fields) {
    
    this.fields = fields;
    return this;
  }

  public CreateTaskRequest addFieldsItem(TaskInstanceField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields and their initial values - should correspond with the Task Definition field schema
   * @return fields
  **/
  @jakarta.annotation.Nullable
  public List<TaskInstanceField> getFields() {
    return fields;
  }


  public void setFields(List<TaskInstanceField> fields) {
    this.fields = fields;
  }


  public CreateTaskRequest stackingKey(String stackingKey) {
    
    this.stackingKey = stackingKey;
    return this;
  }

   /**
   * The key for the Stack that this Task should be added to
   * @return stackingKey
  **/
  @jakarta.annotation.Nullable
  public String getStackingKey() {
    return stackingKey;
  }


  public void setStackingKey(String stackingKey) {
    this.stackingKey = stackingKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTaskRequest createTaskRequest = (CreateTaskRequest) o;
    return Objects.equals(this.taskDefinitionId, createTaskRequest.taskDefinitionId) &&
        Objects.equals(this.correlationIds, createTaskRequest.correlationIds) &&
        Objects.equals(this.fields, createTaskRequest.fields) &&
        Objects.equals(this.stackingKey, createTaskRequest.stackingKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskDefinitionId, correlationIds, fields, stackingKey);
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
    sb.append("class CreateTaskRequest {\n");
    sb.append("    taskDefinitionId: ").append(toIndentedString(taskDefinitionId)).append("\n");
    sb.append("    correlationIds: ").append(toIndentedString(correlationIds)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    stackingKey: ").append(toIndentedString(stackingKey)).append("\n");
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
    openapiFields.add("taskDefinitionId");
    openapiFields.add("correlationIds");
    openapiFields.add("fields");
    openapiFields.add("stackingKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("taskDefinitionId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTaskRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTaskRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTaskRequest is not found in the empty JSON string", CreateTaskRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTaskRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `taskDefinitionId`
      ResourceId.validateJsonElement(jsonObj.get("taskDefinitionId"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("correlationIds") != null && !jsonObj.get("correlationIds").isJsonNull() && !jsonObj.get("correlationIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlationIds` to be an array in the JSON string but got `%s`", jsonObj.get("correlationIds").toString()));
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
      if ((jsonObj.get("stackingKey") != null && !jsonObj.get("stackingKey").isJsonNull()) && !jsonObj.get("stackingKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stackingKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stackingKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTaskRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTaskRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTaskRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTaskRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTaskRequest>() {
           @Override
           public void write(JsonWriter out, CreateTaskRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTaskRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTaskRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTaskRequest
  * @throws IOException if the JSON string is invalid with respect to CreateTaskRequest
  */
  public static CreateTaskRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTaskRequest.class);
  }

 /**
  * Convert an instance of CreateTaskRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
