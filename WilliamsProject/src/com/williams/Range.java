package com.williams;

import java.io.Serializable;

public class Range implements Serializable,Comparable<Range> {
	
	private static final long serialVersionUID = 1L;

	private int low;
    private int high;


    /**
     * 
     * @param low
     * @param high
     * low value should be less than or equal to high
     */
    public Range(int low, int high){
    	  this.low  = low;
    	  this.high = high;
    }
    
	public int getLow() {
		return low;
	}
	
	public void setLow(int low) {
		this.low = low;
	}

	public int getHigh() {
		return high;
	}
	
	public void setHigh(int high) {
		this.high = high;
	}

	/**
	 * @param other
	 * @return true if the range low and high bounds overlapped with another range low and high bounds
	 * otherwise returns false 
	 */
	public boolean isRangeOverLappped(Range other){
		if(low >= other.low && low <= other.high)
		   return true;
		else if(high >= other.low && high <= other.high)
		   return true;
		else
		   return false;
	}
	
	/**
	 * @return true if the low bound is less than or equal to high otherwise returns false
	 */
	public boolean isValidRangeBounds(){
		if(low<=high)
		  return true;
		else
		  return false;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + high;
		result = prime * result + low;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Range other = (Range) obj;
		if (high != other.high)
			return false;
		if (low != other.low)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + low + ", " + high + "]";
	}

	@Override
	public int compareTo(Range o) {
		return ((Integer)low).compareTo((Integer)o.low);
	}

}
