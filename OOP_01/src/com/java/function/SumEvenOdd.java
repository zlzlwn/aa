package com.java.function;

public class SumEvenOdd {


		//Field
		
		//Constructor
		public SumEvenOdd() {
			
		}
	
		//Method
		// 1. 합계구하기
		public int sumCalc(int num1, int num2) {		//파란색 num1은 파라미터라고 부른
			int sum = 0;
			for(int i =num1; i <= num2; i++){
				sum+= i;
			}
//			System.out.println("sumCalc");
			return sum;
		}
		// 2. 합계가 짝수인지 홀수인지 판단
		public String evenOdd(int sum) {
			String result = "";
			if(sum%2 ==0) {
				result ="짝수입니다.";
			}else {
				result ="홀수입니다.";
				
			}
//			System.out.println("짝수 홀수");
			return result;
		}
		

	}


