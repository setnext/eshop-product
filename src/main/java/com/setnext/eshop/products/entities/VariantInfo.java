package com.setnext.eshop.products.entities;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VariantInfo {

	@JsonProperty("colors")
	private Colors[] colors;
	@JsonProperty("sizes")
	private String[] sizes;
	@JsonProperty("models")
	private String[] models;


	public VariantInfo() {}


	public VariantInfo(Colors[] colors, String[] sizes, String[] models) {
		super();
		this.colors = colors;
		this.sizes = sizes;
		this.models = models;
	}


	public Colors[] getColors() {
		return colors;
	}


	public void setColors(Colors[] colors) {
		this.colors = colors;
	}


	public String[] getSizes() {
		return sizes;
	}


	public void setSizes(String[] sizes) {
		this.sizes = sizes;
	}


	public String[] getModels() {
		return models;
	}


	public void setModels(String[] models) {
		this.models = models;
	}


	@Override
	public String toString() {
		return "VariantInfo [colors=" + Arrays.toString(colors) + ", sizes=" + Arrays.toString(sizes) + ", models="
				+ Arrays.toString(models) + "]";
	}
	
	

	





}
