package com.example.store.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.store.exception.dto.ResourceNotFoundException;
import com.example.store.model.dto.PriceDto;
import com.example.store.repository.PriceRepository;

@Service
public class PriceService {

	@Autowired
	private PriceRepository priceRepository;

	@Autowired
	private DateTimeFormatter dateTimeFormatter;

	public PriceDto getProductPriceByDate(LocalDateTime applicationDate, int productId, int brandId) {

		var price = priceRepository.getProductPriceByDate(dateTimeFormatter.format(applicationDate), productId, brandId);

		if (price == null) {
			throw new ResourceNotFoundException("Price not found for given parameters: ApplicationDate: "
					+ applicationDate + " Product ID: " + productId + " Brand ID: " + brandId);
		}

		return new PriceDto(price);

	}

}
