package com.practiceLevel1;

public class TresureMap {

	public static void main(String[] args) {
		
//		�׿��� ��� ���ε��� ������ ���ܳ��� ��Ҹ� �˷��� ��������� �տ� �־���. 
//		�׷��� �� ��������� ���ڷ� ��ȣȭ�Ǿ� �־� ��ġ�� Ȯ���ϱ� ���ؼ��� ��ȣ�� �ص��ؾ� �Ѵ�. 
//		������ ���� ��ȣ�� �ص��� ����� ������� �޸� �Բ� �߰��ߴ�.
//
//		������ �� ���� ���̰� n�� ���簢�� �迭 ���·�, �� ĭ�� "����"(" ") �Ǵ� "��"("#") �� ������ �̷���� �ִ�.
//		��ü ������ �� ���� ������ ���ļ� ���� �� �ִ�. ���� "���� 1"�� "���� 2"��� ����. 
//		���� 1 �Ǵ� ���� 2 �� ��� �ϳ��� ���� �κ��� ��ü ���������� ���̴�. 
//		���� 1�� ���� 2���� ��� ������ �κ��� ��ü ���������� �����̴�.
//		"���� 1"�� "���� 2"�� ���� ���� �迭�� ��ȣȭ�Ǿ� �ִ�.
//		��ȣȭ�� �迭�� ������ �� �����ٿ��� �� �κ��� 1, ���� �κ��� 0���� ��ȣȭ���� �� ������� �������� �ش��ϴ� ���� �迭�̴�.
		
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] result = solution(n, arr1, arr2);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+"");
		}
		
		
	}

	private static String[] solution(int n, int[] arr1, int[] arr2) {
		
		String[] answer = {};
		
//		String a = Integer.toBinaryString(arr1[0]);
//		System.out.println(a);
//		System.out.println(String.format("0%-5s", a));
		
		String[] a1 = new String[arr1.length];
		String[] a2 = new String[arr2.length];
		
		
		for (int i = 0; i < arr1.length; i++) {
			a1[i] = String.format("0%-5s", Integer.toBinaryString(arr1[i]));
			a2[i] = String.format("0%-5s", Integer.toBinaryString(arr2[i]));
		}
		
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a1[i]);
		}
		
		
		return answer;
	}

}
