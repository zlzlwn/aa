package com.java.base;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] datename = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		Calendar calender = Calendar.getInstance();	//현재를 가져려고 new 사용x
		
		int year = calender.get(calender.YEAR);
		int month = calender.get(calender.MONTH)+1;
		int day = calender.get(calender.DAY_OF_MONTH);
		int date = calender.get(calender.DAY_OF_WEEK)-1;
		
		int hour = calender.get(calender.HOUR);
		int minute = calender.get(calender.MINUTE);
		int second = calender.get(calender.SECOND);
		
		
		
		System.out.println(year + "-"+ month+ "-"+String.format("%02d", day) 
							+"("+ datename[date-1]+ ")");
		System.out.println(String.format("%02d", hour));
	}

}//dateName[date-1]
