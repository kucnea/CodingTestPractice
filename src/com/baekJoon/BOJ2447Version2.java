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
		
		for(int i = 1 ; i <= n ; i++){
			Arrays.fill(list[i],"*");
		}
		
		
		s(1,1,n,n);

		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				bw.write(list[i][j]);
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void s(int startX, int startY, int x, int y) {
		
		if(startX < 1) startX=1;
		if(startY < 1) startY=1;
		if(x < 1) x=1;
		if(y < 1) y=1;
		
		if(startX>=x || startY>=y) return;
		if(x-startX==1 || y-startY==1) return;
		
		System.out.println("startX : "+startX+", startY : "+startY+", x ; "+x+", y : "+y);
//		System.out.println("startX*2/3 : "+startX*2/3+", startY : "+startY+", x ; "+x+", y : "+y);
		for(int i = (x/3)+1 ; i <= x*2/3 ; i++) {
			for(int j = (y/3)+1 ; j <= y*2/3 ; j++) {
				list[i][j] = " ";
			}
		}
		System.out.println("case1");
		s(startX, startY, x/3, y/3);
		System.out.println("case2");
		s((x/3)+1, startY, x*2/3, y/3);
		System.out.println("case3");
		s(x*2/3, startY, x, y/3);
		System.out.println("case4");
		s(startX, (y/3)+1,x/3, y*2/3);
		System.out.println("case5");
		s(x*2/3, (y/3)+1,x,y*2/3);
		System.out.println("case6");
		s(startX, y*2/3, x/3, y);
		System.out.println("case7");
		s((x/3)+1, y*2/3, x*2/3, y);
		System.out.println("case8");
		s(x*2/3, y*2/3, x, y);
	}
	
	
}
