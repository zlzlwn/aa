package com.java.base;


import com.java.function.Car;

public class Main {

	public static void main(String[] args) {
		
		Car car1 =new Car();
		System.out.println("car1.company ="+ car1.company);//ㅔ소드로 쓰면 괄호필요해서 필드인줄알았
		//현대자동차
		Car car2 =new Car("자가용");
		System.out.println("car2.company ="+ car2.company);
		//현대자동차
		System.out.println("car1.model ="+ car2.model);
		//자가용
		
		
		
		
		
}
}