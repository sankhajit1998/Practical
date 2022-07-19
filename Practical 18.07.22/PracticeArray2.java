package Array;

/*
@author Sankhajit Roy
*/

// find the even numbers.

public class PracticeArray2 {    // class
	public static void main(String[] args) {   //  main method
		int a[] = {15,12,74,85,34,56,71,81,90};       // input values in array
		
		System.out.print("Even Numbers: ");
		
		for(int i=0;i<a.length;i++) {     // loop for checking all elements
			if(a[i]%2==0) {               // condition
				System.out.print(a[i]+" ");
			}
		}
	}
}
