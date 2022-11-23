package com.setnext.eshop.products.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


@Document("products")
public class Product {
	
	
	@Id
	private String _id;
	
	@JsonProperty("title")
	@Size(min=2, message="Product Name should be more than 4 Letters")
	private String name;
	
	@JsonProperty("description")
	@Size(min=2, message="Description should be more than 20 Characters")
	private String description;
	
	@JsonProperty("categories")
	private String[] categories;
	
	@JsonProperty("brand")
	@Size(min=2, message="Brand Name should be more than 4 Letters")
	private String brand;
	
	@JsonProperty("tags")
	private String[] tags;
	
	private PriceInfo priceInfo;
	
	private VariantInfo variantInfo;
	
	@JsonProperty("image_url")
	
	@NotEmpty(message = "Main Image Url cannot be empty")
	private String imageLink;
	
	@JsonProperty("additional_image_urls")
	private String[] AdditionalImages;
	
	@NotEmpty(message = "Color cannot be empty")
	private String color;
	
	private String model;
	
	@JsonProperty("feature_attributes")
	private List<FeatureAttributes> featureAttributes;
	
	@JsonProperty("techical_attributes")
	private List<TechnicalAttributes> technicalAttributes;
	
	private String material;
	
	private String size;
	
	private TaxInfo tax;
	
	private String channel;
	
	@JsonProperty("is_adult")
	private Boolean isAdult;
	
	
	private String kind;
	
	private String ItemGroupId;
	
	@JsonProperty("product_notes")
	private String[] ProductNotes;
	










	private String mpn;
	
	@JsonProperty("is_on_sale")
	private Boolean isOnSale;
	
	@JsonProperty("in_stock")
	private Boolean inStock;
	
	@JsonProperty("featured_tag")
	private String featuredTag;
	
	@JsonProperty("star_rating")
	private double startRating;
	
	
	
	public Product() {}

	public String getName() {
		return name;
	}


	public String getDescription() {
		return description;
	}


	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String get_id() {
		return _id;
	}


	public void set_id(String _id) {
		this._id = _id;
	}

	public String[] getAdditionalImages() {
		return AdditionalImages;
	}

	public void setAdditionalImages(String[] additionalImages) {
		AdditionalImages = additionalImages;
	}

	public VariantInfo getVariantInfo() {
		return variantInfo;
	}


	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}
    public String getColor() {
		return color;
	}
    public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}


	public String getSizes() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public TaxInfo getTax() {
		return tax;
	}

	public void setTax(TaxInfo tax) {
		this.tax = tax;
	}
    
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Boolean getIsAdult() {
		return isAdult;
	}

	public void setIsAdult(Boolean isAdult) {
		this.isAdult = isAdult;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getItemGroupId() {
		return ItemGroupId;
	}

	public void setItemGroupId(String itemGroupId) {
		ItemGroupId = itemGroupId;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public void setVariantInfo(VariantInfo variantInfo) {
		this.variantInfo = variantInfo;
	}

	public PriceInfo getPriceInfo() {
		return priceInfo;
	}


	public void setPriceInfo(PriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}


	public String getImageLink() {
		return imageLink;
	}


	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}



	public Boolean getIsOnSale() {
		return isOnSale;
	}



	public void setIsOnSale(Boolean isOnSale) {
		this.isOnSale = isOnSale;
	}

	public Boolean getInStock() {
		return inStock;
	}

	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}

	public String getFeaturedTag() {
		return featuredTag;
	}

	public void setFeaturedTag(String featuredTag) {
		this.featuredTag = featuredTag;
	}

	public double getStartRating() {
		return startRating;
	}

	public void setStartRating(double startRating) {
		this.startRating = startRating;
	}


	public String getSize() {
		return size;
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

	public String[] getProductNotes() {
		return ProductNotes;
	}

	public void setProductNotes(String[] productNotes) {
		ProductNotes = productNotes;
	}

	public Product(String _id, @Size(min = 2, message = "Product Name should be more than 4 Letters") String name,
			@Size(min = 2, message = "Description should be more than 20 Characters") String description,
			String[] categories, @Size(min = 2, message = "Brand Name should be more than 4 Letters") String brand,
			String[] tags, PriceInfo priceInfo, VariantInfo variantInfo,
			@NotEmpty(message = "Main Image Url cannot be empty") String imageLink, String[] additionalImages,
			@NotEmpty(message = "Color cannot be empty") String color, String model,
			List<FeatureAttributes> featureAttributes, List<TechnicalAttributes> technicalAttributes, String material,
			String size, TaxInfo tax, String channel, Boolean isAdult, String kind, String itemGroupId,
			String[] productNotes, String mpn, Boolean isOnSale, Boolean inStock, String featuredTag,
			double startRating) {
		super();
		this._id = _id;
		this.name = name;
		this.description = description;
		this.categories = categories;
		this.brand = brand;
		this.tags = tags;
		this.priceInfo = priceInfo;
		this.variantInfo = variantInfo;
		this.imageLink = imageLink;
		AdditionalImages = additionalImages;
		this.color = color;
		this.model = model;
		this.featureAttributes = featureAttributes;
		this.technicalAttributes = technicalAttributes;
		this.material = material;
		this.size = size;
		this.tax = tax;
		this.channel = channel;
		this.isAdult = isAdult;
		this.kind = kind;
		ItemGroupId = itemGroupId;
		ProductNotes = productNotes;
		this.mpn = mpn;
		this.isOnSale = isOnSale;
		this.inStock = inStock;
		this.featuredTag = featuredTag;
		this.startRating = startRating;
	}

	@Override
	public String toString() {
		return "Product [_id=" + _id + ", name=" + name + ", description=" + description + ", categories="
				+ Arrays.toString(categories) + ", brand=" + brand + ", tags=" + Arrays.toString(tags) + ", priceInfo="
				+ priceInfo + ", variantInfo=" + variantInfo + ", imageLink=" + imageLink + ", AdditionalImages="
				+ Arrays.toString(AdditionalImages) + ", color=" + color + ", model=" + model + ", featureAttributes="
				+ featureAttributes + ", technicalAttributes=" + technicalAttributes + ", material=" + material
				+ ", size=" + size + ", tax=" + tax + ", channel=" + channel + ", isAdult=" + isAdult + ", kind=" + kind
				+ ", ItemGroupId=" + ItemGroupId + ", ProductNotes=" + Arrays.toString(ProductNotes) + ", mpn=" + mpn
				+ ", isOnSale=" + isOnSale + ", inStock=" + inStock + ", featuredTag=" + featuredTag + ", startRating="
				+ startRating + "]";
	}

	
	

}

