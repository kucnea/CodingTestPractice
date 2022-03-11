package com.algorithm.sortTest;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] list = new int[8];
		int[] result = new int[8];
		
		for(int i = 0 ; i < 8 ; i++) {
			list[i] = (int)((Math.random()*8)+1);
		}
		
		printList(list);
		System.out.println();
		System.out.println("============정렬 전 후 ==========");
//		mergeSort(0,7);
		sort(list,0,list.length-1);
		
		printList(list);
	}
	
	private static void printList(int[] list) {
		for(int i = 0 ; i < list.length ; i++) {
			System.out.print(list[i]+" ");
		}
	}
	
	private static void sort(int[] list, int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			
			sort(list,start,mid);
			sort(list,mid+1,end);
			
			merge(list,start,mid,end);
		}
	}
	
	private static void merge(int[] list, int start, int mid, int end) {
		
		int size1 = mid - start + 1;
		int size2 = end - mid;
		
		int[] left = new int[size1];
		int[] right = new int[size2];
		
		for(int i = 0 ; i < size1 ; i++) {
			left[i] = list[start+i];
		}
		for(int i = 0 ; i < size2 ; i++) {
			right[i] = list[mid+1+i];
		}
		
		int leftIdx = 0 ; int rightIdx = 0;
		int listIdx = start;
		
		while(leftIdx<size1 && rightIdx<size2) {
			if(left[leftIdx]<=right[rightIdx]) {
				list[listIdx++] = left[leftIdx++];
			}else {
				list[listIdx++] = right[rightIdx++];
			}
		}
		
		while(leftIdx<size1) {
			list[listIdx++] = left[leftIdx++];
		}
		while(rightIdx<size2) {
			list[listIdx++] = right[rightIdx++];
		}
		
	}
	
//	private static void mergeSort(int start, int end) {
//		
//		if(end>start) {
//			int mid = (start+end)/2;
//            // 최소 단위로 쪼개기
//			mergeSort(start,mid);
//			mergeSort(mid+1,end);
//            merge(start,mid,end);            
////            // left ~ mid 까지 왼쪽 파트와 mid+1 ~ right 까지 파트로 분류한 것을 지칭
////			int left = start;
////			int right = mid+1;
////
////            // 결과물로 내놓을 int[] result에 채워넣을 index 시작을 지정.
////            // 콘솔로 들어가는 값을 보니 원하는 순서가 아닌가 싶어 강제로 0도 지정해봤으나 불발.
////			int idx = start;
////
////			while(left <= mid && right <= end) {
////				
////                // 왼,오 파트 중 하나씩 값을 비교해 작은값을 result에 넣도록
////				if(list[left]<=list[right]) result[idx++] = list[left++];
////				else result[idx++] = list[right++];
////				
////			}
////			
////            // 왼, 오 파트중 아직 넣지 않은 값이 있다면 마저 result에 넣도록 처리.
////			if(left <= mid) for(int i = left ; i <= mid ; i++) result[idx++] = list[i];
////			else for(int i = right ; i <= end ; i++) result[idx++] = list[i];
////			
//		}
//		
//	}
	
}
