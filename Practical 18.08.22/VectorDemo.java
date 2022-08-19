package com.collectionframework;

import java.util.Vector;

public class VectorDemo {   // main class
	public static void main(String[] args) {   // main method
		// created a Vector object and adding elements
		Vector<String> vc = new Vector<>(4);   // declared a specific capacity as 4
		vc.add("dog");
		vc.add("cat");
		vc.add("cow");
		vc.add("sheep");
		// checking size & capacity of elements
		System.out.println("Size: "+vc.size());
		System.out.println("Capacity: "+vc.capacity());
		// adding new elements
		vc.addElement("bull");
		vc.addElement("goat");
		// checking size & capacity of elements
		System.out.println("Size: "+vc.size());
		System.out.println("Capacity: "+vc.capacity());
		
		System.out.println(vc);
		// checking element is present in vector or not
		if (vc.contains("cat")) {
			System.out.println("Element present.");
		}
		else {
			System.out.println("Element not present.");
		}
		// getting 1st element
		System.out.println("1st element: "+vc.firstElement());
		// getting last element
		System.out.println("Last element: "+vc.lastElement());
		// checking index of specific element
		System.out.println("Index: "+vc.indexOf("cat"));
		
	}
}
