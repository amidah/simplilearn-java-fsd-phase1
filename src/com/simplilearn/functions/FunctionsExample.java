package com.simplilearn.functions;

public class FunctionsExample {

	public static void main(String[] args) {
	
		FunctionsExample functionsObject = new FunctionsExample();
		functionsObject.function1(); // calling non-parameterized void function, always gets the same result
		functionsObject.function1(50, 20); // calling overloaded parameterized function and will get the result based on the parameters passed
		long resultFunction2 = functionsObject.function2(); // calling non-parameterized long return type function, always gets the same result
		long resultOverloadedFunc2 = functionsObject.function2(100, 100); // calling overloaded parameterized long return type function and will get the result based on the parameters passed
		System.out.println("resultFunction2 ==> " + resultFunction2);
		System.out.println("resultOverloadedFunction2 ==> " + resultOverloadedFunc2);
	}
	
	// public non-parameterized function with void return type (meaning this function does not return anything)
	public void function1() {
		int val1 = 12;
		int val2 = 10;
		System.out.println("resultFunction1 ==> " + (val1 + val2));	
	}
	
	// public non-parameterized function with some return type (like long)
	public long function2() {
		long val1 = 10;
		long val2 = 20;
		return val1 + val2;
	} 
	
	// public parameterized function with void return type (meaning this function does not return anything)
	// this is an overloaded function1
	public void function1(int val1, int val2) {
			
			System.out.println("resultOverloadedFunction1 ==> " + (val1 + val2));	
		}
		
	// public parameterized function with some return type (like long)
	// this is an overloaded function2
	public long function2(long val1, long val2) {
			return val1 + val2;
		}
	
	
	
	
	
	

}
