package com.setnext.eshop.products.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity(name="PriceInfo")
public class PriceInfo_sql {
	
	@Id
	@GeneratedValue
	private long Id;
	
	@JsonProperty("mrp_price")
	@Size(min=2, message="Product Name should be more than 4 Letters")
	private String mrpPrice;
	
	@JsonProperty("discount")
	@Size(min=2, message="Description should be more than 20 Characters")
	private String discount;
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn(name="product_id", nullable=false)
	private Product_sql product;

	
	public PriceInfo_sql(long id, @Size(min = 2, message = "Product Name should be more than 4 Letters") String mrpPrice,
			@Size(min = 2, message = "Description should be more than 20 Characters") String discount,
			Product_sql product) {
		super();
		Id = id;
		this.mrpPrice = mrpPrice;
		this.discount = discount;
		this.product = product;
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
		return "PriceInfo [mrpPrice=" + mrpPrice + ", discount=" + discount + "]";
	}

	public Product_sql getProduct() {
		return product;
	}

	public void setProduct(Product_sql product) {
		this.product = product;
	}
	
	
}
