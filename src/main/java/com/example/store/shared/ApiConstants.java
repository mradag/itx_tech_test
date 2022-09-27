package com.example.store.shared;

public final class ApiConstants {

	private static final String UTILITY_CLASS = "This is a utility class and cannot be instantiated";

	private ApiConstants() {
		throw new UnsupportedOperationException(UTILITY_CLASS);
	}

	public static class StoreAPI {

		private StoreAPI() {
			throw new UnsupportedOperationException(UTILITY_CLASS);
		}

		public static final String PATH_API_MAIN = "/store";
		
		public static class Price {
			
			private Price() {
				throw new UnsupportedOperationException(UTILITY_CLASS);
			}
			
			public static final String PATH_API_PRICE = PATH_API_MAIN + "/prices";
			public static final String PATH_API_PRICE_GET_PRODUCT_PRICE_BY_DATE = "/getProductPriceByDate";
			
		}

	}

}
