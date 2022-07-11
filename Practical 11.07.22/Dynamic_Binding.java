package NewJava;

/*
@author Sankhajit Roy
*/

// run time polymorphism

public class Dynamic_Binding {    // parent class
 void run() {   //  method
		
		System.out.println("Method is not private.");
			
	}
	
}
class test extends Dynamic_Binding{    //  child class
	void run() {    //  method
		System.out.println("Method implementation is changed.");
	}

	 public static void main(String[] args) {
		 test obj = new test();   //  object
			obj.run();   //  called the method under child class
	 }
}
