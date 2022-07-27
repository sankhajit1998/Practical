package com.AdvanceJava;
/*
@author Sankhajit Roy
*/

// methods from String

import java.util.Scanner;

public class StrDemo {   // class

	public void show() {   // method
		Scanner s = new Scanner(System.in);   // Scanner object
		System.out.print("Enter String: ");   
		String A = s.next();   // 1st String
		String B = s.next();   // 2nd String
		
		
		System.out.println(A.length()+B.length());  // 1st String length + (concat) 2nd String
		
		System.out.println( (A.compareTo(B)>0) ? "Yes" : "No" );   // compare to ()
		
		System.out.println(A.substring(0,1).toUpperCase() +A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));   // substring
	}
	
	public static void main(String[] args) {   // main method
		StrDemo temp = new StrDemo();   // object
		temp.show();  // called the method
	}

}
