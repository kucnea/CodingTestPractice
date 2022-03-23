package com.baekJoon;

import java.io.*;

public class BOJ1003 {
	
	static int[] fivo;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		fivo = new int[41];
		
		fivo[0] = 0;
		fivo[1] = 1;
		for(int i = 2 ; i <= 40 ; i++) {
			fivo[i] = fivo[i-1] + fivo[i-2];
		}
		
		String[] f = new String[41];
		int[] c1 = new int[41];
		int[] c0 = new int[41];
		
		for(int i = 0 ; i <= 40 ; i++) {
			f[i] = fivo[i]+"";
		}
		
		for(int i = 0 ; i <= 40 ; i++) {
			
			int zero = 0;
			int one = 0;
			
			if(i<=6) {
				if(f[i].equals("1")) one++;
				else if(f[i].equals("0")) zero++;
			}else if(i<=11) {
				if(f[i].contains("1")) one++;
				else if(f[i].contains("0")) zero++;
			}else {
				for(int j = 0 ; j < f[i].length()-2 ; j++) {
					if(f[i].substring(j,j+1).equals("0")) zero++;
					else if(f[i].substring(j,j+1).equals("1")) one++;
				}
			}
			
			c1[i] = one;
			c0[i] = zero;
		}
		
		//피보나치 테스트
//		for(int i = 0 ; i <= 40 ; i++) {
//			System.out.print(fivo[i]+" ");
//		}
//		System.out.println();
//		for(int i = 0 ; i <= 40 ; i++) {
//			System.out.print(c1[i]+" ");
//		}
//		System.out.println();
//		for(int i = 0 ; i <= 40 ; i++) {
//			System.out.print(c0[i]+" ");
//		}
//		System.out.println();
		
		
		for(int i = 0 ; i < t ; i++) {
			
			int n = Integer.parseInt(br.readLine());
			int sumOne = 0;
			int sumZero = 0;
			StringBuffer temp = new StringBuffer();
			for(int j = 0 ; j <= n ; j++) {
				sumOne += c1[j];
				sumZero += c0[j];
			}
			
			temp.append(sumZero+" "+sumOne+"\n");
			bw.write(temp+"");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
