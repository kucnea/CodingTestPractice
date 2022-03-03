package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ1436 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		int n = Integer.parseInt(s);
		int count = 1;
		int start = 666;
		while (true) {
			if (n == 1)
				break;
			start++;
			String temp = start + "";
			if (temp.contains("666")) {
				count++;
				if (n == count)
					break;
			}

		}
		String t = start + "";
		bw.write(t);
		bw.flush();
		bw.close();
		br.close();

	}

}
