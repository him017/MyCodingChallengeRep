package com.williams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMainChallenge {

	public static void main(String[] args) {
		IZipCodeService zipCodeRangeService = new ZipCodeService();
		
		List<Range> rangeList;
		System.out.println("TestZipCodeRestrictionRangeChallenge:");
		try {
			rangeList = new ArrayList<Range>();
			rangeList.add(new Range(94133, 94133));
			rangeList.add(new Range(94200, 94299));
			rangeList.add(new Range(94226, 94399));
			rangeList.add(new Range(94600, 94699));

			Iterator<Range> iter = rangeList.iterator();
			System.out.print("Input :");
			while (iter.hasNext()) {
				Range range = iter.next();
				System.out.print(range + " ");
				zipCodeRangeService.addZipCodeRestrictionRange(range);
			}

		} catch (Exception e) {
			System.out.println("\n"+e.getMessage());
		} finally {
			Iterator<Range> iter = zipCodeRangeService.getZipCodeRestrictionRange().iterator();
			System.out.print("\nResult:");
			while (iter.hasNext())
				System.out.print(iter.next() + " ");
		}
	}

}
