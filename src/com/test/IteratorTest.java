package com.test;

 

import java.util.*;

 

public class IteratorTest {

 

public static void main(String[] args) {

 

ArrayList<Integer> list = new ArrayList<>();

list.add(1);

list.add(1);

list.add(1);

list.add(1);

list.add(1);

list.add(1);

printList(list);

 

System.out.println();

Iterator<Integer> iter = list.iterator();

printIter(iter);

 

 

LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();

hashMap.put(1,3);

hashMap.put(1,5);

hashMap.put(2,6);

hashMap.put(3,7);

hashMap.put(4,8);

System.out.println(hashMap);

 

System.out.println(hashMap.keySet());

System.out.println(hashMap.values());

 

Iterator<Integer> keyIter = hashMap.keySet().iterator();

Iterator<Integer> valIter = hashMap.values().iterator();

 

System.out.println("====keyIter====");

printIter(keyIter);

System.out.println();

System.out.println("====valIter====");

printIter(valIter);

}

 

 

private static void printIter(Iterator<Integer> iter) {

 

while(iter.hasNext()) {

System.out.print(iter.next()+" ");

}

 

}

 

 

static public void printList(ArrayList<Integer> list) {

 

for(int i = 0 ; i < list.size() ; i++) {

System.out.print(list.get(i)+" ");

}

 

}

}

