package com.collectionframework;
/*
@Author Sankhajit Roy
*/
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {   // main class
	public static void main(String[] args) {   // main method
		// create a LinkedList object
		LinkedList<String> list = new LinkedList<>();
		// adding elements
		list.add("Fire");
		list.add("Water");
		list.add("Earth");
		list.add("Air");
		list.add("Space");
		// Traversing the list of elements in reverse order
		Iterator<String> i = list.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
