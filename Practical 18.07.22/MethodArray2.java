package Array;

/*
@author Sankhajit Roy
*/

// returning array from method

public class MethodArray2 {   // class
	static int[]get(){      // method
		return new int[] {10,20,30,40,50};    //return the values
	}
	public static void main(String[] args) {     // main method
		int arr[] = get();                      // called the method
		for(int i=0;i<arr.length;i++)       // loop for checking all elements
			System.out.println(arr[i]);
	}
}


