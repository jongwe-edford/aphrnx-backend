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

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.Instant;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@Document(collection = "vendors")
public class Vendor {
	@MongoId
	@Id
	private String vendorId;
	private String vendorName;
	private Contact vendorContact;
	private Address vendorAddress;
	private String vendorDescription;
	private String vendorProfilePhoto;
	private String vendorWebsite;
	private String vendorLocation;
	private double vendorRating;
	private Boolean isBlocked;
	private Boolean isApproved;
	private Instant createdAt;
	private Instant lastUpdatedAt;
	private VendorCategory vendorCategory;
	private VendorType vendorType;
	
	enum VendorCategory {
		ELECTRONICS,
		CLOTHING,
		HOME_GOODS,
		
	}
	
	enum VendorType {
		MANUFACTURER,
		DISTRIBUTOR,
		RETAILER,
		WHOLESALER,
	}
	
}
