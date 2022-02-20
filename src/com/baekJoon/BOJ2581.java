package com.baekJoon;

import java.io.*;

public class BOJ2581 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s1 = br.readLine();
		String s2 = br.readLine();
		
		int m = Integer.parseInt(s1);
		int n = Integer.parseInt(s2);
		int[] list = new int[n+1];
		int sum = 0;
		int min = 10001;
		
		
		// �����佺�׳׽��� ü�� n���� �� �ʿ�� ������, ���� ���ϱ����� �ѹ��� ����.
		for(int i = 2 ; i <= n ; i++) {
			
			if(list[i]==0) {
				
				if(i>=m) {
					sum += i;
					min = Math.min(min,i);
				}
				
				for(int j = i ; j <= n ; j++) {
					if(list[j]==0) if(j%i==0) list[j]++;
				}
			}
			
		}
		String result = -1+"";
		if(sum!=0) {
			result = sum+"";
			bw.write(result+"\n");
			result = min+"";
			bw.write(result);	
		}else bw.write(result);
		
		bw.flush();
		br.close();
		bw.close();
		
		
	}
	
}
