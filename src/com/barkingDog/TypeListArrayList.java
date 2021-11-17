package com.barkingDog;

import java.util.ArrayList;

public class TypeListArrayList {

	public static void main(String[] args) {
		
//		1. ������ ��ġ�� �ִ� ���Ҹ� Ȯ��/ ���� O(1)
//		2. ���Ҹ� ���� �߰� = O(1)
//		3. ������ ���Ҹ� ���� = O(1)
//		4. ������ ��ġ�� ���Ҹ� �߰�/���� ��ġ�� ���� ���� = O(n)
		
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
