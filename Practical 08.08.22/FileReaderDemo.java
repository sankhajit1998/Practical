package com.AdvanceJava;
/*
@Author Sankhajit Roy
*/

import java.io.FileReader;

public class FileReaderDemo {   // main class
	public static void main(String[] args) {   // main method
		// try block
		try {
			// create a FileReader object with file path
			FileReader fr = new FileReader("C:\\Autodesk\\sample.txt");
			int i;
			while((i = fr.read())!=-1) {   // using loop to check all characters
				System.out.print((char)i);
		}
		fr.close();   // close the object
		} 
		// catch block with an exception
		catch(Exception e) {
			System.out.println(e);
		}
	  }
}
