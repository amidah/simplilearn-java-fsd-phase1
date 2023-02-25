package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegexPatternExample {

	public static void main(String[] args) {
		// java.util.regex package
	    // 1. MatchResult Interface
	    // 2. Matcher Class
	    // 3. Pattern Class
	    // 4. PatterSyntaxException Class
		
		// Example that accepts alphanumeric characters only
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{12}", "jamesbond007"));
		
		System.out.println(Pattern.matches("[amn]+", "aman"));
		
		System.out.println(Pattern.matches(".s", "is"));
		
		System.out.println(Pattern.matches("\\d", "1")); // d -> only single digits 
		
		System.out.println(Pattern.matches("\\D", "m")); // D -> only single alphabets
		
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7876543451"));
		
		System.out.println(Pattern.matches("^(.+)@(.+)$", "xyz@gmail.com"));

	}

}
