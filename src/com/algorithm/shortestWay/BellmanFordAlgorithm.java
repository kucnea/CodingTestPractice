package com.algorithm.shortestWay;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BellmanFordAlgorithm {
	
	static private final int inf = (int)1e9;
	static private final int start = 1;

	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int V = 6;
		
		int[][] list1 = new int[V+1][V+1];
		int[][] list2 = new int[V+1][V+1];
		
		for(int i = 0 ; i < list1.length ; i++) {
			for(int j = 0 ; j < list1[1].length ; j++) {
				if(i!=j)list1[i][j] = inf;
				else list1[i][j] = 0;
				
				if(i!=j)list2[i][j] = inf;
				else list2[i][j] = 0;
			}
		}
		
		list1[0][0] = list2[0][0] = inf;
		
		// Non minus Cycle
		list1[1][2] = 6;
		list1[1][3] = 2;
		list1[2][3] = 2;
		list1[2][4] = 2;
		list1[3][5] = 1;
		list1[4][6] = 2;
		list1[5][2] = -2;
		list1[5][4] = 3;
		list1[5][6] = 4;
		
		// minus Cycle
		list2[1][2] = 6;
		list2[1][3] = 2;
		list2[2][3] = 2;
		list2[2][4] = 2;
		list2[3][5] = 1;
		list2[4][6] = 2;
		list2[5][2] = -4;
		list2[5][4] = 3;
		list2[5][6] = 4;
		
//		for(int i = 0 ; i < list1.length ; i++) {
//			for(int j= 0 ; j < list1[1].length ; j++) {
//				if(list1[i][j]==inf) list1[i][j] = -1;
//				System.out.print(list1[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		System.out.println();
		
		int[] result1 = new int[V+1];
		int[] result2 = new int[V+1];
		result1 = bel(list1);
//		result2 = bel(list2);
		
		System.out.println("list1 : ");
//		bw.write("\nlist2 : \n");
		for(int i = 0  ; i < result1.length ; i++) {
			System.out.print(result1[i] + " ");
//			bw.write(result2[i]+" ");
		}
//		bw.write("\n");
		
		bw.flush();
		bw.close();
	}
	
	private static int[] bel(int[][] list){
		
		int[] result = new int[list.length];
		
		for(int i = 1 ; i < list.length ; i++) {
			for(int j = 1 ; j < list.length ; j++) {
				for(int l = 1 ; l < list.length ; l++) {
					System.out.println("i : "+i+", j : "+j+", l : "+l);
					System.out.println("list[i][j] : "+list[i][j]+", list[i][l] : "+list[i][l]+", list[l][j] : "+list[l][j]);
					list[i][j] = Math.min(list[i][j], list[i][l]+list[l][j]);
				}
				System.out.println();
			}
		}
		System.out.println("list[3][2] : "+list[3][2]);
		for(int i = 1 ; i < result.length ; i++) {
			result[i] = list[start][i];
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
 