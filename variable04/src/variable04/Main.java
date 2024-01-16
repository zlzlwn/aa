package variable04;

import java.util.Scanner; //패키지 이

public class Main {

	public static void main(String[] args) {
																				
		// -------------------------------------------------//		
		//		
		//Desc : 사용자에게 정수를 입력받아 짝수 인지 홀수 인지 판별한다.
		//Date : 20223.11.23
		//Auther : ji.
		// -------------------------------------------------//		
		
		//내가 사용할 변수는 위에 정리(property)
		//      object
		Scanner scanner = new Scanner (System.in); // 2번 int num1 = 3;이랑 같은 유형 Scanner (System.in) 시스템에서 가져온다.
		int inputNumber = 0; // 사용자에게 입력받은 정 3
	    String result   = "" ; // 짝수인지 홀수 인지 판단결과
		
		
		
		// input
		System.out.print("정수를 입력하세요 : ");//1
		inputNumber = scanner.nextInt();
		scanner.close();
		
		// process
		result = (inputNumber % 2 == 0 ? "짝수" : "홀수");

		//output
		System.out.println("입력하신" + inputNumber + "는(은)"+ result + "입니다.");
		
		
	}

}
