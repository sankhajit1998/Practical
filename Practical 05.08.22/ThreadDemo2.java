package com.AdvanceJava;
/*
@Author Sankhajit Roy
*/
// priority statement example
public class ThreadDemo2 extends Thread {   // class extends Thread
	public void run() {   // run() method
		
		for (int i = 0; i<5; i++) {    // loop to assigning values into thread
			
			// try block
			try {
				Thread.sleep(800);   // set Thread break time
			} catch (InterruptedException e) {   // catch exceptions
				System.out.println(e);
			}
			System.out.println(i);
		}
		System.out.println(getName());   // to get thread numbers
	}
	public static void main(String[] args) {   // main method
		ThreadDemo2 t1 = new ThreadDemo2();    // thread object
		ThreadDemo2 t2 = new ThreadDemo2();    // thread object
		ThreadDemo2 t3 = new ThreadDemo2();    // thread object
		t2.setPriority(MAX_PRIORITY); // set Max Priority to this Thread
		System.out.println(t2.getPriority());   // get priority thread
		System.out.println(Thread.currentThread().getPriority());   // print current thread number
		
		t1.start();   // invoke the run method
		t2.start();   // invoke the run method
		t3.start();   // invoke the run method
		

	}
}
