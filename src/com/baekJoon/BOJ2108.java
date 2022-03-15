package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ2108 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] list = new int[8001];
		int mc = 0;
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			int temp = Integer.parseInt(br.readLine());
			arr[i] = temp;
			list[temp+4000]++;
			mc = Math.max(mc, list[temp+4000]);
			sum += temp;
		}
		Arrays.sort(arr);
		sum = Math.round(sum/n);
		int mid =0 ;
		if(n!=1) {
			mid = (arr[0]+arr[n-1])/((n/2)+1);
		}else {
			mid = arr[0];
		}
		int count = 0;
		int dis = arr[n-1]-arr[0];

		int flag = 0;
		for(int i = 0 ; i < list.length ; i++) {
			if(mc==list[i]) if(flag<2) {
				count = i-4000;
				flag++;
			}
		}
		
		bw.write(sum+"\n"+mid+"\n"+count+"\n"+dis);
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
