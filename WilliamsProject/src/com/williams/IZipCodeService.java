package com.williams;

import java.util.Set;

public interface IZipCodeService {

	/**
	 * addZipCodeRestrictionRange method adds unique zip code restriction range values with no overlapping
	 * @throws NullPointerException
	 * @throws RuntimeException
	 * @param newRange
	 */

	public void addZipCodeRestrictionRange(Range newRange);
	
	/**
	 * Gets zipCode restriction range 
	 * @return 
	 */
	public Set<Range> getZipCodeRestrictionRange();
}
