package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<String> arrayList = new ArrayList<String>(); // <> generic이라고 부름 타입을 정하는 기호
// string대신에 model을 넣어서 사용하는 경우가 많
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println(arrayList.get(3));
		
		//수정
		arrayList.set(3, "str111");
		System.out.println(arrayList);
		
		// 삭제
		arrayList.remove(1);
		System.out.println(arrayList);
		arrayList.add("str1");			//뒤에 가져다붙임
		arrayList.remove("str1");		//제일 앞의 str1만 지워짐
		System.out.println( arrayList.remove("aaa"));
		
		System.out.println(arrayList);
		
		arrayList.add(0, "AAA");		//왜 추가 안되지?
		arrayList.clear();
		System.out.println(arrayList);
		
	}

}
