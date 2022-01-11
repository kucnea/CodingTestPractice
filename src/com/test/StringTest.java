package com.test;

import java.util.Arrays;
import java.io.*;

public class StringTest {

	public static void main(String[] args) throws Exception {
		
		String a = "a";
		String b = "b";
		
		System.out.println("a.substring(0,1) : "+a.substring(0,1));
		
		System.out.println(a.compareTo("c"));
		
		String c = "cba";
		
		char[] arr = c.toCharArray();
		Arrays.sort(arr);
		
		c = new StringBuilder(new String(arr)).toString();
		System.out.println("c :"+c);
		
		String d = "a2";
		arr = null;
		arr = d.toCharArray();
		for(int i = 0; i < arr.length ; i++) {
			System.out.println("arr[i] : "+arr[i]);
		}
				
		
		a = "";
		System.out.println("a.length : "+a.length());
		int i = 1;
		a += (i+1);
		System.out.println("a : "+a);
		
		System.out.println("=======");
		a = "";
		a = "1234";
		System.out.println(a.substring(0,1));
		System.out.println(a.substring(1,2));
		System.out.println(a.substring(2,3));
		System.out.println(a.substring(3,4));
		System.out.println(a.substring(4,4));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		bw.write("s : "+s+"\n");
		bw.write("s.equals null : "+s.equals(null)+"\n");
		bw.write("s.equals \"\" : "+s.equals(""));
		bw.flush();
		bw.close();
		br.close();
	}
	
}
