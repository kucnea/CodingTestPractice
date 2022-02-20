package com.test.interfaceTest;

public class DtoB implements DtoMethod {
	
	String name;
	int age;
	int type;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String setName(String s) {
		return (this.name = s);
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int setAge(int i) {
		return (this.age = i);
	}
	
}
