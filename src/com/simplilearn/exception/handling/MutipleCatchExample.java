package com.simplilearn.exception.handling;

public class MutipleCatchExample {

	public static void main(String[] args) {
		
		try {
		String a[] = new String[5];
		//a[5] = 20 / 0;
		System.out.println(a[4].length());
		}
		
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
//		catch(Exception e) {
//			System.out.println(e);
//			System.out.println("Parent Exception");
//		}
		finally {
			System.out.println("Inside finally");
		}
		
		System.out.println("Rest of the code...");
		
	}
}
