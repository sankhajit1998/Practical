package com.collectionframework;
/*
@Author Sankhajit Roy
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {   // main class
	public static void main(String[] args) {   // main method
		// creating a array list
		ArrayList<String> a1 = new ArrayList<>();
		// adding object to array list
		a1.add("sayan");
		a1.add("sankhajit");
		a1.add("akash");
		a1.add("owashim");
		a1.add("pritam");
		a1.add("stuti");
		a1.add("uday");
		a1.add("jaita");
		// printing array list object
		System.out.println(a1);
		System.out.println("size of array list: "+ a1.size());
		// removing elements from index 5
		a1.remove(5);
		// printing array after removing
		System.out.println(a1);
		System.out.println("size of array list: "+ a1.size());
		// adding two new elements
		a1.add("ravi");
		a1.add("viswa");
		
		System.out.println(a1);
		System.out.println("size of array list: "+ a1.size());   // get the size of array list
		// get the value of the index 6
		System.out.println("element of index value: "+ a1.get(6));
		// traversing using loop
		System.out.println("traversing using loop: ");
		for(int i = 0; i <a1.size(); i++) {
			System.out.print(a1.get(i)+" ");
		}
		
		// traversing using Iterator
		System.out.println("\ntraversing using Iterator: ");
		Iterator <String> itr = a1.iterator();    // getting the iterator
		while (itr.hasNext()) {  // checking iterator has element or not
			System.out.println(itr.next());  // printing elements & move to next
		}
		
		System.out.println("List iterartor-forward: ");
		ListIterator<String> itrl = a1.listIterator();    // getting the iterator
		while (itrl.hasNext()) {  // checking iterator has element or not
			System.out.println(itrl.next());  // printing elements & move to next
		}
		
		System.out.println("List iterartor-backward: ");
		ListIterator<String> itr2 = a1.listIterator(a1.size());    // getting the iterator
		while (itr2.hasPrevious()) {  // checking iterator has element or not
			System.out.println(itr2.previous());  // printing elements & move to next
		}
	}
}
