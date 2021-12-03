package com.javaStudy.GenericTest;

public class GenericTest {
	
	public static class Person<K,V>{
		private K key;
		private V value;
		
		void set(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		String get() {
			return key+", "+value;
		}
		
		Person(){ }
	}
	
	public static void main(String[] args) {
		
		Person<String,Integer> p = new Person<>(); 
		p.set("이름", 10);
		
		System.out.println(p.get());
		System.out.println("key Type : "+p.key.getClass().getName());
		System.out.println("value Type : "+p.value.getClass().getName());
	}
	
	
}
