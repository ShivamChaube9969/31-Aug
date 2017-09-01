package net.shivam.javacodes;

public class Fibonacci {
	public static void main(String[] args) {
		long a = 0, b = 1;
		while ((a + b) < 200) {
			System.out.print((a + b) + " ");
			a = a + b;
			b = a - b;
			a = a - b;
			b = a + b;
		}
	}
}
