package com.flipkart.bo;

public class ProductBO {
	private int productId;
	private String productNm;
	private String descr;
	private float price;

	public ProductBO(int productId, String productNm, String descr, float price) {
		this.productId = productId;
		this.productNm = productNm;
		this.descr = descr;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
