package NewJava;

/*
@author Sankhajit Roy
*/

public interface Test_Interface {   // parent interface
	void print1();    // method
}

interface Test_Interface2 {      // another interface
	void print1();    // method
}

class A4 implements Test_Interface{     // child class
	public void print1() {          // method
		System.out.print("Hello guys....");
	}
	public static void main(String[] args) {    //  main method
		A4 obj = new A4();     // object
		obj.print1();      // called method
	}
}
