package com.java.base;

import java.util.Scanner;

import com.java.function.Calc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int dan;
		int startNum;
		int endNum;
		
		System.out.println("구구단 몇단을출력할까요?(단, 시작수, 끝수)");
		dan = scanner.nextInt();
		startNum = scanner.nextInt();
		endNum = scanner.nextInt();

		
		Calc calc = new Calc(dan,startNum,endNum);
		calc.gugu();
	}

}
