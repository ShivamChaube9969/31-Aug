package net.shivam.javacodes;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] a, b;
		b = new int[5];
		a = new int[] { 1, 2, 3, 4, 50};
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
