package com.javaStudy.anonymousTest;

public class Testfiled {

	public static void main(String[] args) {
		
		Man c = new Man() {
			
			String name = "자식";
			int age = 10;
			
			public void message() {
				System.out.println("Test Message.");
			}
			
//			@Override
//			public void print() {
//				System.out.println("name : "+name+", age : "+age+". This Man is anonymous.");
//			}
		};
		
		Man m = new Man("아빠", 30);
		
		m.print();
		c.print();
//		c.message();	// 선언은 되지만 사용할 수 없다.
		
		
		Man m2 = manDetail(
					new Man() {
						String name = "anonymous";
						int age = 100;
						@Override
						public void print() {
							System.out.println("name : "+name+", age : "+age+". This Man is anonymousObject.");
						}
					}
				);
		
		m2.print();
	}
	
	public static Man manDetail(Man man) {
		return man;
	}

}
