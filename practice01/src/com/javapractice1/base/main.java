package com.javapractice1.base;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num3 = 8000;
		int num4 = 5000;
		int num5 = 3000;
		String result = "" ;
		scanner.close();
		
		// num1이 num2보다 큰지 작은지 같은지 판
		// 숫자 2개 받아오기
		System.out.println("금액을 입력하세요 :");
		num1= scanner.nextInt();
		
		
	   if(num1 > num3){														
		   result = "너무 비쌉니다.";
	   }else if(num1 > num4) {
		   result = "조금 비쌉니다.";
	   }else if(num1 > num5) {
		   result = "적당한 금액입니다.";
	   }else {
		   result = "싼편입니다." ;
		
	}
	   System.out.println(result);
	   
	   System.out.println(">>>>> End<<<<<");
		
		
				}
			
		}

	
		
		
		
	


