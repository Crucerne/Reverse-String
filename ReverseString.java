package com.crucerne.www.reversestring;

/*
 * Using StringBuilder to reverse a string.
 */

public class ReverseString {

	// Using StringBuilder to append each character starting at the end of the given string to reverse it.
	public static String reverseString(String string)
	{
		final StringBuilder builder = new StringBuilder(string.length());
		for (int i = string.length() - 1; i >= 0; i--)
		{
			builder.append(string.charAt(i));
		}
		
		return builder.toString();
	}
	
	// Uses StringBuilder's reverse method to reverse a string and returns it.
	public static String reverseStringEasy(String string)
	{
		final StringBuilder builder = new StringBuilder(string);
		return builder.reverse().toString();
	}
	
}
