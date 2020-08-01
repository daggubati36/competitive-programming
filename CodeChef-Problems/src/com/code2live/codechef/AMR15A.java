package com.code2live.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author vamsid
 * 
 *         Codechef Problem code: AMR15A URL:
 *         https://www.codechef.com/problems/AMR15A
 *
 */

public class AMR15A {
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

		int n = r.nextInt();
		int evenCnt = 0, oddCnt = 0;

		while (n-- > 0) {
			int a = r.nextInt();
			
			if (a % 2 == 0)
				++evenCnt;
			else
				++oddCnt;
		}
		
		if (evenCnt > oddCnt)
			System.out.println("READY FOR BATTLE");
		else
			System.out.println("NOT READY");
	}
}
