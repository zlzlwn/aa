package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 사용자가 입력하는 숫자 5개를받아서 합계
		
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];				//다섯개 변수저장
		int total = 0;
//		int max = 0;
//		int average = 0;
		
		for(int i=0; i<num. length; i++) {
			System.out.println((i+1)+ "번 숫자를 입력하세요 : ");		// 
			num[i] = scanner.nextInt();					//저장이 0부터 시작되서 -1
		}													// array index가 틀리면 에
		
//		for(int i=0; i<num.length; i++) {
			for(int i=0; i<num.length; i++) {
			total += num[i];
			int h = i+1;
			
//			if(num[i] > num[h]) {
//				System.out.println(i);
//			}
			
		}
		System.out.println("Total: "+ total);
		System.out.println("average: "+ ((double)total/num.length));
		System.out.println("Max: "+ total);
		System.out.println("Min: "+ total);
		
		
		
	}

}
