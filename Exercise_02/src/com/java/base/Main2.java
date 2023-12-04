package com.java.base;

import java.util.Scanner;

public class Main2 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
	
		
		
		System.out.println("Input your dicimal no.:");
		num1 = scanner.nextInt();
		
		
		for(int i =1; i<=num1; i++) {
			num1 *= i;
			
		}
		System.out.println(  num1 + "`s factorial value = "+ num1);
			
	}

}
