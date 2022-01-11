package com.test;

import java.io.*;
import java.util.*;

public class StringBuilderTest {

	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		StringBuilder sb = new StringBuilder();
//		
//		String str = br.readLine();
//		bw.write("test 1 : "+sb.toString()+"\n");
//		sb.append(str);
//		bw.write("test 2 : "+sb.toString()+"\n");
//		bw.write("test 3 : "+sb.toString()+"\n");
//		
//		bw.flush();
//		bw.close();
//		br.close();
		
		StringBuilder sb = new StringBuilder("가나다");

		System.out.println("sb.toString() : "+sb.toString());
		sb.append("마바사");
		System.out.println("sb.toString() : "+sb.toString());
	}

}
