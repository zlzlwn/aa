package com.java.base;

import java.util.Scanner;

import com.java.function.Calc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int dan;
		
		System.out.println("구구단 몇단을출력할까요?");
		dan = scanner.nextInt();
		
//		int num1 = 0;
//		System.out.println(num1);
//		num1 = 1;
//		System.out.println(num1);
//		num1 = 2;
//		System.out.println(num1);
//		
		Calc calc = new Calc(dan);
		calc.gugu();
		
//		Calc calc = new Calc(dan);
		
	}

}
