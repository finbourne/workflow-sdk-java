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
import com.finbourne.workflow.model.Link;
import com.finbourne.workflow.model.Parameter;
import com.finbourne.workflow.model.ResourceId;
import com.finbourne.workflow.model.ResultField;
import com.finbourne.workflow.model.VersionInfo;
import com.finbourne.workflow.model.WorkerConfigurationResponse;
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
 * Information about the Worker
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Worker {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_WORKER_CONFIGURATION = "workerConfiguration";
  @SerializedName(SERIALIZED_NAME_WORKER_CONFIGURATION)
  private WorkerConfigurationResponse workerConfiguration;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private VersionInfo version;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<Parameter> parameters;

  public static final String SERIALIZED_NAME_RESULT_FIELDS = "resultFields";
  @SerializedName(SERIALIZED_NAME_RESULT_FIELDS)
  private List<ResultField> resultFields;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public Worker() {
  }

  public Worker id(ResourceId id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getId() {
    return id;
  }


  public void setId(ResourceId id) {
    this.id = id;
  }


  public Worker displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Human readable name
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Worker description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Human readable description
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Worker workerConfiguration(WorkerConfigurationResponse workerConfiguration) {
    
    this.workerConfiguration = workerConfiguration;
    return this;
  }

   /**
   * Get workerConfiguration
   * @return workerConfiguration
  **/
  @jakarta.annotation.Nonnull
  public WorkerConfigurationResponse getWorkerConfiguration() {
    return workerConfiguration;
  }


  public void setWorkerConfiguration(WorkerConfigurationResponse workerConfiguration) {
    this.workerConfiguration = workerConfiguration;
  }


  public Worker version(VersionInfo version) {
    
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


  public Worker parameters(List<Parameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public Worker addParametersItem(Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * The Parameters this Worker accepts or requires.
   * @return parameters
  **/
  @jakarta.annotation.Nullable
  public List<Parameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }


  public Worker resultFields(List<ResultField> resultFields) {
    
    this.resultFields = resultFields;
    return this;
  }

  public Worker addResultFieldsItem(ResultField resultFieldsItem) {
    if (this.resultFields == null) {
      this.resultFields = new ArrayList<>();
    }
    this.resultFields.add(resultFieldsItem);
    return this;
  }

   /**
   * The Fields that the Worker results will come back with.
   * @return resultFields
  **/
  @jakarta.annotation.Nullable
  public List<ResultField> getResultFields() {
    return resultFields;
  }


  public void setResultFields(List<ResultField> resultFields) {
    this.resultFields = resultFields;
  }


  public Worker links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public Worker addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  public List<Link> getLinks() {
    return links;
  }


  public void setLinks(List<Link> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Worker worker = (Worker) o;
    return Objects.equals(this.id, worker.id) &&
        Objects.equals(this.displayName, worker.displayName) &&
        Objects.equals(this.description, worker.description) &&
        Objects.equals(this.workerConfiguration, worker.workerConfiguration) &&
        Objects.equals(this.version, worker.version) &&
        Objects.equals(this.parameters, worker.parameters) &&
        Objects.equals(this.resultFields, worker.resultFields) &&
        Objects.equals(this.links, worker.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, description, workerConfiguration, version, parameters, resultFields, links);
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
    sb.append("class Worker {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    workerConfiguration: ").append(toIndentedString(workerConfiguration)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    resultFields: ").append(toIndentedString(resultFields)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("workerConfiguration");
    openapiFields.add("version");
    openapiFields.add("parameters");
    openapiFields.add("resultFields");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("workerConfiguration");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Worker
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Worker.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Worker is not found in the empty JSON string", Worker.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Worker.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      ResourceId.validateJsonElement(jsonObj.get("id"));
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `workerConfiguration`
      WorkerConfigurationResponse.validateJsonElement(jsonObj.get("workerConfiguration"));
      // validate the optional field `version`
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) {
        VersionInfo.validateJsonElement(jsonObj.get("version"));
      }
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
        if (jsonArrayparameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
          }

          // validate the optional field `parameters` (array)
          for (int i = 0; i < jsonArrayparameters.size(); i++) {
            Parameter.validateJsonElement(jsonArrayparameters.get(i));
          };
        }
      }
      if (jsonObj.get("resultFields") != null && !jsonObj.get("resultFields").isJsonNull()) {
        JsonArray jsonArrayresultFields = jsonObj.getAsJsonArray("resultFields");
        if (jsonArrayresultFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resultFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resultFields` to be an array in the JSON string but got `%s`", jsonObj.get("resultFields").toString()));
          }

          // validate the optional field `resultFields` (array)
          for (int i = 0; i < jsonArrayresultFields.size(); i++) {
            ResultField.validateJsonElement(jsonArrayresultFields.get(i));
          };
        }
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Worker.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Worker' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Worker> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Worker.class));

       return (TypeAdapter<T>) new TypeAdapter<Worker>() {
           @Override
           public void write(JsonWriter out, Worker value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Worker read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Worker given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Worker
  * @throws IOException if the JSON string is invalid with respect to Worker
  */
  public static Worker fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Worker.class);
  }

 /**
  * Convert an instance of Worker to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}