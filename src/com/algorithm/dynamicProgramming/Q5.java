package com.algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q5 {
		
	static int[] d = new int[2001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		String s = br.readLine();
//		int n = Integer.parseInt(s);
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		int[] list = new int[ss.length];
		
		for(int i = 0 ; i < ss.length ; i++) {
			list[i] = Integer.parseInt(ss[i]);
		}
		long startTime = System.currentTimeMillis();
		int result = solution(list);
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime)/1000;
		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		usedMemory = usedMemory/1048576;
		
		bw.write("result : "+result);
		bw.write("\ntime : "+time);
		bw.write("\nusedMemory : "+usedMemory);
		bw.flush();
		
		br.close();
		bw.close();
		
	}

	
	private static int solution(int[] list) {
		int result = 0;
		
		for(int i = 0 ; i < list.length ; i++) {

			int temp = 0;	

			if(i==0) {
				d[i] = list[i];
				continue;
			}
			if(i==1) {
				if(list[i]<list[i-1]) d[i] = list[i-1]+list[i];
				else d[i] = list[i];
				continue;
			}
			System.out.println("i : "+i);
			for(int j = i-1 ; j <= i ; j++) {
				if(j>0) {
					if(list[j-1]==0) temp += list[j];
					if(list[j]<list[j-1]) temp +=list[j];	
				}
			}
			
			
			if(list[i] > temp) {
				d[i] = d[i-2] + list[i];
				list[i-1] = 0;
			}else {
				d[i] = d[i-2]+temp;
			}
			
		}
		
		for(int i = 0 ; i < list.length ; i++) {
			if(list[i]==0) result++;
		}
		
		return result;
	}
}
