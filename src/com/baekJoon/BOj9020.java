package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOj9020 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int t = Integer.parseInt(s);
		
		/*
			주석 처리 코드는 시간 초과
		*/
		
		boolean[] list = new boolean[10001];
//		ArrayList<Integer> arr = new ArrayList<Integer>();
		list[0] = list[1] = true;
		
//		long startTime = System.currentTimeMillis();
		
		for(int i = 2 ; i < 100 ; i++) {
			if(list[i]==false) {
				for(int j = i*i ; j < 10000 ; j+=i) {
					list[j] = true;
				}
			}
		}
		
//		for(int i = 2 ; i < 10000 ; i++) {
//			if(list[i]==false) arr.add(i);
//		}

		for(int i = 0 ; i < t ; i++) {
			
			s = br.readLine();
			int c = Integer.parseInt(s);
//			ArrayList<Integer> arrM = new ArrayList<Integer>();
//			ArrayList<Integer> arrN = new ArrayList<Integer>();
//			ArrayList<Integer> arrG = new ArrayList<Integer>();
//			int size = 0;
			
//			for(int m = 0 ; m < arr.size(); m++) {
//				for(int n = 0 ; n < arr.size() ; n++) {
//					int tempM = arr.get(m);
//					int tempN = arr.get(n);
//					if( (c - tempM) == tempN) {
//						arrM.add(tempM);
//						arrN.add(tempN);
//						size++;
////					arrG.add(Math.abs(arr.get(m)-arr.get(n)));
			
			int m = 0;
			int n = 0;
					
			for(int j = 0 ; j <= (c/2) ; j++) {
				
				if(!list[j] && !list[c-j]) {
					m = j;
					n = c-j;
				}
				
			}
			
			
			
			
//					}
//				}
//			}
			
//			int index = size/2;
			
//			if(arrG.size()>1) {
//				for(int m = 1 ; m < arrG.size() ; m++) {
//					if(arrG.get(m) > arrG.get(m-1)) index=m-1;
//					else index = m;
//				}
//				
//			}else {
//				index = 0;
//			}
//			String result = (arrM.get(index) > arrN.get(index))? arrN.get(index)+" "+arrM.get(index) : arrM.get(index) + " " + arrN.get(index);
			String result = (m > n)? n+" "+m : m+" "+n;
			bw.write(result+"\n");
			
		}
//		long endTime = System.currentTimeMillis();
//		endTime -= startTime;
//		System.out.println("endTime : "+endTime+"(ms)");
		bw.flush();
		br.close();
		bw.close();
		
	}
	
}
