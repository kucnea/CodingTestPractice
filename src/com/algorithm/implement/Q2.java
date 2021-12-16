package com.algorithm.implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		long beforeTime = System.currentTimeMillis(); // ms단위
		int result = solution(n);
		long afterTime = System.currentTimeMillis(); // ms단위
		long time = ( afterTime - beforeTime ); // ms단위
		
		long beforeTime2 = System.currentTimeMillis(); // ms단위
		int result2 = solution2(n);
		long afterTime2 = System.currentTimeMillis(); // ms단위
		long time2 = ( afterTime2 - beforeTime2 ); // ms단위

		bw.write("result : "+result);
		bw.write("\n"+"result2 : "+result2);
		bw.write("\n"+"소요시간 : "+time/1000+"s");
		bw.write("\n"+"소요시간 : "+time2/1000+"s");
		bw.flush();
		br.close();
		bw.close();
	}

	@SuppressWarnings("unused")
	public static class Time{
		int clo;
		int min;
		int sec;
		
		
		Time(){
			sec = 0;
			min = 0;
			clo = 0;
		}
		
		Time(int clo, int min, int sec){
			this.clo = clo;
			this.min = min;
			this.sec = sec;
		}
		
		public String getTime() {
			return clo+":"+min+":"+sec+"";
		}
		
		public String addTime() {
			sec++;
			if(sec==60) {
				sec=0;
				min++;
			}
			if(min==60) {
				min=0;
				clo++;
			}
			return clo+":"+min+":"+sec+"";
		}
	}
	
	private static int solution(int n) {
		
		int result=0;
		Time t = new Time();
		
		while(!t.getTime().equals(n+":59:59")) {
			if(t.addTime().contains("3")) result++;
		}
		
		return result;
	}
	
	private static int solution2(int n) {
		
		int result = 0;
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < 60; j++) {
				for (int j2 = 0; j2 < 60; j2++) {
					if(check(i,j,j2)) result++;
				}
			}
		}
		
		return result;
	}
	
	private static boolean check(int i, int j, int j2) {
		
		if(i%10==3 || j/10==3 || j%10==3 || j2/10==3 || j2%10==3) return true;
		
		return false;
	}
}
