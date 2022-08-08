package com.AdvanceJava;
/*
@Author Sankhajt
*/

import java.io.FileInputStream;

public class FileInputStreamDemo {   // main class
	public static void main(String[] args) {    // main method
		
		// try block
		try {
			// object of input stream file path
			FileInputStream obj = new FileInputStream("C:\\Intel\\test.txt");
			int x = obj.read();   // to read the file
			System.out.print(((char)x));
			
			// loop to read all the input char
			int i = 0;
			while ((i=obj.read()) != - 1) {
				System.out.print((char)i);
			}
			
			obj.close();    // close the object
		
			// catch block for exception handling
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
