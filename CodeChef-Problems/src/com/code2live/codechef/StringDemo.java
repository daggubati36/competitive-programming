package com.code2live.codechef;

public class StringDemo {
	public static void main(String[] args) {
		String readLine = "61 methods, 50 passed, 5 skipped, 6 failed";
		String[] s = readLine.split(",");
		String method = "", pass = "", skip = "", failed = "";
		
//		for (int i = 0; i < s.length; i++) {
//			//s[i].contains("methods")
//		}
		
		for (String str : s) {
			if (str.contains("methods"))
				method = str.substring(0, str.indexOf("methods") - 1).trim();
			if (str.contains("passed"))
				pass = str.substring(0, str.indexOf("passed") - 1).trim();
			if (str.contains("skipped"))
				skip = str.substring(0, str.indexOf("skipped") - 1).trim();
			if (str.contains("failed"))
				failed = str.substring(0, str.indexOf("failed") - 1).trim();
		}
		
		StringBuilder b = new StringBuilder();
		b.append("Total: ")
		.append(method)
		.append("\nPassed: ")
		.append(pass)
		.append("\nSkipped: ")
		.append(skip)
		.append("\nFailed: ")
		.append(failed);

		System.out.println(b.toString());
	}
}

// Total: xxx
// Passed: xxx
