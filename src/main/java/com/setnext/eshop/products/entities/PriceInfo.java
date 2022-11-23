package com.setnext.eshop.products.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Size;


public class PriceInfo {
	
	@JsonProperty("mrp_price")
	@Size(min=2, message="Product Name should be more than 4 Letters")
	private String mrpPrice;
	
	@JsonProperty("discount")
	private String discount;
	
	@JsonProperty("sale_price")
	private String salePrice;

	public PriceInfo(@Size(min = 2, message = "Product Name should be more than 4 Letters") String mrpPrice,
			String discount, String salePrice) {
		super();
		this.mrpPrice = mrpPrice;
		this.discount = discount;
		this.salePrice = salePrice;
	}

	public String getMrpPrice() {
		return mrpPrice;
	}

	public void setMrpPrice(String mrpPrice) {
		this.mrpPrice = mrpPrice;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "PriceInfo [mrpPrice=" + mrpPrice + ", discount=" + discount + ", salePrice=" + salePrice + "]";
	}


	
	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}
	
	
}
