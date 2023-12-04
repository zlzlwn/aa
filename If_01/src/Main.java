import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;				

public class Main {

	public static void main(String[] args) {
		// 비교문, 조건문, Conditional Statement
	    Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String result = "" ;
	    //num1 = 10;
		//num2 = 20;
		
		// num1이 num2보다 큰지 작은지 같은지 판
		// 숫자 2개 받아오기
		System.out.println("첫번째 숫자를 입력하세요 :");
		num1= scanner.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요 :");
		num2= scanner.nextInt();
		
	   if(num1 > num2){
		   System.out.println(result = "보다 큽니다.");
	   }else if(num1 < num2) {
		   System.out.println(result = "보다 작습니다.");
	   }else {
		   System.out.println(result = "같습니다." );
		
	}
	   System.out.println(num1 + "이(가)" + num2 + result);
	  System.out.println(">>>>> End<<<<<");
	  
		
		
		
		

	}

}
