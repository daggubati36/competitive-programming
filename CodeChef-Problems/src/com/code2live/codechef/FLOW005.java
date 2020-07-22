/**
 * 
 */
package com.code2live.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author vamsid
 * 
 *         Codechef Problem code: FLOW005 URL:
 *         https://www.codechef.com/problems/FLOW005
 *
 */
public class FLOW005 {
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
			int n = r.nextInt();
			solve(n);
		}
	}

	private static void solve(int n) {
		int res = 0;
		int amt[] = { 100, 50, 10, 5, 2, 1 };
		int rs[] = new int[amt.length];

		for (int i = 0; i < amt.length; i++) {
			if (n >= amt[i]) {
				res += n / amt[i];
				n = n % amt[i];
			}
		}
		System.out.println(res);
	}

}
