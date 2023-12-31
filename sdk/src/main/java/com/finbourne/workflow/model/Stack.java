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
import java.time.OffsetDateTime;
import java.util.Arrays;
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
 * Information pertaining to the Tasks Stack if one is present
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Stack {
  public static final String SERIALIZED_NAME_MEMBER_ADDED_AS_AT = "memberAddedAsAt";
  @SerializedName(SERIALIZED_NAME_MEMBER_ADDED_AS_AT)
  private OffsetDateTime memberAddedAsAt;

  public static final String SERIALIZED_NAME_STACK_OPENED_AS_AT = "stackOpenedAsAt";
  @SerializedName(SERIALIZED_NAME_STACK_OPENED_AS_AT)
  private OffsetDateTime stackOpenedAsAt;

  public static final String SERIALIZED_NAME_STACK_CLOSED_AS_AT = "stackClosedAsAt";
  @SerializedName(SERIALIZED_NAME_STACK_CLOSED_AS_AT)
  private OffsetDateTime stackClosedAsAt;

  public static final String SERIALIZED_NAME_STACK_MEMBERSHIP_TYPE = "stackMembershipType";
  @SerializedName(SERIALIZED_NAME_STACK_MEMBERSHIP_TYPE)
  private String stackMembershipType;

  public static final String SERIALIZED_NAME_STACK_STATUS = "stackStatus";
  @SerializedName(SERIALIZED_NAME_STACK_STATUS)
  private String stackStatus;

  public static final String SERIALIZED_NAME_LEAD_TASK_ID = "leadTaskId";
  @SerializedName(SERIALIZED_NAME_LEAD_TASK_ID)
  private UUID leadTaskId;

  public static final String SERIALIZED_NAME_LEAD_TASK_STATE = "leadTaskState";
  @SerializedName(SERIALIZED_NAME_LEAD_TASK_STATE)
  private String leadTaskState;

  public static final String SERIALIZED_NAME_TASKS_IN_STACK = "tasksInStack";
  @SerializedName(SERIALIZED_NAME_TASKS_IN_STACK)
  private Integer tasksInStack;

  public Stack() {
  }

  public Stack memberAddedAsAt(OffsetDateTime memberAddedAsAt) {
    
    this.memberAddedAsAt = memberAddedAsAt;
    return this;
  }

   /**
   * When the Task was added to the Stack
   * @return memberAddedAsAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getMemberAddedAsAt() {
    return memberAddedAsAt;
  }


  public void setMemberAddedAsAt(OffsetDateTime memberAddedAsAt) {
    this.memberAddedAsAt = memberAddedAsAt;
  }


  public Stack stackOpenedAsAt(OffsetDateTime stackOpenedAsAt) {
    
    this.stackOpenedAsAt = stackOpenedAsAt;
    return this;
  }

   /**
   * When the Stack was opened
   * @return stackOpenedAsAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getStackOpenedAsAt() {
    return stackOpenedAsAt;
  }


  public void setStackOpenedAsAt(OffsetDateTime stackOpenedAsAt) {
    this.stackOpenedAsAt = stackOpenedAsAt;
  }


  public Stack stackClosedAsAt(OffsetDateTime stackClosedAsAt) {
    
    this.stackClosedAsAt = stackClosedAsAt;
    return this;
  }

   /**
   * When the Stack was closed
   * @return stackClosedAsAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getStackClosedAsAt() {
    return stackClosedAsAt;
  }


  public void setStackClosedAsAt(OffsetDateTime stackClosedAsAt) {
    this.stackClosedAsAt = stackClosedAsAt;
  }


  public Stack stackMembershipType(String stackMembershipType) {
    
    this.stackMembershipType = stackMembershipType;
    return this;
  }

   /**
   * Whether the task is the Lead task of the Stack or a Member within the Stack
   * @return stackMembershipType
  **/
  @jakarta.annotation.Nullable
  public String getStackMembershipType() {
    return stackMembershipType;
  }


  public void setStackMembershipType(String stackMembershipType) {
    this.stackMembershipType = stackMembershipType;
  }


  public Stack stackStatus(String stackStatus) {
    
    this.stackStatus = stackStatus;
    return this;
  }

   /**
   * Status of the Stack (Open/Closed)
   * @return stackStatus
  **/
  @jakarta.annotation.Nullable
  public String getStackStatus() {
    return stackStatus;
  }


  public void setStackStatus(String stackStatus) {
    this.stackStatus = stackStatus;
  }


  public Stack leadTaskId(UUID leadTaskId) {
    
    this.leadTaskId = leadTaskId;
    return this;
  }

   /**
   * ID of the Lead Task
   * @return leadTaskId
  **/
  @jakarta.annotation.Nullable
  public UUID getLeadTaskId() {
    return leadTaskId;
  }


  public void setLeadTaskId(UUID leadTaskId) {
    this.leadTaskId = leadTaskId;
  }


  public Stack leadTaskState(String leadTaskState) {
    
    this.leadTaskState = leadTaskState;
    return this;
  }

   /**
   * State of the Lead Task
   * @return leadTaskState
  **/
  @jakarta.annotation.Nullable
  public String getLeadTaskState() {
    return leadTaskState;
  }


  public void setLeadTaskState(String leadTaskState) {
    this.leadTaskState = leadTaskState;
  }


  public Stack tasksInStack(Integer tasksInStack) {
    
    this.tasksInStack = tasksInStack;
    return this;
  }

   /**
   * Number of Tasks in the Stack
   * @return tasksInStack
  **/
  @jakarta.annotation.Nullable
  public Integer getTasksInStack() {
    return tasksInStack;
  }


  public void setTasksInStack(Integer tasksInStack) {
    this.tasksInStack = tasksInStack;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stack stack = (Stack) o;
    return Objects.equals(this.memberAddedAsAt, stack.memberAddedAsAt) &&
        Objects.equals(this.stackOpenedAsAt, stack.stackOpenedAsAt) &&
        Objects.equals(this.stackClosedAsAt, stack.stackClosedAsAt) &&
        Objects.equals(this.stackMembershipType, stack.stackMembershipType) &&
        Objects.equals(this.stackStatus, stack.stackStatus) &&
        Objects.equals(this.leadTaskId, stack.leadTaskId) &&
        Objects.equals(this.leadTaskState, stack.leadTaskState) &&
        Objects.equals(this.tasksInStack, stack.tasksInStack);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberAddedAsAt, stackOpenedAsAt, stackClosedAsAt, stackMembershipType, stackStatus, leadTaskId, leadTaskState, tasksInStack);
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
    sb.append("class Stack {\n");
    sb.append("    memberAddedAsAt: ").append(toIndentedString(memberAddedAsAt)).append("\n");
    sb.append("    stackOpenedAsAt: ").append(toIndentedString(stackOpenedAsAt)).append("\n");
    sb.append("    stackClosedAsAt: ").append(toIndentedString(stackClosedAsAt)).append("\n");
    sb.append("    stackMembershipType: ").append(toIndentedString(stackMembershipType)).append("\n");
    sb.append("    stackStatus: ").append(toIndentedString(stackStatus)).append("\n");
    sb.append("    leadTaskId: ").append(toIndentedString(leadTaskId)).append("\n");
    sb.append("    leadTaskState: ").append(toIndentedString(leadTaskState)).append("\n");
    sb.append("    tasksInStack: ").append(toIndentedString(tasksInStack)).append("\n");
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
    openapiFields.add("memberAddedAsAt");
    openapiFields.add("stackOpenedAsAt");
    openapiFields.add("stackClosedAsAt");
    openapiFields.add("stackMembershipType");
    openapiFields.add("stackStatus");
    openapiFields.add("leadTaskId");
    openapiFields.add("leadTaskState");
    openapiFields.add("tasksInStack");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Stack
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Stack.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Stack is not found in the empty JSON string", Stack.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("stackMembershipType") != null && !jsonObj.get("stackMembershipType").isJsonNull()) && !jsonObj.get("stackMembershipType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stackMembershipType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stackMembershipType").toString()));
      }
      if ((jsonObj.get("stackStatus") != null && !jsonObj.get("stackStatus").isJsonNull()) && !jsonObj.get("stackStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stackStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stackStatus").toString()));
      }
      if ((jsonObj.get("leadTaskId") != null && !jsonObj.get("leadTaskId").isJsonNull()) && !jsonObj.get("leadTaskId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leadTaskId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leadTaskId").toString()));
      }
      if ((jsonObj.get("leadTaskState") != null && !jsonObj.get("leadTaskState").isJsonNull()) && !jsonObj.get("leadTaskState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leadTaskState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leadTaskState").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Stack.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Stack' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Stack> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Stack.class));

       return (TypeAdapter<T>) new TypeAdapter<Stack>() {
           @Override
           public void write(JsonWriter out, Stack value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Stack read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Stack given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Stack
  * @throws IOException if the JSON string is invalid with respect to Stack
  */
  public static Stack fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Stack.class);
  }

 /**
  * Convert an instance of Stack to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
