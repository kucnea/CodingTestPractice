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
		
		// str을 변형해서 활용할 것이라 원본 저장
		String result = str;
		
		// 앞,뒤 공백 혹시 모르니 제거
		str = str.trim();
		// 빈칸 제거
		str = str.replaceAll(" ", "");
		// Hypen(-) 제거
		str = str.replaceAll("-", "");
		
		// 숫자외에 있을 시 개인정보 아닙니다 반환
		if(!str.matches("[0-9]+")) return "["+result+"] 는 개인정보가 아닙니다.";
		
//		System.out.println("str : "+str);
		
		// 길이 값 사용하기 편하게, 근데 많이 안쓰네
		int length = str.length();
		// 주민번호 검증에 사용할 변수
		int temp = 0;
		
		// 공백과 Hypen을 제거하면 주민번호는 총 13자리
		if(length==13) {
			for (int i = 0; i < length-1; i++) {
				// 주민번호 검증을 위한 공식
				if(i<=7) temp+=(Integer.parseInt(str.substring(i, i+1))*(i+2));
				else temp+=(Integer.parseInt(str.substring(i, i+1))*(i-6));
//				System.out.println("i : "+i+", str.substring(i,i+1) : "+str.substring(i,i+1)+", temp : "+temp);
			}
			temp = (11-(temp%11))%10;
			if(Integer.parseInt(str.substring(12, 13))==temp) return "["+result+"] 는 주민번호가 맞습니다.";
		}
		
		// 공백과 Hypen을 제거하면 카드번호는 총 16자리
		if(length==16) return "["+result+"] 는 카드번호가 맞습니다."; 
			
		
		// 어디에도 해당하지 않으면 개인정보 아닙니다 반환
		return "["+result+"] 는 개인정보가 아닙니다.";
	}

}
