package com.javalec.base;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 신장이 가장 크거나 작은사람 출력하기
		Scanner scanner = new Scanner(System.in);
		//class  변수			새로 만든다
		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		double[] height = new double [name.length];
		double total = 0;
		
		
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "의 신장을 입력하세요 : ");
			height[i] = scanner.nextDouble();
			//스케너 흘러가는ㄷ거를 받고 
		}
		double maxHeight = height[0];
		double minHeight = height[0];
		String maxHeightName = name[0];
		String minHeightName = name[0];
		for(int i = 0; i < name.length; i++) {
			total += height[i];
			if(height[i] > maxHeight) {
				maxHeight = height[i];
				maxHeightName = name[i];
			}
			if(height[i] < minHeight) {
				minHeight = height[i];
				minHeightName = name[i];
			}
		}
		
		System.out.println("평균 신장은 " + ((double)total / name.length) + "입니다.");
		System.out.println("가장 큰 학생은 " + maxHeightName + "이고 그 학생의 키는 " + maxHeight + "입니다.");
		System.out.println("가장 작은 학생은 " + minHeightName + "이고 그 학생의 키는 " + minHeight + "입니다.");
//		String[] name = {"James","Cathy","Kenny","Martin","Crystal"};
//		int height= 0;
//		int num= 0;
//		int tot=0;
//	
//		
//		/*
//		   James의 신장을 입력하세요 : ___
//		   Cathy의 신장을 입력하세요 : ___
//		   Kenny의 신장을 입력하세요 : ___
//		   Martin의 신장을 입력하세요 : ___
//		   Crystal의 신장을 입력하세요 : ___
//		   
//		   평군신장은 :___
//		   가장 큰 학생은 __ 이고 그 학생의 키는 ___
//		   가장 작은 학생은 __ 이고 그 학생의 키는 ___
//		 * 
//		 */
//		for(int i=0; i< name.length; i++) {
//			
//			System.out.println(name[i] + "의 신장을 입력하세요: ");
//			height = scanner.nextInt();	
//			tot += height;
//		}
//		System.out.println("평균 신장은 :"+tot/ name.length);
//		int max =0;
//		int min =0;
//
//		for()
//			
		
		
		
		

	}

}
