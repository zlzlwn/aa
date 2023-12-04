package com.java.base;

import java.util.Scanner;

public class Main_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] number;	
		
		
		System.out.println("입력할 숫자의 갯수? :");
		int count = scanner.nextInt();
		number =new int [count]; 					// 갯수 지정
		
		System.out.println(count + "개의 숫자를 입력하세요!:");
		
		for(int i = 0; i <=count-1 ; i++) {
			System.out.print((i+1) +"의 숫자 :");	
			int inputNum = scanner.nextInt();
		}
		
		System.out.print("몇번째의 숫자를 삭제하시겠습니까? :");
		
		
		System.out.println("------- 결과 -------");
		
		for(int i = 0; i <=count-2 ; i++) {
			
			
			
		}
	}

}
