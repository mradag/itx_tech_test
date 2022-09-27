package com.example.store.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.store.model.Price;

public interface PriceRepository extends CrudRepository<Price, Integer> {

	@Query(value = "Select TOP 1"
			+ "p.ID as id, "
			+ "p.BRAND_ID as brandId, "
			+ "p.START_DATE as startDate, "
			+ "p.END_DATE as endDate, "
			+ "p.PRICE_LIST as priceList, "
			+ "p.PRODUCT_ID as productId, "
			+ "p.PRIORITY as priority, "
			+ "p.PRICE as price, "
			+ "p.CURR as curr "
			+ "from PRICES p "
			+ "WHERE :applicationDate between p.START_DATE and p.END_DATE "
			+ "AND p.PRODUCT_ID = :productId "
			+ "AND p.BRAND_ID = :brandId "
			+ "ORDER BY PRIORITY DESC", nativeQuery = true)
	Price getProductPriceByDate(
			@Param("applicationDate") String applicationDate,
			@Param("productId") int productId,
			@Param("brandId") int brandId);

}
