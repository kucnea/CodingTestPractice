package com.test;

public class InterfaceTest2 implements InterfaceTest{

	@Override
	public void methodA() {
		System.out.println("이 메소드는 interface선언된 추상메소드로 Class에서 구현했습니다.");
		
	}
	
//	@Override
//	public void methodB() {
//		
//	}
	
	@Override
//	public void methodD() { 	// 반환 타입을 임의로 변경할 수 없다.
	public Object mehtodD() {
		
		System.out.println("반환타입을 변경할 수 없다.");
		
//		return;
		return null;
	}
	
	public static void main(String[] args) {
		InterfaceTest2 i = new InterfaceTest2();
		i.methodA();
//		i.methodB(); 	// static으로 선언한건 선언한 메소드가 호출되지 않지만 ( 또한 overried도 불가하다. )
		InterfaceTest.methodB();
		i.methodC();	// default로 선언한건 호출이 가능하다.
		
	}


	
}
