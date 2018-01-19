package com.williams;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class TestGetZipCodeRestrictionRange {

	IZipCodeService zipCodeRangeService = new ZipCodeService();

	@Test
	public void testGetZipCodeRestrictionRange() {
		try{
		 Range inputRange = new Range(94133,94133);
		 zipCodeRangeService.addZipCodeRestrictionRange(inputRange);
	     Iterator<Range> iter = zipCodeRangeService.getZipCodeRestrictionRange().iterator();
	     if(!iter.hasNext())
	    	fail("testGetZipCodeRestrictionRange: Fail: Unable to get values.");
	     else
	       assertEquals("[94133,94133]",inputRange.toString(),iter.next().toString());
		}catch(Exception e){
			fail("testGetZipCodeRestrictionRange: Fail:"+e.getMessage());
		}
	}


}
