package com.code2live.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FSQRT {
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

		int t = fr.nextInt();
		
		while(t-- > 0) {
			int n = fr.nextInt();
			System.out.println(Math.round(Math.sqrt(n)));
		}
	}

}
