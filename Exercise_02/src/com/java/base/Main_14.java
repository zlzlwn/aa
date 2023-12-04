package com.java.base;

import java.util.Scanner;

public class Main_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] histo =new int[10];					// histo에10개를 넣겠다
		
		System.out.println("input score:");
		
		for(int i = 0; i < histo.length; i++) {
			System.out.println((i+1)+"의 score");	
			int kk =scanner.nextInt();				
			histo[kk/10]++;							//반복 필요없이 처음 받을때 변수 추가로 10단위씩 체
			
		}
		
		scanner.close();
		
		System.out.println("--------- Histogram ---------");
		
		for(int i = (histo.length-1); i >=0; i-- ) {
			System.out.print(String.format("%3d : ", i*10));
			for (int j=1;  j <= histo[i]; j++ ){
				System.out.print("#");
			}
		System.out.println();
		}
	}
	

}
