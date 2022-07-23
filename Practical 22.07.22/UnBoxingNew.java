package WrapperClass;
/*
@author Sankhajit Roy
*/

// auto boxing & un boxing using collection framework

import java.util.ArrayList;

public class UnBoxingNew {   // class		
	public static void main(String[] args) {    // main method
		ArrayList<Integer> a1 = new ArrayList<Integer>();   // create a array list integer type object
		
		// auto boxing
		a1.add(5);
		a1.add(2);
		
		System.out.println("List: "+a1);
		// un boxing
		int a = a1.get(0);  // 5 integer convert to int
		System.out.println("value of index 0: "+ a);
	}


}
