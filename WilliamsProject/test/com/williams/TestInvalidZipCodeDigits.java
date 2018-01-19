package com.williams;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestInvalidZipCodeDigits {


	@Test
	public void testInvalidZipCodeDigits() {
		try {
			ZipCodeUtils.doValidateZipCodeRange(new Range(9413, 94133));
			fail("testInvalidZipCodeDigits Fail: "
				+ "Excepted exception with message '5 digit zipcodes only allowed' to be thrown");
		} catch (Exception e) {
			assertThat(e.getMessage(), containsString("5 digit zipcodes only allowed"));
		}
	}

}
