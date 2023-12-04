package com.java.base;

import java.util.Iterator;

public class Main3x_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//삼항 연산자 사용해서 FOR 문 하나로 해서 만들어보기
//	for(int i =1; i<=9; i++) {	//
//		System.out.println();
//		for(int dan =2; dan<=9; dan++) {
//			System.out.print(dan+"x"+(i%2 == 0 ? i : "*")+"="+ (dan*i)+"\t");	
//			
//			if(i%2 == 0) {
//			System.out.print(dan+"x"+i+"="+ (dan*i)+"\t");	
//			}else  {
//			System.out.print(dan+"x"+"*"+"="+ (dan*i)+"\t");
//			}
//		
//			
//		}
//	}
//		
		
	//FOR 문 하나로 해서 만들어보기 
		int multiple = 1;
		
		for(int dan =2; dan<=9 && multiple <= 9; dan++) {
			System.out.print(dan + "x" + multiple + "=" + (dan*multiple)+"\t"); //점기산에 단 9면 로 돌아가기
			
			if(dan == 9) {
				multiple ++;
				dan = 1;
				System.out.println();
			}
			
//			multiple ++;
			
//			System.out.print(2 + "x" + i + "=" + (2*i)+"\t");
//			System.out.print(3 + "x" + i + "=" + (3*i)+"\t");
//			System.out.print(4 + "x" + i + "=" + (4*i)+"\t");
//			System.out.print(5 + "x" + i + "=" + (5*i)+"\t");
//			System.out.print(6 + "x" + i + "=" + (6*i)+"\t");
//			System.out.print(7 + "x" + i + "=" + (7*i)+"\t");
//			System.out.print(8 + "x" + i + "=" + (8*i)+"\t");
//			System.out.print(9 + "x" + i + "=" + (9*i)+"\t");
//			System.out.println("");
			
			
			
		
			
		}
		
		
		
		
		
		
		
		
		
	}

}
