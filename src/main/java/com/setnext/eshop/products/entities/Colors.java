package com.setnext.eshop.products.entities;

public class Colors {
	private String name;
	private String value;

	public Colors() {}

	public Colors(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Colors [name=" + name + ", value=" + value + "]";
	}


}
