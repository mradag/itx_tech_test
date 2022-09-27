package com.example.store.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.store.StoreApplication;
import com.example.store.controller.dto.price.GetProductPriceByDateResponse;
import com.example.store.service.PriceService;
import com.example.store.shared.ApiConstants;
import com.google.gson.Gson;

@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = { StoreApplication.class })
public class PriceControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Spy
	private PriceService priceService;
	
	private static final String PARAMETER_APPLICATIONDATE = "applicationDate";
	private static final String PARAMETER_PRODUCT_ID = "productId";
	private static final String PARAMETER_BRAND_ID = "brandId";

	@Test
	void test1() throws Exception {

		MvcResult result = mockMvc.perform(MockMvcRequestBuilders
				.get(ApiConstants.StoreAPI.Price.PATH_API_PRICE
						+ ApiConstants.StoreAPI.Price.PATH_API_PRICE_GET_PRODUCT_PRICE_BY_DATE)
				.content(MediaType.APPLICATION_JSON_VALUE)
				.param(PARAMETER_APPLICATIONDATE, "2020-06-14T00:00:00.000-00:00")
				.param(PARAMETER_PRODUCT_ID, "35455")
				.param(PARAMETER_BRAND_ID, "1"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();

		String resultStr = result.getResponse().getContentAsString();
		var response = new Gson().fromJson(resultStr, GetProductPriceByDateResponse.class);
		
		Assertions.assertEquals(response.getProductId(), 35455);
		Assertions.assertEquals(response.getBrandId(), 1);
		Assertions.assertEquals(response.getPriceList(), 1);
		Assertions.assertEquals(response.getStartDate(), "2020-06-14-00.00.00");
		Assertions.assertEquals(response.getEndDate(), "2020-12-31-23.59.59");
		Assertions.assertEquals(response.getPrice(), 35.5);
		
	}
	
	@Test
	void test2() throws Exception {

		MvcResult result = mockMvc.perform(MockMvcRequestBuilders
				.get(ApiConstants.StoreAPI.Price.PATH_API_PRICE
						+ ApiConstants.StoreAPI.Price.PATH_API_PRICE_GET_PRODUCT_PRICE_BY_DATE)
				.content(MediaType.APPLICATION_JSON_VALUE)
				.param(PARAMETER_APPLICATIONDATE, "2020-06-14T16:00:00.000-00:00")
				.param(PARAMETER_PRODUCT_ID, "35455")
				.param(PARAMETER_BRAND_ID, "1"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();

		String resultStr = result.getResponse().getContentAsString();
		var response = new Gson().fromJson(resultStr, GetProductPriceByDateResponse.class);
		
		Assertions.assertEquals(response.getProductId(), 35455);
		Assertions.assertEquals(response.getBrandId(), 1);
		Assertions.assertEquals(response.getPriceList(), 2);
		Assertions.assertEquals(response.getStartDate(), "2020-06-14-15.00.00");
		Assertions.assertEquals(response.getEndDate(), "2020-06-14-18.30.00");
		Assertions.assertEquals(response.getPrice(), 25.45);
		
	}
	
	
	@Test
	void test3() throws Exception {

		MvcResult result = mockMvc.perform(MockMvcRequestBuilders
				.get(ApiConstants.StoreAPI.Price.PATH_API_PRICE
						+ ApiConstants.StoreAPI.Price.PATH_API_PRICE_GET_PRODUCT_PRICE_BY_DATE)
				.content(MediaType.APPLICATION_JSON_VALUE)
				.param(PARAMETER_APPLICATIONDATE, "2020-06-14T21:00:00.000-00:00")
				.param(PARAMETER_PRODUCT_ID, "35455")
				.param(PARAMETER_BRAND_ID, "1"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();

		String resultStr = result.getResponse().getContentAsString();
		var response = new Gson().fromJson(resultStr, GetProductPriceByDateResponse.class);
		
		Assertions.assertEquals(response.getProductId(), 35455);
		Assertions.assertEquals(response.getBrandId(), 1);
		Assertions.assertEquals(response.getPriceList(), 1);
		Assertions.assertEquals(response.getStartDate(), "2020-06-14-00.00.00");
		Assertions.assertEquals(response.getEndDate(), "2020-12-31-23.59.59");
		Assertions.assertEquals(response.getPrice(), 35.5);
		
	}
	
	@Test
	void test4() throws Exception {

		MvcResult result = mockMvc.perform(MockMvcRequestBuilders
				.get(ApiConstants.StoreAPI.Price.PATH_API_PRICE
						+ ApiConstants.StoreAPI.Price.PATH_API_PRICE_GET_PRODUCT_PRICE_BY_DATE)
				.content(MediaType.APPLICATION_JSON_VALUE)
				.param(PARAMETER_APPLICATIONDATE, "2020-06-15T10:00:00.000-00:00")
				.param(PARAMETER_PRODUCT_ID, "35455")
				.param(PARAMETER_BRAND_ID, "1"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();

		String resultStr = result.getResponse().getContentAsString();
		var response = new Gson().fromJson(resultStr, GetProductPriceByDateResponse.class);
		
		Assertions.assertEquals(response.getProductId(), 35455);
		Assertions.assertEquals(response.getBrandId(), 1);
		Assertions.assertEquals(response.getPriceList(), 3);
		Assertions.assertEquals(response.getStartDate(), "2020-06-15-00.00.00");
		Assertions.assertEquals(response.getEndDate(), "2020-06-15-11.00.00");
		Assertions.assertEquals(response.getPrice(), 30.5);
		
	}
	
	@Test
	void test5() throws Exception {

		MvcResult result = mockMvc.perform(MockMvcRequestBuilders
				.get(ApiConstants.StoreAPI.Price.PATH_API_PRICE
						+ ApiConstants.StoreAPI.Price.PATH_API_PRICE_GET_PRODUCT_PRICE_BY_DATE)
				.content(MediaType.APPLICATION_JSON_VALUE)
				.param(PARAMETER_APPLICATIONDATE, "2020-06-16T21:00:00.000-00:00")
				.param(PARAMETER_PRODUCT_ID, "35455")
				.param(PARAMETER_BRAND_ID, "1"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();

		String resultStr = result.getResponse().getContentAsString();
		var response = new Gson().fromJson(resultStr, GetProductPriceByDateResponse.class);
		
		Assertions.assertEquals(response.getProductId(), 35455);
		Assertions.assertEquals(response.getBrandId(), 1);
		Assertions.assertEquals(response.getPriceList(), 4);
		Assertions.assertEquals(response.getStartDate(), "2020-06-15-16.00.00");
		Assertions.assertEquals(response.getEndDate(), "2020-12-31-23.59.59");
		Assertions.assertEquals(response.getPrice(), 38.95);
		
	}
}
