package com.javalec.base;

import java.util.Scanner;

public class Main2EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, firstNum = 0;
		int num2 = 0, secondNum = 0;
		int multi = 0;
		int multiNum = 0;
		int multiCount = 0;
		int minNum = 0;
		int maxNum = 0;
		
		
		
		
		
		System.out.println("시작하는 숫자를 정하세요 : ");
		num1 = scanner.nextInt();
		System.out.println("범위의 끝 숫자를 정하세요 :");
		num2 = scanner.nextInt();
		System.out.println("원하는 배수는 ?");
		multi = scanner.nextInt();
	
		//System.out.println(num1 +"/"+ num2  + "/" + multi2);
		// 처음 시작수, 마지막수 크기 다를때 설
		if(num1>num2) {
			firstNum = num2;	//설정하려는 수 앞에!
			secondNum = num1;
		}else {
			firstNum = num1;
			secondNum = num2;
			
		}
		
		//5의 배수 계산
		if(multi > secondNum) {
			System.out.println("다시 입력하세요.");
		}else {
		
		//System.out.println(firstNum + "/"+ secondNum);   
		for(int i=firstNum; i<=secondNum; i++) {
	
			if(i%multi == 0) {		//나머지로 배수 거르기
				multiCount++;		// 배수 갯수
				multiNum += i;		// 
		//System.out.println(multiNum+"-"+ i);
		//System.out.println(multiCount);
				
			if(i<= firstNum + multi) {
				minNum = i;
			}if(i>= secondNum - multi) {
				maxNum = i;
			}
		 }
		}
		}
		// 출
		System.out.println(num1 + "부터 "+ num2+ "의 범위중" +multi + "의 배수의 숫자의 갯수는 " + multiCount + "개이고 합은" + multiNum + " 입니다.");
		System.out.println(multi + "배수의 평균은"+ ((double)multiNum / multiCount) + "이고,");
		System.out.println("5의배수의 숫자중 최대 숫자는"+ maxNum +  "이고 최소숫자"+ minNum);
	
	
	
	
	}
}
