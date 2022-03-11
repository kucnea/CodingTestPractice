package com.algorithm.sortTest;

public class MergeSort {
	
	static int[] list;
	static int[] result;
	
	public static void main(String[] args) {
		
		list = new int[8];
		result = new int[8];
		
		for(int i = 0 ; i < 8 ; i++) {
			list[i] = (int)((Math.random()*8)+1);
		}
		
		for(int i = 0 ; i < 8 ; i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		System.out.println("============정렬 전 후 ==========");
		mergeSort(0,7);
		
		for(int i = 0 ; i < 8 ; i++) {
			System.out.print(result[i]+" ");
		}
	}
	
	
	private static void mergeSort(int start, int end) {
		
		if(end>start) {
			int mid = (start+end)/2;
            // 최소 단위로 쪼개기
			mergeSort(start,mid);
			mergeSort(mid+1,end);
            merge(start,mid,end);            
//            // left ~ mid 까지 왼쪽 파트와 mid+1 ~ right 까지 파트로 분류한 것을 지칭
//			int left = start;
//			int right = mid+1;
//
//            // 결과물로 내놓을 int[] result에 채워넣을 index 시작을 지정.
//            // 콘솔로 들어가는 값을 보니 원하는 순서가 아닌가 싶어 강제로 0도 지정해봤으나 불발.
//			int idx = start;
//
//			while(left <= mid && right <= end) {
//				
//                // 왼,오 파트 중 하나씩 값을 비교해 작은값을 result에 넣도록
//				if(list[left]<=list[right]) result[idx++] = list[left++];
//				else result[idx++] = list[right++];
//				
//			}
//			
//            // 왼, 오 파트중 아직 넣지 않은 값이 있다면 마저 result에 넣도록 처리.
//			if(left <= mid) for(int i = left ; i <= mid ; i++) result[idx++] = list[i];
//			else for(int i = right ; i <= end ; i++) result[idx++] = list[i];
//			
		}
		
	}
	
	private static void merge(int start, int mid, int end) {
		 // left ~ mid 까지 왼쪽 파트와 mid+1 ~ right 까지 파트로 분류한 것을 지칭
		int left = start;
		int right = mid+1;

        // 결과물로 내놓을 int[] result에 채워넣을 index 시작을 지정.
        // 콘솔로 들어가는 값을 보니 원하는 순서가 아닌가 싶어 강제로 0도 지정해봤으나 불발.
		int idx = start;

		while(left <= mid && right <= end) {
			
            // 왼,오 파트 중 하나씩 값을 비교해 작은값을 result에 넣도록
			if(list[left]<=list[right]) result[idx++] = list[left++];
			else result[idx++] = list[right++];
			
		}
		
        // 왼, 오 파트중 아직 넣지 않은 값이 있다면 마저 result에 넣도록 처리.
		if(left <= mid) for(int i = left ; i <= mid ; i++) result[idx++] = list[i];
		else for(int i = right ; i <= end ; i++) result[idx++] = list[i];
	}
}
