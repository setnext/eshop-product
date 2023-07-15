package com.setnext.eshop.products.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockInfo {
	
	@JsonProperty("isOnStock")
	private boolean isOnStock;
	
	@JsonProperty("stockQuantity")
	private int stockQuantity;

	public StockInfo(boolean isOnStock, int stockQuantity) {
		super();
		this.isOnStock = isOnStock;
		this.stockQuantity = stockQuantity;
	}

	public boolean isOnStock() {
		return isOnStock;
	}

	public void setOnStock(boolean isOnStock) {
		this.isOnStock = isOnStock;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	@Override
	public String toString() {
		return "StockInfo [isOnStock=" + isOnStock + ", stockQuantity=" + stockQuantity + "]";
	}

	
	
	


}
