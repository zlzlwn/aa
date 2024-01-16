package com.java.function;

public class Even1 {

	public Even1() {
		// TODO Auto-generated constructor stub
	}
	public String evencal(int sum) {
		String result = "";
		if(sum%2 ==0) {
			result ="짝수입니다.";
		}else {
			result ="홀수입니다.";
			
		}
		System.out.println("짝수 홀수");
		return result;
	}
	
	
	

}
