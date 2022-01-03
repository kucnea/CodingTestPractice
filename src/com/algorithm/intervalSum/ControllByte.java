package com.algorithm.intervalSum;

public class ControllByte {

	public static void main(String[] args) {
		
		// i의 0이 아닌 마지막 비트를 찾는 법
				long startTime = System.currentTimeMillis();
				for(int i = 1 ; i <= 16 ; i++) {
					System.out.println(i+"의 마지막 1의 위치 : "+Integer.toBinaryString(i & -i));
					int k = i;
					k += Integer.parseInt(Integer.toBinaryString(k & -k),2);
					System.out.println("k : "+k);
					System.out.println();
				}
				long endTime = System.currentTimeMillis();
				long time = (endTime - startTime);
				System.out.println("time : "+time);
				
	}

}
