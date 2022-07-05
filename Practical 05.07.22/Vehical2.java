/*
@author Sankhajit Roy 
*/

// hierarchical inheritance in java


public class Vehical2 {  // parent class
	void run() {
		System.out.println("Running mode on.");
	}
}
class cars extends Vehical2{    // child class
	void features() {
		System.out.println("Well executed features.");
	}
}
class Audi extends Vehical2{   // child class
	void speed() {
		System.out.println("Very high speed.");
	}
}
class new_vehical{   // main class
	public static void main(String[] args) {
		Audi b = new Audi();   // object of last child class
		b.run();     // called parent class method
//		b.features();    // called child class method
		b.speed();
	}
}
