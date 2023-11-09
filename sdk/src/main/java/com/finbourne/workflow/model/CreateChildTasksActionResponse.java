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
import com.finbourne.workflow.model.CreateChildTaskConfiguration;
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
 * Defines a read-only Create Child Tasks Action
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateChildTasksActionResponse {
  /**
   * Type name for this Action
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CREATECHILDTASKS("CreateChildTasks"),
    
    RUNWORKER("RunWorker"),
    
    TRIGGERPARENTTASK("TriggerParentTask");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_CHILD_TASK_CONFIGURATIONS = "childTaskConfigurations";
  @SerializedName(SERIALIZED_NAME_CHILD_TASK_CONFIGURATIONS)
  private List<CreateChildTaskConfiguration> childTaskConfigurations;

  public CreateChildTasksActionResponse() {
  }

  public CreateChildTasksActionResponse type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type name for this Action
   * @return type
  **/
  @jakarta.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreateChildTasksActionResponse childTaskConfigurations(List<CreateChildTaskConfiguration> childTaskConfigurations) {
    
    this.childTaskConfigurations = childTaskConfigurations;
    return this;
  }

  public CreateChildTasksActionResponse addChildTaskConfigurationsItem(CreateChildTaskConfiguration childTaskConfigurationsItem) {
    if (this.childTaskConfigurations == null) {
      this.childTaskConfigurations = new ArrayList<>();
    }
    this.childTaskConfigurations.add(childTaskConfigurationsItem);
    return this;
  }

   /**
   * The Child Task Configurations
   * @return childTaskConfigurations
  **/
  @jakarta.annotation.Nullable
  public List<CreateChildTaskConfiguration> getChildTaskConfigurations() {
    return childTaskConfigurations;
  }


  public void setChildTaskConfigurations(List<CreateChildTaskConfiguration> childTaskConfigurations) {
    this.childTaskConfigurations = childTaskConfigurations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChildTasksActionResponse createChildTasksActionResponse = (CreateChildTasksActionResponse) o;
    return Objects.equals(this.type, createChildTasksActionResponse.type) &&
        Objects.equals(this.childTaskConfigurations, createChildTasksActionResponse.childTaskConfigurations);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, childTaskConfigurations);
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
    sb.append("class CreateChildTasksActionResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    childTaskConfigurations: ").append(toIndentedString(childTaskConfigurations)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("childTaskConfigurations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateChildTasksActionResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateChildTasksActionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateChildTasksActionResponse is not found in the empty JSON string", CreateChildTasksActionResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("childTaskConfigurations") != null && !jsonObj.get("childTaskConfigurations").isJsonNull()) {
        JsonArray jsonArraychildTaskConfigurations = jsonObj.getAsJsonArray("childTaskConfigurations");
        if (jsonArraychildTaskConfigurations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("childTaskConfigurations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `childTaskConfigurations` to be an array in the JSON string but got `%s`", jsonObj.get("childTaskConfigurations").toString()));
          }

          // validate the optional field `childTaskConfigurations` (array)
          for (int i = 0; i < jsonArraychildTaskConfigurations.size(); i++) {
            CreateChildTaskConfiguration.validateJsonElement(jsonArraychildTaskConfigurations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateChildTasksActionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateChildTasksActionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateChildTasksActionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateChildTasksActionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateChildTasksActionResponse>() {
           @Override
           public void write(JsonWriter out, CreateChildTasksActionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateChildTasksActionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateChildTasksActionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateChildTasksActionResponse
  * @throws IOException if the JSON string is invalid with respect to CreateChildTasksActionResponse
  */
  public static CreateChildTasksActionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateChildTasksActionResponse.class);
  }

 /**
  * Convert an instance of CreateChildTasksActionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}