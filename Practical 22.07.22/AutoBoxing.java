package WrapperClass;
/*
@author Sankhajit Roy
*/

// primitive to wrapper

public class AutoBoxing {  // class
	public static void main(String[] args) {    // main method
		int a = 10;
		Integer i = Integer.valueOf(a);     // converting int(primitive) into Integer(wrapper)
		Integer j = a;    // (auto boxing) now compiler will write Integer .valueOf(a)
		System.out.println(a+" "+i+" "+j);
	}

}
