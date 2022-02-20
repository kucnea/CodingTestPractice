package com.baekJoon;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BOJ10757 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger a = new BigInteger(st.nextToken()); 
		BigInteger b = new BigInteger(st.nextToken());
		
		String result = (a.add(b))+"";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
	
	
}
