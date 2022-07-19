package Array;

/*
@author Sankhajit Roy
*/
// jagged array

public class JaggedArray {   // class
	public static void main(String[] args) {  // main method
		
		int arr[][] = new int [3][];   // declaration & initialization
		arr[0]=new int [3];  // took number of columns 
		arr[1]=new int [4];  // took number of columns 
		arr[2]=new int [2];  // took number of columns 
		int count = 0;  
		for(int i =0; i<arr.length; i++)   // logic for print array
			for(int j=0; j<arr[i].length;j++)    
				arr [i][j] = count++;    
		for(int i =0; i<arr.length; i++) {   // logic for print array
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
			
	}
}
