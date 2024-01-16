package com.java.function;

public class Calc {

	//Field
	int dan;
	int startNum;
	int endNum;
	
	
	//Constructor
	public Calc() {
		
	}
	public Calc(int num1,int num2,int num3) {
		this.dan = num1;		//this 는 Calc가 생성  받아서 Class 의 num1으로 넘긴
		this.startNum = num2;
		this.endNum = num3;
//		System.out.println(num1);
	}
//	----------------------여기까지가 Main에서 값 받아오기--------
	//Method
	public void gugu() {
		multi(dan,startNum,endNum);
		
	}
	private void multi(int num1,int num2,int num3) { //계산,출력
			for(int i=num2; i<=num3; i++) {
				System.out.println(num1+ "x"+ i+ "="+ (num1*i));
		}
	}
}
