package com.practiceLevel1Unsolved;

import java.util.ArrayList;
import java.util.HashSet;

public class Budget {

	public static void main(String[] args) {
		
		/*
		 
		S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 필요한 금액을 조사했습니다. 
		그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 구매해 줄 수는 없습니다. 그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.

		물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다. 
		예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며, 1,000원보다 적은 금액을 지원해 줄 수는 없습니다.

		부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 
		최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.
		
		*/	
		
		int[] d = {};
		int budget = 0;
		int result = solution(d, budget);
		System.out.println(result);
		
		
//		int a = (int) (10*Math.random());
//		System.out.println(a);
		
//		int a = 0;
//		int b = a;
//		a = 1;
//		System.out.println(b);
//		 ( b=0 )
		
	}

	
	
	private static int solution(int[] d, int budget) {
		
		int result = 0;
		
		return result;
	}
	
	
	
	
	
	
	/*

	private static int solution(int[] d, int budget) {
		
		int result = 0;
		int budgetC = budget;
		int pro = 0;
		int cnt = (int) (d.length*Math.random());
		ArrayList<Integer> cnts = new ArrayList<Integer>();
		int a = 0;
//		ArrayList<Integer> as = new ArrayList<Integer>();
		HashSet<Integer> as = new HashSet<Integer>();
		
//		while(true) {
//			
//			if(budget-d[cnt]>0) {
//				cnts.add(cnt);
//				pro = budget-d[cnt];
//				a++;
//			}else {
//				cnts = new ArrayList<Integer>();
//				budget=budgetC;
//				as.add(a);
//			}
//			
//			cnt = (int) (d.length*Math.random());
//			
//			for (int i = 0; i < cnts.size(); i++) {
//				if(cnts.get(i)==cnt) {
//					cnt = (int) (d.length*Math.random());
//					i=-1;
//				}
//			} 
//			
//			
//		}
		
		
//		for (int i = 0; i < d.length; i++) {
//			
//			if(budget-d[i]>0) {
//				pro = budget-d[i];
//				cnt.set(cntC, cnt.get(i)+1);
//			}else {
//				budget = budgetCopy;
//				cntC++;
//			}
//			
//		}
		
		
		return result;
	}
	*/

	
	/*
	
	private static int solution(int[] d, int budget) {
		
		int result = 0;
		int budget1 = budget;
		ArrayList<Integer> cnts = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> cntss = new ArrayList<ArrayList<Integer>>();
		
		
		while(true) {
			
			while(true) {
				
				int cnt = (int) (d.length*Math.random());
				
				for (int i = 0; i < cnts.size(); i++) {
					if(cnts.get(i)==cnt) {
						cnt = (int) (d.length*Math.random());
						i=-1;
					}
				} 
				
				budget -= d[cnt];
				
				if(budget<0) {
					budget=budget1;
					cntss.add(cnts);
				}
				else cnts.add(cnt);
				
			}
			
			for (int i = 0; i < cntss.size(); i++) {
				for (int j = 0; j < i; j++) {
					
					result = cntss.get(i).size();
					if(cntss.get(j).size()>cntss.get(i).size()) result = cntss.get(j).size();
					
				}
			}
			
			
		}
		
		return result;
	}

	
	*/
}
