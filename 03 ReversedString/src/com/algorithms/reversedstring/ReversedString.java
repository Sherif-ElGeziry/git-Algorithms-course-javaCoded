package com.algorithms.reversedstring;

public class ReversedString {
	String reverse;

	public String ReversedRecursiveString(String string) {
		if (string.length() == 0) {
			return "";
		}

		return ReversedRecursiveString(string.substring(1)) + string.charAt(0);
	}

	public String ReversedIterativeString(String string) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < string.length(); i++) {
			result.append(string.charAt(string.length() - 1 - i));
		}
		return result.toString();
	}
}
