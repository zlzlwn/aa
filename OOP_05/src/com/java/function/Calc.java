package com.java.function;

public class Calc {
	//property, field
	int dan = 2;
	
		// Constructor
	public Calc() {
		
	}
		public Calc(int dan) {
			this.dan= dan;
			
		}
			
		//Method
		
	public void gugu() {
			multi(dan);		
		}
	private void multi(int num1) {
		for(int i=1; i<=9; i++) {
			System.out.println(num1+"x"+i+"="+(num1*i));
		}
	}
		
		
		
		
		
		
		
}
