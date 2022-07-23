package WrapperClass;
/*
@author Sankhajit Roy
*/

// wrapper to primitive

public class UnBoxing {   // class 
	public static void main(String[] args) {   // main method
		Integer a=new Integer(3);   // integer object
		int i=a.intValue();   // converting Integer(wrapper) into int(primitive) 
		int j=a;            // (un boxing) now compiler will write Integer .valueOf(a)
		System.out.println(a+" "+i+" "+j);
	}
}
