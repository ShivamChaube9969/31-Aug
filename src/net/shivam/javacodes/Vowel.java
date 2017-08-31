package net.shivam.javacodes;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char input = in.next().charAt(0);
		in.close();
		if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
			System.out.println("its a vowel");
		} else {
			System.out.println("its a consonent");
		}
	}
}
