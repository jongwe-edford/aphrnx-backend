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

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.Instant;

public class Customer {
	@MongoId
	@Id
	private String customerId;
	private String customerFirstName;
	private String customerLastName;
	private Contact customerContact;
	private Address customerAddress;
	private String customerProfilePhoto;
	private Boolean isBlocked;
	private Boolean isApproved;
	private Instant createdAt;
	private Instant lastUpdatedAt;
	
}
