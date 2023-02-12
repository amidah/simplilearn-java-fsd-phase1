package com.simplilearn.exception.handling;

public class NullPointerExceptionHandling {
	
	public static void main(String[] args) {
	
		Person p1 = new Person("John", 29, "Male");
		
		Person p2 = new Person();
		
		System.out.println(p1.getName() + " ==== " + p1.getName().length());
		
		try {
		System.out.println(p2.getName() + " ==== " + p2.getName().length());
		}
		catch(NullPointerException npe) {
			System.out.println(npe);
		}
		
	}

}
