package com.simplilearn.functions;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		MethodOverloadingExample methodOverloadObj = new MethodOverloadingExample();
		System.out.println(methodOverloadObj.addition(30 , 20));
		System.out.println(methodOverloadObj.addition(30 , 20, 10));
		System.out.println(methodOverloadObj.multiplication(10 , 5));
		System.out.println(methodOverloadObj.multiplication(20.50 , 10.50));
	}
	
	
	// Overloaded Methods - when the number of parameters are different 
	// Overloaded Methods - when the data type of parameters are different
	// Not Overloaded Methods - when the return types are different
	
	// Example 1 - when the number of parameters are different
	
	public int addition(int a, int b) {
		System.out.println("Inside addition function with 2 parameters....");
		return a + b;
	} 
	
	public int addition(int a, int b, int c) {
		System.out.println("Inside addition function with 3 parameters....");
		return a + b + c;
	}
	

	
	// Example 2 - when the data type of parameters are different
	
	public int multiplication(int a, int b) {
		System.out.println("Inside multiplication function with 2 parameters of int type....");
		return a * b;
	} 
	
	public double multiplication(double a, double b) {
		System.out.println("Inside multiplication function with 2 parameters of double type....");	
		return a * b;
	}
	
	// Example 3 - Non Overloaded - when the return types are different 
	//but the names are same and the parameters are also same
	
//		public int subtraction(int a, int b) {
//			return a - b;
//		} 
//		
//		public double subtraction(int a, int b) {
//			return a - b;
//		}
		

}
