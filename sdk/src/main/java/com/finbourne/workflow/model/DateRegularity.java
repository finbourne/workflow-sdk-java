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
import com.finbourne.workflow.model.DayOfYear;
import com.finbourne.workflow.model.DayRegularity;
import com.finbourne.workflow.model.RelativeMonthRegularity;
import com.finbourne.workflow.model.SpecificMonthRegularity;
import com.finbourne.workflow.model.WeekRegularity;
import com.finbourne.workflow.model.YearRegularity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



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
public class DateRegularity extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DateRegularity.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DateRegularity.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DateRegularity' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DayRegularity> adapterDayRegularity = gson.getDelegateAdapter(this, TypeToken.get(DayRegularity.class));
            final TypeAdapter<RelativeMonthRegularity> adapterRelativeMonthRegularity = gson.getDelegateAdapter(this, TypeToken.get(RelativeMonthRegularity.class));
            final TypeAdapter<SpecificMonthRegularity> adapterSpecificMonthRegularity = gson.getDelegateAdapter(this, TypeToken.get(SpecificMonthRegularity.class));
            final TypeAdapter<WeekRegularity> adapterWeekRegularity = gson.getDelegateAdapter(this, TypeToken.get(WeekRegularity.class));
            final TypeAdapter<YearRegularity> adapterYearRegularity = gson.getDelegateAdapter(this, TypeToken.get(YearRegularity.class));

            return (TypeAdapter<T>) new TypeAdapter<DateRegularity>() {
                @Override
                public void write(JsonWriter out, DateRegularity value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `DayRegularity`
                    if (value.getActualInstance() instanceof DayRegularity) {
                      JsonElement element = adapterDayRegularity.toJsonTree((DayRegularity)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `RelativeMonthRegularity`
                    if (value.getActualInstance() instanceof RelativeMonthRegularity) {
                      JsonElement element = adapterRelativeMonthRegularity.toJsonTree((RelativeMonthRegularity)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `SpecificMonthRegularity`
                    if (value.getActualInstance() instanceof SpecificMonthRegularity) {
                      JsonElement element = adapterSpecificMonthRegularity.toJsonTree((SpecificMonthRegularity)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `WeekRegularity`
                    if (value.getActualInstance() instanceof WeekRegularity) {
                      JsonElement element = adapterWeekRegularity.toJsonTree((WeekRegularity)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `YearRegularity`
                    if (value.getActualInstance() instanceof YearRegularity) {
                      JsonElement element = adapterYearRegularity.toJsonTree((YearRegularity)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: DayRegularity, RelativeMonthRegularity, SpecificMonthRegularity, WeekRegularity, YearRegularity");
                }

                @Override
                public DateRegularity read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize DayRegularity
                    try {
                      // validate the JSON object to see if any exception is thrown
                      DayRegularity.validateJsonElement(jsonElement);
                      actualAdapter = adapterDayRegularity;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'DayRegularity'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for DayRegularity failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'DayRegularity'", e);
                    }
                    // deserialize RelativeMonthRegularity
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RelativeMonthRegularity.validateJsonElement(jsonElement);
                      actualAdapter = adapterRelativeMonthRegularity;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RelativeMonthRegularity'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RelativeMonthRegularity failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RelativeMonthRegularity'", e);
                    }
                    // deserialize SpecificMonthRegularity
                    try {
                      // validate the JSON object to see if any exception is thrown
                      SpecificMonthRegularity.validateJsonElement(jsonElement);
                      actualAdapter = adapterSpecificMonthRegularity;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'SpecificMonthRegularity'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for SpecificMonthRegularity failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'SpecificMonthRegularity'", e);
                    }
                    // deserialize WeekRegularity
                    try {
                      // validate the JSON object to see if any exception is thrown
                      WeekRegularity.validateJsonElement(jsonElement);
                      actualAdapter = adapterWeekRegularity;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'WeekRegularity'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for WeekRegularity failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'WeekRegularity'", e);
                    }
                    // deserialize YearRegularity
                    try {
                      // validate the JSON object to see if any exception is thrown
                      YearRegularity.validateJsonElement(jsonElement);
                      actualAdapter = adapterYearRegularity;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'YearRegularity'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for YearRegularity failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'YearRegularity'", e);
                    }

                    if (match == 1) {
                        DateRegularity ret = new DateRegularity();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for DateRegularity: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public DateRegularity() {
        super("oneOf", Boolean.FALSE);
    }

    public DateRegularity(DayRegularity o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DateRegularity(RelativeMonthRegularity o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DateRegularity(SpecificMonthRegularity o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DateRegularity(WeekRegularity o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DateRegularity(YearRegularity o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("DayRegularity", DayRegularity.class);
        schemas.put("RelativeMonthRegularity", RelativeMonthRegularity.class);
        schemas.put("SpecificMonthRegularity", SpecificMonthRegularity.class);
        schemas.put("WeekRegularity", WeekRegularity.class);
        schemas.put("YearRegularity", YearRegularity.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return DateRegularity.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * DayRegularity, RelativeMonthRegularity, SpecificMonthRegularity, WeekRegularity, YearRegularity
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof DayRegularity) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RelativeMonthRegularity) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SpecificMonthRegularity) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WeekRegularity) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof YearRegularity) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be DayRegularity, RelativeMonthRegularity, SpecificMonthRegularity, WeekRegularity, YearRegularity");
    }

    /**
     * Get the actual instance, which can be the following:
     * DayRegularity, RelativeMonthRegularity, SpecificMonthRegularity, WeekRegularity, YearRegularity
     *
     * @return The actual instance (DayRegularity, RelativeMonthRegularity, SpecificMonthRegularity, WeekRegularity, YearRegularity)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `DayRegularity`. If the actual instance is not `DayRegularity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DayRegularity`
     * @throws ClassCastException if the instance is not `DayRegularity`
     */
    public DayRegularity getDayRegularity() throws ClassCastException {
        return (DayRegularity)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RelativeMonthRegularity`. If the actual instance is not `RelativeMonthRegularity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RelativeMonthRegularity`
     * @throws ClassCastException if the instance is not `RelativeMonthRegularity`
     */
    public RelativeMonthRegularity getRelativeMonthRegularity() throws ClassCastException {
        return (RelativeMonthRegularity)super.getActualInstance();
    }
    /**
     * Get the actual instance of `SpecificMonthRegularity`. If the actual instance is not `SpecificMonthRegularity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SpecificMonthRegularity`
     * @throws ClassCastException if the instance is not `SpecificMonthRegularity`
     */
    public SpecificMonthRegularity getSpecificMonthRegularity() throws ClassCastException {
        return (SpecificMonthRegularity)super.getActualInstance();
    }
    /**
     * Get the actual instance of `WeekRegularity`. If the actual instance is not `WeekRegularity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WeekRegularity`
     * @throws ClassCastException if the instance is not `WeekRegularity`
     */
    public WeekRegularity getWeekRegularity() throws ClassCastException {
        return (WeekRegularity)super.getActualInstance();
    }
    /**
     * Get the actual instance of `YearRegularity`. If the actual instance is not `YearRegularity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `YearRegularity`
     * @throws ClassCastException if the instance is not `YearRegularity`
     */
    public YearRegularity getYearRegularity() throws ClassCastException {
        return (YearRegularity)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DateRegularity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with DayRegularity
    try {
      DayRegularity.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DayRegularity failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RelativeMonthRegularity
    try {
      RelativeMonthRegularity.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RelativeMonthRegularity failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SpecificMonthRegularity
    try {
      SpecificMonthRegularity.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SpecificMonthRegularity failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with WeekRegularity
    try {
      WeekRegularity.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for WeekRegularity failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with YearRegularity
    try {
      YearRegularity.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for YearRegularity failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for DateRegularity with oneOf schemas: DayRegularity, RelativeMonthRegularity, SpecificMonthRegularity, WeekRegularity, YearRegularity. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of DateRegularity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DateRegularity
  * @throws IOException if the JSON string is invalid with respect to DateRegularity
  */
  public static DateRegularity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DateRegularity.class);
  }

 /**
  * Convert an instance of DateRegularity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

