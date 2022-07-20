package Array;
/*
@author Sankhajit Roy
*/

// A program to compare array list

import java.util.ArrayList;    // inbuilt package
import java.util.List;         // inbuilt package
public class ArrayCompareList {   // class
	public static void main(String[] args) {   // main method
		List<String> al = new ArrayList<String>();   // array list object
		// calling add method with parameters
		al.add("Rose");
		al.add("Sun Flower");
		al.add("Lily");
		al.add("Daisy");
		al.add("Mari Gold");
		al.add("Tulip");
		al.add("Jasmine");
		System.out.println(al);
		
		List<String> al1 = new ArrayList<String>();    // array list object
		// calling add method with parameters
		al1.add("Rose");
		al1.add("Sun Flower");
		al1.add("Lily");
		al1.add("Daisy");
		al1.add("Mari Gold");
		al1.add("Tulip");
		al1.add("Jasmine");
		System.out.println(al1);
		
		boolean b = al.equals(al1);    // conditional method for comparing
		System.out.println(b);
		
		al1.add("Red Rose");
		boolean b1 = al.equals(al1);    // conditional method for comparing
		System.out.println(b1);
	}
}
