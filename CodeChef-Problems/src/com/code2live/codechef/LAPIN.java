package com.code2live.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LAPIN {
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

	public static void main(String[] args) {
		FastReader s = new FastReader(System.in);
		boolean r = false;
		String rs = "";

		int t = s.nextInt();
		while (t-- > 0) {
			r = isLapindrome(s.next());
			rs = r ? "YES" : "NO";
			System.out.println(rs);
		}

	}

	private static boolean isLapindrome(String s) {
		String s1, s2;
		int l = s.length();
		if ((l % 2) == 0) { // if length is even
			s1 = s.substring(0, l / 2);
			s2 = s.substring(l / 2);
			return sortAndCompare(s1, s2);
		} else {
			s1 = s.substring(0, (l / 2));
			s2 = s.substring((l / 2) + 1);
			return sortAndCompare(s1, s2);
		}
	}

	private static boolean sortAndCompare(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		boolean r = false;

		Arrays.sort(c1);
		Arrays.sort(c2);

		for (int i = 0; i < c1.length; i++)
			if (c1[i] != c2[i]) {
				r = false;
				break;
			} else
				r = true;

		return r;
	}
}
