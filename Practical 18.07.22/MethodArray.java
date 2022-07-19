package Array;

/*
@author Sankhajit Roy
*/

// passing array to a method to find max value

public class MethodArray {     // class
	static void max(int arr[]) {   // static max method 
		int max = arr[0];    
		for (int i = 1; i<arr.length; i++)  // loop for check all elements inside the array
			if (max < arr[i])   // checking max value array
				max=arr[i];      // reference var
		System.out.println(max);
	}
	public static void main(String[] args) {   // main method
		int a[] = {10,20,30,40,50,60,70};
		max(a);    // called method
		
	}
}
