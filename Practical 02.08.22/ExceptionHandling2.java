package com.AdvanceJava;
/*
@author Sankhajit Roy
*/

// example of multiple catch block
public class ExceptionHandling2 {   // class
	public void show() {   // method
		String a = "i am error!";
		System.out.println(a);
		try {
			int i = 50/0;           // Arithmetic exception
			System.out.println(i);
			
			int arr[] = new int[3];  // Array index out of bound exception
			arr[4] = 24;
		}
		// multiple catch block
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {   // main method
		ExceptionHandling2 temp = new ExceptionHandling2();
		temp.show();   // called method
	}
}
