/*
 * FINBOURNE Workflow API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.workflow;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.AccessControlledAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.AccessControlledResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ActionDefinition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ActionDefinitionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ActionDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ActionDetailsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ActionId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ActionLog.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ActionLogItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ActionLogOrigin.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ChangeItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.CreateChildTaskConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.CreateChildTasksAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.CreateChildTasksActionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.CreateEventHandlerRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.CreateNewTaskActivity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.CreateNewTaskActivityResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.CreateTaskDefinitionRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.CreateTaskRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.CreateWorkerRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.DeletedEntityResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.EventHandler.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.EventHandlerMapping.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.EventMatchingPattern.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.Fail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.FailResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.FieldMapping.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.GetWorkerResultResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.HealthCheck.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.HealthCheckResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.IdSelectorDefinition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.IdentifierPartSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.InitialState.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.Link.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.LuminesceView.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.LuminesceViewResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.LusidProblemDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.LusidValidationProblemDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.PagedResourceListOfEventHandler.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.PagedResourceListOfTask.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.PagedResourceListOfTaskDefinition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.PagedResourceListOfWorker.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.Parameter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ParameterValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ReadOnlyStates.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ResourceId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ResourceListOfAccessControlledResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ResourceListOfChangeItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ResourceListOfTask.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ResultField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ResultMatchingPattern.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ResultantChildTaskConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.RunWorkerAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.RunWorkerActionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.RunWorkerRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.RunWorkerResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.SchedulerJob.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.SchedulerJobResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.Sleep.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.SleepResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.Stack.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.Task.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TaskActivity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TaskActivityResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TaskDefinition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TaskDefinitionVersion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TaskFieldDefinition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TaskInstanceField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TaskStateDefinition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TaskSummary.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TaskTransitionDefinition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TransitionTriggerDefinition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TriggerParentTaskAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TriggerParentTaskActionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.TriggerSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.UpdateEventHandlerRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.UpdateMatchingTasksActivity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.UpdateMatchingTasksActivityResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.UpdateTaskDefinitionRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.UpdateTaskRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.UpdateWorkerRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.ValueConstraints.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.VersionInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.Worker.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.WorkerConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.WorkerConfigurationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.finbourne.workflow.model.WorkerStatusTriggers.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
