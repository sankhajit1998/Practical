package com.AdvanceJava;
/*
@Author Sankhajit Roy
*/

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {   // main class
	public static void main(String[] args) {   // main method
		// try block
		try {
			// create FileWriter object with file path
			FileWriter fw = new FileWriter("C:\\Autodesk\\sample.txt");
			fw.write("Welcome to Anudip Foundation.");
			// create FileReader object with file path
			FileReader fr = new FileReader("C:\\Autodesk\\sample.txt");
			
		int i;
		while((i = fr.read())!=-1) {   // using loop to check all characters
		System.out.println((char)i);
		}
		fw.close();   // close object
		fr.close();   // close object
		System.out.println("Done!");
		} 
		// catch block with exception
		catch(Exception e) {
		System.out.println(e);
	    }
	}
}
