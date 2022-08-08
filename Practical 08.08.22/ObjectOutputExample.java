package com.AdvanceJava;
/*
@Author Sankhajit Roy
*/
/*Parent class : Student.java*/

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {   // main class
	public static void main(String[] args) {   // main method
		// try block
		try {
			// object of Student.java parent class
			Student s = new Student(65,"Sankhajit",2000);   
			
			// create a FileOutputStream with file path
			FileOutputStream obj = new FileOutputStream("C:\\Autodesk\\sample2.txt");
			
			// create a object of ObjectOutputStream to write the data type
			ObjectOutputStream obj2 = new ObjectOutputStream(obj);
			
			obj2.writeObject(s);   // object to specify ObjectOutputStream class
			obj2.close();  // close the object
			System.out.println("Done.");
		} 
		// catch block with exception
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
