package Array;
/*
@author Sankhajit Roy
*/

// clone of array

public class CloneArray {
	public static void main(String[] args) {
		int arr[] = {44,4,5,6};  // declaring & initializing value
		System.out.println("Print the actual array: ");
		for(int i:arr)   // for each loop for print
			System.out.println(i);
		System.out.println("Print the clone array: ");
		int carr[] = arr.clone();  // different reference value
		for(int i:arr)    // for each loop for cloning array
			System.out.println(i);
		System.out.println("Both are equal or not?");
		System.out.println(arr==carr);   // checking
	}
}
