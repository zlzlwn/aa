package com.javalec.base;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String gradeResult = "";
		
		
		
		
		System.out.println("==학점관리==");		
		System.out.println("성적을 입력하세요 : ");
		
		
		score = scanner. nextInt()/10;
		
		if (score > 10 || score < 0 ) {
			System.out.println("점수를 다시 입력하세요.");
}else {
	

		
		if (score == 9) { gradeResult = "A";
		}else if (score == 8) {
		}else if (score == 7) {
		}else if (score == 6) {
		}else {
			System.out.println("B");
	
		}

System.out.println("귀하는" + gradeResult + "점 입니다.");



}
	}

}
