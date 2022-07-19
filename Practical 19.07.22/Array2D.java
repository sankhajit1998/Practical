package Array;
/*
@author Sankhajit Roy
*/

// Multi / Two dimensional array 

public class Array2D {   // class
	public static void main(String[] args) {    // main method
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};    // input multiple array
		
		for (int i = 0; i < 3; i++) {    // loop for checking all elements in row
			
			for (int j = 0; j < 3; j++) {  // loop for checking all elements in column
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
