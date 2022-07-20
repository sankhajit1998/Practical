package Array;
/*
@author Sankhajit Roy
*/
// Sum of Matrices

public class ArrayMatrix {   // class
	public static void main(String[] args) {   // main method
		int a[][] = {{1,2,3},{4,5,6}};    // declaration array 1
		int b[][] = {{1,3,4},{3,4,5}};    // declaration array 2
		int c[][] = new int[2][3]; // store the sum of matrix
		
		for(int i = 0; i <2; i++) {   // for loop to read row elements
			for(int j = 0; j <3; j++) {     // for loop to read column elements
				c[i][j] = a[i][j] + b[i][j];    // logic for sum
				System.out.println(c[i][j]);
			}
			System.out.println();   // new line
		}
	}

}
