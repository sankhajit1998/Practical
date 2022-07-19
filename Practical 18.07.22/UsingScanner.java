package Array;

/*
@author Sankhajit Roy
*/
// using scanner took input in array

import java.util.Scanner;

public class UsingScanner {        // class
	public static void main(String[] args) {     // main method
		Scanner scan = new Scanner(System.in);    // scanner object
		System.out.print("Enter array length: ");
		int arrayLength = scan.nextInt();          // read the input
		
		int arr[] = new int[arrayLength];        // input for array
		System.out.println("Enter elements: ");
		for (int i = 0; i<arrayLength; i++) {     // loop for check the elements
			arr[i] = scan.nextInt();          // took the values
		}
		
		System.out.print("Display the array list: ");
		for(int i = 0; i < arrayLength; i++) {   // loop for check the elements
			System.out.print(arr[i]+" ");   // to print the values
		}
	}
}
