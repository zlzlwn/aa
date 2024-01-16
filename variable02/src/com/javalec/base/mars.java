package com.javalec.base;

public class mars {
//Class 이름 대문자로 작성하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//연산자 종류별출력
		int num1 = 10;
		int num2 = 2;
		int num3 = 5;
		
		System.out.println("<<<<산술연산자>>>>");
		System.out.println("덧셈:" +num1 + "+" + num2 + '=' + (num1+num2));
		System.out.println("뺄셈:" +num1 + "-" + num2 + '=' + (num1-num2));
		System.out.println("곱셈:" +num1 + "-" + num2 + '=' + (num1*num2)); 
		System.out.println("나눗셈 몫:" +num1 + "/" + num2 + '=' + (num1/num2));
		System.out.println("나눗셈 나머지:" +num1 + "%" + num2 + '=' + (num1%num2));// 짝수홀수알고리즘
		
		
		System.out.println("<<<<자동증감연산자>>>>");
		num1 =num1 + 1;// = 기준 왼쪽부터 시
		num1 +=1; // 위랑 같음
		num1++;
		
		System.out.println("증가 :"+ num1);
		num1 =num1 - 1;// = 기준 왼쪽부터 시
		num1 -=1; // 위랑 같음
		num1 --;
		System.out.println("감소 :"+ num1);		
		
		
		System.out.println("<<<<동등 비교 관계 연산자>>>>");
		System.out.println("num1==num2 :" + (num1==num2));
		System.out.println("num1!=num2 :" + (num1!=num2));// 영어하듯이 svo 처럼
		System.out.println("num1>num2 :" + (num1>num2));
		System.out.println("num1<num2 :" + (num1<num2));
		System.out.println("num1>=num2 :" + (num1>=num2));
		System.out.println("num1<=num2 :" + (num1<=num2));
	
		System.out.println("<<<<논리 연산자>>>>");
		/*
		 t && t => t
		 t && f => f
		 f && t => f
		 f && f => f
		 */
		System.out.println("num1>num2 && num2>num3 :" + ((num1>num2) && (num2>num3))); //&& 동등 연산

		/*
		 t || t => t
		 t || f => t
		 f || t => t
		 f || f => f
		 */
		System.out.println("num1>num2 || num2>num3 :" + ((num1>num2) || (num2>num3))); //|| :or
		
		System.out.println("<<<<삼항 연산자>>>>");
		//7이 3의 배수인지 판
		System.out.println("7이 3배수인가? :" + (7%3 == 0 ? "3의 배수" : "3의배수 아님")); 
		String result = (7%3 == 0 ? "3의 배수" : "3의배수 아님");
		System.out.println(result);
		
		/*
		 등록된 ID : abcd
		 등록된 Password : 1234
		 
		 입력 ID : qwe
		 입력된 Password : 1234
		 통과 : 환영합니다 /불통과  id나 password를 다시 입력 하세
		 */
		
		String idRegister ="abcd";
		int passwordRegister = 1234;
		

		String idEntered ="qwe";
		int passWordentered = 1234;
		
		System.out.println((idRegister == idEntered) && (passWordentered == passwordRegister) ? "환영합니다" : "id나 password를 다시 입력 하세요");
		
		
		
		
		
		
	}

}
