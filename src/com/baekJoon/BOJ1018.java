package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ1018 {
	
	static char[][] list;

	public static void main(String[] args) throws Exception {
		//아직
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		list = new char[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			list[i] = st.nextToken().toCharArray();
		}

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.print(list[i][j] + " ");
//			}
//			System.out.println();
//		}

		int result = 65;
		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				
				System.out.println("result : "+result+", i : "+i+", j : "+j);
				result = Math.min(check(i, j), result);

			}
		}
		String temp = result + "";
		bw.write(temp);
		bw.flush();
		bw.close();
		br.close();
	}

	static private int check(int x, int y) {

		char[][] map = list.clone();
		int result = 0;
		for (int i = x; i < x + 7; i++) {
			for (int j = y; j < y + 7; j++) {
				
				if (map[i][j] == 'W') {
					if (map[i][j + 1] == 'W') {
						map[i][j + 1] = 'B';
						result++;
					}
				} else {
					if (map[i][j + 1] == 'B') {
						System.out.println("check");
						map[i][j + 1] = 'W';
						result++;
					}
				}
				
				

				if (map[i][j] == 'W') {
					if (map[i + 1][j] == 'W') {
						map[i + 1][j] = 'B';
						result++;
					}
				} else {
					if (map[i + 1][j] == 'B') {
						map[i + 1][j] = 'W';
						result++;
					}
				}
				
			}
		}

		return result;
	}
}
