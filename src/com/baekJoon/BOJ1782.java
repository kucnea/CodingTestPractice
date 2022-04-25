package com.baekJoon;

import java.io.*;

import java.util.*;

public class BOJ1782 {

	static int result;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());

		int b = Integer.parseInt(st.nextToken());

		for (int i = a; i <= b; i++) {

			if (i == m(i)) {

				result++;

			}

		}

		bw.write(result + "");

		bw.flush();

		bw.close();

		br.close();

	}

	private static int m(int i) {

		StringBuffer sb = new StringBuffer(i + "");

		sb = sb.reverse();

		String temp = sb.toString();

		if (temp.contains("3") || temp.contains("4") || temp.contains("6") || temp.contains("7") || temp.contains("9"))
			return -1;

		temp = temp.replaceAll("2", "-1");

		temp = temp.replaceAll("5", "2");

		temp = temp.replaceAll("-1", "5");

		return Integer.parseInt(temp);

	}

}
