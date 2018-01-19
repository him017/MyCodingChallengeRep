package com.williams;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestNullZipCodeRange {

	Range range;

	@Test
	public void testNullZipCodeRange() {
		try {
			ZipCodeUtils.doValidateZipCodeRange(range);
			fail("testNullZipCodeRange Fail: "
			    + "Excepted exception with message 'Nulls are not allowed' to be thrown");
		} catch (Exception e) {
			assertThat(e.getMessage(), containsString("Nulls are not allowed"));
		}
	}
}
