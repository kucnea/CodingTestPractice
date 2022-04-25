package com.baekJoon;

import java.io.*;

import java.util.*;

public class BOJ1780 {

	static int countM1;

	static int countZero;

	static int count1;

	static int[][] list;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		list = new int[n][n];

		for (int i = 0; i < n; i++) {

			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < n; j++) {

				list[i][j] = Integer.parseInt(st.nextToken());

			}

		}

//printList(list);

		check(0, 0, n);

		String temp = "";

		temp = countM1 + "\n";

		bw.write(temp);

		temp = countZero + "\n";

		bw.write(temp);

		temp = count1 + "\n";

		bw.write(temp);

		bw.flush();

		bw.close();

		br.close();

	}

	private static void check(int i, int j, int n) {

		if (n == 3) {

			test(i, j, n);

		} else {

			if (test(i, j, n)) {

				return;

			}

			else {

				check(0, 0, n / 3);
				check(0, n / 3, n / 3);
				check(0, (2 * n) / 3, n / 3);

				check(n / 3, 0, n / 3);
				check(n / 3, n / 3, n / 3);
				check(n / 3, (2 * n) / 3, n / 3);

				check((2 * n) / 3, 0, n / 3);
				check((2 * n) / 3, n / 3, n / 3);
				check((2 * n) / 3, (2 * n) / 3, n / 3);

			}

		}

	}

	private static void printList(int[][] list) {

		for (int i = 0; i < list.length; i++) {

			for (int j = 0; j < list[0].length; j++) {

				System.out.print(list[i][j] + " ");

			}

			System.out.println();

		}

	}

	private static boolean test(int x, int y, int n) {

		boolean flag = true;

		if (list[x][y] == 1) {

			for (int i = 0; i < n; i++) {

				for (int j = 0; j < n; j++) {

					if (list[x + i][y + j] != 1) {

						flag = false;

						break;

					}

					if (!flag)
						break;

				}

			}

			if (flag) {

				count1++;

				return flag;

			}

		} else if (list[x][y] == -1) {

			for (int i = 0; i < n; i++) {

				for (int j = 0; j < n; j++) {

					if (list[x + i][y + j] != -1) {

						flag = false;

						break;

					}

					if (!flag)
						break;

				}

			}

			if (flag) {

				countM1++;

				return flag;

			}

		} else if (list[x][y] == 0) {

			for (int i = 0; i < n; i++) {

				for (int j = 0; j < n; j++) {

					if (list[x + i][y + j] != 0) {

						flag = false;

						break;

					}

					if (!flag)
						break;

				}

			}

			if (flag) {

				countZero++;

				return flag;

			}

		}

		if (n > 3)
			return flag;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (list[x + i][x + j] == 1)
					count1++;

				else if (list[x + i][x + j] == -1)
					countM1++;

				else if (list[x + i][x + j] == 0)
					countZero++;

			}

		}

		return flag;

	}

}
