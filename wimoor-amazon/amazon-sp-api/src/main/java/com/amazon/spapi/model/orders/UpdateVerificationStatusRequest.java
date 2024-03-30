/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.amazon.spapi.model.orders.UpdateVerificationStatusRequestBody;
import java.io.IOException;

/**
 * Request to update the verification status of an order containing regulated products.
 */
@ApiModel(description = "Request to update the verification status of an order containing regulated products.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-25T13:56:53.532+08:00")
public class UpdateVerificationStatusRequest {
  @SerializedName("regulatedOrderVerificationStatus")
  private UpdateVerificationStatusRequestBody regulatedOrderVerificationStatus = null;

  public UpdateVerificationStatusRequest regulatedOrderVerificationStatus(UpdateVerificationStatusRequestBody regulatedOrderVerificationStatus) {
    this.regulatedOrderVerificationStatus = regulatedOrderVerificationStatus;
    return this;
  }

   /**
   * The updated values of the VerificationStatus field.
   * @return regulatedOrderVerificationStatus
  **/
  @ApiModelProperty(required = true, value = "The updated values of the VerificationStatus field.")
  public UpdateVerificationStatusRequestBody getRegulatedOrderVerificationStatus() {
    return regulatedOrderVerificationStatus;
  }

  public void setRegulatedOrderVerificationStatus(UpdateVerificationStatusRequestBody regulatedOrderVerificationStatus) {
    this.regulatedOrderVerificationStatus = regulatedOrderVerificationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVerificationStatusRequest updateVerificationStatusRequest = (UpdateVerificationStatusRequest) o;
    return Objects.equals(this.regulatedOrderVerificationStatus, updateVerificationStatusRequest.regulatedOrderVerificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulatedOrderVerificationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVerificationStatusRequest {\n");
    
    sb.append("    regulatedOrderVerificationStatus: ").append(toIndentedString(regulatedOrderVerificationStatus)).append("\n");
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

