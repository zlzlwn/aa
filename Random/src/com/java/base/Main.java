package com.java.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random= new Random();
//		for(int loop =1; loop <= 10; loop++){
//			int i = random.nextInt(10);			
//		System.out.println(i);
//		}
	
		//Lotto 번호 생성기
		int [] num = new int [6];
		
		for(int i =0; i <= num.length; i++){
			num[i]= random.nextInt(45)+1;
			for(int j =0; j <= i; j++){
				num[i] = num[j];
				num[i]= num[j+1];
				
			}
//			
			System.out.println(num[i]);
		}
		
		
			
			
//		int a = random.nextInt(45);	
//		int b = random.nextInt(45);
//		int c = random.nextInt(45);
//		
//		
//		int j = random.nextInt(45);	
//		for(int i =1; i <= 45; i++){
//			
//			if(a==b) {
//				b=b+1;
//				
//			}
//		}
//		
//		System.out.println(a);
//		
		
		
		
	
		
		
	}

}
