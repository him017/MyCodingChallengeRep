package com.williams;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestNullZipCodeRange.class, TestInvalidZipCodeRange.class, TestInvalidZipCodeDigits.class, 
	            TestAddZipCodeRestrictionRange.class, TestGetZipCodeRestrictionRange.class})
public class AllTests {

}
