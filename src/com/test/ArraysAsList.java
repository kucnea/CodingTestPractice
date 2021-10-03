package com.test;

import java.util.Arrays;

public class ArraysAsList {

	public static void main(String[] args) {
		
		String[] t2 = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};		
		String[] languages = {"PYTHON", "C++", "SQL"};
		int[] preference = {7, 5, 5};
		
		String answer = "";
		int score = -1;
		
		
		for(String str : t2) {
			String[] t = str.split(" ");
			String tname = t[0];
			int tscore = 0;
			for (int i = 0; i < languages.length; i++) {
				int idx = Arrays.asList(t).indexOf(languages[i]);
				if(idx>-1) tscore+=preference[i]*(6-idx);
			}
			if(score == tscore && answer.compareTo(tname)>0) answer=tname;
			if(score<tscore) {
				score = tscore;
				answer = tname;
			}
			
		}
		
		
		
		
		
	}

}
