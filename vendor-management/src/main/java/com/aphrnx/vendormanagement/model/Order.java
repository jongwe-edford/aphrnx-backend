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

import java.time.Instant;
import java.util.List;

public class Order {
	private String orderId;
	private Vendor vendor;
	private List<com.aphrnx.vendormanaement.model.Product> products;
	private Customer customer;
	private double amount;
	private OrderStatus status;
	private Instant orderDate;
	private Instant deliveryDate;
	private ShippingAddress shippingAddress;
}
