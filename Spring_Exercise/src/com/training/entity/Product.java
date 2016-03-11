package com.training.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("product")
public class Product {
	
	@Value("51")
	private int productId;
	@Value("Mobile")
	private String productType;
	@Value("Damaged Screen")
	private String description;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productType, String description) {
		super();
		this.productId = productId;
		this.productType = productType;
		this.description = description;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productType=" + productType + ", description=" + description
				+ "]";
	}
}
