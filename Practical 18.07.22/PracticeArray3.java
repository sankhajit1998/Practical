package Array;

/*
@author Sankhajit roy
*/

// find sum of odd numbers

public class PracticeArray3 {    // class
	static void sumOdd(int arr[]) {
		
		int sumOdd = arr[0];
		System.out.print("All Odd numbers: ");
		for(int i=0;i<arr.length;i++)
			if(arr[i]%2!=0) {
				sumOdd += arr[i];
				System.out.print(arr[i]+" ");
			}
		System.out.println("\nSum of odd numbers: "+sumOdd);
	}
	public static void main(String[] args) {
		int a[] = {15,12,74,85,34,56,71,81,90};
		sumOdd(a);
	}
}
