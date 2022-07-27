package com.AdvanceJava;
/*
@author Sankhajit Roy
*/
// toString method
public class ToString {   // class
	int rollno;
	String name,address;
	
	public ToString(int rollno,String name,String address) {   // parameterized constructor
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public String toString() {   // method
		return super.toString();    // return the constructor values
	}
	
	public static void main(String[] args) {  // main method
		ToString s1 = new ToString(1, "Raj", "Kolkata");    // object1
		ToString s2 = new ToString(2, "Dip", "Siliguri");   // object 2
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
