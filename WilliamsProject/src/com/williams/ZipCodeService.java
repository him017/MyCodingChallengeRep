package com.williams;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class ZipCodeService implements IZipCodeService, Serializable{

	private static final long serialVersionUID = 1L;
	
	SortedSet<Range> zipCodeRangeSet;
	
	
	/**
	 * addZipCodeRestrictionRange method adds unique zip code restriction range values with no overlapping
	 * @throws NullPointerException
	 * @throws RuntimeException
	 * @param newRange
	 */
	@Override
	public void addZipCodeRestrictionRange(Range newRange) {
		
		ZipCodeUtils.doValidateZipCodeRange(newRange);    

		if(zipCodeRangeSet == null){
			zipCodeRangeSet = new ConcurrentSkipListSet<Range>();
		}

		if(zipCodeRangeSet.isEmpty()){
			zipCodeRangeSet.add(newRange);
			return;
		}

		
	    boolean isRangeOverLapped = false;
	    Iterator<Range> iter = zipCodeRangeSet.iterator();
	    while (iter.hasNext()) { 
	      Range oldRange    = iter.next();
	      isRangeOverLapped = oldRange.isRangeOverLappped(newRange);
	      if(isRangeOverLapped){
	    	 newRange.setLow (Math.min(oldRange.getLow(),  newRange.getLow()));	    	  
	    	 newRange.setHigh(Math.max(oldRange.getHigh(), newRange.getHigh())); 
	    	 zipCodeRangeSet.remove(oldRange);
	      }
	     }
	    
	     zipCodeRangeSet.add(newRange);
	}


	/**
	 * Gets zipCode restriction range 
	 * @return
	 */
	@Override
	public Set<Range> getZipCodeRestrictionRange(){
		return zipCodeRangeSet;
	}
	
	

}
