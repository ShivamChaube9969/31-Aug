package net.shivam.javacodes;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("+ : 1");
		System.out.println("- : 2");
		System.out.println("* : 3");
		System.out.println("/ : 4");
		System.out.print("Enter the type of operation :");
		int input = in.nextInt();
		
		
		switch (input) {
		case 1:
			System.out.print("\nEnter the two variables: ");
			int a, b;
			a = in.nextInt();
			b = in.nextInt();
			System.out.println("Addition is : " + (a + b));
			break;
		case 2:
			System.out.print("\nEnter the two variables: ");
			a = in.nextInt();
			b = in.nextInt();
			System.out.println("Subtraction is : " + (a - b));
			break;
		case 3:
			System.out.print("\nEnter the two variables: ");
			a = in.nextInt();
			b = in.nextInt();
			System.out.println("Multiplication is : " + (a * b));
			break;
		case 4:
			System.out.print("\nEnter the two variables: ");
			a = in.nextInt();
			b = in.nextInt();
			System.out.println("Division is : " + a / b);
			break;
		default:
			System.out.println("Invalid input");
		}
		in.close();
	}
}
