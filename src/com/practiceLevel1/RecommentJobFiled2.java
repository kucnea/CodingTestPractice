package com.practiceLevel1;

import java.util.*;

public class RecommentJobFiled2 {

	public static void main(String[] args) {
		
		
//		개발자가 사용하는 언어와 언어 선호도를 입력하면 그에 맞는 직업군을 추천해주는 알고리즘을 개발하려고 합니다.
//
//		아래 표는 5개 직업군 별로 많이 사용하는 5개 언어에 직업군 언어 점수를 부여한 표입니다.
//
//		점수	SI			CONTENTS	HARDWARE	PORTAL		GAME
//		5	JAVA		JAVASCRIPT	C			JAVA		C++
//		4	JAVASCRIPT	JAVA		C++			JAVASCRIPT	C#
//		3	SQL			PYTHON		PYTHON		PYTHON		JAVASCRIPT
//		2	PYTHON		SQL			JAVA		KOTLIN		C
//		1	C#			C++			JAVASCRIPT	PHP			JAVA
//		
//		예를 들면, SQL의 SI 직업군 언어 점수는 3점이지만 CONTENTS 직업군 언어 점수는 2점입니다. 
//		SQL의 HARDWARE, PORTAL, GAME 직업군 언어 점수는 0점입니다.
//
//		직업군 언어 점수를 정리한 문자열 배열 table, 개발자가 사용하는 언어를 담은 문자열 배열 languages, 
//		언어 선호도를 담은 정수 배열 preference가 매개변수로 주어집니다. 
//		개발자가 사용하는 언어의 언어 선호도 x 직업군 언어 점수의 총합이 가장 높은 직업군을 return 하도록 solution 함수를 완성해주세요. 
//		총합이 같은 직업군이 여러 개일 경우, 이름이 사전 순으로 가장 빠른 직업군을 return 해주세요.
				
/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////				
//  									다른 사람의 풀이를 보고 연습해보자.                            //
/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
		
		String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String[] languages = {"PYTHON", "C++", "SQL"};
		int[] preference = {7, 5, 5};
//		String result = solution(table, languages, preference);
		String result2 = solution2(table, languages, preference);
//		System.out.println(result);
		System.out.println(result2);
		
	}

//	private static String solution(String[] table, String[] languages, int[] preference) {
//		
//		String answer = "";
//        int score=-1;
//        for(String str : table){
//            String[] t = str.split(" ");
//            String tname = t[0];
//            int tscore = 0;
//            for(int i=0;i<languages.length;i++){
//                int idx = Arrays.asList(t).indexOf(languages[i]);
//                if(idx>-1) tscore+=preference[i]*(6-idx);
//            }
//            if(score ==tscore && answer.compareTo(tname)>0) answer=tname;
//            if(score<tscore){
//                score =tscore;
//                answer= tname;
//            }
//        }
//        return answer;
//	}
	
	
	
	private static String solution2(String[] table, String[] languages, int[] preference) {
		
		String answer = "";
        int score=-1;
        for(String str : table){
            String[] t = str.split(" ");
            String tname = t[0];
            int tscore = 0;
            for(int i=0;i<languages.length;i++){
                int idx = Arrays.asList(t).indexOf(languages[i]);
                if(idx>-1) tscore+=preference[i]*(6-idx);
            }
            if(score ==tscore && answer.compareTo(tname)>0) answer=tname;
            if(score<tscore){
                score =tscore;
                answer= tname;
            }
        }
        return answer;
	}

}
