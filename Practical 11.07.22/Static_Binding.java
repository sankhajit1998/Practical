package NewJava;

/*
@author Sankhajit Roy
*/

// compile time polymorphism

public class Static_Binding {  //  parent class
	
	private void run() {   //  method
		
		System.out.println("Method is private.");
			
	}
	public static void main(String[] args) {   // main method
		Static_Binding obj = new Static_Binding();    // object
		obj.run();    // called the method under child class
	}
}
