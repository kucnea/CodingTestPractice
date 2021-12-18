package com.algorithm.sortTest;

public class QuickSort {

	static int[] list; 
	
	public static void main(String[] args) {
		
		list = new int[10];
		int[] array = {5,4,9,0,3,1,6,2,7,8};
		list = array;
		
		long startTime = System.currentTimeMillis();

		int pivot = 0;
		int left = 0;
		int right = list.length-1;
		
		list = solution(pivot,left,right);
		
		long endTime = System.currentTimeMillis();
		long time = (endTime-startTime)/1000;
		
		for(int i = 0; i < list.length ; i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		System.out.println("Time : "+time);
		
	}

	// 재귀함수를 사용할 것 같은데
	
	private static int[] solution(int pivot, int left, int right) {
		System.out.println("solution start."
				+"\n pivot : "+pivot+", left : "+left+", right : "+right);
		
		int temp = 0;
		
		int r = right;
		int l = left;
		
		if(pivot==left && pivot==right) return list;
		
		while(true) {
//			System.out.println("pivot : "+pivot);
			for(int j=l ; j<=r ; j++) {
				if(list[pivot]<list[j]) {
					left = j;
					break;
				}
			}

			for(int j=r ; j>=l ; j--) {
				if(list[pivot]>list[j]) {
					right = j;
					break;
				}
			}
			System.out.println("======");
			System.out.println("r : "+r);
			System.out.println("right : "+right);
			System.out.println("l : "+l);
			System.out.println("left : "+left);
			System.out.println("======");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			if(left>right) {
				temp = list[right];
				list[right] = list[left];
				list[left] = temp;
				temp = 0;	
			}else {
				temp = list[right];
				list[right] = list[pivot];
				list[pivot] = temp;
				temp = 0;
				
				temp = right;
				right = pivot;
				pivot = temp;
				temp = 0;
				
				solution(l,right,pivot-1);
				solution(pivot+1,pivot+1,r);
				
				break;
			}
			
		}
		
		
		return list;
	}
}
