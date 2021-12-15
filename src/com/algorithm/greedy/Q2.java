package com.algorithm.greedy;

public class Q2 {
	
	static int count = 0;
	
	public static void main(String[] args) {
		
		int N = 17;
		int K = 4;
		int result = solution(N, K);
		System.out.println("result : "+result);
		
	}

	private static int solution(int n, int k) {
		
		if(k==1) {
			if(n==1) return count;
			n -= 1;
			count++;
			solution(n,k);
		}
		
		if(n!=1) {
			
			if(n%k==0) {
				n /= k;
				count++;
			}else {
				n -= 1;
				count++;
			}
			
			solution(n,k);
		}else {
			return count;
		}
		
		return count;
	}

}
