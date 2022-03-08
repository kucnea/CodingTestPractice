package com.algorithm.sortTest;

public class QuickSort {

	static int[] list; 
	
	public static void main(String[] args) {
		
		list = new int[10];
		int[] array = {5,7,9,0,3,1,6,2,4,8};
		list = array.clone();
		
		long startTime = System.currentTimeMillis();

		int pivot = 0;
		int left = 0;
		int right = list.length-1;
		
		solution(pivot,left,right);
		quickSort(array,0,9);
		long endTime = System.currentTimeMillis();
		long time = (endTime-startTime)/1000;
		
		for(int i = 0; i < list.length ; i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		for(int i = 0; i < list.length ; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Time : "+time);
		
	}

	// 재귀함수를 사용할 것 같은데
	
	private static void solution(int pivot, int left, int right) {
//		System.out.println("solution start."
//				+"\n pivot : "+pivot+", left : "+left+", right : "+right);
//		
		int temp = 0;
		
		int r = right;
		int l = left;
		
		if(pivot==left && pivot==right) return;
		
		while(true) {
//			System.out.println("pivot : "+pivot);
			for(int j=l+1 ; j<=r ; j++) {
				if(list[pivot]<list[j]) {
					left = j;
					break;
				}else {
					left = -1;
				}
			}
//10243
//01243
//1243
//4321
//1324
			for(int j=r ; j>=l ; j--) {
				if(list[pivot]>list[j]) {
					right = j;
					break;
				}else {
					right = -1;
				}
			}
			
			if(left==-1) {
				temp = list[r];
				list[r] = list[pivot];
				list[pivot] = temp;
				
				solution(pivot,l,r-1);
				return;
			}
			
			if(right==-1) {
				solution(pivot+1,l+1,r);
				return;
			}
			
//			System.out.println("======");
//			System.out.println("list[pivot] : "+list[pivot]);
//			System.out.println("r : "+r);
//			System.out.println("right : "+right);
//			System.out.println("list[right] : "+list[right]);
//			System.out.println("l : "+l);
//			System.out.println("left : "+left);
//			System.out.println("list[left] : "+list[left]);
//			System.out.println("======");
//			System.out.println();
//			System.out.println();
//			System.out.println();
//			System.out.println();
			if(left<right) {
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
		
		
		return;
	}
	
	
	private static void quickSort(int[] list, int start, int end) {
		
		if(start >= end) return;
		int pivot = start;
		int left = start+1;
		int right = end;
		
		while(left<=right) {
			
			while(left <= end && list[left] <= list[pivot]) left++;
			while(right > start && list[right] >= list[pivot]) right--;
			
			if(left > right) {
				int temp = list[pivot];
				list[pivot] = list[right];
				list[right] = temp;
			}else {
				int temp = list[left];
				list[left] = list[right];
				list[right] = temp;
			}
			
		}
		
		quickSort(list,start, right-1);
		quickSort(list,right+1,end);
		
	}
	
	private static void sortVersion2(int start, int end) {
		
		if(start>=end) return;
		int pivot = start;
		int left = start+1;
		int right = end;
		
		while(left<=right) {
			
			while(left < end && list[left]<=list[pivot]) left++;
			while(right > start && list[right]>=list[pivot]) right--;
			
			int temp = 0;
			if(left<right) {
				temp = list[left];
				list[left] = list[right];
				list[right] = temp;
			}else {
				temp = list[left];
				list[left] = list[pivot];
				list[pivot] = temp;
			}
			
		}
		
		sort(start,pivot-1);
		sort(pivot+1,end);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
