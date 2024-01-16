package com.java.function;

public class Sum1 {

	
	public Sum1() {
		// TODO Auto-generated constructor stub
	}
	
		// 합계구하기
	public int sumCal(int num1, int num2) {		//파란색 num1은 파라미터라고 부른
		int sum1 = 0;
		for(int i =num1; i <= num2; i++){
			sum1+= i;
		}
		System.out.println("sumCalc");
		return sum1;
	}
	
	
	
}
