package edu_chap2;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 23;
		byte b = (byte) a; // type casting이라 한다
		System.out.println(b); // 23

		byte c = 23;
		short d = 47;
		int e = 65;
		int f = c + d + e;
		System.out.println(f); // 135

		int g = 23;
		byte h = (byte) g;
		System.out.println(h); // 23

		byte i = 10;
		byte j = 20;
		byte k = (byte) (i + j);
		System.out.println(k); // 30
	}

}
