/*
@author Sankhajit Roy 
*/

// multilevel inheritance in java (multiple inheritance dose not support in java)


public class Vehical {  // parent class
	void run() {
		System.out.println("Running mode on.");
	}
}
class Bike extends Vehical{    // child class
	void features() {
		System.out.println("Well executed features.");
	}
}
class BMW extends Bike{   // child class
	void speed() {
		System.out.println("Very high speed.");
	}
}
class Test_inheritance{   // main class
	public static void main(String[] args) {
		BMW b = new BMW();   // object of last child class
		b.run();     // called parent class method
		b.features();    // called child class method
		b.speed();
	}
}