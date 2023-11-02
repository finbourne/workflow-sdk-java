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
import com.finbourne.workflow.model.Worker;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
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
 * PagedResourceListOfWorker
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PagedResourceListOfWorker {
  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private String nextPage;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE = "previousPage";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE)
  private String previousPage;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Worker> values = new ArrayList<>();

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public PagedResourceListOfWorker() {
  }

  public PagedResourceListOfWorker nextPage(String nextPage) {
    
    this.nextPage = nextPage;
    return this;
  }

   /**
   * Get nextPage
   * @return nextPage
  **/
  @jakarta.annotation.Nullable
  public String getNextPage() {
    return nextPage;
  }


  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  public PagedResourceListOfWorker previousPage(String previousPage) {
    
    this.previousPage = previousPage;
    return this;
  }

   /**
   * Get previousPage
   * @return previousPage
  **/
  @jakarta.annotation.Nullable
  public String getPreviousPage() {
    return previousPage;
  }


  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }


  public PagedResourceListOfWorker values(List<Worker> values) {
    
    this.values = values;
    return this;
  }

  public PagedResourceListOfWorker addValuesItem(Worker valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @jakarta.annotation.Nonnull
  public List<Worker> getValues() {
    return values;
  }


  public void setValues(List<Worker> values) {
    this.values = values;
  }


  public PagedResourceListOfWorker href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @jakarta.annotation.Nullable
  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public PagedResourceListOfWorker links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public PagedResourceListOfWorker addLinksItem(Link linksItem) {
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
    PagedResourceListOfWorker pagedResourceListOfWorker = (PagedResourceListOfWorker) o;
    return Objects.equals(this.nextPage, pagedResourceListOfWorker.nextPage) &&
        Objects.equals(this.previousPage, pagedResourceListOfWorker.previousPage) &&
        Objects.equals(this.values, pagedResourceListOfWorker.values) &&
        Objects.equals(this.href, pagedResourceListOfWorker.href) &&
        Objects.equals(this.links, pagedResourceListOfWorker.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPage, previousPage, values, href, links);
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
    sb.append("class PagedResourceListOfWorker {\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
    openapiFields.add("nextPage");
    openapiFields.add("previousPage");
    openapiFields.add("values");
    openapiFields.add("href");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("values");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PagedResourceListOfWorker
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PagedResourceListOfWorker.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PagedResourceListOfWorker is not found in the empty JSON string", PagedResourceListOfWorker.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PagedResourceListOfWorker.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nextPage") != null && !jsonObj.get("nextPage").isJsonNull()) && !jsonObj.get("nextPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPage").toString()));
      }
      if ((jsonObj.get("previousPage") != null && !jsonObj.get("previousPage").isJsonNull()) && !jsonObj.get("previousPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousPage").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }

      JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
      // validate the required field `values` (array)
      for (int i = 0; i < jsonArrayvalues.size(); i++) {
        Worker.validateJsonElement(jsonArrayvalues.get(i));
      };
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
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
       if (!PagedResourceListOfWorker.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PagedResourceListOfWorker' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PagedResourceListOfWorker> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PagedResourceListOfWorker.class));

       return (TypeAdapter<T>) new TypeAdapter<PagedResourceListOfWorker>() {
           @Override
           public void write(JsonWriter out, PagedResourceListOfWorker value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PagedResourceListOfWorker read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PagedResourceListOfWorker given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PagedResourceListOfWorker
  * @throws IOException if the JSON string is invalid with respect to PagedResourceListOfWorker
  */
  public static PagedResourceListOfWorker fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PagedResourceListOfWorker.class);
  }

 /**
  * Convert an instance of PagedResourceListOfWorker to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
