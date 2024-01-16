package com.javalec.function;

public class CalcEach {

	//Field
	
			
	//Constructor
	public CalcEach() {
		
	}
	
	//Method
	public void calc(int first, int second) {
		//덧,뺄,곱,나눔
		add(first,second);
		sub(first,second);
		mul(first,second);
		div(first,second);
	}
	
	public void cal2(int first, int second) {
		
		add(first,second);
		sub(first,second);
		mul(first,second);
		div(first,second);
	}
	
	
	private void add(int first, int second) {
		System.out.println("덧셈 : "+ (first+second) );
	}
	private void sub(int first, int second) {
		System.out.println("덧셈 : "+ (first+second) );
	}		
	private void mul(int first, int second) {
		System.out.println("덧셈 : "+ (first+second) );
	}
	private void div(int first, int second) {
		System.out.println("덧셈 : "+ (first+second) );
	}
	
	
	

	
	
}
