package com.javalec.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// Map
		HashMap<String, String> hashMap =new HashMap<String, String>();
		hashMap.put("Apple", "사과");
		hashMap.put("Banana", "바나나");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get("Apple"));
		
		hashMap.put("Apple", "Apple");
		System.out.println(hashMap);
		
		hashMap.remove("Apple");
		System.out.println(hashMap);
		
		hashMap.clear();
		System.out.println(hashMap);
		
		

	}

}
