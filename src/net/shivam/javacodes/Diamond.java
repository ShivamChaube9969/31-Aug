package net.shivam.javacodes;

import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		System.out.println("1 : ");
		System.out.println("2 : ");
		System.out.println("3 : ");
		System.out.println("Enter the Diamond No. :");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		in.close();
		Diamond obj1 = new Diamond();
		switch (input) {
		case 1:
			obj1.diamond1();
			break;
		case 2:
			obj1.diamond2();
			break;
		case 3:
			obj1.diamond3();
			break;
		default:

		}
	}

	void diamond1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	void diamond2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	void diamond3() {
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j >= 1; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					if (i == 2) {
						System.out.print("*");
					} else {
						System.out.print("x");
					}

				}
			}
			for (int k = 2; k <= i; k++) {
				if (i == 2) {
					System.out.print("*");
				} else {
					System.out.print("x");
				}
			}
			System.out.println();
		}
		for (int i = 3; i > 0; i--) {
			for (int j = 4; j >= 1; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					if (i == 2) {
						System.out.print("*");
					} else {
						System.out.print("x");
					}

				}
			}
			for (int k = 2; k <= i; k++) {
				if (i == 2) {
					System.out.print("*");
				} else {
					System.out.print("x");
				}
			}
			System.out.println();
		}
	}
}
