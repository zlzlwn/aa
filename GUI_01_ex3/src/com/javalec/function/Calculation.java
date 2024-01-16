package com.javalec.function;

public class Calculation {
	int num1;
	int num2;
	
	public Calculation() {
		
	}
	
	public Calculation(String num1, String num2) {
		super();
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
	}
	
	public String add1() {
		return Integer.toString(num1 + num2);
	}

	public String sub1() {
		return Integer.toString(num1 - num2);
	}
	
	public String mul1() {
		return Integer.toString(num1 * num2);
	}
	
	public String div1() {
		String result;
		if(num2 == 0) {
			result = "Impossible";
		}else {
			result = String.format("%.3f", (double)num1/num2);
		}
		return result;
	}







}




















