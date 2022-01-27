package com.test;

public class EqualsOverridingTest {

	public static void main(String[] args) {
		
		Man man1 = new Man(1,10);
		Man man2 = new Man(1,10);
		Man man3 = man2;
		
		System.out.println("man1 == man2 : "+(man1==man2));
		System.out.println("man1.equals(man2) : "+man1.equals(man2));
		System.out.println("man2.equals(man3) : "+man2.equals(man3));
		
		System.out.println("man1.hashCode() : "+man1.hashCode());
		System.out.println("man2.hashCode() : "+man2.hashCode());
		System.out.println("man3.hashCode() : "+man3.hashCode());
	}
	
	static class Man{
		int num;
		int age;
		
		Man(int num, int age){
			this.num = num;
			this.age = age;
		}
		
		@Override
		public boolean equals(Object man2) {
			return this.num == ((Man)man2).num && this.age == ((Man)man2).age; 
		}
		
		@Override
		public int hashCode() {
			return num;
		}
	}
}
