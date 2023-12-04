package com.java.base;

import java.util.Scanner;

public class Main_5_input_number_add {

	public static void main(String[] args) {
		/*
		 * Description : input number & add 
		 * Author  : j.park
		 * Date : 2023.12.03
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);				//스캐너선언
		int tot=0; 												//합계 변수 선언
		
		System.out.print("몇개의 숫자를 더할까요? : ");
		int inputNum = scanner.nextInt();						// 입력숫자받아오기
		System.out.println(inputNum + "의 숫자를 입력하세요");		//숫자 입력 프린트
		
		for(int i =1; i <= inputNum; i++) {
			int inputNumi = scanner.nextInt();					//더하는 숫자 받아오기
			tot = inputNumi+tot;								//받아온 숫자 더하기	
		}
		System.out.println("입력한 숫자의 합은 "+tot+" 입니다.");		//더한 숫자 출력
	}

}
