package com.example.store.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.store.shared.DatabaseConstants;

@Entity(name = DatabaseConstants.Prices.ENTITY_NAME)
public class Price {

	@Id
	@Column(name = DatabaseConstants.Prices.ID)
	private int id;

	@Column(name = DatabaseConstants.Prices.BRAND_ID)
	private int brandId;

	@Column(name = DatabaseConstants.Prices.START_DATE)
	private Timestamp startDate;

	@Column(name = DatabaseConstants.Prices.END_DATE)
	private Timestamp endDate;

	@Column(name = DatabaseConstants.Prices.PRICE_LIST)
	private int priceList;

	@Column(name = DatabaseConstants.Prices.PRODUCT_ID)
	private int productId;

	@Column(name = DatabaseConstants.Prices.PRIORITY)
	private int priority;

	@Column(name = DatabaseConstants.Prices.PRICE)
	private double price;

	@Column(name = DatabaseConstants.Prices.CURR)
	private String curr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public int getPriceList() {
		return priceList;
	}

	public void setPriceList(int priceList) {
		this.priceList = priceList;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

}
