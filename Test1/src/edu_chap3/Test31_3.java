package edu_chap3;

public class Test31_3 {

	public static void main(String[] args) {
		int i = 1;
		do {
			int j = 1;
			do {
				if (j > 5)
					continue;
				System.out.print(i + "*" + j + "=" + i * j + " ");
				//j++;
			} while (++j < 10);
			System.out.println();
			i++;
		} while (i < 10);
	}
}
