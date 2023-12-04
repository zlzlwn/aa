package com.javalec.base;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//수의 범위를 입력받아 총합, 평균, 짝수의 총합과 평균, 홀수의 총합과 평균 구하기
		// 질문 출력 -> 
//		덧셈 시작 수를 입력하세요 :10
//		덧셈 끝 수를 입력하세요 :1
		
//		결과
//		1) 숫자의 총 합은 _이며 평균은__.
//		1) 홀수의 총 합은 _이며 평균은__.
//		1) 짝수의 총 합은 _이며 평균은__.
		//property, attribute, field
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, firstNum = 0;		//시작숫자
		int num2 = 0, secondNum= 0;		//끝숫자
		int tot = 0;					//총
		int totCount = 0;				//총합 횟수
		int oddTot = 0;					//홀수 총합
		int oddTotCount = 0;			//홀수 총합 횟수		
		int evenTot = 0;				//짝수 총합
		int evenTotCount = 0;			//짝수 총합 횟수
		
		
		
		// 입력받
		System.out.println("덧셈 시작 수를 입력하세요:");
		num1 = scanner.nextInt();
//		System.out.println(num1);
		
		System.out.println("덧셈 끝수를 입력하세요:");
		num2 = scanner.nextInt();
//		System.out.println(num2);
		
		
		//시작숫자와 끝숫자를 비교해서 시작과 끝을정렬하자!
		if(num1 > num2) {
			firstNum = num2;
			secondNum = num1;
		}else {
				firstNum = num1;
				secondNum = num2;
			}
		//System.out.println(firstNum + "/"+ secondNum);
		
		//숫자의 총합 구하기
		for(int i=firstNum; i<=secondNum; i++) {
			//System.out.println(i);
			tot += i;			//숫자의 총합 구하기
			totCount++;			//숫자의 횟수 구하기
			if(i%2 == 1) {		//홀수인 경우
				oddTot += i;
				oddTotCount++;
			}else {				//짝수인 경우
				evenTot += i;
				evenTotCount++;
				
			}
			
		}
		// 출력하기
		System.out.println("결과:");
		System.out.println("1)숫자의 총합은 " + tot + "이며 평균은" + ((double)tot/totCount));
		System.out.println("2)홀수의 총합은 " + tot + "이며 평균은" + ((double)oddTot/oddTotCount));
		System.out.println("3)짝수의 총합은 " + tot + "이며 평균은" + ((double)evenTot/evenTotCount));
		
		
	
	
	}
	
		

		
		
		
		
		
		
	}


