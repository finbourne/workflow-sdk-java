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
 * Defines a State change
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TaskTransitionDefinition {
  public static final String SERIALIZED_NAME_FROM_STATE = "fromState";
  @SerializedName(SERIALIZED_NAME_FROM_STATE)
  private String fromState;

  public static final String SERIALIZED_NAME_TO_STATE = "toState";
  @SerializedName(SERIALIZED_NAME_TO_STATE)
  private String toState;

  public static final String SERIALIZED_NAME_TRIGGER = "trigger";
  @SerializedName(SERIALIZED_NAME_TRIGGER)
  private String trigger;

  public static final String SERIALIZED_NAME_GUARD = "guard";
  @SerializedName(SERIALIZED_NAME_GUARD)
  private String guard;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public TaskTransitionDefinition() {
  }

  public TaskTransitionDefinition fromState(String fromState) {
    
    this.fromState = fromState;
    return this;
  }

   /**
   * The State this Transition if coming From
   * @return fromState
  **/
  @jakarta.annotation.Nonnull
  public String getFromState() {
    return fromState;
  }


  public void setFromState(String fromState) {
    this.fromState = fromState;
  }


  public TaskTransitionDefinition toState(String toState) {
    
    this.toState = toState;
    return this;
  }

   /**
   * The State this Transition is going To
   * @return toState
  **/
  @jakarta.annotation.Nonnull
  public String getToState() {
    return toState;
  }


  public void setToState(String toState) {
    this.toState = toState;
  }


  public TaskTransitionDefinition trigger(String trigger) {
    
    this.trigger = trigger;
    return this;
  }

   /**
   * The Trigger for this Transition
   * @return trigger
  **/
  @jakarta.annotation.Nonnull
  public String getTrigger() {
    return trigger;
  }


  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }


  public TaskTransitionDefinition guard(String guard) {
    
    this.guard = guard;
    return this;
  }

   /**
   * The Guard for this Transition, if any
   * @return guard
  **/
  @jakarta.annotation.Nullable
  public String getGuard() {
    return guard;
  }


  public void setGuard(String guard) {
    this.guard = guard;
  }


  public TaskTransitionDefinition action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * The Action to invoke on successful Transition
   * @return action
  **/
  @jakarta.annotation.Nullable
  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskTransitionDefinition taskTransitionDefinition = (TaskTransitionDefinition) o;
    return Objects.equals(this.fromState, taskTransitionDefinition.fromState) &&
        Objects.equals(this.toState, taskTransitionDefinition.toState) &&
        Objects.equals(this.trigger, taskTransitionDefinition.trigger) &&
        Objects.equals(this.guard, taskTransitionDefinition.guard) &&
        Objects.equals(this.action, taskTransitionDefinition.action);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromState, toState, trigger, guard, action);
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
    sb.append("class TaskTransitionDefinition {\n");
    sb.append("    fromState: ").append(toIndentedString(fromState)).append("\n");
    sb.append("    toState: ").append(toIndentedString(toState)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    guard: ").append(toIndentedString(guard)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
    openapiFields.add("fromState");
    openapiFields.add("toState");
    openapiFields.add("trigger");
    openapiFields.add("guard");
    openapiFields.add("action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fromState");
    openapiRequiredFields.add("toState");
    openapiRequiredFields.add("trigger");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TaskTransitionDefinition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaskTransitionDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskTransitionDefinition is not found in the empty JSON string", TaskTransitionDefinition.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaskTransitionDefinition.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("fromState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromState").toString()));
      }
      if (!jsonObj.get("toState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toState").toString()));
      }
      if (!jsonObj.get("trigger").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trigger` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trigger").toString()));
      }
      if ((jsonObj.get("guard") != null && !jsonObj.get("guard").isJsonNull()) && !jsonObj.get("guard").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guard` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guard").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskTransitionDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskTransitionDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskTransitionDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskTransitionDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskTransitionDefinition>() {
           @Override
           public void write(JsonWriter out, TaskTransitionDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaskTransitionDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaskTransitionDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskTransitionDefinition
  * @throws IOException if the JSON string is invalid with respect to TaskTransitionDefinition
  */
  public static TaskTransitionDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskTransitionDefinition.class);
  }

 /**
  * Convert an instance of TaskTransitionDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
