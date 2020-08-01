package com.code2live.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRB01 {
	static class FastReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public FastReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
	}

	static FastReader r = new FastReader(System.in);

	public static void main(String[] args) throws Exception {

		int t = r.nextInt();

		while (t-- > 0) {
			System.out.println(solve(r.nextInt()) ? "yes" : "no");
		}

	}

	private static boolean solve(int n) {

		for (int i = 2; i < n/2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
