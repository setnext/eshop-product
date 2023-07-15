package com.setnext.eshop.products.exceptions;


import java.time.LocalDateTime;

public class ExceptionDetails {

	private LocalDateTime timestamp;
	private String message;
	private String details;
	public ExceptionDetails(LocalDateTime localDateTime, String message, String details) {
		super();
		this.timestamp = localDateTime;
		this.message = message;
		this.details = details;
		System.out.println(this.details);
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}




}
