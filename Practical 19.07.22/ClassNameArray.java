package Array;
/*
@author Sankhajit Roy
*/

// to get the class name of array

public class ClassNameArray { // class 
	public static void main(String[] args) {   // main method
		int arr[] = {1,2,3};   // declaration & initialization of an array
		Class c = arr.getClass();   // getting the class name
		String name = c.getName();   
		System.out.println(c);   // print the class name type
	}
}
