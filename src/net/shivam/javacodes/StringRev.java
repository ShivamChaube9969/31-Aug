package net.shivam.javacodes;

import java.util.Scanner;

public class StringRev {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		in.close();
		int len = input.length();
		char[] abc = new char[len];
		int j = len - 1;
		for (int i = 0; i < len; i++) {
			abc[j] = input.charAt(i);
			j--;
		}
		for (char a : abc) {
			System.out.print(a);
		}
	}
}
