package week1.day2;

public class Calculator {
	public int add(int num1, int num2, int num3) {
		int addition = num1 + num2 + num3;
		System.out.println(addition);
		return addition;
	}
	public int sub(int num1, int num2) {
		int subtraction = num1 - num2;
		System.out.println(subtraction);
		return subtraction;
	}

	public double mul(double num1, double num2) {		
		double multiplication = num1*num2;
		System.out.println(multiplication);
		return multiplication;
	}
	
	public float div(float num1,float num2) {		
		float division = num1/num2;
		System.out.println(division);
		return division;		
	}	

	}