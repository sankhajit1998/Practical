package Array;
/*
@author Sankhajit Roy
*/
// Create integer array of 10 elements accepts values o array and find sum, max, min, avg

public class PracticeArray1 {    // class
	static void sum(int arr[]) {     // method for sum of values
		int sum = arr[0];
		for (int i = 1; i<arr.length; i++)    // loop for checking all elements  
			sum += arr[i];   // logic
		
		System.out.println("Sum value: "+sum);
	}
	
	static void max(int arr[]) {     // method for maximum number of values
		int max = arr[0];
		for (int i = 1; i<arr.length; i++)    // loop for checking all elements  
			if (max < arr[i])   // condition
				max=arr[i];
		System.out.println("Max value: "+max);
	}
	static void min(int arr[]) {     // method for minimum number of values
		int min = arr [0];
		for (int i = 1; i < arr.length; i++)    // loop for checking all elements
			if (min > arr[i])     // condition
				min = arr[i];
		System.out.println("Min value: "+min);
	}
	static void avg(int arr[]) {     // method for average of values
		int avg = arr[0];
		for (int i = 1; i<arr.length; i++)    // loop for checking all elements  
			avg += arr[i] / arr.length;    // condition
		
		System.out.println("Avg value: "+avg);
	}
	public static void main(String[] args) {   // main method
		int a[] = {12,20,31,40,36,60,45,85,95,98};    // input values of array
		sum(a);  // called the method
		max(a);  // called the method
		min(a);  // called the method
		avg(a);  // called the method
		
	}
}
