package com.code2live.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TLG {
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

	static FastReader fr = new FastReader(System.in);

	public static void main(String[] args) throws Exception {

		int n = fr.nextInt();
		int s = 0, t = 0, max = 0, lead = 0, p = 0;
		int[] win = new int[2];

		while (n-- > 0) {
			int s1 = fr.nextInt(), t1 = fr.nextInt();
			s += s1;
			t += t1;
			if (s >= t) {
				lead = s - t;
				p = 1;
			} else {
				lead = t - s;
				p = 2;
			}
			if (lead >= max) {
				max = lead;
				win[0] = p;
				win[1] = max;
			}
		}
		System.out.println(win[0] + " " + win[1]);
	}
}
