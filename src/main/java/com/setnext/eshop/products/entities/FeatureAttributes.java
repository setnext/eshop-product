package com.setnext.eshop.products.entities;

public class FeatureAttributes {


	private String key;
	private String value;
	public FeatureAttributes() {

	}

	public FeatureAttributes(String key, String value) {
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
