package com.java.base;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int share;			//몫
		int rest;			//나머지
		int num1 = 0;			// 입력값
		int k;				//
		int total= 0;
		
		System.out.print("Enter an integer(0~9) : ");
		num1 = scanner.nextInt();
		
		k= num1;
//		System.out.println(num1);
		
		while (k != 0) {
			share= k/10;				//계속 돌아가게 설정 필요
			k = k%10;
			total +=k;
		}
		System.out.println(total);
		System.out.println();
//		for(int i=1; i<=num1; i++) {
//			System.out.print(i);
////			int i = num3;
//			
//		}
		
////		while
//		if(i<10) {
//			syso
//			k += rest;
//		}
		
		
//		System.out.println("sum of digits =" );
		
		
	
	
	}

}
