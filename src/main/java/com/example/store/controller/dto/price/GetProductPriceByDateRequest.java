package com.example.store.controller.dto.price;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class GetProductPriceByDateRequest {

	@NotNull(message = "Application Date field (applicationDate) must not be null")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime applicationDate;

	@NotNull(message = "Product ID field (productId) must not be null")
	private Integer productId;

	@NotNull(message = "Brand ID field (brandId) must not be null")
	private Integer brandId;

	public LocalDateTime getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDateTime applicationDate) {
		this.applicationDate = applicationDate;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

}
