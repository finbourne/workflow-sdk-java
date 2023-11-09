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
 * A request to update a Task
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateTaskRequest {
  public static final String SERIALIZED_NAME_CORRELATION_IDS = "correlationIds";
  @SerializedName(SERIALIZED_NAME_CORRELATION_IDS)
  private List<String> correlationIds;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<TaskInstanceField> fields;

  public UpdateTaskRequest() {
  }

  public UpdateTaskRequest correlationIds(List<String> correlationIds) {
    
    this.correlationIds = correlationIds;
    return this;
  }

  public UpdateTaskRequest addCorrelationIdsItem(String correlationIdsItem) {
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


  public UpdateTaskRequest fields(List<TaskInstanceField> fields) {
    
    this.fields = fields;
    return this;
  }

  public UpdateTaskRequest addFieldsItem(TaskInstanceField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Defines the fields associated with the update
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
    UpdateTaskRequest updateTaskRequest = (UpdateTaskRequest) o;
    return Objects.equals(this.correlationIds, updateTaskRequest.correlationIds) &&
        Objects.equals(this.fields, updateTaskRequest.fields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationIds, fields);
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
    sb.append("class UpdateTaskRequest {\n");
    sb.append("    correlationIds: ").append(toIndentedString(correlationIds)).append("\n");
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
    openapiFields.add("correlationIds");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateTaskRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateTaskRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateTaskRequest is not found in the empty JSON string", UpdateTaskRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTaskRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTaskRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTaskRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTaskRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTaskRequest>() {
           @Override
           public void write(JsonWriter out, UpdateTaskRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTaskRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateTaskRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateTaskRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateTaskRequest
  */
  public static UpdateTaskRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTaskRequest.class);
  }

 /**
  * Convert an instance of UpdateTaskRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}