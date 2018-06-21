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
import com.github.drsmugleaf.eve.esi.model.GetFwLeaderboardsCorporationsActiveTotal1;
import com.github.drsmugleaf.eve.esi.model.GetFwLeaderboardsCorporationsLastWeek1;
import com.github.drsmugleaf.eve.esi.model.GetFwLeaderboardsCorporationsYesterday1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Top 10 rankings of corporations by victory points from yesterday, last week and in total
 */
@ApiModel(description = "Top 10 rankings of corporations by victory points from yesterday, last week and in total")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-06T12:27:50.305+02:00")
public class GetFwLeaderboardsCorporationsVictoryPoints {
  @SerializedName("active_total")
  private List<GetFwLeaderboardsCorporationsActiveTotal1> activeTotal = new ArrayList<GetFwLeaderboardsCorporationsActiveTotal1>();

  @SerializedName("last_week")
  private List<GetFwLeaderboardsCorporationsLastWeek1> lastWeek = new ArrayList<GetFwLeaderboardsCorporationsLastWeek1>();

  @SerializedName("yesterday")
  private List<GetFwLeaderboardsCorporationsYesterday1> yesterday = new ArrayList<GetFwLeaderboardsCorporationsYesterday1>();

  public GetFwLeaderboardsCorporationsVictoryPoints activeTotal(List<GetFwLeaderboardsCorporationsActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints addActiveTotalItem(GetFwLeaderboardsCorporationsActiveTotal1 activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

   /**
   * Top 10 ranking of corporations active in faction warfare by total victory points. A corporation is considered \&quot;active\&quot; if they have participated in faction warfare in the past 14 days.
   * @return activeTotal
  **/
  @ApiModelProperty(required = true, value = "Top 10 ranking of corporations active in faction warfare by total victory points. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days.")
  public List<GetFwLeaderboardsCorporationsActiveTotal1> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsCorporationsActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints lastWeek(List<GetFwLeaderboardsCorporationsLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints addLastWeekItem(GetFwLeaderboardsCorporationsLastWeek1 lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

   /**
   * Top 10 ranking of corporations by victory points in the past week
   * @return lastWeek
  **/
  @ApiModelProperty(required = true, value = "Top 10 ranking of corporations by victory points in the past week")
  public List<GetFwLeaderboardsCorporationsLastWeek1> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsCorporationsLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints yesterday(List<GetFwLeaderboardsCorporationsYesterday1> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints addYesterdayItem(GetFwLeaderboardsCorporationsYesterday1 yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

   /**
   * Top 10 ranking of corporations by victory points in the past day
   * @return yesterday
  **/
  @ApiModelProperty(required = true, value = "Top 10 ranking of corporations by victory points in the past day")
  public List<GetFwLeaderboardsCorporationsYesterday1> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsCorporationsYesterday1> yesterday) {
    this.yesterday = yesterday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwLeaderboardsCorporationsVictoryPoints getFwLeaderboardsCorporationsVictoryPoints = (GetFwLeaderboardsCorporationsVictoryPoints) o;
    return Objects.equals(this.activeTotal, getFwLeaderboardsCorporationsVictoryPoints.activeTotal) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsCorporationsVictoryPoints.lastWeek) &&
        Objects.equals(this.yesterday, getFwLeaderboardsCorporationsVictoryPoints.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTotal, lastWeek, yesterday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCorporationsVictoryPoints {\n");
    
    sb.append("    activeTotal: ").append(toIndentedString(activeTotal)).append("\n");
    sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
    sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
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
