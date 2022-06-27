/*
@Author Sankhajit Roy 
*/
// Find the number is even or odd.

package sankha_java;

import java.util.Scanner;    // scanner package

public class odd_even {

	public static void main(String[] args) {   // main method
		Scanner scan = new Scanner(System.in);   // scanner object
		System.out.print("Enter the number: ");
		int num = scan.nextInt();     // read user input
		
		if(num%2 == 0) {   // 1st condition
			System.out.println("This number is Even.");
		}
		else {             // last condition
			System.out.println("This number is Odd.");
		}

	}

}
