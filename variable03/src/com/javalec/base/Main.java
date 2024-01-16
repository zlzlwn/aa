package com.javalec.base;

import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		//	사용자에게 입력받기 (정수)
		Scanner scanner = new Scanner (System.in);// scanner 객체,object, instant  입력 
		
		
		
		System.out.print("정수를 입력하세요 :");// 줄 안띄고 입력가능
		int inputnum = scanner.nextInt();// 스캐너까지 가다가 멈추고 입력하면 밑에줄 결과나옴
		System.out.println("입력된 숫자는" + inputnum + "입니다.");
		
//		사용자가 입력한 숫자가 짝수인지 홀수 인지 출하기
		
		
		System.out.print("정수를 입력하세요 :");
		System.out.println(inputnum % 2 == 0  ? "입력된 숫자는 짝수입니다" : "입력된 숫자는 홀수입니다");
		
}

}
