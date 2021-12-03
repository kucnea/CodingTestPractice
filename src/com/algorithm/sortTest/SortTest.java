package com.algorithm.sortTest;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {
	
	public static void main(String[] args) {
		
		MInt[] arr = new MInt[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new MInt((int)(Math.random()*100));
		}
		
		System.out.print("정렬 전  : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].value + " ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		
		System.out.print("정렬 후 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].value + " ");
		}
		System.out.println();
		
		System.out.println("======================");
		
		YInt[] arr2 = new YInt[10];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = new YInt((int)(Math.random()*100));
		}
		
		System.out.print("정렬 전 : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i].value+" ");
		}
		System.out.println();
		
//		Arrays.sort(arr2);
//		
//		System.out.print("정렬 후 : ");
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i].value+" ");
//		}
//		System.out.println();
		
		// Arrays.sort() 메소드가 compareTo를 이용해 정렬하기 때문에 compare을 사용하는 클래스는 정렬할 수 없다.
		// compare을 이용해서 정렬하려면 추가적인 코딩이 필요하다.
		
		Arrays.sort(arr2, comp);
		
		System.out.print("정렬 후 : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i].value+" ");
		}
		System.out.println();
		
	}
	
	
	static class MInt implements Comparable<MInt>{
		
		int value;
		
		public MInt(int value) {
			this.value = value;
		}
		
		@Override
		public int compareTo(MInt m) {
			return this.value - m.value;
		}
		
	}
	
	static Comparator<YInt> comp = new Comparator<YInt>() {
		
		@Override
		public int compare(YInt y1, YInt y2) {
			return y1.value - y2.value;
		}
	};
	
	static class YInt {
		
		int value;
		
		public YInt(int value) {
			this.value = value;
		}
		
	}
}
