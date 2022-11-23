package com.setnext.eshop.products.entities;

public class TaxInfo {
	
	
	private String rate;
	private String country;
	private String region;
	public TaxInfo(String rate, String country, String region) {
		super();
		this.rate = rate;
		this.country = country;
		this.region = region;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	


	

	
	
	
}
