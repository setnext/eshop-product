package com.setnext.eshop.products.entities;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommerceAttributes {
	
	private String[] channel;
	
	@JsonProperty("isAdult")
	private Boolean isAdult;
	
	@JsonProperty("isOnSale")
	private Boolean isOnSale;
	
	
	@JsonProperty("starRating")
	private float starRating;
	
	@JsonProperty("highlightTag")
	private String highlightTag;

	public CommerceAttributes() {}

	public CommerceAttributes(String[] channel, Boolean isAdult, Boolean isOnSale, float starRating,
			String highlightTag) {
		super();
		this.channel = channel;
		this.isAdult = isAdult;
		this.isOnSale = isOnSale;
		this.starRating = starRating;
		this.highlightTag = highlightTag;
	}

	public String[] getChannel() {
		return channel;
	}

	public void setChannel(String[] channel) {
		this.channel = channel;
	}

	public Boolean getIsAdult() {
		return isAdult;
	}

	public void setIsAdult(Boolean isAdult) {
		this.isAdult = isAdult;
	}

	public Boolean getIsOnSale() {
		return isOnSale;
	}

	public void setIsOnSale(Boolean isOnSale) {
		this.isOnSale = isOnSale;
	}

	public float getStarRating() {
		return starRating;
	}

	public void setStarRating(float starRating) {
		this.starRating = starRating;
	}

	public String getHighlightTag() {
		return highlightTag;
	}

	public void setHighlightTag(String highlightTag) {
		this.highlightTag = highlightTag;
	}

	@Override
	public String toString() {
		return "CommerceAttributes [channel=" + Arrays.toString(channel) + ", isAdult=" + isAdult + ", isOnSale="
				+ isOnSale + ", starRating=" + starRating + ", highlightTag=" + highlightTag + "]";
	}
	
	
	
	
}
