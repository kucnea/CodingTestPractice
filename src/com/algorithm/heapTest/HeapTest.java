package com.algorithm.heapTest;

import java.util.Comparator;

public class HeapTest<E> {
	
	private final Comparator<? super E> comparator;
	private static final int DefaultCapacity = 10; // 최소(기본) 용적 크기
	
	private int size; // 요소 개수
	
	private Object[] array; // 요소를 담을 배열
	
	//생성자 Type 1 ( 초기 공간 할당 X )
	public HeapTest() {
		this(null);
	}
	
	public HeapTest(Comparator<? super E> comparator) {
		this.array = new Object[DefaultCapacity];
		this.size = 0;
		this.comparator = comparator;
	}
	
	
	// 생성자 Type 2 ( 초기 공간 할당 O )
	public HeapTest(int capacity) {
		this(capacity, null);
	}

	public HeapTest(int capacity, Comparator<? super E> comparator) {
		this.array = new Object[capacity];
		this.size = 0;
		this.comparator = comparator;
	}
	
	
	
	// 받은 인덱스의 부모 노드 인덱스를 반환
	private int getParent(int index) {
		return index / 2;
	}
	
	// 받은 인덱스의 왼쪽 자식 노드 인덱스를 반환
	private int getLeftChild(int index) {
		return index * 2;
	}
	
	// 받은 인덱스의 오른쪽 자식 노드 인덱스를 반환
	private int getRightChild(int index) {
		return getLeftChild(index) + 1;      // 물론, index*2 + 1 을 해도 된다.
	}
	
	
}
