package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ9184 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][][] list = new int[21][21][21];
		
		for(int a = 0 ; a < 21 ; a++) {
			for(int b = 0 ; b < 21 ; b++) {
				for(int c = 0 ; c < 21 ; c++) {
					if(a <= 0 || b <= 0 || c<= 0) list[0][0][0] = 1;
					else if(a > 20 || b > 20 || c > 20) list[20][20][20] = 1048576;
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
			
			StringBuffer temp = new StringBuffer("w("+a+", "+b+", "+c+") = ");
			if(a == -1 && b == -1 && c == -1) break;
			temp.append(list[a][b][c]);
			
			bw.write(temp+"");
		}
		bw.flush();
		bw.close();
		br.close();
		
		
		
		
		
		
		
	}
}
