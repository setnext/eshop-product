package com.setnext.eshop.products.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class VariantInfo_sql {
	
	
	
	@jakarta.persistence.Id
	@GeneratedValue
	private long Id;
	
	
	private String name;


	public VariantInfo_sql(long id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	
	@JoinColumn(name = "product_id")
	@ManyToOne
	private Product_sql product;


	public long getId() {
		return Id;
	}


	public void setId(long id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "VariantInfo [Id=" + Id + ", name=" + name + ", product=" + product + "]";
	}
	
	

}
