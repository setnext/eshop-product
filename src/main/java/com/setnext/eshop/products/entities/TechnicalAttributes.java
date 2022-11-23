package com.setnext.eshop.products.entities;

import java.util.Arrays;

public class TechnicalAttributes {
	
	
	private String key;
	private String value;
	
	public TechnicalAttributes(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "FeatureAttributes [key=" + key + ", value=" + value + "]";
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	



	

}
