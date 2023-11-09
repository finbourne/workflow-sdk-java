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
import com.finbourne.workflow.model.CreateChildTasksAction;
import com.finbourne.workflow.model.FieldMapping;
import com.finbourne.workflow.model.ResourceId;
import com.finbourne.workflow.model.ResultantChildTaskConfiguration;
import com.finbourne.workflow.model.RunWorkerAction;
import com.finbourne.workflow.model.TriggerParentTaskAction;
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



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.finbourne.workflow.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ActionDetails extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ActionDetails.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ActionDetails.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ActionDetails' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateChildTasksAction> adapterCreateChildTasksAction = gson.getDelegateAdapter(this, TypeToken.get(CreateChildTasksAction.class));
            final TypeAdapter<RunWorkerAction> adapterRunWorkerAction = gson.getDelegateAdapter(this, TypeToken.get(RunWorkerAction.class));
            final TypeAdapter<TriggerParentTaskAction> adapterTriggerParentTaskAction = gson.getDelegateAdapter(this, TypeToken.get(TriggerParentTaskAction.class));

            return (TypeAdapter<T>) new TypeAdapter<ActionDetails>() {
                @Override
                public void write(JsonWriter out, ActionDetails value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateChildTasksAction`
                    if (value.getActualInstance() instanceof CreateChildTasksAction) {
                      JsonElement element = adapterCreateChildTasksAction.toJsonTree((CreateChildTasksAction)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `RunWorkerAction`
                    if (value.getActualInstance() instanceof RunWorkerAction) {
                      JsonElement element = adapterRunWorkerAction.toJsonTree((RunWorkerAction)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `TriggerParentTaskAction`
                    if (value.getActualInstance() instanceof TriggerParentTaskAction) {
                      JsonElement element = adapterTriggerParentTaskAction.toJsonTree((TriggerParentTaskAction)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateChildTasksAction, RunWorkerAction, TriggerParentTaskAction");
                }

                @Override
                public ActionDetails read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateChildTasksAction
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreateChildTasksAction.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreateChildTasksAction;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateChildTasksAction'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateChildTasksAction failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateChildTasksAction'", e);
                    }
                    // deserialize RunWorkerAction
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RunWorkerAction.validateJsonElement(jsonElement);
                      actualAdapter = adapterRunWorkerAction;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RunWorkerAction'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RunWorkerAction failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RunWorkerAction'", e);
                    }
                    // deserialize TriggerParentTaskAction
                    try {
                      // validate the JSON object to see if any exception is thrown
                      TriggerParentTaskAction.validateJsonElement(jsonElement);
                      actualAdapter = adapterTriggerParentTaskAction;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'TriggerParentTaskAction'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for TriggerParentTaskAction failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'TriggerParentTaskAction'", e);
                    }

                    if (match == 1) {
                        ActionDetails ret = new ActionDetails();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ActionDetails: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ActionDetails() {
        super("oneOf", Boolean.FALSE);
    }

    public ActionDetails(CreateChildTasksAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ActionDetails(RunWorkerAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ActionDetails(TriggerParentTaskAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateChildTasksAction", CreateChildTasksAction.class);
        schemas.put("RunWorkerAction", RunWorkerAction.class);
        schemas.put("TriggerParentTaskAction", TriggerParentTaskAction.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ActionDetails.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateChildTasksAction, RunWorkerAction, TriggerParentTaskAction
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateChildTasksAction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunWorkerAction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TriggerParentTaskAction) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateChildTasksAction, RunWorkerAction, TriggerParentTaskAction");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateChildTasksAction, RunWorkerAction, TriggerParentTaskAction
     *
     * @return The actual instance (CreateChildTasksAction, RunWorkerAction, TriggerParentTaskAction)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateChildTasksAction`. If the actual instance is not `CreateChildTasksAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateChildTasksAction`
     * @throws ClassCastException if the instance is not `CreateChildTasksAction`
     */
    public CreateChildTasksAction getCreateChildTasksAction() throws ClassCastException {
        return (CreateChildTasksAction)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunWorkerAction`. If the actual instance is not `RunWorkerAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunWorkerAction`
     * @throws ClassCastException if the instance is not `RunWorkerAction`
     */
    public RunWorkerAction getRunWorkerAction() throws ClassCastException {
        return (RunWorkerAction)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TriggerParentTaskAction`. If the actual instance is not `TriggerParentTaskAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TriggerParentTaskAction`
     * @throws ClassCastException if the instance is not `TriggerParentTaskAction`
     */
    public TriggerParentTaskAction getTriggerParentTaskAction() throws ClassCastException {
        return (TriggerParentTaskAction)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ActionDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CreateChildTasksAction
    try {
      CreateChildTasksAction.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateChildTasksAction failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RunWorkerAction
    try {
      RunWorkerAction.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RunWorkerAction failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TriggerParentTaskAction
    try {
      TriggerParentTaskAction.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TriggerParentTaskAction failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ActionDetails with oneOf schemas: CreateChildTasksAction, RunWorkerAction, TriggerParentTaskAction. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ActionDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActionDetails
  * @throws IOException if the JSON string is invalid with respect to ActionDetails
  */
  public static ActionDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActionDetails.class);
  }

 /**
  * Convert an instance of ActionDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
