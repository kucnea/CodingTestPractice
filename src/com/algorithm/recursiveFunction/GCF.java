package com.algorithm.recursiveFunction;

public class GCF {

	public static void main(String[] args) {
		
		int a = 192;
		int b = 162;
		
		int gcf = Gcf(a,b);
		
		System.out.println("GCF : "+gcf);
	}

	private static int Gcf(int a, int b) {
		
		int result = Math.max(a, b) - Math.min(a, b);
		
		if(result == 0) return a;
		
		result = Gcf(Math.min(a, b), result);
		
		return result;
	}

}
