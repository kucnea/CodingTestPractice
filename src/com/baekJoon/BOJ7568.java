package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ7568 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		HashMap<Integer,Node> list = new HashMap<>();
		
		for(int i = 0 ; i < t ; i++) {
			
			st = new StringTokenizer(br.readLine());
			list.put(i, new Node(st));
			
		}
		
		
		for(int i = 0 ; i < t ; i++) {
			int rank = 1;
			
			for(int j = 0 ; j < t ; j++) {
				if(i==j) continue;
				
				if(list.get(i).x<list.get(j).x && list.get(i).y<list.get(j).y) rank++;
//				else if(list.get(i).x==list.get(j).x && list.get(i).y<list.get(j).y) rank++;
//				else if(list.get(i).x<list.get(j).x && list.get(i).y==list.get(j).y) rank++;
				
			}
			
			String temp = rank+" ";
			bw.write(temp);
			
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	
	static class Node {
		int x;
		int y;
		
		Node(StringTokenizer st){
			this.x = Integer.parseInt(st.nextToken());
			this.y = Integer.parseInt(st.nextToken());
		}
	}
	
	
}
