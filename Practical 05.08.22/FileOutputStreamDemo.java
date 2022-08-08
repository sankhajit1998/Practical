package com.AdvanceJava;
/*
@Author Sankhajit Roy
*/

import java.io.FileOutputStream;

public class FileOutputStreamDemo {   // class
	public static void main(String[] args) {    // main method
		
		// try block
		try {
			// set the object to this file path
			FileOutputStream obj = new FileOutputStream("C:\\Intel\\test.txt"); 
			obj.write(97);    // write the object over the file
			String s = "Any line";
			byte b [] = s.getBytes();   // store the value of string 
			
			obj.write(b);   // write the string value
			obj.close();    // close object
			
			System.out.println("Done!");
		// catch block	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
