package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ9184 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][][] list = new int[101][101][101];
		
		for(int a = 0 ; a < 50 ; a++) {
			for(int b = 0 ; b < 50 ; b++) {
				for(int c = 0 ; c < 50 ; c++) {
					list[a][b][c]=1;
				}
			}
		}
		
		for(int a = 70 ; a < 101 ; a++) {
			for(int b = 70 ; b < 101 ; b++) {
				for(int c = 70 ; c < 101 ; c++) {
					list[a][b][c] = 1048576;
				}
			}
		}
			
		
		
		for(int a = 50 ; a < 71 ; a++) {
			for(int b = 50 ; b < 71 ; b++) {
				for(int c = 50 ; c < 71 ; c++) {
					if(a <= 50 || b <= 50 || c<= 50) list[50][50][50] = 1;
					else if(a > 70 || b > 70 || c > 70) list[70][70][70] = 1048576;
					else if(a < b && b < c) list[a][b][c] = list[a][b][c-1] + list[a][b][c-1] - list[a][b-1][c];
					else list[a][b][c] = list[a-1][b][c] + list[a-1][b-1][c] + list[a-1][b][c-1] - list[a-1][b-1][c-1];
				}
			}
		}
		
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			StringBuffer temp = new StringBuffer("w("+(a)+", "+(b)+", "+(c)+") = ");
			if(a == -1 && b == -1 && c == -1) break;
			temp.append(list[a+50][b+50][c+50]);
			
			bw.write(temp+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
		
		
		
		
		
		
	}
}
