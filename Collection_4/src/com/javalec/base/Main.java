package com.javalec.base;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// Set(집합) 요즘은 잘 안
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(4);
		hashSet.add(4);
		hashSet.add(4);	//중복된 데이터는 수용하지 않는다
		System.out.println(hashSet);
		
		hashSet.remove(4);
		System.out.println(hashSet);
		
		
		

		
		
	}

}
