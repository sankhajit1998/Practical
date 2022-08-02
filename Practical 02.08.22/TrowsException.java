package com.AdvanceJava;
/*
@author Sankhajit Roy
*/

//whether the student is pass or not
public class TrowsException {   // class
	public static void Eligible(int marks) throws ArithmeticException  {   // method
		// throw arithmetic exception to check pass or not
		if (marks >=0 && marks<35) {   // condition
			throw new ArithmeticException("Student is fail");
		}
		else {
			System.out.println("Student is fail");
		}
	}
	public static void main(String[] args) {   // main method
		Eligible(15);    // predefined value
		System.out.println("rest of the code.");
	}
}
