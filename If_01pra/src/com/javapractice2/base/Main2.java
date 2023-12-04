package com.javapractice2.base;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언
	    Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		Double a = (double) 0;
		String result = "" ;
	

		
		
		
		
		//점수 입
		
		System.out.println("국어 점수를 입력하세요 :");
		num1= scanner.nextInt();
		
		System.out.println("영어 점수를 입력하세요 :");
		num2= scanner.nextInt();
		
		System.out.println("수학 점수를 입력하세요 :");
		num3= scanner.nextInt();
	
		//평균점수
		a = (double) ((num1 + num2 + num3 )/3) ;
		
		System.out.println( "평균점수: " + a );
		// 점수비교
		if (num1>a) {
			result= "보다 높습니다.";
			
		}else if (num1 == a) {
			result= "입니다.";
		}else if (num2 < a) {
			result= "보다 낮습니다.";

			
		}
		
		System.out.println("국어점수는 평균"+ result);
		
		
		if (num2 > a) {
			result= "보다 높습니다.";
		}else if (num2 == a) {
			result= "입니다.";
		}else if (num3 < a) {
			result= "보다 낮습니다.";
		}
		System.out.println("영어점수는 평균"+ result);
		
		
		if (num3 > a) {
			result= "보다 높습니다.";
		}else if (num3 == a) {
			result= "입니다.";
		}else {
			result= "보다 낮습니다.";
		}
	    System.out.println("수학점수는 평균"+ result);
	
		
	    System.out.println(">>>>> End<<<<<");
	  
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
