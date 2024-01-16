package com.javalec.function;

public class Addition {

	
	//field
	int num1;
	int num2;
	
	
	
	//constructor
	
	public Addition() {
		// TODO Auto-generated constructor stub
	}



	public Addition(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
	
	
	//method
	
	public int add()  {
		return  num1+num2;
		
	}
	
	public int sub()  {
		return  num1-num2;
		
	}
	public int mul()  {
		return  num1*num2;
		
	}
	public int div()  {
		return  num1/num2;
		
	}
	
}
