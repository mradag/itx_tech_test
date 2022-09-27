package com.example.store.shared;

public class DatabaseConstants {
	
	private static final String UTILITY_CLASS = "This is a utility class and cannot be instantiated";

	private DatabaseConstants() {
		throw new UnsupportedOperationException(UTILITY_CLASS);
	}
	
	public static class Prices {
		
		private Prices() {
			throw new UnsupportedOperationException(UTILITY_CLASS);
		}
		
		public static final String ENTITY_NAME = "PRICES";
		
		public static final String ID = "ID";
		
		public static final String BRAND_ID = "BRAND_ID";
		
		public static final String START_DATE = "START_DATE";
		
		public static final String END_DATE = "END_DATE";
		
		public static final String PRICE_LIST = "PRICE_LIST";
		
		public static final String PRODUCT_ID = "PRODUCT_ID";
		
		public static final String PRIORITY = "PRIORITY";
		
		public static final String PRICE = "PRICE";
		
		public static final String CURR = "CURR";
		
	}

}
