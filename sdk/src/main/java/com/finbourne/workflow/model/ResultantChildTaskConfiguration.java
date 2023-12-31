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
import com.finbourne.workflow.model.FieldMapping;
import com.finbourne.workflow.model.ResourceId;
import com.finbourne.workflow.model.ResultMatchingPattern;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
 * Child Task Configuration
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResultantChildTaskConfiguration {
  public static final String SERIALIZED_NAME_RESULT_MATCHING_PATTERN = "resultMatchingPattern";
  @SerializedName(SERIALIZED_NAME_RESULT_MATCHING_PATTERN)
  private ResultMatchingPattern resultMatchingPattern;

  public static final String SERIALIZED_NAME_TASK_DEFINITION_ID = "taskDefinitionId";
  @SerializedName(SERIALIZED_NAME_TASK_DEFINITION_ID)
  private ResourceId taskDefinitionId;

  public static final String SERIALIZED_NAME_TASK_DEFINITION_AS_AT = "taskDefinitionAsAt";
  @SerializedName(SERIALIZED_NAME_TASK_DEFINITION_AS_AT)
  private OffsetDateTime taskDefinitionAsAt;

  public static final String SERIALIZED_NAME_INITIAL_TRIGGER = "initialTrigger";
  @SerializedName(SERIALIZED_NAME_INITIAL_TRIGGER)
  private String initialTrigger;

  public static final String SERIALIZED_NAME_CHILD_TASK_FIELDS = "childTaskFields";
  @SerializedName(SERIALIZED_NAME_CHILD_TASK_FIELDS)
  private Map<String, FieldMapping> childTaskFields = new HashMap<>();

  public static final String SERIALIZED_NAME_MAP_STACKING_KEY_FROM = "mapStackingKeyFrom";
  @SerializedName(SERIALIZED_NAME_MAP_STACKING_KEY_FROM)
  private String mapStackingKeyFrom;

  public ResultantChildTaskConfiguration() {
  }

  public ResultantChildTaskConfiguration resultMatchingPattern(ResultMatchingPattern resultMatchingPattern) {
    
    this.resultMatchingPattern = resultMatchingPattern;
    return this;
  }

   /**
   * Get resultMatchingPattern
   * @return resultMatchingPattern
  **/
  @jakarta.annotation.Nullable
  public ResultMatchingPattern getResultMatchingPattern() {
    return resultMatchingPattern;
  }


  public void setResultMatchingPattern(ResultMatchingPattern resultMatchingPattern) {
    this.resultMatchingPattern = resultMatchingPattern;
  }


  public ResultantChildTaskConfiguration taskDefinitionId(ResourceId taskDefinitionId) {
    
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


  public ResultantChildTaskConfiguration taskDefinitionAsAt(OffsetDateTime taskDefinitionAsAt) {
    
    this.taskDefinitionAsAt = taskDefinitionAsAt;
    return this;
  }

   /**
   * TaskDefinition AsAt timestamp
   * @return taskDefinitionAsAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getTaskDefinitionAsAt() {
    return taskDefinitionAsAt;
  }


  public void setTaskDefinitionAsAt(OffsetDateTime taskDefinitionAsAt) {
    this.taskDefinitionAsAt = taskDefinitionAsAt;
  }


  public ResultantChildTaskConfiguration initialTrigger(String initialTrigger) {
    
    this.initialTrigger = initialTrigger;
    return this;
  }

   /**
   * The Initial Trigger for automatic start
   * @return initialTrigger
  **/
  @jakarta.annotation.Nullable
  public String getInitialTrigger() {
    return initialTrigger;
  }


  public void setInitialTrigger(String initialTrigger) {
    this.initialTrigger = initialTrigger;
  }


  public ResultantChildTaskConfiguration childTaskFields(Map<String, FieldMapping> childTaskFields) {
    
    this.childTaskFields = childTaskFields;
    return this;
  }

  public ResultantChildTaskConfiguration putChildTaskFieldsItem(String key, FieldMapping childTaskFieldsItem) {
    if (this.childTaskFields == null) {
      this.childTaskFields = new HashMap<>();
    }
    this.childTaskFields.put(key, childTaskFieldsItem);
    return this;
  }

   /**
   * Field Mappings
   * @return childTaskFields
  **/
  @jakarta.annotation.Nonnull
  public Map<String, FieldMapping> getChildTaskFields() {
    return childTaskFields;
  }


  public void setChildTaskFields(Map<String, FieldMapping> childTaskFields) {
    this.childTaskFields = childTaskFields;
  }


  public ResultantChildTaskConfiguration mapStackingKeyFrom(String mapStackingKeyFrom) {
    
    this.mapStackingKeyFrom = mapStackingKeyFrom;
    return this;
  }

   /**
   * The field to be mapped as the ChildTasks Stacking Key
   * @return mapStackingKeyFrom
  **/
  @jakarta.annotation.Nullable
  public String getMapStackingKeyFrom() {
    return mapStackingKeyFrom;
  }


  public void setMapStackingKeyFrom(String mapStackingKeyFrom) {
    this.mapStackingKeyFrom = mapStackingKeyFrom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultantChildTaskConfiguration resultantChildTaskConfiguration = (ResultantChildTaskConfiguration) o;
    return Objects.equals(this.resultMatchingPattern, resultantChildTaskConfiguration.resultMatchingPattern) &&
        Objects.equals(this.taskDefinitionId, resultantChildTaskConfiguration.taskDefinitionId) &&
        Objects.equals(this.taskDefinitionAsAt, resultantChildTaskConfiguration.taskDefinitionAsAt) &&
        Objects.equals(this.initialTrigger, resultantChildTaskConfiguration.initialTrigger) &&
        Objects.equals(this.childTaskFields, resultantChildTaskConfiguration.childTaskFields) &&
        Objects.equals(this.mapStackingKeyFrom, resultantChildTaskConfiguration.mapStackingKeyFrom);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultMatchingPattern, taskDefinitionId, taskDefinitionAsAt, initialTrigger, childTaskFields, mapStackingKeyFrom);
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
    sb.append("class ResultantChildTaskConfiguration {\n");
    sb.append("    resultMatchingPattern: ").append(toIndentedString(resultMatchingPattern)).append("\n");
    sb.append("    taskDefinitionId: ").append(toIndentedString(taskDefinitionId)).append("\n");
    sb.append("    taskDefinitionAsAt: ").append(toIndentedString(taskDefinitionAsAt)).append("\n");
    sb.append("    initialTrigger: ").append(toIndentedString(initialTrigger)).append("\n");
    sb.append("    childTaskFields: ").append(toIndentedString(childTaskFields)).append("\n");
    sb.append("    mapStackingKeyFrom: ").append(toIndentedString(mapStackingKeyFrom)).append("\n");
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
    openapiFields.add("resultMatchingPattern");
    openapiFields.add("taskDefinitionId");
    openapiFields.add("taskDefinitionAsAt");
    openapiFields.add("initialTrigger");
    openapiFields.add("childTaskFields");
    openapiFields.add("mapStackingKeyFrom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("taskDefinitionId");
    openapiRequiredFields.add("childTaskFields");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResultantChildTaskConfiguration
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResultantChildTaskConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResultantChildTaskConfiguration is not found in the empty JSON string", ResultantChildTaskConfiguration.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResultantChildTaskConfiguration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `resultMatchingPattern`
      if (jsonObj.get("resultMatchingPattern") != null && !jsonObj.get("resultMatchingPattern").isJsonNull()) {
        ResultMatchingPattern.validateJsonElement(jsonObj.get("resultMatchingPattern"));
      }
      // validate the required field `taskDefinitionId`
      ResourceId.validateJsonElement(jsonObj.get("taskDefinitionId"));
      if ((jsonObj.get("initialTrigger") != null && !jsonObj.get("initialTrigger").isJsonNull()) && !jsonObj.get("initialTrigger").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initialTrigger` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initialTrigger").toString()));
      }
      if ((jsonObj.get("mapStackingKeyFrom") != null && !jsonObj.get("mapStackingKeyFrom").isJsonNull()) && !jsonObj.get("mapStackingKeyFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mapStackingKeyFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mapStackingKeyFrom").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResultantChildTaskConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResultantChildTaskConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResultantChildTaskConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResultantChildTaskConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<ResultantChildTaskConfiguration>() {
           @Override
           public void write(JsonWriter out, ResultantChildTaskConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResultantChildTaskConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResultantChildTaskConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResultantChildTaskConfiguration
  * @throws IOException if the JSON string is invalid with respect to ResultantChildTaskConfiguration
  */
  public static ResultantChildTaskConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResultantChildTaskConfiguration.class);
  }

 /**
  * Convert an instance of ResultantChildTaskConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
