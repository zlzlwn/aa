package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] str = {"a","b"};
//		int[] intNum = {1,2};
//		double [] doubleNum = {1.2, 2.3};
//		boolean[] boolNum = {true, false};
		// 편균 구하기
//		int [] intNum = {1, 5, 8, 12, 200, 1002};
//		int tot = 0;
//		int count = 0;
//		
//		//1 토탈 구하기
//		// num1~6까지더한다고 생각 -> for 문을 이용하자!
//		
//		for(int i=0; i<intNum.length; i++) {
//				tot += intNum[i];
////				count ++;
//												//count 써보
//			}
//		
//		//2. total /갯수
//		System.out.println((double)tot/intNum.length);
////		System.out.println(tot/(double)count);
		//배열 구구단
		Scanner scanner = new Scanner(System.in);
		int [] danNum = {5,3,9,5};
		
//		int dan = 0;
//		int multiple = 0;
		
		// 단 배
		for(int i=0; i<danNum.length; i++) {
			for(int j =1; j<=9; j++) {	
				System.out.print( danNum[i]+ "x"+ j + "=" + (danNum[i]*j)+"\t");
			}
		}
		
	}

}
