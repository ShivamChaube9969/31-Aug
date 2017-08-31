package net.shivam.javacodes;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		in.close();
		int count = 0;
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
