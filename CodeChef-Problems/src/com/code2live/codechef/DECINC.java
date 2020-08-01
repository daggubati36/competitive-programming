package com.code2live.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DECINC {
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
		
		HashMap<String, String> ship = new HashMap<String, String>();
		ship.put("b", "Battleship");
		ship.put("c", "Cruiser");
		ship.put("d", "Destroyer");
		ship.put("f", "Frigate");

		int t = r.nextInt();

		while (t-- > 0) {
			String id = r.next();
			
			System.out.println(ship.get(id.toLowerCase()));
		}

	}
}
