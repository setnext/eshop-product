//package com.setnext.eshop.products.entities;
//
//import java.util.Arrays;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.Size;
//
//public class ProductMetaData {
//	
//	@JsonProperty("productName")
//	@Size(min=2, message="Product Name should be more than 5 Letters")
//	private String productName;
//	
//	@JsonProperty("productDescription")
//	@Size(min=2, message="Description should be more than 50 Characters")
//	private String description;
//	
//	@JsonProperty("brand")
//	@NotEmpty(message = "Brand Name cannot be empty")
//	private String brand;
//	
//	@JsonProperty("primaryCategory")
//	private int primaryCategory;
//	
//	@JsonProperty("subCategories")
//	private String[] categories;
//	
//	@JsonProperty("tags")
//	private String[] tags;
//	
//	@JsonProperty("material")
//	private String material;
//	
//	@JsonProperty("kind")
//	private String kind;
//
//	@JsonProperty("mpn")
//	private String mpn;
//	
//
//	
//	public ProductMetaData(@Size(min = 2, message = "Product Name should be more than 5 Letters") String productName,
//			@Size(min = 2, message = "Description should be more than 50 Characters") String description,
//			@NotEmpty(message = "Brand Name cannot be empty") String brand, String[] categories, String[] tags,
//			int primaryCategory, String material, String kind, String mpn) {
//		super();
//		this.productName = productName;
//		this.description = description;
//		this.brand = brand;
//		this.categories = categories;
//		this.tags = tags;
//		this.primaryCategory = primaryCategory;
//		this.material = material;
//		this.kind = kind;
//		this.mpn = mpn;
//	}
//
//
//	public String getProductName() {
//		return productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public String[] getCategories() {
//		return categories;
//	}
//
//	public void setCategories(String[] categories) {
//		this.categories = categories;
//	}
//
//	public String[] getTags() {
//		return tags;
//	}
//
//	public void setTags(String[] tags) {
//		this.tags = tags;
//	}
//
//	public int getPrimaryCategory() {
//		return primaryCategory;
//	}
//
//	public void setPrimaryCategory(int primaryCategory) {
//		this.primaryCategory = primaryCategory;
//	}
//
//	public String getMaterial() {
//		return material;
//	}
//
//	public void setMaterial(String material) {
//		this.material = material;
//	}
//
//	public String getKind() {
//		return kind;
//	}
//
//	public void setKind(String kind) {
//		this.kind = kind;
//	}
//
//	public String getMpn() {
//		return mpn;
//	}
//
//	public void setMpn(String mpn) {
//		this.mpn = mpn;
//	}
//
//	@Override
//	public String toString() {
//		return "ProductMetaData [productName=" + productName + ", description=" + description + ", brand=" + brand
//				+ ", categories=" + Arrays.toString(categories) + ", tags=" + Arrays.toString(tags)
//				+ ", primaryCategory=" + primaryCategory + ", material=" + material + ", kind=" + kind + ", mpn=" + mpn
//				+ "]";
//	}
//	
//	
//	
//	
//	
//
//}
