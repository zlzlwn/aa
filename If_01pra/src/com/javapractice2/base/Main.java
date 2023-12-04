package com.javapractice2.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
			int num1 = 0;
			int num2 = 90;
			int num3 = 80;
			int num4 = 70;
			int num5 = 60;
			int num6 = 0;
			int num7 = 100;
			
			
			String result = "" ;
		    //num1 = 10;
			//num2 = 20;
			
			// num1이 num2보다 큰지 작은지 같은지 판
			// 숫자 2개 받아오기
			
			System.out.println("성적를 입력하세요 :");
			num1= scanner.nextInt();
		   if(num1 > num7||num1 < num6){
				   System.out.println("다시 입력하세요.");
		   if(num1 > num7){
				   System.out.println("다시 입력하세요.");
		   }else if(num1 >= num2){
			   System.out.println(result = "A");
		   }else if(num1 >= num3) {
			   System.out.println(result = "B");
		   }else if(num1 >= num4) {
			   System.out.println(result = "C");
		   }else if(num1 >= num5) {
			   System.out.println(result = "D");
		   }else if(num1 >= num6) {
			   System.out.println(result = "F");
		   }else {
			   System.out.println("다시 입력하세요." );
			
		}
		  
		  System.out.println("당신의 학점은" + result + "입니다.");
			
		  System.out.println(">>>>> End<<<<<");
			
	}

}
