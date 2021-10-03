package com.practiceLevel1;

public class RecommentJobFiled {

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
				
				
				
		String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String[] languages = {"PYTHON", "C++", "SQL"};
		int[] preference = {7, 5, 5};
		String result = solution(table, languages, preference);
		System.out.println(result);
		
	}

	private static String solution(String[] table, String[] languages, int[] preference) {
		
		String answer = "";
		int[] point = new int[5];
		boolean si = false; //5
		boolean contents = false; //1
		boolean hardware = false; //3
		boolean portal = false; //4
		boolean game = false; //2
		
		String[][] t = new String[5][6];
		for (int i = 0; i < t.length; i++) {
			t[i]=table[i].split(" ");	
		}
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < languages.length; j++) {
				System.out.println("반복문 : "+t[i][1]+"두번째 : "+languages[j]);
				if(t[i][1].equals(languages[j])) {
					point[i] += 5*preference[j];
				}else if(t[i][2].equals(languages[j])) {
					point[i] += 4*preference[j];
				}else if(t[i][3].equals(languages[j])) {
					point[i] += 3*preference[j];
				}else if(t[i][4].equals(languages[j])) {
					point[i] += 2*preference[j];
				}else if(t[i][5].equals(languages[j])) {
					point[i] += 1*preference[j];
				}else {
					
				}
				
			}
		}
		
		System.out.println("========");
		for (int i = 0; i < point.length; i++) {
			System.out.println(point[i]);
		}
		System.out.println("========");
		for (int i = 1; i < point.length; i++) {
			if(point[0]>=point[i]) {
				si = true;
			}else {
				si = false;
				break;
			}
		}
		for (int i = 0; i < point.length; i++) {
			if(point[1]>=point[i]) {
				contents = true;
			}else {
				contents = false;
				break;
			}
		}
		for (int i = 0; i < point.length; i++) {
			if(point[2]>=point[i]) {
				hardware = true;
			}else {
				hardware = false;
				break;
			}
		}
		for (int i = 0; i < point.length; i++) {
			if(point[3]>=point[i]) {
				portal = true;
			}else {
				portal = false;
				break;
			}
		}
		for (int i = 0; i < point.length; i++) {
			if(point[4]>=point[i]) {
				game = true;
			}else {
				game = false;
				break;
			}
		}
		
		if(contents == true) answer = "CONTENTS";
		else if(game == true) answer = "GAME"; 
		else if(hardware == true) answer = "HARDWARE";
		else if(portal == true) answer = "PORTAL";
		else if(si == true) answer = "SI";
		
		
		return answer;
	}

}
