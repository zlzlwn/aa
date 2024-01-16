package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.CalAll;
import com.javalec.function.Calc;
import com.javalec.function.CalcEach;

//import java.javalec.
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		int firstNum =0;
		int secondNum =0;
		Calc calc = new	Calc();					//instance를 만든
//		calc1 만들고 테스트 하면 false로 나온다.
		CalAll all =new CalAll();
		CalcEach each = new CalcEach();
		
		
		
		System.out.println("1번 숫자를 입력하세요 : ");
		firstNum= scanner.nextInt();
		System.out.println("2번 숫자를 입력하세요 : ");
		secondNum= scanner.nextInt();
		
		System.out.println("덧셈결과 : ");
		// ------------
		
		each.cal2(firstNum, secondNum);
		each.calc(firstNum, secondNum);
	}

}
