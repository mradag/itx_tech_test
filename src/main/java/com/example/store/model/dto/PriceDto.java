package com.example.store.model.dto;

import java.sql.Timestamp;

import com.example.store.model.Price;

public class PriceDto {
	
	public PriceDto() {
		super();
	}
	
	public PriceDto(Price price) {
		this.id = price.getId();
		this.brandId = price.getBrandId();
		this.startDate = price.getStartDate();
		this.endDate = price.getEndDate();
		this.priceList = price.getPriceList();
		this.productId = price.getProductId();
		this.priority = price.getPriority();
		this.price = price.getPrice();
		this.curr = price.getCurr();
	}
	
	private int id;

	private int brandId;
	
	private Timestamp startDate;
	
	private Timestamp endDate;
	
	private int priceList;
	
	private int productId;
	
	private int priority;
	
	private double price;
	
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
