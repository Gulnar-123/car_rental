package com.carbikesalerprj.CarBikeSalerPrj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Buynow {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String productname,quantity,fullname,emailaddress,address,paymentmethod;
	public Buynow() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Buynow(String productname, String quantity, String fullname, String emailaddress, String address,
			String paymentmethod) {
		super();
		this.productname = productname;
		this.quantity = quantity;
		this.fullname = fullname;
		this.emailaddress = emailaddress;
		this.address = address;
		this.paymentmethod = paymentmethod;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPaymentmethod() {
		return paymentmethod;
	}
	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}
	

}
