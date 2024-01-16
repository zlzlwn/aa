package com.javalec.function;

public class CalAll {

	public CalAll() {
		// TODO Auto-generated constructor stub
	}
	public void calc(int first, int second) {			//출력하고 Main에서 받아서 보여주기만 할때 void사용!
		
		System.out.println("덧셈 : "+ first+second);
		System.out.println("뺄셈 : "+ (first-second));
		System.out.println("곱셈 : "+ (first*second));
		System.out.println("나눗셈 : "+ (first/second));

}
}
