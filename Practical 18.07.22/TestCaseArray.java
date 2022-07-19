package Array;

/*
@author Sankhajit Roy 
*/
// simple array

public class TestCaseArray {    // class

	public static void main(String[] args) {    // main method
		int a[] = {10,20,30,40,50,60,70,};      // array values
//		int a[] = new int[7];   // Declaration & instantiation 
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		a[5]=60;
//		a[6]=70;
		
//		for (int i =0; i<a.length; i++) {  // loop (traversing array) length is the properties of array
//			System.out.println(a[i]);
//		}
		
		for (int i:a) {                  // for each loop
			System.out.println(i);
		}
			
	}

}
