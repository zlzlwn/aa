package com.java.base;

import java.util.Scanner;

import com.java.function.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		// 범위의 합계를 구하고 홀수 짝수 판별한다.
		
		Scanner scanner = new Scanner(System.in);	//Scanner가 패키지 안에 있어서 자동으로 패키지 뒤에 정렬
		SumEvenOdd evenodd = new SumEvenOdd();
		
		int startNum = 0;
		int endNum = 0;
		int sum = 0;
		
//		System.out.println("start >>>");
		
		System.out.println("범위의 숫자중 작은 숫자: ");
		startNum = scanner.nextInt();
//		System.out.println("num1>>>");
		
		System.out.println("범위의 숫자중 큰 숫자: ");
		endNum = scanner.nextInt();
//		System.out.println("num2>>>");
		
		sum = evenodd.sumCalc(startNum, endNum); //지워지고 이자리에sum이 들어온
		
		System.out.println(startNum+ "~"+ endNum+ "까지의 합: "+ sum);
		System.out.println(evenodd.evenOdd(sum));
	}

}
