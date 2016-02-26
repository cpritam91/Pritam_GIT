package com.training.entity;

public class Item {
	
	private Integer ItemId;
	private String ItemName;
	private Double Price;
	private String Category;
	private Boolean inStock;
	private Boolean isVeg;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(Integer itemId, String itemName, Double price, String category, Boolean inStock, Boolean isVeg) {
		super();
		ItemId = itemId;
		ItemName = itemName;
		Price = price;
		Category = category;
		this.inStock = inStock;
		this.isVeg = isVeg;
	}
	public Integer getItemId() {
		return ItemId;
	}
	public void setItemId(Integer itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Boolean isInStock() {
		return inStock;
	}
	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}
	public Boolean isVeg() {
		return isVeg;
	}
	public void setIsVeg(Boolean isVeg) {
		this.isVeg = isVeg;
	}
	@Override
	public String toString() {
		return "Item [ItemId=" + ItemId + ", ItemName=" + ItemName + ", Price=" + Price + ", Category=" + Category
				+ ", inStock=" + inStock + ", isVeg=" + isVeg + "]";
	}
	
}
