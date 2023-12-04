package com.java.base;

import java.util.Scanner;

public class Mainex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	
	for(int dan = 1; dan <=9; dan++) {
	
//		System.out.println("구구단으로 사용할 숫자를 입력하세요!");
//		dan = scanner.nextInt();
		System.out.print("----"+ dan + "단----");
		for(int i=1; i<=9; i++) {
			System.out.print(dan+"x"+i+"="+ (dan*i));
			
		}
		
	}
		
	System.out.print("111111\n");	// \n 한줄 띄기 \t 한칸
	System.out.print("222222\t");	
	System.out.print("333333");	
	
		
		
	}

}
