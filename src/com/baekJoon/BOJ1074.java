package com.baekJoon;

import java.io.*;

import java.util.*;

public class BOJ1074 {

	static int count;

	static int[][] list;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int size = (int) Math.pow(2, n);
		list = new int[size][size];
		count = 0;

		check(0, 0, size);

		String temp = list[r][c] + "";

		bw.write(temp);
		bw.flush();
		bw.close();
		br.close();

	}

	private static void check(int x, int y, int size) {

		if (size == 2) {

			list[x][y] = count++;
			list[x][y + 1] = count++;
			list[x + 1][y] = count++;
			list[x + 1][y + 1] = count++;
			return;

		}

		check(x, y, size / 2);
		check(x, y + (size / 2), size / 2);
		check(x + (size / 2), y, size / 2);
		check(x + (size / 2), y + (size / 2), size / 2);

	}

}