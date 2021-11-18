package com.freeCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DataStructureList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0, 1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
//		list.remove(2);
//		System.out.println(list);
		
		int i = list.indexOf(3);
		System.out.println(i);
		
		list.add(3);
		i = list.indexOf(3);
		System.out.println(i);
		
		
		int[] list2 = {1,2,3,4,5};
		list.removeAll(list);
		List<int[]> list3 = Arrays.asList(list2);
		System.out.println(list3.get(0).equals(list2));
		System.out.println(list3.get(0)==list2);
		System.out.println(list3.get(0)[0]);
		list2[0]=10;
		System.out.println("list2[0] : "+list2[0]);
		System.out.println("list3.get[0][0] : "+list3.get(0)[0]);
		ArrayList<Integer> list4 = new ArrayList<Integer>();
//		list4.addAll(list3);
		
		
		String[] str = {"abc","def","ghi"};
		List<String> str2 = Arrays.asList(str);
		System.out.println(str2.get(0));
		
		ArrayList<String> str3 = new ArrayList<>();
		str3.addAll(str2);
		System.out.println("str3 : "+str3);
		
		System.out.println(str3 == str2);
		System.out.println(str3.equals(str2) );
		
		LinkedList<Integer> lList = new LinkedList<Integer>();
		lList.add(1);
		lList.add(2);
		lList.add(3);
		lList.add(4);
		
		System.out.println("lList : "+lList);
		lList.add(2, 7);
		System.out.println("lList : "+lList);

		Vector<Integer> v = new Vector<Integer>();
		Thread t = new Thread();
		
		
		
		
	}

}
