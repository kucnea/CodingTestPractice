package com.baekJoon;

import java.io.*;


public class BOJ1193 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int x = Integer.parseInt(s);
		
		//1-2-3-4
		int stage = 0;
		int scale = 1;
		int round = 0;
		
		double temp = 0;
		
		while(stage<x) {
			stage += scale;
			scale++;
			round++;
			System.out.println();
		}
		int dis = stage-x;
		int up = round-dis;
		int down = 1+dis;
		
		String result = "";
		if(round%2==0) {
			result = up+"/"+down;	
		}else {
			result = down+"/"+up;
		}
		
		bw.write(result);
		bw.flush();
		br.close();
		bw.close();
		
	}
	
}
