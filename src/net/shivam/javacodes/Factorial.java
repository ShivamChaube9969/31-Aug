package net.shivam.javacodes;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		in.close();
		for(int i = input - 1; i >= 1; i--){
			input = input * i;
		}
		System.out.println(input);
	}
}
