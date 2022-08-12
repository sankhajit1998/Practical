package com.collectionframework;
/*
@Author Sankhajit Roy
*/
interface FunctionalInterfaceDemo {   // interface
	int add(int a, int b);   // variables
}
class LambdaFunction{   // main class
	public static void main(String[] args) {   // main method
		// sum of two value using lambda expression 
		FunctionalInterfaceDemo d = (a,b) -> (a+b);
		System.out.println(d.add(40,50));
	}
}