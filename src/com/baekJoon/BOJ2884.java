package com.baekJoon;

import java.io.*;

public class BOJ2884 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int t = Integer.parseInt(ss[0]);
		int m = Integer.parseInt(ss[1]);
		
		String result = "";
		
		if(m<45) {
			t--;
			m = 60-(45-m);
			if (t<0) t=23;
		}else m = m-45;
		
		result = t+" "+m;
		System.out.println(result);
		
	}
	
}
