package com.test.interfaceTest;

public class DtoA implements DtoMethod {
	
	String name;
	int age;
	String type;
	
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String setName(String s) {
		return (this.name = s);
	}
	@Override
	public int getAge() {
		return this.age;
	}
	@Override
	public int setAge(int i) {
		return (this.age = i);
	}
	
}
