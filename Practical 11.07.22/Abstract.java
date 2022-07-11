package NewJava;

/*
@author Sankhajit Roy
*/

// Abstract class

abstract class Abstract {   // abstract parent class
	abstract void run();    // abstract method
}
class test1 extends Abstract{    // child class
	void run() {    // method
		System.out.println("Running mode on.");
	}
}
class test_Final{    // main class
	public static void main(String[] args) {   // main method
		test1 obj = new test1();    // object
		obj.run();    // called the method
	}
}
