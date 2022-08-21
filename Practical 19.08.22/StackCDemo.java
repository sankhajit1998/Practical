package com.collectionframework;
/*
@Author Sankhajit Roy
*/
import java.util.Stack;

public class StackCDemo {     // main class
	public static void main(String[] args) {    // main method
		// created a stack object
		Stack<Integer> s = new Stack<>();
		// checking stack empty or not
		boolean result = s.empty();
		System.out.println("Is the stack empty? "+result);
		// adding elements
		s.push(25);
		s.push(35);
		s.push(40);
		s.push(55);
		s.push(80);
		s.push(75);
		// result
		System.out.println("Stack elements: "+s);
		// check elements from top
		Integer digit = s.peek();
		System.out.println("Top elements: "+digit);
		// search elements
		int digit1 = s.search(35);
		System.out.println("Search elements: "+digit1);
		// find size of stack
		int x = s.size();
		System.out.println("Stack size: "+x);
		// again checking stack empty or not
		System.out.println("Elements are "+s);
		result = s.empty();
		System.out.println("Is the stack empty? "+result);
	}
}
