package com.AdvanceJava;
/*
@author Sankhajit Roy
*/

public class StringExample {   // class
	public void show() {    // method
		char arr[] = {'j','a','v','a'};    // elements declaration
		
		String s = new String(arr);     // String object
		System.out.println("Value is "+s);
		System.out.println(arr);
	}
	public void myFunction() {    //  method
		String n1 = "Sankha";    
		String n2 = "Sankha";
		String n3 = new String("Sankha");    // object
	}
	public static void main(String[] args) {   // method
		StringExample obj = new StringExample();    // object
		obj.show();   // called the method
		obj.myFunction();    // called the method
	}

}
