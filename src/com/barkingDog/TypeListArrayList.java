package com.barkingDog;

import java.util.ArrayList;

public class TypeListArrayList {

	public static void main(String[] args) {
		
//		1. 임의의 위치에 있는 원소를 확인/ 변경 O(1)
//		2. 원소를 끝에 추가 = O(1)
//		3. 마지막 원소를 제거 = O(1)
//		4. 임의의 위치에 원소를 추가/임의 위치의 원소 제거 = O(n)
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//2.
		list.add(1);
		list.add(2);
		list.add(3);
		
		//1.
		list.get(1);
		System.out.println(list.get(1));
		list.set(1, 3);
		System.out.println(list.get(1));
		
		//3. 4.
		list.remove(2);
		
		//4.
		list.add(1, 10);
		System.out.println(list);
	}

}
