package com.AdvanceJava;
/*
@author Sankhajit Roy
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexDemo {  // class

	public static void main(String[] args) {   // main method
		Pattern p = Pattern.compile(".a");   // compile regular expression
		Matcher m = p.matcher("ma");      // compile regular expression with reference value
		boolean b = m.matches();  
		
		// Various type of Quantifiers 
		boolean bb = Pattern.compile("..m").matcher("aam").matches();    // type 1 char values
		
		boolean b1 = Pattern.matches("[a-zA-Z0-9]{8,}","Anudip123ppp");  // type 2 name with numeric value
		
		boolean b2 = Pattern.matches("[6789]{1}[0-9]{9}","8348222580");  // type 3 numeric values
		
		boolean b3 = Pattern.matches("^[a-z0-9+_.-]*@[a-zA-Z0-9]*+\\.[a-z]{3}","sankha123_.-@gmail.com");    // type 4 email id
		
		boolean b4 = Pattern.matches("^[a-zA-Z0-9+_.-]{8,}","Sankha@123_.");   // type 5 user id
		
		boolean b5 = Pattern.matches("[a-zA-Z]","Anudip");  // type 4 name
		
		System.out.println(b+" "+bb+" "+b1+" "+b2+" "+b3+" "+b4+" "+b5);

	}

}
