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

public class Payment {
	private static final Log log = LogFactory.getLog(Payment.class);
	private String paymentId;
	private double amount;
	private Currency currency;
	private PaymentMethod paymentMethod;
	private Vendor vendor;
	private Order order;
	
	public Payment(String paymentId, double amount, Currency currency, PaymentMethod paymentMethod, Vendor vendor, Order order) {
		this.paymentId = paymentId;
		this.amount = amount;
		this.currency = currency;
		this.paymentMethod = paymentMethod;
		this.vendor = vendor;
		this.order = order;
	}
	
	
	public String getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Currency getCurrency() {
		return currency;
	}
	
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public Vendor getVendor() {
		return vendor;
	}
	
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
}
