package com.williams;


import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestInvalidZipCodeRange {

	@Test
	public void testInvalidZipCodeRange() {
		try {
		 ZipCodeUtils.doValidateZipCodeRange(new Range(94133,94033));
		 fail("TestInvalidZipCodeRange Fail: "
		 	+ "Excepted exception with message 'Invalid range bound values' to be thrown");
		}catch(Exception e){
			assertThat(e.getMessage(), containsString("Invalid range bound values"));
		}
          
	}

}
