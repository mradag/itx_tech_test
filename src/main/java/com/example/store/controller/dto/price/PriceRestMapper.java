package com.example.store.controller.dto.price;

import java.text.SimpleDateFormat;

import com.example.store.model.dto.PriceDto;
import com.example.store.shared.ApplicationConstants;

public class PriceRestMapper {

	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ApplicationConstants.DEFAULT_DATE_FORMAT);

	private PriceRestMapper() {
		throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
	}

	public static GetProductPriceByDateResponse priceDtoToProductPriceByDateResponse(PriceDto dto) {

		GetProductPriceByDateResponse response = new GetProductPriceByDateResponse();
		response.setProductId(dto.getProductId());
		response.setBrandId(dto.getBrandId());
		response.setPriceList(dto.getPriceList());
		response.setStartDate(simpleDateFormat.format(dto.getStartDate()));
		response.setEndDate(simpleDateFormat.format(dto.getEndDate()));
		response.setPrice(dto.getPrice());

		return response;

	}

}
