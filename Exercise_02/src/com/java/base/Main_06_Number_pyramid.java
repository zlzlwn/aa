package com.java.base;

import java.util.Scanner;

public class Main_06_Number_pyramid {

	public static void main(String[] args) {
		/*
		 * Description : Number pyramid 
		 * Author  : j.park
		 * Date : 2023.12.03
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		int up = 1;
		
		System.out.println("몇 단계의 파라미드로 구성할까 ? : ");
		int inputNum1 = scanner.nextInt(); 
		
		int num1 =inputNum1;
		
		for(int i =1; i <= inputNum1; i++) {
			for(int j =1; j <= i; j++) {
				System.out.print(String.format("%3d",up++));
				if(i==j) {
					System.out.println();// 줄바꾸
				}
			}
			
		 
			
		}	
	}
	}
