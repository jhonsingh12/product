package com.flipkart.bo;

public class OrderBo {
	private int productId;
	private int quantity;
	private String fullAddress;
	private int zip;
	private String city;

	public OrderBo(int productId, int quantity, String fullAddress, int zip,
			String city) {
		this.productId = productId;
		this.quantity = quantity;
		this.fullAddress = fullAddress;
		this.zip = zip;
		this.city = city;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
