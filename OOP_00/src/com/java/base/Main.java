package com.java.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Main 이 출력하고 나머지 게산은class설정
		
		
		int sum =0;
		Scanner scanner = new Scanner(System.in);	//Scanner가 패키지 안에 있어서 자동으로 패키지 뒤에 정렬
		int startNum = 0;
		int endNum = 0;
		
		
		System.out.println("범위의 숫자중 작은 숫자: ");
		startNum = scanner.nextInt();
		
		System.out.println("범위의 숫자중 큰 숫자: ");
		endNum = scanner.nextInt();
		
		for(int i =startNum; i <= endNum; i++){
			sum+= i;
			
		}
		System.out.println(startNum+ "~"+ endNum+ "까지의 합: "+ sum);
		
		if(sum%2 == 0 ) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
			
		}
	}

}
