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
 * Defines a mapping for event handler properties
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventHandlerMapping {
  public static final String SERIALIZED_NAME_MAP_FROM = "mapFrom";
  @SerializedName(SERIALIZED_NAME_MAP_FROM)
  private String mapFrom;

  public static final String SERIALIZED_NAME_SET_TO = "setTo";
  @SerializedName(SERIALIZED_NAME_SET_TO)
  private String setTo;

  public EventHandlerMapping() {
  }

  public EventHandlerMapping mapFrom(String mapFrom) {
    
    this.mapFrom = mapFrom;
    return this;
  }

   /**
   * The field to map from
   * @return mapFrom
  **/
  @jakarta.annotation.Nullable
  public String getMapFrom() {
    return mapFrom;
  }


  public void setMapFrom(String mapFrom) {
    this.mapFrom = mapFrom;
  }


  public EventHandlerMapping setTo(String setTo) {
    
    this.setTo = setTo;
    return this;
  }

   /**
   * The (constant) value to set
   * @return setTo
  **/
  @jakarta.annotation.Nullable
  public String getSetTo() {
    return setTo;
  }


  public void setSetTo(String setTo) {
    this.setTo = setTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventHandlerMapping eventHandlerMapping = (EventHandlerMapping) o;
    return Objects.equals(this.mapFrom, eventHandlerMapping.mapFrom) &&
        Objects.equals(this.setTo, eventHandlerMapping.setTo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapFrom, setTo);
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
    sb.append("class EventHandlerMapping {\n");
    sb.append("    mapFrom: ").append(toIndentedString(mapFrom)).append("\n");
    sb.append("    setTo: ").append(toIndentedString(setTo)).append("\n");
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
    openapiFields.add("mapFrom");
    openapiFields.add("setTo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventHandlerMapping
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventHandlerMapping.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventHandlerMapping is not found in the empty JSON string", EventHandlerMapping.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mapFrom") != null && !jsonObj.get("mapFrom").isJsonNull()) && !jsonObj.get("mapFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mapFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mapFrom").toString()));
      }
      if ((jsonObj.get("setTo") != null && !jsonObj.get("setTo").isJsonNull()) && !jsonObj.get("setTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `setTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("setTo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventHandlerMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventHandlerMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventHandlerMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventHandlerMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<EventHandlerMapping>() {
           @Override
           public void write(JsonWriter out, EventHandlerMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventHandlerMapping read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventHandlerMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventHandlerMapping
  * @throws IOException if the JSON string is invalid with respect to EventHandlerMapping
  */
  public static EventHandlerMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventHandlerMapping.class);
  }

 /**
  * Convert an instance of EventHandlerMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}