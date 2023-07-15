package com.setnext.eshop.products.entities;


import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


@Document("products")
public class Product {
	@Id
	private String _id;
	
	@JsonProperty("productName")
	@Size(min=2, message="Product Name should be more than 5 Letters")
	private String productName;
	
	@JsonProperty("productDescription")
	@Size(min=2, message="Description should be more than 50 Characters")
	private String description;
	
	@JsonProperty("brand")
	@NotEmpty(message = "Brand Name cannot be empty")
	private String brand;
	
	@JsonProperty("primaryCategory")
	private int primaryCategory;
	
	@JsonProperty("subCategories")
	private String[] categories;
	
	@JsonProperty("tags")
	private String[] tags;
	
	@JsonProperty("material")
	private String material;
	
	@JsonProperty("kind")
	private String kind;

	@JsonProperty("mpn")
	private String mpn;
	

	@JsonProperty("productVariants")
	private VariantInfo variantInfo;

	@JsonProperty("productImages")
	private String[] productImages;
	
	@JsonProperty("commerceAttributes")
	private CommerceAttributes commerceAttributes;

	@JsonProperty("priceInfo")
	private PriceInfo priceInfo;
	
	@JsonProperty("stockInfo")
	private StockInfo stockInfo;
	
	@JsonProperty("taxInfo")
	private TaxInfo taxInfo;

	@JsonProperty("feature_attributes")
	private List<FeatureAttributes> featureAttributes;

	@JsonProperty("technical_attributes")
	private List<TechnicalAttributes> technicalAttributes;

	private String ItemGroupId;

	@JsonProperty("product_notes")
	private String[] ProductNotes;




	public Product() {}




	public Product(String _id,
			@Size(min = 2, message = "Product Name should be more than 5 Letters") String productName,
			@Size(min = 2, message = "Description should be more than 50 Characters") String description,
			@NotEmpty(message = "Brand Name cannot be empty") String brand, int primaryCategory, String[] categories,
			String[] tags, String material, String kind, String mpn, VariantInfo variantInfo, String[] productImages,
			CommerceAttributes commerceAttributes, PriceInfo priceInfo, StockInfo stockInfo, TaxInfo taxInfo,
			List<FeatureAttributes> featureAttributes, List<TechnicalAttributes> technicalAttributes,
			String itemGroupId, String[] productNotes) {
		super();
		this._id = _id;
		this.productName = productName;
		this.description = description;
		this.brand = brand;
		this.primaryCategory = primaryCategory;
		this.categories = categories;
		this.tags = tags;
		this.material = material;
		this.kind = kind;
		this.mpn = mpn;
		this.variantInfo = variantInfo;
		this.productImages = productImages;
		this.commerceAttributes = commerceAttributes;
		this.priceInfo = priceInfo;
		this.stockInfo = stockInfo;
		this.taxInfo = taxInfo;
		this.featureAttributes = featureAttributes;
		this.technicalAttributes = technicalAttributes;
		ItemGroupId = itemGroupId;
		ProductNotes = productNotes;
	}




	public String get_id() {
		return _id;
	}




	public void set_id(String _id) {
		this._id = _id;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	public int getPrimaryCategory() {
		return primaryCategory;
	}




	public void setPrimaryCategory(int primaryCategory) {
		this.primaryCategory = primaryCategory;
	}




	public String[] getCategories() {
		return categories;
	}




	public void setCategories(String[] categories) {
		this.categories = categories;
	}




	public String[] getTags() {
		return tags;
	}




	public void setTags(String[] tags) {
		this.tags = tags;
	}




	public String getMaterial() {
		return material;
	}




	public void setMaterial(String material) {
		this.material = material;
	}




	public String getKind() {
		return kind;
	}




	public void setKind(String kind) {
		this.kind = kind;
	}




	public String getMpn() {
		return mpn;
	}




	public void setMpn(String mpn) {
		this.mpn = mpn;
	}




	public VariantInfo getVariantInfo() {
		return variantInfo;
	}




	public void setVariantInfo(VariantInfo variantInfo) {
		this.variantInfo = variantInfo;
	}




	public String[] getProductImages() {
		return productImages;
	}




	public void setProductImages(String[] productImages) {
		this.productImages = productImages;
	}




	public CommerceAttributes getCommerceAttributes() {
		return commerceAttributes;
	}




	public void setCommerceAttributes(CommerceAttributes commerceAttributes) {
		this.commerceAttributes = commerceAttributes;
	}




	public PriceInfo getPriceInfo() {
		return priceInfo;
	}




	public void setPriceInfo(PriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}




	public StockInfo getStockInfo() {
		return stockInfo;
	}




	public void setStockInfo(StockInfo stockInfo) {
		this.stockInfo = stockInfo;
	}




	public TaxInfo getTaxInfo() {
		return taxInfo;
	}




	public void setTaxInfo(TaxInfo taxInfo) {
		this.taxInfo = taxInfo;
	}




	public List<FeatureAttributes> getFeatureAttributes() {
		return featureAttributes;
	}




	public void setFeatureAttributes(List<FeatureAttributes> featureAttributes) {
		this.featureAttributes = featureAttributes;
	}




	public List<TechnicalAttributes> getTechnicalAttributes() {
		return technicalAttributes;
	}




	public void setTechnicalAttributes(List<TechnicalAttributes> technicalAttributes) {
		this.technicalAttributes = technicalAttributes;
	}




	public String getItemGroupId() {
		return ItemGroupId;
	}




	public void setItemGroupId(String itemGroupId) {
		ItemGroupId = itemGroupId;
	}




	public String[] getProductNotes() {
		return ProductNotes;
	}




	public void setProductNotes(String[] productNotes) {
		ProductNotes = productNotes;
	}
	





	




	
	




}

