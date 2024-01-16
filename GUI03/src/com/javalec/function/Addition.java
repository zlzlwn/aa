package com.javalec.function;

public class Addition {

	int num1;
	int num2;
	
	public Addition() {
		// TODO Auto-generated constructor stub
	}

	public Addition(String num1, String num2) {
		super();
		this.num1 =    Integer.parseInt(num1) ;
		this.num2 = Integer.parseInt(num2) ;
	}
	
	public String add(String type) {
		int Sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		int result = 0;
		
		
		
		for(int i=num1; i<=num2; i++) {
			Sum = Sum + i;
			if(i%2==0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		
		if(type.equals("All")) {
			result = Sum;
		}
		
		if(type.equals("Odd")) {
			result = oddSum;
		}
		
		if(type.equals("Even")) {
			result = evenSum;
		}
		
		return Integer.toString(result);
	}
	
//	private void numberSet() {
//		if(startNum>endNum) {
//			int x = startNum;
//			startNum = endNum;
//			endNum = x;
//		}
	}
	
	
	
	

