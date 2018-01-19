package com.williams;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class TestAddZipCodeRestrictionRange {

	IZipCodeService zipCodeRangeService = new ZipCodeService();
	
	@Test
	public void testAddZipCodeRestrictionRange() {
		try{
			Range range = new Range(94133,94133);
	    	zipCodeRangeService.addZipCodeRestrictionRange(range);
	    	doCheckZipCodeRestrictionRangeOutput(range);
		}catch(Exception e){
			fail("testAddZipCodeRestrictionRange: Fail:"+e.getMessage());
		}
	}
	
	public void doCheckZipCodeRestrictionRangeOutput(Range inputRange) {
	    Iterator<Range> iter = zipCodeRangeService.getZipCodeRestrictionRange().iterator();
	     if(!iter.hasNext())
	    	fail("testAddZipCodeRestrictionRange: Fail");
	     else
	       assertEquals("[94133,94133]",inputRange.toString(),iter.next().toString());
	}

}
