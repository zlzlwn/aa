package com.javapractice2.base;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//선언
	    Scanner scanner = new Scanner(System.in);
	    Double tall = (double) 0;
	    Double weight = (double) 0;
	    Double bmi = (double) 0;
	
		String result = "" ;
	

		
		//키, 몸무게 입력
		System.out.println("키(cm)를 입력하세요: ");
		tall = (double)scanner.nextInt();
		
		
		System.out.println("몸무게(kg)를 입력하세요: ");
		
		weight = (double)scanner.nextInt();
		
		
		bmi = (weight / (tall/100) / (tall/100)) ;
		
		//System.out.println("당신의 bmi지수는" + bmi + "입니다.");
		
		
		// bmi 분류
		if(weight <= 0 || tall <= 0) {
		System.out.println("다시 입력하세요.");
		
		}else {
	    if (bmi > 30) {
	    	result =  "고도비만";
		}else if (bmi > 25) {
			result =  "비만";
		}else if (bmi > 23) {
			result =  "과체중";
		}else if (bmi > 18.5) {
			result =  "정상체중";
		}else if (bmi > 0) {
			result =  "저체중";
		}
	    System.out.println("귀하는 " + result + " 입니다.");
		}
	    
	
	}
		}

	
	
			
