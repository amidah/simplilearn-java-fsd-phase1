package com.simplilearn.exception.handling;

public class UncheckedExceptionHandling {

	public static void main(String[] args) {
		
		
		int a = 100;
		int b = 0;
		
		int add  = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = 0;
		try {
		div = a / b;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		System.out.println("add = " + add);
		System.out.println("sub = " + sub);
		System.out.println("mul = " + mul);
		System.out.println("div = " + div);
		
	}

}
