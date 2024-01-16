package com.java.function;

public class Calc {
	//Field
	public int num1;		//퍼블릭에서 데이터 넣어주고 메소드에서 계산방
	public int num2;
	
	//Constructor
	public Calc() {				//overloading: Clac가 두개 있는데도 실행됨
	 	
		
	}

	public Calc(int num1, int num2) {
		this.num1 = num1;		//this 는 Calc가 생성  받아서 Class 의 num1으로 넘긴
		this.num2 = num2;
		addAction();
		subAction();
		mulAction();
		divAction();
		
	}
	//Method
	
	public void calcAll() {
		String arr[] = {addAction(),subAction(),mulAction(),divAction()};
		
		for(int i=0; i<arr.length;i++) {
			String a = arr[i];
			
		}
	}
//		addAction();
//		subAction();
//		mulAction();
//		divAction();
	
	public String addAction() {
		System.out.println("덧셈 :"+ (num1+num2));
		return "";
	}
	
	public String subAction() {
		System.out.println("뺄셈 :"+ (num1+num2));
		return "";
	}

	public String mulAction() {
		System.out.println("곱셈 :"+ (num1+num2));
		return "";
	}
	
	public String divAction() {
		System.out.println("나눗셈 :"+ (num1+num2));
		return "";
	}
	
	
	
	
	
	
}
