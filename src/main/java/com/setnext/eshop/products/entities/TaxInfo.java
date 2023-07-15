package com.setnext.eshop.products.entities;

public class TaxInfo {


	private String tax1;
	private String tax2;
	private String tax3;
	
	public TaxInfo() {}
	public TaxInfo(String tax1, String tax2, String tax3) {
		super();
		this.tax1 = tax1;
		this.tax2 = tax2;
		this.tax3 = tax3;
	}
	public String getTax1() {
		return tax1;
	}
	public void setTax1(String tax1) {
		this.tax1 = tax1;
	}
	public String getTax2() {
		return tax2;
	}
	public void setTax2(String tax2) {
		this.tax2 = tax2;
	}
	public String getTax3() {
		return tax3;
	}
	public void setTax3(String tax3) {
		this.tax3 = tax3;
	}
	@Override
	public String toString() {
		return "TaxInfo [tax1=" + tax1 + ", tax2=" + tax2 + ", tax3=" + tax3 + "]";
	}
	
	
	








}
