package com.baekJoon;

import java.io.*;
import java.util.Arrays;

public class BOJ2447Version2 {
	
	static String[][] list = new String[6562][6562];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		for(int i = 1 ; i < n ; i++){
			Arrays.fill(list[i],"*");
		}
		
		
		s(1,1,n,n);
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				if(list[i][j]==null) bw.write(" ");
				else bw.write(list[i][j]);
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void s(double startX, double startY, double x, double y) {
		
		if(startX < 1) startX=1;
		if(startY < 1) startY=1;
		if(x < 1) x=1;
		if(y < 1) y=1;
		
		if(startX>=x || startY>=y) return;
//		if(x-startX==1 || y-startY==1) return;
		
		System.out.println("startX : "+startX+", x ; "+x+", startY : "+startY+", y : "+y);
		for(int i= (int)startX ; i <= x/3 ; i++) {
			for(int j = (int)startY ; j <= y/3 ; j++) {
				list[i][j] = " ";
			}
		}
		for(int i= (int)x*2/3 ; i <= x ; i++) {
			for(int j = (int)y*2/3 ; j <= y ; j++) {
				list[i][j] = " ";
			}
		}
//		System.out.println("case1");
		s(startX, startY, x/3, y/3);
//		System.out.println("case2");
		s(x/3, startY, Math.ceil(x*2/3), y/3);
//		System.out.println("case3");
		s(Math.ceil(x*2/3), startY, x, y/3);
//		System.out.println("case4");
		s(startX, x/3, x/3, Math.ceil(y*2/3));
//		System.out.println("case5");
		s(Math.ceil(x*2/3), x/3, x, Math.ceil(y*2/3));
//		System.out.println("case6");
		s(startX, Math.ceil(x*2/3), x/3, y);
//		System.out.println("case7");
		s(x/3, Math.ceil(x*2/3), Math.ceil(x*2/3), y);
//		System.out.println("case8");
		s(Math.ceil(x*2/3), x*2/3, x, y);
		
	}
	
	
//	private static void star(int n) {
//		
//		StringBuffer time = new StringBuffer();
//		if(n==1) return;
//		for(int i = n/3 ; i < n*(2/3) ; i++){
//			for(int j = n/3 ; j < n*(2/3) ; j++) {
//				list[i][j] = " ";
//			}
//		}
//		
//		star(n/3);
//	}
//	
//	private static boolean check(int x, int y) {
//		
//		
//		return false;
//	}
}
