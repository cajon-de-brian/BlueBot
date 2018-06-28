/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.drsmugleaf.eve.esi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * response object
 */
@ApiModel(description = "response object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-06T12:27:50.305+02:00")
public class PutCharactersCharacterIdCalendarEventIdResponse {
  /**
   * response string
   */
  @JsonAdapter(ResponseEnum.Adapter.class)
  public enum ResponseEnum {
    ACCEPTED("accepted"),
    
    DECLINED("declined"),
    
    TENTATIVE("tentative");

    private String value;

    ResponseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResponseEnum fromValue(String text) {
      for (ResponseEnum b : ResponseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResponseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResponseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResponseEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResponseEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("response")
  private ResponseEnum response = null;

  public PutCharactersCharacterIdCalendarEventIdResponse response(ResponseEnum response) {
    this.response = response;
    return this;
  }

   /**
   * response string
   * @return response
  **/
  @ApiModelProperty(required = true, value = "response string")
  public ResponseEnum getResponse() {
    return response;
  }

  public void setResponse(ResponseEnum response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutCharactersCharacterIdCalendarEventIdResponse putCharactersCharacterIdCalendarEventIdResponse = (PutCharactersCharacterIdCalendarEventIdResponse) o;
    return Objects.equals(this.response, putCharactersCharacterIdCalendarEventIdResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutCharactersCharacterIdCalendarEventIdResponse {\n");
    
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

