package com.javalec.base;

import java.util.Scanner;

public class switch_01p {
	public static void main(String[] args) {
		//변수선언
		 Scanner scanner = new Scanner(System.in);
			int score = 0;
			int num2 = 90;
			int num3 = 80;
			int num4 = 70;
			int num5 = 60;
			int num6 = 0;
			int num7 = 100;
			int scoreb = 0;
			
			String result = "" ;
			
			System.out.println("성적를 입력하세요 :");
			score= scoreb/10;
			scoreb= scanner.nextInt();
			
			
			
			// 성적계산
			if(scoreb > 100 || scoreb < 0) {
				System.out.println("다시 입력하세요.");}
			else {
			switch(score) {
			case 9:
				result = "A";
				break;
			case 8:
				result = "B";
				break;
			case 7:
				result = "c";
				break;
			case 6:
				result = "D";
				break;
			default:
				result = "F";
				break;
				
			}
			System.out.println("당신의 학점은" + result + "입니다.");
			
			}
			
			
	}
		
		
		
		
		
	}

