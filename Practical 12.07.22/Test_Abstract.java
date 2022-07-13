package NewJava;

/*
@author Sankhajit Roy
*/

abstract class Test_Abstract {    // abstract parent class
	Test_Abstract() {      // constructor
		System.out.println("Bike is created");
	}
	abstract void run();    // abstract method
	
	void changeSpeed() {    // simple method
		System.out.println("Speed changed");
	}
}

class Child extends Test_Abstract{     //  child class
	void run() {    // method
		System.out.println("Running Safely");
	}
}

class test_Class{    // main class
	public static void main(String[] args) {    // main method
		Test_Abstract obj = new Child();     // object
		obj.run();          // called method
		obj.changeSpeed();       // called method
	}
}