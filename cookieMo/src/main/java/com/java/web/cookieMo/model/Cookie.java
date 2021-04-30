package com.java.web.cookieMo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "Cookie")
@Table(name = "Cookie")
public class Cookie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cookie_seq")
	@SequenceGenerator(name = "cookie_seq", sequenceName = "cookie_seq", initialValue = 5550, allocationSize = 1)
	@Column(name = "cookie_id")
	private int cookieId;
	
	@Column(name = "cookieName")
	private String cookieName;
	
	@Column(name = "cookieDescription")
	private String cookieDescription;
	
	@Column(name = "remainingQuantity")
	private int remainingQuantity;
	
	@Column(name = "quantitySold")
	private int quantitySold;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "image")
	private String image;
	
	public int getCookieId() {
		return cookieId;
	}
	public void setCookieId(int cookieId) {
		this.cookieId = cookieId;
	}
	public String getCookieName() {
		return cookieName;
	}
	public void setCookieName(String cookieName) {
		this.cookieName = cookieName;
	}
	public String getCookieDescription() {
		return cookieDescription;
	}
	public void setCookieDescription(String cookieDescription) {
		this.cookieDescription = cookieDescription;
	}
	public int getRemainingQuantity() {
		return remainingQuantity;
	}
	public void setRemainingQuantity(int remainingQuantity) {
		this.remainingQuantity = remainingQuantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
}
