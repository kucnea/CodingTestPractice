package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ1002 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int t = Integer.parseInt(s);
		for(int i = 0 ; i < t ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());	
			int ax = Integer.parseInt(st.nextToken());
			int ay = Integer.parseInt(st.nextToken());
			int ar = Integer.parseInt(st.nextToken());
			
			int cx = Integer.parseInt(st.nextToken());
			int cy = Integer.parseInt(st.nextToken());
			int cr = Integer.parseInt(st.nextToken());
			
			int dx = Math.abs(ax-cx);
			int dy = Math.abs(ay-cy);
			double dis = Math.sqrt((Math.pow(dx, 2)+Math.pow(dy, 2)));
			
			int temp = 0;
			if((ax==cx) && (ay==cy) && (ar==cr)) temp = -1;
			else {
				if((ar+cr)<dis) temp = 0;
				else if((ar+cr)==dis) temp = 1;
				else if((ar==cr+dis) || (cr==ar+dis)) temp = 1;
				else if((ar>dis && (dis+cr)<ar) || (cr>dis && (dis+ar)< cr)) temp = 0;
				else if((ar+cr)>dis) temp = 2;	
			}
			
			
			String result = temp+"\n";
			bw.write(result);
			
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
}
