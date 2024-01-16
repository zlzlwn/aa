package com.javalec.function;

public class BmiCalc {

	double weight;
	double height;
	
	
	
	public BmiCalc() {
		// TODO Auto-generated constructor stub
	}



	public BmiCalc(double weight,double height) {
		super();
		this.weight = weight ;
		this.height = height ;
	}
	
	
	
	
	public double calcBmi() {
		height =height/100;
		double bmi =weight/(height*height);
		bmi = Math.round(bmi*10)/10.0;
		System.out.println(bmi);
		return bmi;
		
		
	}
	public String showResult(double bmi ) {
		String result="";
		if(bmi<18.5) {
			result ="저체중";
		}if(bmi<23) {
			result ="정상";
		}if(bmi<25) {
			result ="과체중";
		}if(bmi<30) {
			result ="비만";
		}else {
			result ="고도비만";
		}

		
		return result;
	}

	
	
}
