package com.java.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// -------------------------------------------------//		
				//		
				//Desc : 반복
				//Date : 2023.11.24
				//Auther : ji.
				// -------------------------------------------------//		
				
		// 반복문
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
		
//		for(int i=1; i<=10; i+=2) {   //start end stack ++더하기 +=n n 더하기 i = i+1 로도 가능
//		System.out.println(i);			// eg) 게시판 만들기 화면 아이콘 불러올때 
		
		
		
		
		
		//1부터 10까지 합계
//		int tot = 0;
//		for(int i=1; i<=10; i++) {   //누적변수 tot
//			tot+=i; // 같음 (tot = tot + i;)
//			
//			
//			}
//		System.out.println(tot);
		// 1부터 100까지의 홀수만 출력
//	int oddTot = 0;					//변수선
//	int	evenTot = 0;
//	
//	
//	for(int i=1; i<=100; i++) {   	// 범위 설정
//		
//		if(i%2==1) {				//홀수
//			oddTot += i;			//
//		} 
//	}
//	
//	
//		for(int j=1; j<=100; j++) {   	// 범위 설정
//			
//			if(j%2==0) {				//홀수
//				evenTot += j;			//
//			} 
//	}
//		System.out.println(oddTot+ "+"+ evenTot);
//		System.out.println("짝수의 합" +oddTot );
//		System.out.println("홀수의 합" +evenTot);
	
		// 변수 선(다시해보기)
		
//		Scanner scanner = new Scanner(System.in);
//		int num1 = 0;
//		int num2 = 0;
//		int tot = 0;
//
//		
//		
//		
//	System.out.print("덧셈 시작 수를 입력하세요: ");
//	num1= scanner.nextInt();
//	System.out.print("덧셈 끝수를 입력하세요: ");
//	num2= scanner.nextInt();
//	
//	if(num1 > num2 ) {
//		
//		for(int i=num2; i<=num1; i++) { 
//		   tot += i;		
//	
//	}
//	System.out.println(num1+ "~"+ num2+ "까지의 합은"+ tot +"입니다.");
//	
//	}
//	else  {
//	
//		for(int i=num1; i>=num2; i++) { 
//		   tot += i;		
//	
//	}
//	System.out.println(num1+ "~"+ num2+ "까지의 합은"+ tot +"입니다.");
//	}
//		
//		
//		
		
		
		
		Scanner scanner = new Scanner(System.in);
		int startNum = 0;
		int finNum = 0;
		
		int tot = 0;
		double avg = 0;
		int oddtot = 0;
		double oddavg = 0;
		int eventot = 0;
		double evenavg = 0;
		double count = 0;
		double oddcount = 0;
		double evencount = 0;
		int result = 0;
		
	System.out.print("덧셈 시작 수를 입력하세요: ");
	startNum= scanner.nextInt();
	System.out.print("덧셈 끝수를 입력하세요: ");
	finNum= scanner.nextInt();
	
		if(finNum > startNum) {
			for(int i=startNum; i<=finNum; i++) {
				    tot += i;		
				    count += 1;
				if (i%2==0) {
					oddtot += i;		
					oddcount += 1;
				}else {
					eventot += i;		
					evencount += 1;}
				}
			
		}else
		  {for(int i=finNum; i<=count; i++) {
			    tot += i;		
			    count += 1;
			if (i%2==0) {
				oddtot += i;		
				oddcount += 1;
			}else {
				eventot += i;		
				evencount += 1;
			}
			
		}
			
		}
		avg = tot/count;
		oddavg = oddtot/oddcount;
		evenavg= eventot/evencount;
		
		
		
		System.out.println(
				"숫자의 총합은"+ tot + "이며 평균은" + avg + "입니다."
				+"홀수의 총합은"+ oddtot + "이며 평균은" + oddavg + "입니다."
				+"짝수의 총합은"+ eventot + "이며 평균은" + evenavg + "입니다."
				
				
				);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
