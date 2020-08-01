package com.code2live.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author vamsid
 * 
 *         Codechef Problem code: PALL01 URL:
 *         https://www.codechef.com/problems/PALL01
 *
 */

public class PALL01 {
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
			System.out.println(solve(r.nextInt()) ? "wins" : "loses");
		}

	}

	private static boolean solve(int num) {
		int n = num, rev = 0;

		while (n != 0) {
			rev = (rev * 10) + n % 10;
			n /= 10;
		}

		return num == rev;

	}
}
