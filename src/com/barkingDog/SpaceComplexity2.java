package com.barkingDog;

public class SpaceComplexity2 {
	
	public static void main(String[] args) {
	
		double a = 0.1;
		double b = 0.5;
		
		System.out.println("a+a+a : "+(a+a+a));
		System.out.println("b+b+b : "+(b+b+b));
		
		boolean resultA = false;
		boolean resultB = false;
		
		if((a+a+a)==0.3) resultA = true;
		if((b+b+b)==1.5) resultB = true;
		System.out.println("(a+a+a)==0.3 : "+resultA);
		System.out.println("(b+b+b)==0.5 : "+resultB);
		
		float c = (float) 0.1;
		boolean resultC = false;
		if((c+c+c)==0.3) resultC = true;
		
		System.out.println("c : "+c);
		System.out.println("(c+c+c)==0.3 : "+resultC);
	}
	
}
