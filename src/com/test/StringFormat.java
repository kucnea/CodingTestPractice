package com.test;

public class StringFormat {
	
	public static void main(String[] args) {
		
		
		String a = "�� ���� �ڿ�";
		System.out.println(String.format("�� %-9s", a));
		String b = String.format("�� %-9s", a);
		System.out.println(b);
		
	}
	
}
