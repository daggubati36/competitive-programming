package com.code2live.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FLOW004 {
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

	public static void main(String[] args) throws Exception {
		FastReader fr = new FastReader(System.in);

		int t = fr.nextInt();

		while (t-- > 0)
			System.out.println(solve(fr.nextInt()));
	}

	private static int solve(int n) {
		int l = n % 10;
		int r = 0;

		while (n > 0) {
			if (n < 10)
				break;
			else
				n /= 10;
		}
		return l+n;
	}
}
