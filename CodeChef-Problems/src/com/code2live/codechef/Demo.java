package com.code2live.codechef;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
	private int x;
	private int y;
}

public class Demo {
	int a = 10;

	public static void main(String[] args) {
		String x = "abc xyx hhgj \"abbv dsafda\"";
		StringBuilder sb = new StringBuilder();
		
		String[] s = x.split(" ");
		for (int i = 0; i < s.length; i++) {
			if (s[i].contains("\"")); {
				sb.append(s[i]);
			}
		}
	}

}