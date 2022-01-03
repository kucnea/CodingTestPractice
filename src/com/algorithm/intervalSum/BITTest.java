package com.algorithm.intervalSum;

import java.io.*;

public class BITTest {
	
	private static int[] list;
	
	private static int[] set(int n) {
		int count = 1;
		while(true) {
			count *= 2;
			if(count>n) break;
		}
		int[] result = new int[count];
		return result;
	}
	
	private static void update(int index, int value) {
		int i = index; 
		while(true) {
			if(i>=list.length) {
				list[list.length-1] += value;
				System.out.println("update// index :"+index+", i : "+i+", value : "+value+", list[list.length-1] : "+list[list.length-1]);
				break;
			}
			list[i] += value;
			System.out.println("update// index :"+index+", i : "+i+", value : "+value+", list[i] : "+list[i]);
			i += Integer.parseInt(Integer.toBinaryString(i & -i),2);
		}
		System.out.println();
	}
	
	private static void update2(int index, int value) {
		int i = index; 
		value = value-list[index];
		while(true) {
			if(i>=list.length) {
				list[list.length-1] += value;
				System.out.println("update// index :"+index+", i : "+i+", value : "+value+", list[list.length-1] : "+list[list.length-1]);
				break;
			}
			list[i] += value;
			System.out.println("update// index :"+index+", i : "+i+", value : "+value+", list[i] : "+list[i]);
			i += Integer.parseInt(Integer.toBinaryString(i & -i),2);
		}
		System.out.println();
	}
	
	private static int intervalSum(int start, int end) {
		int result = 0;
		System.out.println("interval Sum");
		for(int i = end ; i > 0 ; i -= Integer.parseInt(Integer.toBinaryString(i & -i),2)) {
			if(i==list.length-1) {
				result=list[i];
				break;
			}
			System.out.println("i : "+i+"list[i] :"+list[i]+", end : "+end);
			result += list[i];
		}
		System.out.println("mid interval : "+result);
		for(int i = start ; i > 0 ; i -= Integer.parseInt(Integer.toBinaryString(i & -i),2)) {
			result -= list[i];
		}
		
		return result;
	}
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int n = Integer.parseInt(ss[0]);
		list = set(n+1);
		int m = Integer.parseInt(ss[1]);
		int k = Integer.parseInt(ss[2]);
		
		for(int i = 1 ; i <= n ; i++) {
			s = br.readLine();
			int value = Integer.parseInt(s);
			update(i,value);
		}
		
		System.out.println();
		
		for(int i = 0 ; i < m+k ; i++) {
			s = br.readLine();
			ss = s.split(" ");
			int check = Integer.parseInt(ss[0]);
			int first = Integer.parseInt(ss[1]);
			int second = Integer.parseInt(ss[2]);
			
			if(check==1) update2(first,second);
			else System.out.println(intervalSum(first,second));
		}
		//2,5
		//3,5
		
	}

}
