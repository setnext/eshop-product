package com.setnext.eshop.products.entities;

import java.util.Arrays;

public class VariantInfo {
	
	
	private String[] colors;
	private String[] sizes;
	private String[] models;


	public VariantInfo(String[] colors, String[] sizes, String[] models) {
		super();
		this.colors = colors;
		this.sizes = sizes;
		this.models = models;
	}

	

	public String[] getColors() {
		return colors;
	}


	public void setColors(String[] colors) {
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
