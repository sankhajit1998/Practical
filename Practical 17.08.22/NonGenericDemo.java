package com.collectionframework.map;
/*
@Author Sankhajit Roy
*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//non-generic example
public class NonGenericDemo {    // main class
	public static void main(String[] args) {    // main method
		// created a HashMap object
		Map mp = new HashMap<>();
		// adding elements
		mp.put(1, "pallabi");
		mp.put(2, "rahul");
		mp.put(5, "sweta");
		mp.put(7, "karan");
		
		// traversing elements
		Set set = mp.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry en = (Map.Entry)i.next();
			// print key and values from elements
			System.out.println(en.getKey()+ " " +en.getValue());
		}
	}

}
