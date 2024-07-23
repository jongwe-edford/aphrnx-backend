/*
 * Copyright (c) 2024 23. This project was created by Edford Jongwe.
 * Website: www.jongwe-edford.netlify.app
 * Git: /jongwe-edford
 * Instagram: /jongwe_edford
 * Facebook: /jongwe_edford
 * Twitter: /edford_jongwe
 * Dribble: /jongwe_edford
 */

package com.aphrnx.vendormanaement.model;

import com.aphrnx.vendormanagement.model.Brand;
import com.aphrnx.vendormanagement.model.Category;
import com.aphrnx.vendormanagement.model.SubCategory;
import com.aphrnx.vendormanagement.model.Vendor;

import java.util.Collection;

public class Product {
	private String productId;
	private String name;
	private String description;
	private double price;
	private int quantity;
	private Vendor vendor;
	private Category category;
	private SubCategory subCategory;
	private Collection<String> images;
	private Brand brand;
	
}
