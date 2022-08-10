package com.collectionframework;
/*
@Author Sankhajit Roy
*/
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListShortDemo {   // main class
	public static void main(String[] args) {    // main method
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
		
		System.out.println("String sorted list: ");
		
		// sorting array list
		Collections.sort(a1);
		for(String s: a1){    // for each loop
			System.out.println(s);
		}
		// creating another array list 
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(20);
		a2.add(32);
		a2.add(45);
		a2.add(26);
		a2.add(37);
		a2.add(58);
		a2.add(61);
		
		System.out.println("Integer sorted list: ");
		
		// sorting array list
		Collections.sort(a2);
		for(Integer s1: a2){   // for each loop
			System.out.println(s1);
		}
	}
}
