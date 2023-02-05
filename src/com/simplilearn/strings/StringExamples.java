package com.simplilearn.strings;

public class StringExamples {

	public static void main(String[] args) {
		
		String s = "John";
		
		System.out.println("s ===> " + s);
		
		String s1 = new String("John");
		
		System.out.println("s1 ===> " + s1);
		
		System.out.println("Comparision using double equlas:: " + (s == s1)); // false
		
		System.out.println("Comparision using .equlas function:: " + (s.equals(s1))); // true
		
		String a = "Harry";
		a = a.concat("Potter");
		
		System.out.println("a ===> " + a);
		
		String b = "Potter";
		
		String c = "Potter";
		
		System.out.println("Comparision using double equlas:: " + (b == c)); 
		
		System.out.println("Comparision using .equlas function:: " + (b.equals(c)));  
		

	}

}
