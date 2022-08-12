package com.collectionframework;
/*
@Author Sankhajit Roy
*/

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {   // main class
	public static void main(String... args) {   // main method
		// create a LinkedList object
		LinkedList<String> animal = new LinkedList<>();
		// adding elements
		animal.add("Cat");
		animal.add("Dog");
		animal.add("Cow");
		// adding an element in specific position
		animal.add(2,"Bull");
		
		LinkedList<String> animal2 = new LinkedList<>();
		animal2.add("Rabbit");
		animal2.add("Pig");
		// adding 2nd list elements to the first list
		// animal.addAll(animal2);
		// adding 2nd list elements to the specific position
		animal.addAll(1, animal2);
		// adding an elements to the first position
		animal.addFirst("Goat");
		// adding an elements to the last position
		animal.addLast("Sheep");
		// removing an particular element
		animal.remove("Bull");
		// removing all elements from 2nd list
		animal.removeAll(animal2);
		// removing the first element
		animal.removeFirst();
		// removing the last element
		animal.removeLast();
		// remove first occurrence from the list if there duplicate element
		animal.removeFirstOccurrence(animal2);
		
		// clear all elements
		animal.clear();
		
		Iterator<String> itr = animal.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
