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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class PaymentMethod {
	private static final Log log = LogFactory.getLog(PaymentMethod.class);
	private String paymentMethodId;
	private String paymentMethodName;
	private Vendor vendor;
	
	public PaymentMethod(String paymentMethodId, String paymentMethodName, Vendor vendor) {
		this.paymentMethodId = paymentMethodId;
		this.paymentMethodName = paymentMethodName;
		this.vendor = vendor;
	}
	
	public String getPaymentMethodId() {
		return paymentMethodId;
	}
	
	public void setPaymentMethodId(String paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}
	
	public String getPaymentMethodName() {
		return paymentMethodName;
	}
	
	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}
	
	public Vendor getVendor() {
		return vendor;
	}
	
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
	public abstract boolean processPayment(Payment payment);
}
