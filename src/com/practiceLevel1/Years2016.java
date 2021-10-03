package com.practiceLevel1;

public class Years2016 {
	
	public static void main(String[] args) {
	
//		2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
//		두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
//		요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//		입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
		
		int a=0;
		int b=0;
		String result = solution(a,b);
		System.out.println(result);
		
	
	}

	private static String solution(int a, int b) {
		
		String answer="";
		int cnt = 0;
		
		switch(a){
		case 1: cnt=b;
			break;
			
		case 2: cnt=31+b;
			break;
			
		case 3: cnt=60+b;
			break;
			
		case 4: cnt=91+b;
			break;
			
		case 5: cnt=121+b;
			break;
			
		case 6: cnt=152+b;
			break;
			
		case 7: cnt=182+b;
			break;
			
		case 8: cnt=213+b;
			break;
			
		case 9: cnt=244+b;
			break;
			
		case 10: cnt=274+b;
			break;
			
		case 11: cnt=305+b;
			break;
			
		case 12: cnt=335+b;
			break;
		}
		
		switch(cnt%7) {
		case 1: answer="FRI";
			break;
		case 2: answer="SAT";
			break;
		case 3: answer="SUN";
			break;
		case 4: answer="MON";
			break;
		case 5: answer="TUE";
			break;
		case 6: answer="WED";
			break;
		case 0: answer="THU";
			break;
		}
		
		return answer;
	}
}
