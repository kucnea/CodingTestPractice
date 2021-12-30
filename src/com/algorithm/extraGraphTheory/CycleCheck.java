package com.algorithm.extraGraphTheory;

public class CycleCheck {

	static int[] list;
	
	public static void main(String[] args) {
		
		list = new int[5];
		
		for(int i = 0 ; i < list.length ; i++) {
			list[i] = i;
		}
		
		boolean flag = cycle();
		System.out.println("flag : "+flag);
		
	}

	
	private static boolean cycle() {
		boolean result = false;
		
		for(int i = 0 ; i < list.length ; i++) {
			int j = 0;
			
			if(i!=list.length-1) j = i+1;
			else j = 0;
			
			if(find(i)!=find(j)) union(i,j);
			else return true;
			
		}
		
		return result;
	}
	
	private static int find(int i) {
		if(i==list[i]) return i;
		else return list[i] = find(list[i]);
	}
	
	private static void union(int i, int j) {
		if(list[i]<list[j]) list[j] = list[i];
		else list[i] = list[j];
	}
}
