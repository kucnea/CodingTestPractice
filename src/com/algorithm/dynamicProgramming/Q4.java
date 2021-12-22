package com.algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4 {
	
	static int[][] d = new int[1001][21];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int t = Integer.parseInt(s);
		int[] result = new int[t];
		
		for(int i = 0 ; i < t ; i++) {
			s = br.readLine();
			String[] ss = s.split(" ");
			
			int n = Integer.parseInt(ss[0]);
			int m = Integer.parseInt(ss[1]);
			
			int[][] list = new int[n][m];
			
			s = br.readLine();
			ss = s.split(" ");
			int x = 0;
			int y = 0;
			for(int j = 0 ; j < n*m ; j++) {
				
				list[x][y] = Integer.parseInt(ss[j]);
				
				if(y==(m-1)) {
					x++;
					y=0;
					continue;
				}
				
				y++;
			}
			
			result[i] = solution(i,list);
			
		}
		
		for(int i = 0 ; i < t ; i++) {
			bw.write("result["+i+"] : "+result[i]);
			bw.write("\n");
		}
		bw.flush();
		
		br.close();
		bw.close();
		
	}
	
	private static int solution(int t, int[][] list) {
		
		int j = 0;
		
		for(int i = 0 ; i < list[0].length ; i++) {
			
			int temp = 0;
			int jtemp = j;
			
			if(i==0) {
				
				for(int m = 1 ; m<list.length ; m++) {
					if(temp<list[m][i]) {
						temp = list[m][i];
						j = m;
					}
				}
				System.out.println("list["+j+"]["+i+"] : "+list[j][i]+", temp : "+temp);
				d[t][i] = temp;
				continue;
			}
			
			for(int m = jtemp-1 ; m <= jtemp+1 ; m++) {
				if(m<0 || m>=list.length) continue;
				if(temp<list[m][i]) {
					temp = list[m][i];
					j = m;
				}
			}
			d[t][i] = d[t][i-1]+temp;
			System.out.println("list["+j+"]["+i+"] : "+list[j][i]+", temp : "+temp);
		}
		
		return d[t][list[0].length-1];
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
