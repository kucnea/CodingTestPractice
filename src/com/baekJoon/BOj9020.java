package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOj9020 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int t = Integer.parseInt(s);
		
		int[] list = new int[10001];
		ArrayList<Integer> arr = new ArrayList<Integer>();
		list[0] = 1;
		list[1] = 1;
		
		for(int i = 2 ; i < 100 ; i++) {
			if(list[i]==0) {
				for(int j = i+1 ; j < 10000 ; j++) {
					if(list[j]==0 && j%i==0) list[j]++;
				}
			}
		}
		
		for(int i = 2 ; i < 10000 ; i++) {
			if(list[i]==0) arr.add(i);
		}
		
		
		for(int i = 0 ; i < t ; i++) {
			
			s = br.readLine();
			int c = Integer.parseInt(s);
			ArrayList<Integer> arrM = new ArrayList<Integer>();
			ArrayList<Integer> arrN = new ArrayList<Integer>();
			ArrayList<Integer> arrG = new ArrayList<Integer>();
			
			for(int m = 0 ; m < arr.size(); m++) {
				for(int n = 0 ; n < arr.size() ; n++) {
					if( (c - arr.get(m)) == arr.get(n)) {
						arrM.add(arr.get(m));
						arrN.add(arr.get(n));
						arrG.add(Math.abs(arr.get(m)-arr.get(n)));
					}
				}
			}
			
			int index = 0;
			int temp = 0;
			if(arrG.size()>1) {
				
				for(int m = 1 ; m < arrG.size() ; m++) {
					if(arrG.get(m) > arrG.get(m-1)) index=m-1;
					else index = m;
				}
				
			}else {
				index = 0;
			}
			
			String result = (arrM.get(index) > arrG.get(index))? arrG.get(index)+" "+arrM.get(index) : arrM.get(index) + " " + arrG.get(index);
			bw.write(result+"\n");
			
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}
	
}
