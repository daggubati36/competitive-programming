package com.code2live.codechef;

import java.util.Scanner;

public class HS08TEST {
	public static void main(String[] args) throws Exception {
		System.out.println("Input: ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		double y = s.nextDouble();
		s.close();

		solve(x, y);
	}

	static void solve(int x, double y) {
		double c = 0.50;
		double bal = y - (x + c);
		if (x % 5 == 0 && bal > 0)
			System.out.format("%.2f", bal);
		else
			System.out.format("%.2f", y);
	}
}
