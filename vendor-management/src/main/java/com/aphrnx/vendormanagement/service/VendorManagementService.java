/*
 * Copyright (c) 2024 23. This project was created by Edford Jongwe.
 * Website: www.jongwe-edford.netlify.app
 * Git: /jongwe-edford
 * Instagram: /jongwe_edford
 * Facebook: /jongwe_edford
 * Twitter: /edford_jongwe
 * Dribble: /jongwe_edford
 */

package com.aphrnx.vendormanagement.service;

import com.aphrnx.vendormanagement.http.response.Response;
import com.aphrnx.vendormanagement.model.Vendor;

import java.util.Map;

public interface VendorManagementService {
	Response<String> register(Vendor vendor);
	
	Response<Map<String, ?>> unBlock(String vendorId);
	
	Response<Map<String, ?>> approve(String approvalCode);
	
	Response<Object> listAllVendorProduct(String vendorId);
	
	Response<Object> listVendorCustomers(String vendorId);
	
	Response<Object> listVendorOrders(String vendorId);
	
	Response<Object> listAvailablePaymentOptions(String vendorId);
	
	Response<String> addPaymentMethod(String paymentMethod);
}
