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
import org.threeten.bp.OffsetDateTime;

/**
 * wallet transaction
 */
@ApiModel(description = "wallet transaction")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-06T12:27:50.305+02:00")
public class GetCorporationsCorporationIdWalletsDivisionTransactions200Ok {
  @SerializedName("client_id")
  private Integer clientId = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("is_buy")
  private Boolean isBuy = null;

  @SerializedName("journal_ref_id")
  private Long journalRefId = null;

  @SerializedName("location_id")
  private Long locationId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("transaction_id")
  private Long transactionId = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  @SerializedName("unit_price")
  private Double unitPrice = null;

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * client_id integer
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "client_id integer")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Date and time of transaction
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date and time of transaction")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok isBuy(Boolean isBuy) {
    this.isBuy = isBuy;
    return this;
  }

   /**
   * is_buy boolean
   * @return isBuy
  **/
  @ApiModelProperty(required = true, value = "is_buy boolean")
  public Boolean isIsBuy() {
    return isBuy;
  }

  public void setIsBuy(Boolean isBuy) {
    this.isBuy = isBuy;
  }

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok journalRefId(Long journalRefId) {
    this.journalRefId = journalRefId;
    return this;
  }

   /**
   * journal_ref_id integer
   * @return journalRefId
  **/
  @ApiModelProperty(required = true, value = "journal_ref_id integer")
  public Long getJournalRefId() {
    return journalRefId;
  }

  public void setJournalRefId(Long journalRefId) {
    this.journalRefId = journalRefId;
  }

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * location_id integer
   * @return locationId
  **/
  @ApiModelProperty(required = true, value = "location_id integer")
  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity integer
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "quantity integer")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Unique transaction ID
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "Unique transaction ID")
  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * type_id integer
   * @return typeId
  **/
  @ApiModelProperty(required = true, value = "type_id integer")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Amount paid per unit
   * @return unitPrice
  **/
  @ApiModelProperty(required = true, value = "Amount paid per unit")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdWalletsDivisionTransactions200Ok getCorporationsCorporationIdWalletsDivisionTransactions200Ok = (GetCorporationsCorporationIdWalletsDivisionTransactions200Ok) o;
    return Objects.equals(this.clientId, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.clientId) &&
        Objects.equals(this.date, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.date) &&
        Objects.equals(this.isBuy, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.isBuy) &&
        Objects.equals(this.journalRefId, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.journalRefId) &&
        Objects.equals(this.locationId, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.locationId) &&
        Objects.equals(this.quantity, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.quantity) &&
        Objects.equals(this.transactionId, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.transactionId) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.typeId) &&
        Objects.equals(this.unitPrice, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, date, isBuy, journalRefId, locationId, quantity, transactionId, typeId, unitPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdWalletsDivisionTransactions200Ok {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isBuy: ").append(toIndentedString(isBuy)).append("\n");
    sb.append("    journalRefId: ").append(toIndentedString(journalRefId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

