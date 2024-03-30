/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.productpricing;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.amazon.spapi.model.productpricing.ListingOffersResponseList;
import java.io.IOException;

/**
 * The response associated with the getListingOffersBatch API call.
 */
@ApiModel(description = "The response associated with the getListingOffersBatch API call.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-25T13:39:05.731+08:00")
public class GetListingOffersBatchResponse {
  @SerializedName("responses")
  private ListingOffersResponseList responses = null;

  public GetListingOffersBatchResponse responses(ListingOffersResponseList responses) {
    this.responses = responses;
    return this;
  }

   /**
   * Get responses
   * @return responses
  **/
  @ApiModelProperty(value = "")
  public ListingOffersResponseList getResponses() {
    return responses;
  }

  public void setResponses(ListingOffersResponseList responses) {
    this.responses = responses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetListingOffersBatchResponse getListingOffersBatchResponse = (GetListingOffersBatchResponse) o;
    return Objects.equals(this.responses, getListingOffersBatchResponse.responses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetListingOffersBatchResponse {\n");
    
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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

