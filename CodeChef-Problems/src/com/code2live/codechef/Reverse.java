package com.code2live.codechef;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		System.out.println("Input: ");
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		System.out.println("\n\nT: " + t);
		while (s.hasNext())
			reverse(s.nextInt());
	}

	static void reverse(int n) {
		System.out.println("n: " + n);
		int reversed = 0;

		while (n != 0) {
			reversed = (reversed * 10) + n % 10;
			n /= 10;
		}

		System.out.println(reversed + "\n");
	}
}
