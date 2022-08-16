package com.collectionframework.Set;
/*
@Author Sankhajit Roy
*/
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {    // main class
	public static void main(String[] args) {    // main method
		// create a HashSet object and adding elements
		HashSet<String> set = new HashSet<>();
		set.add("ram");
		set.add("rima");
		set.add("ram");
		set.add("ramesh");
		set.add("pratim");
		set.add("rajen");
		
		System.out.println(set);
		// using iterator to inverse the elements
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		// to remove the specific element
		set.remove("rajen");
		System.out.println(set);
		
		// created a new set
		Set<String> set1 = new HashSet<>();
		set1.add("sankha");
		set1.add("sayan");
		set1.add("akash");
		set1.add("arnab");
		set1.add(null);
		
		System.out.println(set1);
		// remove all elements from first set
		set.removeAll(set);
		System.out.println(set);
		
	}
}
