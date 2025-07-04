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
import com.finbourne.workflow.model.ReadOnlyStates;
import com.finbourne.workflow.model.ValueConstraints;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
 * Defines a Task Definition Field
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TaskFieldDefinition {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_READ_ONLY_STATES = "readOnlyStates";
  @SerializedName(SERIALIZED_NAME_READ_ONLY_STATES)
  private ReadOnlyStates readOnlyStates;

  public static final String SERIALIZED_NAME_VALUE_CONSTRAINTS = "valueConstraints";
  @SerializedName(SERIALIZED_NAME_VALUE_CONSTRAINTS)
  private ValueConstraints valueConstraints;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CONTAINS_URL = "containsUrl";
  @SerializedName(SERIALIZED_NAME_CONTAINS_URL)
  private Boolean containsUrl;

  public TaskFieldDefinition() {
  }

  public TaskFieldDefinition name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this Field
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TaskFieldDefinition type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The value type for the field. Available values are: \&quot;String\&quot;, \&quot;Decimal\&quot;, \&quot;DateTime\&quot;, \&quot;Boolean\&quot;)
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public TaskFieldDefinition readOnlyStates(ReadOnlyStates readOnlyStates) {
    
    this.readOnlyStates = readOnlyStates;
    return this;
  }

   /**
   * Get readOnlyStates
   * @return readOnlyStates
  **/
  @jakarta.annotation.Nullable
  public ReadOnlyStates getReadOnlyStates() {
    return readOnlyStates;
  }


  public void setReadOnlyStates(ReadOnlyStates readOnlyStates) {
    this.readOnlyStates = readOnlyStates;
  }


  public TaskFieldDefinition valueConstraints(ValueConstraints valueConstraints) {
    
    this.valueConstraints = valueConstraints;
    return this;
  }

   /**
   * Get valueConstraints
   * @return valueConstraints
  **/
  @jakarta.annotation.Nullable
  public ValueConstraints getValueConstraints() {
    return valueConstraints;
  }


  public void setValueConstraints(ValueConstraints valueConstraints) {
    this.valueConstraints = valueConstraints;
  }


  public TaskFieldDefinition displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name for field definition
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public TaskFieldDefinition description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description for field definition
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TaskFieldDefinition category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Category for field definition
   * @return category
  **/
  @jakarta.annotation.Nullable
  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public TaskFieldDefinition containsUrl(Boolean containsUrl) {
    
    this.containsUrl = containsUrl;
    return this;
  }

   /**
   * Field contains url
   * @return containsUrl
  **/
  @jakarta.annotation.Nullable
  public Boolean getContainsUrl() {
    return containsUrl;
  }


  public void setContainsUrl(Boolean containsUrl) {
    this.containsUrl = containsUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskFieldDefinition taskFieldDefinition = (TaskFieldDefinition) o;
    return Objects.equals(this.name, taskFieldDefinition.name) &&
        Objects.equals(this.type, taskFieldDefinition.type) &&
        Objects.equals(this.readOnlyStates, taskFieldDefinition.readOnlyStates) &&
        Objects.equals(this.valueConstraints, taskFieldDefinition.valueConstraints) &&
        Objects.equals(this.displayName, taskFieldDefinition.displayName) &&
        Objects.equals(this.description, taskFieldDefinition.description) &&
        Objects.equals(this.category, taskFieldDefinition.category) &&
        Objects.equals(this.containsUrl, taskFieldDefinition.containsUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, readOnlyStates, valueConstraints, displayName, description, category, containsUrl);
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
    sb.append("class TaskFieldDefinition {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    readOnlyStates: ").append(toIndentedString(readOnlyStates)).append("\n");
    sb.append("    valueConstraints: ").append(toIndentedString(valueConstraints)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    containsUrl: ").append(toIndentedString(containsUrl)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("readOnlyStates");
    openapiFields.add("valueConstraints");
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("category");
    openapiFields.add("containsUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TaskFieldDefinition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaskFieldDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskFieldDefinition is not found in the empty JSON string", TaskFieldDefinition.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaskFieldDefinition.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `readOnlyStates`
      if (jsonObj.get("readOnlyStates") != null && !jsonObj.get("readOnlyStates").isJsonNull()) {
        ReadOnlyStates.validateJsonElement(jsonObj.get("readOnlyStates"));
      }
      // validate the optional field `valueConstraints`
      if (jsonObj.get("valueConstraints") != null && !jsonObj.get("valueConstraints").isJsonNull()) {
        ValueConstraints.validateJsonElement(jsonObj.get("valueConstraints"));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskFieldDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskFieldDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskFieldDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskFieldDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskFieldDefinition>() {
           @Override
           public void write(JsonWriter out, TaskFieldDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaskFieldDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaskFieldDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskFieldDefinition
  * @throws IOException if the JSON string is invalid with respect to TaskFieldDefinition
  */
  public static TaskFieldDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskFieldDefinition.class);
  }

 /**
  * Convert an instance of TaskFieldDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
