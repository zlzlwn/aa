package com.javalec.base;

import com.javalec.function.Child1;
import com.javalec.function.Child2;
import com.javalec.function.Child3;
import com.javalec.model.LunchMenu;
import com.javalec.model.PriceTable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LunchMenu child1 = new Child1(PriceTable.RICE,PriceTable.BULGOGI,PriceTable.BANANA,PriceTable.ALMOND,PriceTable.MILK);			//price table 때문ㅔ
		LunchMenu child2 = new Child2(PriceTable.RICE,PriceTable.BULGOGI,PriceTable.BANANA,PriceTable.ALMOND,PriceTable.MILK);			//price table 때문ㅔ
		LunchMenu child3 = new Child3(PriceTable.RICE,PriceTable.BULGOGI,PriceTable.BANANA,PriceTable.ALMOND,PriceTable.MILK);			//price table 때문ㅔ
		
		System.out.println("child1의 식대 : "+child1.calc());
		System.out.println("child2의 식대 : "+child2.calc());
		System.out.println("child3의 식대 : "+child3.calc());
		
		
		
	}

}
