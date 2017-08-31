package net.shivam.javacodes;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		in.close();
		int count = 0;
		int i = 0;
		for (int j = input.length() - 1; j >= input.length() / 2; j--) {
			if (input.charAt(i) != input.charAt(j)) {
				count++;
			}
			i++;
		}

		if (count == 0) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
