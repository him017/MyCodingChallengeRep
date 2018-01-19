package com.williams;

public class ZipCodeUtils {
	static final int VALID_ZIPCODE_DIGITS = 5;
	
	static void doValidateZipCodeRange(Range range){
		if(range == null){
			throw new NullPointerException("Nulls are not allowed");
		}
		
		if(!range.isValidRangeBounds()){
			throw new RuntimeException("Invalid range bound values : " + range.toString());
		}

		if(String.valueOf(range.getLow()).length()!= VALID_ZIPCODE_DIGITS ||
		   String.valueOf(range.getHigh()).length()!= VALID_ZIPCODE_DIGITS){
			throw new RuntimeException(VALID_ZIPCODE_DIGITS + " digit zipcodes only allowed : " + range.toString());
		}
	}

}
