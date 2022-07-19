package Array;

/*
@author Sankhajit Roy
*/

// print anonymous array

public class AnonymousArray {      // class
	static void print(int arr[]) {    // static max method receives an array as a arguments / parameter
		for (int i = 0; i<arr.length;i++)    // loop to check all elements
			System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		print(new int[] {10,20,30,40,50,60,70});   // passing anonymous array to method print
	}
}
