package com.javalec.function;

public class Sum {
	 int num1;
	   int num2;
	   int sum;
	   
	   public Sum() {
	      // TODO Auto-generated method stub

	   }

	   public Sum(String num1, String num2) {
	      super();
	      this.num1 = Integer.parseInt(num1);
	      this.num2 = Integer.parseInt(num2);
	   }
	   
	   public String sum() {
	      int fNum = num1;
	      int lNum = num2;
	      
	      if(num1 >= num2) {
	         fNum = num2;
	         lNum = num1;
	      }else {
	         fNum = num1;
	         lNum = num2;
	      }
	      for(int i=fNum; i<=lNum; i++) {
	         sum += i;
	      }
	      return Integer.toString(sum);
	   }
	   

}
