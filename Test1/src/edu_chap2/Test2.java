package edu_chap2;

public class Test2 {

	public static void main(String[] args) {
		float a = 3.14f; //실수는 double로 해석 default
		byte num1 = 1;
		short num2 = 20;
		long num3 = 300;
		long depositAmount = 2147483648l;
		
		boolean isMarried = true;
		char gender = 'F';
		gender = 'M';
		String greet = "Good Morning";
		System.out.println(depositAmount + "\n" + isMarried  + "\t" + gender + "\r" + greet);
	}

}