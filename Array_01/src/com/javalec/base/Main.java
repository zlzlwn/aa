package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// array
		String[] weekDay = new String[7];
		weekDay[0] = "일요일";
		weekDay[1] = "월요일";
		weekDay[2] = "화요일";
		weekDay[3] = "수요일";
		weekDay[4] = "목요일";
		weekDay[5] = "금요일";
		weekDay[6] = "토요일";
//		System.out.println(weekDay.length);
//		for (int i=0; i<weekDay.length; i+= 2) {			// .length: 문자 출력
//			 
//				System.out.println(weekDay[i]);			// 
//			
//		}
		for (int i=0; i<weekDay.length; i+= 2) {
			
			
			while (true) {
				i++;
				if(i>6) {					//7로 넣으면 어케
					break;
					
				}
				System.out.println(weekDay[i]);
			}
		}
	}

}
