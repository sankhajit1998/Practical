package com.collectionframework.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {    // main class
	public static void main(String[] args) {    // main method
		// created a LinkedHashMap and adding elements
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(200, "riya");
		lhm.put(205, "priya");
		lhm.put(202, "rima");
		lhm.put(201, "rohit");
		lhm.put(207, "karan");
		lhm.put(null, null);
		lhm.put(206, null);
		lhm.put(null, "sanjib");
		
		lhm.putIfAbsent(206, "maya");
		lhm.putIfAbsent(200, "puja");
		

		// key
			System.out.println("key are: "+lhm.keySet());
			
		// value
			System.out.println("values are: "+lhm.values());
			
		// key-value pair
			System.out.println("key-value pair: "+lhm.entrySet());
			
		// remove the map elements
		lhm.remove(202);
		
		// traversing map
		for(Map.Entry<Integer, String> m : lhm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
