package com.java.base;

public class Main_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =1; i<=9; i++) {
			System.out.println();
			
		for(int dan = 2; dan<=9; dan++ ) {		//nested for 문장(for 문 안에 for 문 들어가 있는거)
			
			if(dan%2 == 0 || i%2 == 0) {
				System.out.print(dan+"x"+i+"="+ (dan*i)+"\t");
			}else {
				System.out.print("\t");
			}	
		}
		}

	
	
	}

}
