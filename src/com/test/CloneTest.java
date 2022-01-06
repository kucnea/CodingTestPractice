package com.test;

public class CloneTest {

	public static void main(String[] args) {
		
		int[][] list = new int[4][4];
		int[][] map = new int[4][4];
		
		list[0][0] = 1;
		
		map = list.clone();
		System.out.println("step 1.");
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map.length ; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("step 2.");
		list[0][1] = 1;
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map.length ; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("step 3.");
		for(int i = 0 ; i < list.length ; i++) {
			map[i] = list[i].clone();
		}
		list[0][2] = 1;
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map.length ; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
	}

}
