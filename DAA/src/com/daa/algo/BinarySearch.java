package com.daa.algo;

public class BinarySearch {
	
	int[] array;
	int mid,start,end;
	
	public BinarySearch(int[] array) {
		this.array=array;
		mid=array.length/2;
		start=0;
		end=array.length-1;
		
	}
	
	public int searchElement(int value) {
		
		
		while(start<=end) {
			if(value==array[mid])
				return mid;
		
			else if(value>array[mid]) {
				start=mid+1;
				
			}
			else if(value<array[mid]) {
				end=mid-1;
				
			}
			mid=(start+end)/2;
		}
		
		return -1;
	}
	

}
