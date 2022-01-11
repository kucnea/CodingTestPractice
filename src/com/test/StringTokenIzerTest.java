package com.test;

import java.util.*;
import java.io.*;

public class StringTokenIzerTest {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		System.out.println(st.hasMoreTokens());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
	}
	
}
