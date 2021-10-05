package com.practiceLevel1;

public class TresureMap {

	public static void main(String[] args) {
		
//		네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 
//		그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 
//		다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
//
//		지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
//		전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자. 
//		지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 
//		지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
//		"지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
//		암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
		
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] result = solution(n, arr1, arr2);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+"");
		}
		
		
	}

	private static String[] solution(int n, int[] arr1, int[] arr2) {
		
		String[] answer = new String[arr1.length];
		
//		String a = Integer.toBinaryString(arr1[0]);
//		System.out.println(a);
//		System.out.println(String.format("0%-5s", a));
		
		String[] a1 = new String[arr1.length];
		String[] a2 = new String[arr2.length];
		
		
		for (int i = 0; i < arr1.length; i++) {
			if(Integer.toBinaryString(arr1[i]).length()<5) a1[i] = "0"+Integer.toBinaryString(arr1[i]);
			else a1[i] = Integer.toBinaryString(arr1[i]);
			if(Integer.toBinaryString(arr2[i]).length()<5) a2[i] = "0"+Integer.toBinaryString(arr2[i]);
			else a2[i] = Integer.toBinaryString(arr2[i]);
		}
		
//		for (int i = 0; i < a2.length; i++) {
//			System.out.println(a1[i]);
//			System.out.println(a1[i].length());
//			System.out.println(a1[i].substring(0,1));
//			System.out.println(a1[i].substring(4,5));
//		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(a1[i].substring(j,j+1).equals("1") || a2[i].subSequence(j,j+1).equals("1")) {
					answer[i] += "#";
				}else {
					answer[i] += " ";
				}
			}
			
		}
		
		
		for (int i = 0; i < a2.length; i++) {
			System.out.println(answer[i]);
		}
		
		
		return answer;
	}

}
