package edu_chap3;

public class Test31_2 {
	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {
			int j = 1;
			while (j < 10) {
				System.out.print(i + "*" + j + "=" + (i * j) + " ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}