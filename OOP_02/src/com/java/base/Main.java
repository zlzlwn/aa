package com.java.base;

import java.util.Scanner;

import com.java.function.Even1;
import com.java.function.Sum1;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Sum1 sum = new Sum1();
		Even1 even =new Even1();
		
		
		int startNum = 0;
		int endNum = 0;
		int tot = 0;
		
		
		System.out.println("start >>>");
		
		System.out.println("범위의 숫자중 작은 숫자: ");
		startNum = scanner.nextInt();
		
		
		System.out.println("범위의 숫자중 큰 숫자: ");
		endNum = scanner.nextInt();
		
		tot= sum.sumCal(startNum, endNum); 
		System.out.println(startNum+ "~"+ endNum+ "까지의 합: "+ tot);
		System.out.println(even.evencal(tot));
	}

}
