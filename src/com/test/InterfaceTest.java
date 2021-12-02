package com.test;

public interface InterfaceTest {
	
	public void methodA();
	
	public static void methodB() {
		System.out.println("이 메소드는 interface에서 static으로 선언된 일반메소드 입니다.");
	}
	
	public default void methodC() {
		System.out.println("이 메소드는 interface에서 default으로 선언된 일반메소드 입니다.");
	}
	
	public boolean equals(Object obj);
	
	public Object mehtodD(); 
	
}
