package com.javalec.function;

public class SecondSon {


	
	
	public SecondSon() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeChoco() {
		MamaBag bag = new MamaBag();
		MamaBag.shoco =MamaBag.shoco-1;
		if(MamaBag.shoco<0) {
			System.out.println("첫째는 초코파이먹고싶어요.");
		}else {
			System.out.println("첫째는 맛있게 먹었어요.");
			
		}
	
	}
	}
