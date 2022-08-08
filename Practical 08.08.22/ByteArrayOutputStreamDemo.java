package com.AdvanceJava;
/*
@Author Sankhajit Roy
*/

import java.io.ByteArrayOutputStream;  
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {   // main class
	public static void main(String[] args) throws IOException {   // main method throws IO 
		// Create FileOutputStream objects with file path
		FileOutputStream obj1 = new FileOutputStream("C:\\Intel\\sample 1.txt");
		FileOutputStream obj2 = new FileOutputStream("C:\\Intel\\sample 2.txt");
		
		// create ByteArrayOutputStream object
		ByteArrayOutputStream temp = new ByteArrayOutputStream();
		temp.write(65);   // declare the byte code input
		temp.writeTo(obj1);   // object to convert byte code
		temp.writeTo(obj2);   // object to convert byte code
		temp.close();   // close the object
		System.out.println("Done.");
	}
}
