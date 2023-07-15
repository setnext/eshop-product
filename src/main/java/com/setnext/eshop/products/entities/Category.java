package com.setnext.eshop.products.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Id;

@Document
public class Category {

	@Id
	private String _id;


	@JsonProperty("categoryId")
	private int categoryId;

	@JsonProperty("category")
	private String category;

	@JsonProperty("display_name")
	private String displayName;

	@JsonProperty("sub_category")
	private String subCategory;

	@JsonProperty("sub_category_path")
	private String subCategoryPath;

	@JsonProperty("is_active")
	private Boolean isActive;

	@JsonProperty("is_landing_category")
	private Boolean isLandingCategry;

	@JsonProperty("priority_level")
	private int priorityLevel;

	@JsonProperty("is_root_category")
	private Boolean isRootCategory;

	public String get_id() {
		return _id;
	}


	public void set_id(String _id) {
		this._id = _id;
	}



	public String getSubCategoryPath() {
		return subCategoryPath;
	}

	public void setSubCategoryPath(String subCategoryPath) {
		this.subCategoryPath = subCategoryPath;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public int getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(int priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public Boolean getIsRootCategory() {
		return isRootCategory;
	}

	public void setIsRootCategory(Boolean isRootCategory) {
		this.isRootCategory = isRootCategory;
	}

	public Category() {}



	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}




	public Category(String _id, int categoryId, String category, String displayName, String subCategory,
			String subCategoryPath, Boolean isActive, Boolean isLandingCategry, int priorityLevel,
			Boolean isRootCategory) {
		super();
		this._id = _id;
		this.categoryId = categoryId;
		this.category = category;
		this.displayName = displayName;
		this.subCategory = subCategory;
		this.subCategoryPath = subCategoryPath;
		this.isActive = isActive;
		this.isLandingCategry = isLandingCategry;
		this.priorityLevel = priorityLevel;
		this.isRootCategory = isRootCategory;
	}


	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public Boolean getIsLandingCategry() {
		return isLandingCategry;
	}

	public void setIsLandingCategry(Boolean isLandingCategry) {
		this.isLandingCategry = isLandingCategry;
	}


	public String getDisplayName() {
		return displayName;
	}


	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	@Override
	public String toString() {
		return "Category [_id=" + _id + ", categoryId=" + categoryId + ", category=" + category + ", displayName="
				+ displayName + ", subCategory=" + subCategory + ", subCategoryPath=" + subCategoryPath + ", isActive="
				+ isActive + ", isLandingCategry=" + isLandingCategry + ", priorityLevel=" + priorityLevel
				+ ", isRootCategory=" + isRootCategory + "]";
	}









}
