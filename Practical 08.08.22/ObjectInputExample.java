package com.AdvanceJava;
/*
@Author Sankhajit Roy
*/
/*Parent class : Student.java*/

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputExample {   // main class
	public static void main(String[] args) {   // main method
		// try block
		try {
			// create a object of ObjectInputStream to read the data type 
			ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("C:\\Autodesk\\sample2.txt"));
			
			// object of Student.java parent class
			Student s = (Student)obj2.readObject();
			
			System.out.println("Id is: "+ s.id +", Name is: " + s.name + ", Fees is: "+ s.fees);
			obj2.close();  // close the object
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
