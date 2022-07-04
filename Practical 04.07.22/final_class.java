/*
@author Sankhajit Roy
*/
// Final class keyword

final class final_class {  // final class
	
	void display() {  // method
		System.out.println("Succesfully Working.");
	}
	
//	class main extends final_class{
//		void display() {
//			System.out.println("Working.");
//		}
//		public static void main(String[] args) {
//			main a = new main();
//			a.display();
//
//		}
	
	public static void main(String[] args) {
		final_class a = new final_class();  // object
		a.display();  // called method

	}
}
