/*
 * Copyright (c) 2024 23. This project was created by Edford Jongwe.
 * Website: www.jongwe-edford.netlify.app
 * Git: /jongwe-edford
 * Instagram: /jongwe_edford
 * Facebook: /jongwe_edford
 * Twitter: /edford_jongwe
 * Dribble: /jongwe_edford
 */

package com.aphrnx.vendormanagement.model;

public enum OrderStatus {
	PENDING("Pending"),
	PROCESSING("Processing"),
	SHIPPED("Shipped"),
	DELIVERED("Delivered"),
	CANCELLED("Cancelled"),
	RETURNED("Returned");
	
	private final String status;
	
	OrderStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
}
