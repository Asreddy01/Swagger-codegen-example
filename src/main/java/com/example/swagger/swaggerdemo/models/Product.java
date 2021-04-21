package com.example.swagger.swaggerdemo.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-21T06:28:50.558791700+05:30[Asia/Calcutta]")
public class Product   {
  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("productName")
  private String productName = null;

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("productAvalilability")
  private Boolean productAvalilability = true;

  @JsonProperty("productManufactureName")
  private String productManufactureName = null;

  public Product productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")
  
    public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public Product productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * prodcut name
   * @return productName
  **/
  @ApiModelProperty(value = "prodcut name")
  
    public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Product productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Product Type
   * @return productType
  **/
  @ApiModelProperty(value = "Product Type")
  
    public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public Product productAvalilability(Boolean productAvalilability) {
    this.productAvalilability = productAvalilability;
    return this;
  }

  /**
   * Get productAvalilability
   * @return productAvalilability
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isProductAvalilability() {
    return productAvalilability;
  }

  public void setProductAvalilability(Boolean productAvalilability) {
    this.productAvalilability = productAvalilability;
  }

  public Product productManufactureName(String productManufactureName) {
    this.productManufactureName = productManufactureName;
    return this;
  }

  /**
   * Product Manufacture Name
   * @return productManufactureName
  **/
  @ApiModelProperty(value = "Product Manufacture Name")
  
    public String getProductManufactureName() {
    return productManufactureName;
  }

  public void setProductManufactureName(String productManufactureName) {
    this.productManufactureName = productManufactureName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.productId, product.productId) &&
        Objects.equals(this.productName, product.productName) &&
        Objects.equals(this.productType, product.productType) &&
        Objects.equals(this.productAvalilability, product.productAvalilability) &&
        Objects.equals(this.productManufactureName, product.productManufactureName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productName, productType, productAvalilability, productManufactureName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    productAvalilability: ").append(toIndentedString(productAvalilability)).append("\n");
    sb.append("    productManufactureName: ").append(toIndentedString(productManufactureName)).append("\n");
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
