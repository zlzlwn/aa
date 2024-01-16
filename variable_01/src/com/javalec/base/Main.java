package com.javalec.base;

public class Main {
public static void main(String[] args) {
	//	data 출력
	System.out.println("abcd");
	System.out.println("가나다");
	System.out.println("123");
	System.out.println(123);
	System.out.println("123+1="+ (1234+1));    //(1234+1)먼저 실행 후 "123+1=" 출력 다음 + 
	
	//	변수(variable)
	// -정수(intiger)
	//	 int 정수 정의(한번만) num1 이름 = 10 10이라고 정의(할당)함 ; 마침표-> heap 메모리에 num1  data 메모리에 10 저장
	int num1 = 10; //첫번째 숫자
	System.out.println(num1);
	num1 = 100;
	System.out.println(num1);
	int firstNumber = 10; //두번째 숫자
	int num3 = 20; //세번째 숫자
	// 덧셈

	System.out.println(firstNumber + "+" + num3 + "=" + (firstNumber + num3) );
	// 뺄셈
	System.out.println(firstNumber + "-" + num3 + "=" + (firstNumber - num3) );
	//	곱셈
	System.out.println(firstNumber + "*" + num3 + "=" + (firstNumber * num3) );
	//	나눗셈
	System.out.println(firstNumber + "/" + num3 + "=" + ((double)firstNumber / num3) );
	// double 실수형 인데 선언에서 더블로 하면 소수점이 더러워서 식 안에 넣음 
	//	변수 작명 
	/*
	 * 변수는 의미전달
	 1) camel : 2 단어의 연결중 첫번째 단어는 소문자로 시작하고 두번째 단어는 대문자로 시작
	    eg) appleFruit, firstNumber
	    사용: 변수이름, Method 이름
	 2) pascal : 2 단어의 연결중 첫번째 단어는 대문자로 시작하고 두번째 단어는 대문자로 시작
	    eg) AppleFruit, FirstNumber
	    사용: Class 이름
	 3) snake : 2 단어의 연결을 under bar로 함 dart에서 많이 씀임
	    eg) Apple_fruit, First_number
	    사용: 변수이름 method 이
	 */
	// 상수 (constant)
	final double pi = 3.141592;
//	constnumber =100;
	
	System.out.println(pi);
	
	System.out.println("----------------------------");
	
	int intNum1 = 20;
	int intNum2 = 10;
	
	int intNum3 = intNum1 +intNum2;
	char char1 = '가';
	String str1 ="나다라마";
	double doublenum = 10;
	
	boolean boolNum1 =true;
	boolNum1 = false;
	
	doublenum = intNum3;
	intNum3 = (int)doublenum;// 자료 범위에 따라 소수점 버림
	
	
	
	
	
	
	

}
}
