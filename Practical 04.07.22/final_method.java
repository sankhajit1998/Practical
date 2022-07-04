/*
@author Sankhajit Roy
*/
// Final method keyword

public class final_method {
	
	final void display() {   // final method is static
		System.out.println("Working.");
	}
//}	
//
//class new_method extends final_method{
//	public final void display() {
//		System.out.println("Not working.");
//	}
//	
	public static void main(String[] args) {
		final_method a = new final_method();  // object
		a.display();   // called method
	}
}
