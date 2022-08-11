package com.AdvanceJava;
/*
@Author Sankhajit Roy
*/

public class DaemonThreadDemo extends Thread {  // main class
	// run() method
	public void run() {
		System.out.println("Name: "+Thread.currentThread().getName());
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());
		
//		if (Thread.currentThread().isDaemon()) {
//			System.out.println("Thread is Daemon");
//		}
//		else {
//			System.out.println("Thread is not Daemon");
//		}
	}
	public static void main(String[] args) {    // main method
		// create object of the main class
		DaemonThreadDemo t1 = new DaemonThreadDemo();
		DaemonThreadDemo t2 = new DaemonThreadDemo();
		DaemonThreadDemo t3 = new DaemonThreadDemo();
		t1.setDaemon(true);  // set t1 as a daemon thread
		// invoked the run() method
		t1.start();
		t2.start();
		t3.start();
		
	}
}
