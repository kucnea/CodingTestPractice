package com.practiceLevel1Unsolved;

import java.util.ArrayList;
import java.util.HashSet;

public class Budget {

	public static void main(String[] args) {
		
		/*
		 
		S�翡���� �� �μ��� �ʿ��� ��ǰ�� ������ �ֱ� ���� �μ����� ��ǰ�� �����ϴµ� �ʿ��� �ݾ��� �����߽��ϴ�. 
		�׷���, ��ü ������ ������ �ֱ� ������ ��� �μ��� ��ǰ�� ������ �� ���� �����ϴ�. �׷��� �ִ��� ���� �μ��� ��ǰ�� ������ �� �� �ֵ��� �Ϸ��� �մϴ�.

		��ǰ�� ������ �� ���� �� �μ��� ��û�� �ݾ׸�ŭ�� ��� ������ ��� �մϴ�. 
		���� ��� 1,000���� ��û�� �μ����� ��Ȯ�� 1,000���� �����ؾ� �ϸ�, 1,000������ ���� �ݾ��� ������ �� ���� �����ϴ�.

		�μ����� ��û�� �ݾ��� ����ִ� �迭 d�� ���� budget�� �Ű������� �־��� ��, 
		�ִ� �� ���� �μ��� ��ǰ�� ������ �� �ִ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
		
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
