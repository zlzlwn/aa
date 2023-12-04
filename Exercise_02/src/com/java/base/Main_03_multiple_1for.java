package com.java.base;

import java.util.Scanner;

public class Main_03_multiple_1for {
	public static void main(String[] args) {
		/*
		 * Description : multiple 1 for 
		 * Author  : j.park
		 * Date : 2023.12.03
		 * 
		 */
		
	Scanner scanner = new Scanner(System.in);
	int num1 = 0;
		
		System.out.println("Input your number : ");
		int inputNum = scanner.nextInt(); 
		
		for(int i =1; i <= 9; i++){
			System.out.println(inputNum + "x" + i + "=" + (inputNum*i)+ "\t"+ (inputNum+1) + "x" + i + "=" + ((inputNum+1)*i)+ "\t"+ (inputNum+2) + "x" + i + "=" + ((inputNum+2)*i)+ "\t"+ (inputNum+3) + "x" + i + "=" + ((inputNum+3)*i));
		}
		
		
		
		
		
}
}
