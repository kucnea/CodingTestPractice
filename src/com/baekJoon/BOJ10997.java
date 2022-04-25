package com.baekJoon;

import java.io.*;

import java.util.Arrays;

public class BOJ10997 {

	static String[][] list;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		if (n == 1)
			list = new String[1][1];

		else
			list = new String[3 + 4 * (n - 1)][1 + 4 * (n - 1)];

		for (int i = 0; i < list.length; i++) {

			Arrays.fill(list[i], " ");

		}

		if (n != 1)
			start(0, list[0].length - 1, n);

		else
			list[0][0] = "*";
		
		
		for(int i = 1 ; i < list[0].length ; i++) {
			list[1][i] = "";
		}
		
		
		for (int i = 0; i < list.length; i++) {

			for (int j = 0; j < list[0].length; j++) {

				bw.write(list[i][j]);

			}

			bw.write("\n");

		}

		bw.flush();

		bw.close();

		br.close();

	}

	private static void start(int x, int y, int n) {

		for (int i = 0; i < 1 + 4 * (n - 1); i++) {
			list[x][y--] = "*";
		}

		y++;

		for (int i = 0; i < 3 + 4 * (n - 1); i++) {
			list[x++][y] = "*";
		}

		x--;

		for (int i = 0; i < 1 + 4 * (n - 1); i++) {
			list[x][y++] = "*";
		}

		y--;

		for (int i = 0; i < 3 + 4 * (n - 1) - 2; i++) {
			list[x--][y] = "*";
		}

		x++;

		list[x][--y] = "*";

		if (n == 2) {

			list[x][--y] = "*";

			list[++x][y] = "*";

			list[++x][y] = "*";

			return;

		}

		start(x, y - 1, n - 1);

	}

}