package com.programmers;

import java.util.*;

public class RecommentJobFiled2 {

	public static void main(String[] args) {
		
		
//		�����ڰ� ����ϴ� ���� ��� ��ȣ���� �Է��ϸ� �׿� �´� �������� ��õ���ִ� �˰����� �����Ϸ��� �մϴ�.
//
//		�Ʒ� ǥ�� 5�� ������ ���� ���� ����ϴ� 5�� �� ������ ��� ������ �ο��� ǥ�Դϴ�.
//
//		����	SI			CONTENTS	HARDWARE	PORTAL		GAME
//		5	JAVA		JAVASCRIPT	C			JAVA		C++
//		4	JAVASCRIPT	JAVA		C++			JAVASCRIPT	C#
//		3	SQL			PYTHON		PYTHON		PYTHON		JAVASCRIPT
//		2	PYTHON		SQL			JAVA		KOTLIN		C
//		1	C#			C++			JAVASCRIPT	PHP			JAVA
//		
//		���� ���, SQL�� SI ������ ��� ������ 3�������� CONTENTS ������ ��� ������ 2���Դϴ�. 
//		SQL�� HARDWARE, PORTAL, GAME ������ ��� ������ 0���Դϴ�.
//
//		������ ��� ������ ������ ���ڿ� �迭 table, �����ڰ� ����ϴ� �� ���� ���ڿ� �迭 languages, 
//		��� ��ȣ���� ���� ���� �迭 preference�� �Ű������� �־����ϴ�. 
//		�����ڰ� ����ϴ� ����� ��� ��ȣ�� x ������ ��� ������ ������ ���� ���� �������� return �ϵ��� solution �Լ��� �ϼ����ּ���. 
//		������ ���� �������� ���� ���� ���, �̸��� ���� ������ ���� ���� �������� return ���ּ���.
				
/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////				
//  									�ٸ� ����� Ǯ�̸� ���� �����غ���.                            //
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
