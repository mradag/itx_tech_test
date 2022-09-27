package com.example.store.controller;

import java.text.ParseException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.store.controller.dto.price.PriceRestMapper;
import com.example.store.controller.dto.price.GetProductPriceByDateRequest;
import com.example.store.controller.dto.price.GetProductPriceByDateResponse;
import com.example.store.service.PriceService;
import com.example.store.shared.ApiConstants;

@RestController
@RequestMapping(ApiConstants.StoreAPI.Price.PATH_API_PRICE)
public class PriceController {

	@Autowired
	private PriceService priceService;

	@GetMapping(path = ApiConstants.StoreAPI.Price.PATH_API_PRICE_GET_PRODUCT_PRICE_BY_DATE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetProductPriceByDateResponse> getProductPriceByDate(
			@Valid GetProductPriceByDateRequest request) throws ParseException {

		var dto = priceService.getProductPriceByDate(request.getApplicationDate(), request.getProductId(),
				request.getBrandId());

		var result = PriceRestMapper.priceDtoToProductPriceByDateResponse(dto);

		return new ResponseEntity<GetProductPriceByDateResponse>(result, HttpStatus.OK);

	}

}
