package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Input;
import com.javalec.function.Output;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ID를 입력하세요 :");
		String strId= scanner.next();
		
		System.out.println("PW를 입력하세요 :");
		String strPW= scanner.next();
		
		Input.id= strId;
		Input.pw= strPW;
		
		
		System.out.println("귀하의 ID :"+Output.checkId());
		System.out.println("귀하의 ID :"+Output.checkpw());
	}
}
