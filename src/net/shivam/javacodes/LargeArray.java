package net.shivam.javacodes;

import java.util.Arrays;

public class LargeArray {
	public static void main(String[] args) {
		int[] a, b;
		b = new int[] { 1, 2, 3, 4, 5, 6};
		a = new int[] { 1, 2, 3, 4, 5};
		if (a.length > b.length) {
			System.out.println(Arrays.toString(a));
		} else {
			System.out.println(Arrays.toString(b));
		}
	}
}
