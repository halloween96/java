package edu_chap3;

public class Test22 {
	public static void main(String[] args) {
		int a = 12;
		int b = 2;
		char op = '!';

		switch (op) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
		default:
			System.out.println("부적합 연산자");
		}
	}
}
