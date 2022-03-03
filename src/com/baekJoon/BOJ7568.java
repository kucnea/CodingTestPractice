package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ7568 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		HashMap<Integer,StringTokenizer> list = new HashMap<>();
		
		for(int i = 0 ; i < t ; i++) {
			
			st = new StringTokenizer(br.readLine());
			list.put(i, st);
			
		}
		
		
		for(int i = 0 ; i < t ; i++) {
			int rank = 1;
			int ix = Integer.parseInt(list.get(i).nextToken());
			int iy = Integer.parseInt(list.get(i).nextToken());
			for(int j = 0 ; j < t ; j++) {
				if(i==j) break;
				if(ix<Integer.parseInt(list.get(j).nextToken()) && iy<Integer.parseInt(list.get(j).nextToken())) {
					rank++;
				}else if(ix<=Integer.parseInt(list.get(j).nextToken()) && iy<Integer.parseInt(list.get(j).nextToken())){
					rank++;
				}else if(ix<Integer.parseInt(list.get(j).nextToken()) && iy<=Integer.parseInt(list.get(j).nextToken())) {
					rank++;
				}
			}
			
			String temp = rank+"";
			bw.write(temp+" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	
}
