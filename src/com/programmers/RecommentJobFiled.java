package com.programmers;

public class RecommentJobFiled {

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
				System.out.println("�ݺ��� : "+t[i][1]+"�ι�° : "+languages[j]);
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
