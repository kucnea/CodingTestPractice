package com.baekJoon;

import java.io.*;

import java.util.*;

public class BOJ2447Version3 {

	static String[][] list;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		list = new String[n][n];

		for (int i = 0; i < n; i++) {

			Arrays.fill(list[i], "*");

		}

		star(0, 0, n);

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				bw.write(list[i][j]);

			}

			bw.write("\n");

		}

		bw.flush();

		bw.close();

		br.close();

	}

	private static void star(int x, int y, int n) {

		for (int i = n / 3; i < (2 * n) / 3; i++) {

			for (int j = n / 3; j < (2 * n) / 3; j++) {

				list[x + i][y + j] = " ";

			}

		}

		if (n == 3)
			return;

		else {

			star(x + 0, y + 0, n / 3);
			star(x + 0, y + (n / 3), n / 3);
			star(x + 0, y + ((2 * n) / 3), n / 3);

			star(x + (n / 3), y + 0, n / 3);
			star(x + (n / 3), y + (n / 3), n / 3);
			star(x + (n / 3), y + ((2 * n) / 3), n / 3);

			star(x + ((2 * n) / 3), y + 0, n / 3);
			star(x + ((2 * n) / 3), y + (n / 3), n / 3);
			star(x + ((2 * n) / 3), y + ((2 * n) / 3), n / 3);

		}

	}

}