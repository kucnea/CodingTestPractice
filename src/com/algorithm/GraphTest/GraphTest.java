package com.algorithm.GraphTest;

public class GraphTest {

	private int[][] array;
	
	
	// graph의 사이즈 선언 ( 0인덱스를 비워 직관적으로 하고자 +1 )
	public void graphSize(int size) {
		array = new int[size+1][size+1];
	}


	// array를 호출
	public int[][] getGraph() {
		return array;
	}
	
	
	// graph가 null인지 체크
	public boolean graphNullCheck() {
		return array == null;
	}
	
	
	// x와 y를 단방향으로 연결해주는 함수
	public void addDirectEdge(int x, int y) {
		array[x][y] = 1;
	}
	
	
	// x와 y를 양방향으로 연결해주는 함수
	public void addCompleteEdge(int x, int y) {
		array[x][y] = array[y][x] = 1;
	}
	
	
	// x와 y의 단방향 연결을 끊는 함수
	public void deleteDirectEdge(int x, int y) {
		array[x][y] = 0;
	}
	
	
	// x와 y의 양방향 연결을 끊는 함수
	public void deleteCompleteEdge(int x, int y) {
		array[x][y] = array[y][x] = 0;
	}
	
	
	public void printGraph() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		GraphTest g = new GraphTest();
		
		g.graphSize(3);
		g.addDirectEdge(1, 2);
		g.addDirectEdge(1, 3);
		g.addCompleteEdge(2, 3);
		
		g.printGraph();
		
	}
}
