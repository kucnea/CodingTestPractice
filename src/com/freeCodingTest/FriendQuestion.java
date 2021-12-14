package com.freeCodingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FriendQuestion {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\upload/info.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str;
		while((str = br.readLine())!=null) {
			if(str.length()!=0) {
				bw.write(solution(str)+"\n");
				bw.flush();	
			}
		}
		
		br.close();
		bw.close();
	}

	private static String solution(String str) {
		
		String result = str;
		
		str = str.trim();
		str = str.replaceAll(" ", "");
		str = str.replaceAll("-", "");
		
		if(!str.matches("[0-9]+")) return "["+result+"] 는 개인정보가 아닙니다.";
		
//		System.out.println("str : "+str);
		
		int length = str.length();
		int temp = 0;
		
		if(length==13) {
			for (int i = 0; i < length-1; i++) {
				if(i<=7) temp+=(Integer.parseInt(str.substring(i, i+1))*(i+2));
				else temp+=(Integer.parseInt(str.substring(i, i+1))*(i-6));
//				System.out.println("i : "+i+", str.substring(i,i+1) : "+str.substring(i,i+1)+", temp : "+temp);
			}
			temp = (11-(temp%11))%10;
			if(Integer.parseInt(str.substring(12, 13))==temp) return "["+result+"] 는 주민번호가 맞습니다.";
		}
		
		if(length==16) return "["+result+"] 는 카드번호가 맞습니다."; 
			
		
		
		return "["+result+"] 는 개인정보가 아닙니다.";
	}

}
