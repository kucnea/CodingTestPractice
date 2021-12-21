package com.algorithm.binarySearch;

public class BinarySearchTest {

	public static void main(String[] args) {
		
		int[] list = {1,2,3,4,5,6,7,8,9};
		int n = 4;
		
		System.out.println(binarySearch(list,n,0,list.length-1));
	}

	private static boolean binarySearch(int[] list, int i, int start, int end) {
		
		while(start<=end) {
			
			int mid = (start+end)/2;
			
			System.out.println("start : "+start+", end : "+end+", mid : "+mid+", i : "+i);
			
			if(list[mid]>i) end = mid-1;
			if(list[mid]<i) start = mid+1;
			if(list[mid]==i) return true;
			
		}
		if(start==end) return true;
		return false;
	}
}
