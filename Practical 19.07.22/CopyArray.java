package Array;
/*
@author Sankhajit Roy
*/
// Copy of array

public class CopyArray {   // class
	public static void main(String[] args) {   // main method
		// declaring a source array
		char[] copyForm = {'d','e','c','f','f','e','i','n'};
		
		// declaring a destination array
		char[] copyTo = new char[7];
		System.arraycopy(copyForm,1,copyTo,0,7);
		// print the destination array
		System.out.println(String.valueOf(copyTo));
	}
}
