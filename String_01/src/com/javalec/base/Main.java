package com.javalec.base;


public class Main {

	public static void main(String[] args) {
		/*
		 * Description : 
		 * Author  : j.park
		 * Date : 2023.12.04
		 * 
		 */
		String str0= "가나다라마바";								// 다 같은거임 대문자로 시작하는 애들은 new라고 적는다
		String str1= new String("abcdefg");
		String str11= new String("ABCDEFG");
		String str2= new String("HIJKLMN");
		String str3= new String("    abc    ");
//		s 대문자인 이유는 객체형 변수라서 

		System.out.println(str1);
		System.out.println(str1.concat(str2));					// . 어서사용한 거는 api사용한거고 method
		System.out.println(str1.substring(3));					// sub : 부분집합 필요한 부분만 뽑아올때 사용
		System.out.println(str1.substring(3,5));
		
		//라마 만 출력하기
	System.out.println(str0.substring(3,5));					//012345배열에
	
	System.out.println(str1.length());
	System.out.println(str1.toUpperCase());						//대문자
	System.out.println(str2.toLowerCase());						//소문자
	
	System.out.println(str1.charAt(3));							//3번째 문자만 가지고오기
	System.out.println(str1.indexOf('d')); 						// d라는 애가 인덱스 몇번째에 있는지
	
	System.out.println(str1.equals(str2));
	
	//str1과 str11를 equals로 바교하여 true값이 나오게하기
	
	System.out.println(str1.equals(str11.toLowerCase()));
	System.out.println(str3);
	System.out.println(str3.trim());							//스페이스바 삭제
	System.out.println(str1.replace('a', 'z'));					// a를 z로 바꾸기(보여줄때만)
	System.out.println(str1.replaceAll("abc", "zzzzzz"));		// 문자열
	// framework  개발하기위해서class사
	
	
	
	
	}

}
