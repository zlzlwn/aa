package com.javelec.base;

public class Main {

	public static void main(String[] args) {
		// 1에서 100까지의 수중 10인경우를 찾기
//		for(int i=1; i<=100; i++) {
//			if(i ==10) {
//				System.out.println("Find 10");
//				break;							// 찾아서10에서 빠져나감
//			}
//			System.out.println(i);
//		}
		
		// 1~10 중 5빼고 뎨속 이어서 출력하기(continue)
		for(int i=1; i<=10; i++) {
			if(i == 5) {
				continue;						// 5까지가도 계속해서 진행(빈 데이터 없이감)
			}
				System.out.println(i);			//
			
		}
		
		
		
		
		
		
		
	}

}
