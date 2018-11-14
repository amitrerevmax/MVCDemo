package com.amit.model;

public class Products {
	
	private int productID;
	private String productCode;
	private String name;
	private int quantity;
	private double price;
	
	public Products() {
		super();
	}
	
	public int getProductID() {
		return productID;
	}
	public String getProductCode() {
		return productCode;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
}
