package com.test.interfaceTest;

public class Do {

	public static void main(String[] args) {
		
		DtoA a = new DtoA();
		DtoB b = new DtoB();
		
		a.setName("¾È³ç");
		Man m = new Man();
		a = (DtoA) m.gettingAge(a);

		
		
		System.out.println("a.getName() : "+a.getName());
		
	}

}
