package com.AdvanceJava;
/*
@Author Sankhajit Roy
*/

public class ThreadClassWithString {   // class
	public static void main(String[] args) {   // main method
		// this is a object of thread class where we using the constructor string name
		Thread obj = new Thread("first thread");
		obj.start();  // move the thread to the active state
		String s = obj.getName();   // we are getting the thread name
		System.out.println(s);
	}
}
