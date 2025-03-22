package com.rt.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="productdeatails")
public class ProductEntity {
@Id
@GeneratedValue
@Column(name="productId")
@NotNull(message = "ID is required")
//@Min(value = 1, message = "ID must be a positive value")
//@Pattern(regexp = "\\d+", message = "ID must contain only numbers")
private int productId;
@Size(min=3,max=10)
@Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid username format")
@Column(name="productName")
private String productName;

@Column(name="ProductQuantity")
@Min(value = 1, message = "Quantity must be a positive value")
private int ProductQuantity;

@Column(name="productPrice")
@DecimalMin(value = "0.0", inclusive = false, message = "Prize must be a positive value")
private float productPrice;

public ProductEntity(){}

public ProductEntity(int productId, String productName, int productQuantity, float productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	ProductQuantity = productQuantity;
	this.productPrice = productPrice;
}

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public int getProductQuantity() {
	return ProductQuantity;
}

public void setProductQuantity(int productQuantity) {
	ProductQuantity = productQuantity;
}

public float getProductPrice() {
	return productPrice;
}

public void setProductPrice(float productPrice) {
	this.productPrice = productPrice;
}



}
