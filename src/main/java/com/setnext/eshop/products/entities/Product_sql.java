package com.setnext.eshop.products.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


@Entity(name="Product")
public class Product_sql {
	
	@Id
	@JsonProperty("product_id")
	@GeneratedValue
	private long id;
	
	@JsonProperty("product_name")
	@Size(min=2, message="Product Name should be more than 4 Letters")
	private String name;
	
	@JsonProperty("product_description")
	@Size(min=2, message="Description should be more than 20 Characters")
	private String description;
	
	@JsonProperty("category_id")
	@Size(min=2, message="Categiry Name should be more than 4 Letters")
	private String categoryId;
	
	@JsonProperty("sub_category_id")
	@Size(min=2, message="Categiry Name should be more than 4 Letters")
	private String subCategoryId;
	
	@JsonProperty("brand")
	@Size(min=2, message="Brand Name should be more than 4 Letters")
	private String brand;
	
	
	@NotEmpty(message = "Short Image Url cannot be empty")
	private String short_image_url;
	
	@NotEmpty(message = "Long Image Url cannot be empty")
	private String long_image_url;
	
	
	@Positive(message="Price cannot be in Negative Value")
	private double price;
	
	
	@OneToMany(mappedBy = "product",fetch=FetchType.LAZY , cascade = CascadeType.ALL)
	private List<PriceInfo_sql> priceInfo;
	
	@JsonIgnore
	@OneToOne(mappedBy = "product",cascade = {CascadeType.ALL})
	private VariantInfo_sql variantInfo;
	
	public Product_sql() {}
	
	
	
	
	
	public Product_sql(long id, String name, String description, String short_image_url, String long_image_url,
			double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.short_image_url = short_image_url;
		this.long_image_url = long_image_url;
		this.price = price;
	}





	public long getId() {
		return id;
	}





	public String getName() {
		return name;
	}





	public String getDescription() {
		return description;
	}





	public String getShort_image_url() {
		return short_image_url;
	}





	public String getLong_image_url() {
		return long_image_url;
	}

	public double getPrice() {
		return price;
	}



	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", description=" + description + ", short_image_url="
				+ short_image_url + ", long_image_url=" + long_image_url + ", price=" + price + "]";
	}





	public String getCategoryId() {
		return categoryId;
	}





	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}





	public String getSubCategoryId() {
		return subCategoryId;
	}





	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}





	public String getBrand() {
		return brand;
	}





	public void setBrand(String brand) {
		this.brand = brand;
	}









	public VariantInfo_sql getVariantInfo() {
		return variantInfo;
	}





	public void setVariantInfo(VariantInfo_sql variantInfo) {
		this.variantInfo = variantInfo;
	}





	public void setId(long id) {
		this.id = id;
	}





	public void setName(String name) {
		this.name = name;
	}





	public void setDescription(String description) {
		this.description = description;
	}





	public void setShort_image_url(String short_image_url) {
		this.short_image_url = short_image_url;
	}





	public void setLong_image_url(String long_image_url) {
		this.long_image_url = long_image_url;
	}





	public void setPrice(double price) {
		this.price = price;
	}





	public List<PriceInfo_sql> getPriceInfo() {
		return priceInfo;
	}





	public void setPriceInfo(List<PriceInfo_sql> priceInfo) {
		this.priceInfo = priceInfo;
	}
	
	

}

