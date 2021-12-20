package com.test;

public class RecursiveFunction {

	public static void main(String[] args) {
		
		int count = 0;
		int x = 0;
		count = re(0,count);
		
		System.out.println("count : "+count);
	}
	
	private static int re(int x, int count) {
		
		if(x>10) return count;
		
		x++;
		count += x;
		System.out.println("x : "+x+", count : "+count);
		return re(x,count); 
	}

}
