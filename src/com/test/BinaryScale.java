package com.test;

public class BinaryScale {

	public static void main(String[] args) {
		
		int n = 1;
		int m = 1;
		n = n<<1;
		
		System.out.println(n);
		System.out.println(m);
		int y = n+m;
		System.out.println(y);
		
		n = n>>1;
		System.out.println(n);
		n = n>>1;
		System.out.println(n);
		
		n = 30;
		n = n>>1;
		System.out.println(n);
		
		
//		n = 30;
//		for (int i = 31; i >=0; --i) {
//			System.out.printf("%d", (n>>i)&i);
//			if(i%4==0) {
//				System.out.printf(" ");
//			}
//		}
		System.out.println("=========");
		n=30;
		n = n>>1;
		n = n>>1;
		System.out.println(n);
		
		
		int num = Integer.valueOf("8",8);
		System.out.println(num);
		
		
		
		
	}

}
