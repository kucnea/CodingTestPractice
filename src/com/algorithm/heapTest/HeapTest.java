package com.algorithm.heapTest;

import java.util.Comparator;
import java.util.NoSuchElementException;

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
	
	private void resize(int newCapacity) {
		
		Object[] newArray = new Object[newCapacity];
		
		// 기존 배열에 있던 내용은 새 배열에 넣어준다.
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		
		// 기존 배열 GC처리를 위해 null처리 후 새 배열을 연결.
		this.array = null;
		this.array = newArray;
	}
	
	
	//삽입
	public void add(E value) {
		
		// 배열 용적이 꽉 차있을 경우 용적을 두 배로 늘려준다.
		if(size + 1 == array.length) {
			resize(array.length*2);
		}
		
		// 가장 마지막에 추가되는 위치와 넣을 값을 넘겨줌
		siftUp(size+1, value);
		
		//정상적으로 재배치가 끝나면 사이즈 증가
		size++;
		
	}
	
	//상향 선별
	// @param idx 추가할 노드의 인덱스
	// @param target 재배치 할 노드
	private void siftUp(int idx, E target) {
		
		// comparator가 존재할 경우 comparator를 인자로 넘겨준다.
		if(comparator != null) {
			siftUpComparator(idx, target, comparator);
		}else {
			siftUpComparable(idx, target);
		}
		
	}
	
	
	// comparator를 이용한 siftUp
	@SuppressWarnings("unchecked")
	private void siftUpComparator(int idx, E target, Comparator<? super E> comp) {
		
		//root 노드보다 클 때 까지만 탐색
		while(idx > 1) {
			int parent = getParent(idx);		// 삽입노드의 부모노드 인덱스 구하기
			Object parentVal = array[parent];	// 부모노드의 값
			
			if(comp.compare(target, (E) parentVal) >= 0){
				break;
			}
			
			// 부모노드가 타겟노드보다 크므로
			// 현재 삽입 될 위치에 부모노드 값으로 교체해주고
			// 타겟 노드 위치를 부모노드의 위치로 변경해준다.
			
			array[idx] = parentVal;
			idx = parent;
		}
		
		// 최종적으로 삽입될 위치에 타겟 노드 값을 저장해준다.
		array[idx] = target;
		
	}
	
	@SuppressWarnings("unckecked")
	private void siftUpComparable(int idx, E target) {
		
		//타겟노드가 비교 될 수 있도록 한 변수를 생성.
		Comparable<? super E> comp = (Comparable<? super E>) target;
		
		while(idx > 1) {
			int parent = getParent(idx);
			Object parentVal = array[parent];
			
			if(comp.compareTo((E)parentVal) >= 0) {
				break;
			}
			
			array[idx] = parentVal;
			idx = parent;
		}
		
		array[idx] = comp;
		
	}
	
	
	@SuppressWarnings("unchecked")
	public E remove() {
		if(array[1] == null) {
			throw new NoSuchElementException();
		}
		
		E result = (E) array[1];
		E target = (E) array[size];
		array[size] = null;
		
		siftDown(1, target);
		
		return result;
	}
	
	
	// 하향 선별
	// @param idx 삭제할 노드의 인덱스
	// @param target 재배치 할 노드
	private void siftDown(int idx, E target) {
		// comparator가 존재할 경우 comparator를 인자로 넘겨준다
		if(comparator != null) {
			siftDownComparator(idx, target, comparator);
		}else {
			siftDownComparable(idx, target);
		}
	}
	
	// comparator를 이용한 sift-down
	@SuppressWarnings("unchecked")
	private void siftDownComparator(int idx, E target, Comparator<? super E> comp) {
		
		array[idx] = null;
		size--;
		
		int parent = idx;
		int child;
		
		while((child = getLeftChild(parent)) <= size){
			
			int right = getRightChild(parent);
			
			Object childVal = array[child];
			
			if(right <= size && comp.compare((E) childVal, (E) array[right]) > 0){
				child = right;
				childVal = array[child];
			}
			
			if(comp.compare(target, (E) childVal) <= 0) {
				break;
			}
			
			array[parent] = childVal;
			parent = child;
		}
		
		array[parent] = target;
		
		if(array.length > DefaultCapacity && size < array.length / 4) {
			resize(Math.max(DefaultCapacity, array.length /2));
		}
		
	}
	
	@SuppressWarnings("unchecked")
	private void siftDownComparable(int idx, E target) {
		
		Comparable<? super E> comp = (Comparable<? super E>) target;
		
		array[idx] = null;
		size--;
		
		int parent = idx;
		int child;
		
		while((child = getLeftChild(parent)) <= size) {
			
			int right = getRightChild(parent);
			
			Object childVal = array[child];
			
			if(right <= size && ((Comparable<? super E>)childVal).compareTo((E)array[right])> 0){
				child = right;
				childVal = array[child];
			}
			
			if(comp.compareTo((E) childVal) <= 0){
				break;
			}
			
			array[parent] = childVal;
			parent = child;
			
		}
		
		array[parent] = comp;
		
		if(array.length > DefaultCapacity && size < array.length / 4) {
			resize(Math.max(DefaultCapacity, array.length /2 ));
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
