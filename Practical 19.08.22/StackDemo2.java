package com.collectionframework;
/*
@Author Sankhajit Roy
*/
import java.util.Stack;
import java.util.EmptyStackException;

public class StackDemo2 {    // main class
	public static void main(String[] args) {    // main method
		// created a stack object 
		Stack<Integer> s = new Stack<>();
		System.out.println("Stack: "+ s);
		// pushing elements into stack
		pushelement(s,15);
		pushelement(s,45);
		pushelement(s,20);
		pushelement(s,30);
		// pop elements from stack
		popelement(s);
		popelement(s);
		
		// if stack is empty throw exception
		try {
			popelement(s);
		}
		catch (EmptyStackException e) {
			System.out.println("Stack empty.");
		}
	
	}
	// push operation
	private static void pushelement(Stack<Integer> s,int i) {
		// invoke push() method
		s.push(new Integer(i));
		System.out.println("Push"+i);
		System.out.println("Stack"+s);
	}
	
	// pop operation
	private static void popelement(Stack<Integer>s) {
		// invoke pop() method
		Integer i = (Integer)s.pop();
		System.out.println("Push"+i);
		System.out.println("Stack"+s);
	}
}
