package com.algorithm;

public class TestSpace {

	public static void main(String[] args) {
		
		Runtime.getRuntime().gc(); // 가비지 컬렉터 소환
		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("테스트 전 : "+usedMemory+"bytes");
		// 1,0의 값을 갖는 1bit
		// 8bit = 1byte
		// 1,048,576byte = 1MB
		// 1,024MB = 1GB
		// 실행시 usedMemory는 1,470,352byte로 1.4mb 근처로 추정된다. 기본 동작 메모리 일 수 있겠다.
		
		int[] arr = new int[1000000];
		usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("100만 단위 배열 선언시 : "+usedMemory+"bytes");
		// 길이가 100만인 int배열을 만들시 8,165,224byte를 사용하는 것으로 나타난다. 대략 8mb근처다.
		// 먼저 사용된 메모리를 제하면 6.3mb 근처다.
		
		int[][] arr2 = new int[2000][2000];
		usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("100만+400만 단위 배열 선언시 : "+usedMemory+"bytes");
		// 길이가 2000인 배열을 담을 수 있는 길이가 2000인 배열을 만드니 ( 대략 400만개의 요소를 담을 수 있다. )
		// 21,679,464byte를 사용하는 것으로 확인된다.
		// 13mb정도의 메모리를 사용하는 것이다.
		
		int[][] arr3 = new int[500][10000];
		usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("100만+400만+500만 단위 배열 선언시 : "+usedMemory+"bytes");
		// 여기까지 총합 1000만 단위의 int가 들어갈 공간을 확보했다.
		// 43,558,248byte로 43mb정도다.
		
		arr = null;
		arr2 = null;
		arr3 = null;
		usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("null처리 후 메모리 : "+usedMemory+"bytes");
		Runtime.getRuntime().gc();
		// null처리 이후 가비지 컬렉터를 호출하면 해당 메모리가 사라진다.
		// 그렇지 않을시 당연히 언젠가 가비지 컬렉터가 메모리를 처리하겠지만 지금 코드의 경우 원하는 시점이 아니였다.
		
		// arr[0] = 1;
		// null 처리 이후 초기화시도시 에러가 발생한다.
		
		usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("null, 가비지 컬렉터 소환 후 메모리 : "+usedMemory+"bytes");
		
		long time1 = 0;
		long time2 = 0;
		arr2 = new int[1000][10000];
		usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		time1 = usedMemory;
		System.out.println("1000만 단위 배열 선언시 메모리 : "+usedMemory+"bytes");
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 10000; j++) {
				arr2[i][j] = 1;
			}
		}
		usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		time2 = usedMemory;
		System.out.println("1000만 단위 배열을 모두 1로 초기화 후 메모리 : "+usedMemory+"bytes");
		System.out.println("두 시점의 메모리의 차이 : "+(time2 - time1)+"bytes");
		// 두 시점의 메모리 차이는 2,694,856byte로 2mb정도다.
		// 배열 선언으로 발생하는 메모리가 42178672-1195920 = 40,982,752byte로 40mb정도인데
		// 값을 선언하는 것보다는 주소를 지정하는데 메모리를 많이 소모하는 것을 알 수 있었다.
		
		
	}

}
