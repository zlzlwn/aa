package com.java.base;

import java.util.Scanner;

public class Main_144 {

	public static void main(String[] args) {
		/*
		 * Description : bank 
		 * Author  : j.park
		 * Date : 2023.12.04
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		int[] cosnum;				//고객 번호
		int[] cosaccount;				//고객 번호
		
		
		
		while (true) {
			
			System.out.println("1.입금"+ "\n"+ "2.출금"+ "\n"+ "3.현황"+ "\n"+ "4.종료");
			
			System.out.print("번호를 선택하세요!");
			int inputNum = scanner.nextInt();
			for(int i =0; i <= 4; i++){
			if(inputNum == 1) {
				System.out.println("고객번호 : ");
				int  personNum = scanner.nextInt();
				cosnum = new int [(personNum)];
				System.out.println("금액 : ");
				int  account = scanner.nextInt();
				cosaccount = new int [(account)];
				System.out.println("입금 결과 : "+ "고객번호 : "+ (personNum+1)+"\t"+ "잔액 : "+ account);
				System.out.println(cosaccount[i]);
			}
			}
			
			if(inputNum == 2) {
				
			}
			
			if(inputNum == 4) {
				break;
				
			}
		}
		System.out.println(">>>> Thank you <<<<");
	}

}
