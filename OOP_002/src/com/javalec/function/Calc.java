package com.javalec.function;

public class Calc {

	//field
	
	//constructor
	public Calc() {
		// 여기도 코딩은 가능
		
	}
	
	//method
	//>> 덧셈
	public int addaction(int first, int second) {			//여기의 파라미터는 메인과 이름 상관없다. 순서가 중요!!
		return (first+second);								//string으로 바로 출력할수도 있음
	}
	
	//>> 뺄셈
		public int subaction(int first, int second) {			//여기의 파라미터는 메인과 이름 상관없다. 순서가 중요!!
			return (first-second);								//string으로 바로 출력할수도 있음
	}	
		//>> 곱
		public int mulaction(int first, int second) {			//여기의 파라미터는 메인과 이름 상관없다. 순서가 중요!!
			return (first*second);								//string으로 바로 출력할수도 있음
		}	
		//>> 나눗
		public int divaction(int first, int second) {			//여기의 파라미터는 메인과 이름 상관없다. 순서가 중요!!
			return (first / second);								//string으로 바로 출력할수도 있음
		}	
		
}
