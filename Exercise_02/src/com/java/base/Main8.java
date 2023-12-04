package com.java.base;

import java.util.Iterator;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		
		
		
		// 변수선
		Scanner scanner = new Scanner(System.in);
		String[] subject = {"korean", "English", "Mathmatics"};
		int [] korean = new int[4];
		int [] English = new int[4];
		int [] Mathmatics =new int[4];
		//선
		for (int i=0; i<subject. length; i++) {
			System.out.println(subject[i]+ "의 성적을 입력: ");        
				if(i ==0) {										//국어 시험
					for(int k=0; k<=3; k++) {
						System.out.println("no" +(k+1) + "의 성적은 : ");
						korean[k] = scanner.nextInt();	
						}
				}else if (i ==1) {
					for(int k=0; k<=3; k++) {
						System.out.println("no" + k+1 + "의 성적은 : ");
						English[k] = scanner.nextInt();
						}
				}else if (i ==2) {
					for(int k=0; k<=3; k++) {
						System.out.println("no" + k+1 + "의 성적은 : ");
						Mathmatics[k] = scanner.nextInt();
						
					}
				}
			
				}
//		System.out.println(korean[3]);
		System.out.println("\t"+"korean"+ "\t"+"English"+ "\t"+"Mathmatics"+ "\t"+"Total"+ "\t"+"Average"+ "\t");
		
		for(int i=0; i<4; i++) {
			System.out.print("No"+ i+1 + "\t" + korean[i]+ "\t" + English[i] + "\t" + Mathmatics[i] + "\t" + (korean[i]+ English[i]+ Mathmatics[i]) 
							+"\t"+ ((korean[i]+ English[i]+ Mathmatics[i])/3));
			for(int j=0; j<4; j++)
				System.out.println("");
		}
		
		}
		
		
	}

