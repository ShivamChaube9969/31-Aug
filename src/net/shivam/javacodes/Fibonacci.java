package net.shivam.javacodes;

public class Fibonacci {
	public static void main(String[] args) {
		long a = 0, b = 1;
		for (int i = 1; i <= 30; i++) {
			if ((a + b) > 200) {
				break;
			}
			System.out.print((a + b) + " ");
			a = a + b;
			b = a - b;
			a = a - b;
			b = a + b;
		}
	}
}
