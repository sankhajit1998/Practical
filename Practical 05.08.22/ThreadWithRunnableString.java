package com.AdvanceJava;
/*
@Author Sankhajit Roy
*/
//class implements Runnable interface
public class ThreadWithRunnableString implements Runnable{  
	
	public void run() {   // run() method
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {    // main method
		// this is a object of thread class where we using the constructor string name
		Runnable r = new ThreadWithRunnableString();   // object of runnable interface
		Thread t = new Thread(r,"First thread.");    // thread object
		t.start();  // move the thread to the active state
		String s = t.getName();   // we are getting the thread name
		System.out.println(s);
	}
}
