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
import com.github.drsmugleaf.eve.esi.model.PostCorporationsCorporationIdAssetsLocationsPosition;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-06T12:27:50.305+02:00")
public class PostCorporationsCorporationIdAssetsLocations200Ok {
  @SerializedName("item_id")
  private Long itemId = null;

  @SerializedName("position")
  private PostCorporationsCorporationIdAssetsLocationsPosition position = null;

  public PostCorporationsCorporationIdAssetsLocations200Ok itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * item_id integer
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "item_id integer")
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public PostCorporationsCorporationIdAssetsLocations200Ok position(PostCorporationsCorporationIdAssetsLocationsPosition position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(required = true, value = "")
  public PostCorporationsCorporationIdAssetsLocationsPosition getPosition() {
    return position;
  }

  public void setPosition(PostCorporationsCorporationIdAssetsLocationsPosition position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCorporationsCorporationIdAssetsLocations200Ok postCorporationsCorporationIdAssetsLocations200Ok = (PostCorporationsCorporationIdAssetsLocations200Ok) o;
    return Objects.equals(this.itemId, postCorporationsCorporationIdAssetsLocations200Ok.itemId) &&
        Objects.equals(this.position, postCorporationsCorporationIdAssetsLocations200Ok.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, position);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCorporationsCorporationIdAssetsLocations200Ok {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

