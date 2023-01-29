package com.simplilearn.functions;

public class ClassB extends ClassA {

	
	public static void main(String[] args) {
		ClassA classAObj = new ClassB();
		classAObj.output1();
		classAObj.output2();
	}
	public void output1() {
		System.out.println("ClassB ========== Output 1");
	}
	public static void output2() {
		System.out.println("ClassB ========== Output 2");
	}
}
