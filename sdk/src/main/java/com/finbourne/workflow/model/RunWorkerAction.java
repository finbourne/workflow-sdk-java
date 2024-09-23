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
import com.finbourne.workflow.model.ResultantChildTaskConfiguration;
import com.finbourne.workflow.model.WorkerStatusTriggers;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * Defines a Run Worker Action
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RunWorkerAction {
  /**
   * Type name for this Action
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    RUNWORKER("RunWorker");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public static final String SERIALIZED_NAME_WORKER_ID = "workerId";
  @SerializedName(SERIALIZED_NAME_WORKER_ID)
  private ResourceId workerId;

  public static final String SERIALIZED_NAME_WORKER_AS_AT = "workerAsAt";
  @SerializedName(SERIALIZED_NAME_WORKER_AS_AT)
  private OffsetDateTime workerAsAt;

  public static final String SERIALIZED_NAME_WORKER_PARAMETERS = "workerParameters";
  @SerializedName(SERIALIZED_NAME_WORKER_PARAMETERS)
  private Map<String, FieldMapping> workerParameters;

  public static final String SERIALIZED_NAME_WORKER_STATUS_TRIGGERS = "workerStatusTriggers";
  @SerializedName(SERIALIZED_NAME_WORKER_STATUS_TRIGGERS)
  private WorkerStatusTriggers workerStatusTriggers;

  public static final String SERIALIZED_NAME_CHILD_TASK_CONFIGURATIONS = "childTaskConfigurations";
  @SerializedName(SERIALIZED_NAME_CHILD_TASK_CONFIGURATIONS)
  private List<ResultantChildTaskConfiguration> childTaskConfigurations;

  public static final String SERIALIZED_NAME_WORKER_TIMEOUT = "workerTimeout";
  @SerializedName(SERIALIZED_NAME_WORKER_TIMEOUT)
  private Integer workerTimeout;

  public RunWorkerAction() {
  }

  public RunWorkerAction type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type name for this Action
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RunWorkerAction workerId(ResourceId workerId) {
    
    this.workerId = workerId;
    return this;
  }

   /**
   * Get workerId
   * @return workerId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getWorkerId() {
    return workerId;
  }


  public void setWorkerId(ResourceId workerId) {
    this.workerId = workerId;
  }


  public RunWorkerAction workerAsAt(OffsetDateTime workerAsAt) {
    
    this.workerAsAt = workerAsAt;
    return this;
  }

   /**
   * Worker AsAt
   * @return workerAsAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getWorkerAsAt() {
    return workerAsAt;
  }


  public void setWorkerAsAt(OffsetDateTime workerAsAt) {
    this.workerAsAt = workerAsAt;
  }


  public RunWorkerAction workerParameters(Map<String, FieldMapping> workerParameters) {
    
    this.workerParameters = workerParameters;
    return this;
  }

  public RunWorkerAction putWorkerParametersItem(String key, FieldMapping workerParametersItem) {
    if (this.workerParameters == null) {
      this.workerParameters = new HashMap<>();
    }
    this.workerParameters.put(key, workerParametersItem);
    return this;
  }

   /**
   * Parameters for this Worker
   * @return workerParameters
  **/
  @jakarta.annotation.Nullable
  public Map<String, FieldMapping> getWorkerParameters() {
    return workerParameters;
  }


  public void setWorkerParameters(Map<String, FieldMapping> workerParameters) {
    this.workerParameters = workerParameters;
  }


  public RunWorkerAction workerStatusTriggers(WorkerStatusTriggers workerStatusTriggers) {
    
    this.workerStatusTriggers = workerStatusTriggers;
    return this;
  }

   /**
   * Get workerStatusTriggers
   * @return workerStatusTriggers
  **/
  @jakarta.annotation.Nullable
  public WorkerStatusTriggers getWorkerStatusTriggers() {
    return workerStatusTriggers;
  }


  public void setWorkerStatusTriggers(WorkerStatusTriggers workerStatusTriggers) {
    this.workerStatusTriggers = workerStatusTriggers;
  }


  public RunWorkerAction childTaskConfigurations(List<ResultantChildTaskConfiguration> childTaskConfigurations) {
    
    this.childTaskConfigurations = childTaskConfigurations;
    return this;
  }

  public RunWorkerAction addChildTaskConfigurationsItem(ResultantChildTaskConfiguration childTaskConfigurationsItem) {
    if (this.childTaskConfigurations == null) {
      this.childTaskConfigurations = new ArrayList<>();
    }
    this.childTaskConfigurations.add(childTaskConfigurationsItem);
    return this;
  }

   /**
   * Tasks can be generated from run worker results; this is the configuration
   * @return childTaskConfigurations
  **/
  @jakarta.annotation.Nullable
  public List<ResultantChildTaskConfiguration> getChildTaskConfigurations() {
    return childTaskConfigurations;
  }


  public void setChildTaskConfigurations(List<ResultantChildTaskConfiguration> childTaskConfigurations) {
    this.childTaskConfigurations = childTaskConfigurations;
  }


  public RunWorkerAction workerTimeout(Integer workerTimeout) {
    
    this.workerTimeout = workerTimeout;
    return this;
  }

   /**
   * Worker WorkerTimeout in seconds
   * @return workerTimeout
  **/
  @jakarta.annotation.Nullable
  public Integer getWorkerTimeout() {
    return workerTimeout;
  }


  public void setWorkerTimeout(Integer workerTimeout) {
    this.workerTimeout = workerTimeout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunWorkerAction runWorkerAction = (RunWorkerAction) o;
    return Objects.equals(this.type, runWorkerAction.type) &&
        Objects.equals(this.workerId, runWorkerAction.workerId) &&
        Objects.equals(this.workerAsAt, runWorkerAction.workerAsAt) &&
        Objects.equals(this.workerParameters, runWorkerAction.workerParameters) &&
        Objects.equals(this.workerStatusTriggers, runWorkerAction.workerStatusTriggers) &&
        Objects.equals(this.childTaskConfigurations, runWorkerAction.childTaskConfigurations) &&
        Objects.equals(this.workerTimeout, runWorkerAction.workerTimeout);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, workerId, workerAsAt, workerParameters, workerStatusTriggers, childTaskConfigurations, workerTimeout);
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
    sb.append("class RunWorkerAction {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    workerAsAt: ").append(toIndentedString(workerAsAt)).append("\n");
    sb.append("    workerParameters: ").append(toIndentedString(workerParameters)).append("\n");
    sb.append("    workerStatusTriggers: ").append(toIndentedString(workerStatusTriggers)).append("\n");
    sb.append("    childTaskConfigurations: ").append(toIndentedString(childTaskConfigurations)).append("\n");
    sb.append("    workerTimeout: ").append(toIndentedString(workerTimeout)).append("\n");
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
    openapiFields.add("workerId");
    openapiFields.add("workerAsAt");
    openapiFields.add("workerParameters");
    openapiFields.add("workerStatusTriggers");
    openapiFields.add("childTaskConfigurations");
    openapiFields.add("workerTimeout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("workerId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunWorkerAction
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunWorkerAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunWorkerAction is not found in the empty JSON string", RunWorkerAction.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunWorkerAction.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `workerId`
      ResourceId.validateJsonElement(jsonObj.get("workerId"));
      // validate the optional field `workerStatusTriggers`
      if (jsonObj.get("workerStatusTriggers") != null && !jsonObj.get("workerStatusTriggers").isJsonNull()) {
        WorkerStatusTriggers.validateJsonElement(jsonObj.get("workerStatusTriggers"));
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
            ResultantChildTaskConfiguration.validateJsonElement(jsonArraychildTaskConfigurations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunWorkerAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunWorkerAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunWorkerAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunWorkerAction.class));

       return (TypeAdapter<T>) new TypeAdapter<RunWorkerAction>() {
           @Override
           public void write(JsonWriter out, RunWorkerAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunWorkerAction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunWorkerAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunWorkerAction
  * @throws IOException if the JSON string is invalid with respect to RunWorkerAction
  */
  public static RunWorkerAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunWorkerAction.class);
  }

 /**
  * Convert an instance of RunWorkerAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
