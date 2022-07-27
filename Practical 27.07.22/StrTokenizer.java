package com.AdvanceJava;
/*
@author Sankhajit Roy
*/

// using String Tokenizer 

import java.util.StringTokenizer;

public class StrTokenizer {   // class
	public static void show() {    // method
		StringTokenizer t = new StringTokenizer("Anudip foundation skill and carrer developemnt center", " ");
		
		while(t.hasMoreTokens()) {    // loop to check all elements
			System.out.println(t.nextToken(" "));
		}
		StringTokenizer st = new StringTokenizer("I am riya,Staying in kolkata");   // object
		while (st.hasMoreTokens()) {    // loop to check all elements
			System.out.println(st.nextToken(","));
		}
    }
	public static void main(String[] args) {    // main method
		show();   // called method
	}

}
