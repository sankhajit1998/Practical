/*
@author Sankhajit Roy
*/
// Final variable keyword

public class final_var {
	
	final int carspeed = 60;   // set final variable
	void run() {
		// carspeed = 90;   through error
	}
	public static void main(String[] args) {
		final_var a = new final_var();    // object
		a.run();   //  call the method
		System.out.print("Final car speed is "+a.carspeed);

	}

}
