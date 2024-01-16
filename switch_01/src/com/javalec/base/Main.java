package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Switch
		
		
	Scanner scanner = new Scanner(System.in) ;
	int inputNumber = 0;
	String result = "";
	
		
		
		
		
		System.out.println("숫자를 입력하세요 : ");
		inputNumber = scanner.nextInt();
		
		
		
		
		// if 문 적용
//		if(inputNumber % 2 == 0) {
//		result = "짝수" ;
//	}else {
//		result = "홀수" ;
//	}
		
		// switch문 적용
		switch(inputNumber % 2) {
		case 0:
			result = "짝수";
			break;
		case 1:
			result = "홀수";
			break;
		default:			// 예제경우는 경우의수가 2개밖에없어서 디폴트 없어도됨
			break;
			
		}
		
		
		
		
	System.out.println("입력하신 숫자" + inputNumber + "은(는)" + result + "입니다.");
		
		
		
		
	}
	}
