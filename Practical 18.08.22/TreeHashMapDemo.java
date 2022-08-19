package com.collectionframework.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapDemo {    // main class
	public static void main(String[] args) {   // main method
		// created a TreeMap object and adding elements
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(200, "riya");
		tm.put(205, "priya");
		tm.put(202, "rima");
		tm.put(201, "rohit");
		// descending order
		System.out.println("Descending map: "+tm.descendingKeySet());
		// it returns whose keys are less than(or equal to, if inclusive is true) toKey
		System.out.println("Head map: "+tm.headMap(201,true));
		// it returns whose keys are greater than(or equal to, if inclusive is true) fromKey
		System.out.println("Tail map: "+tm.tailMap(201,true));
		// it returns the portion of this map whose keys range from fromKey to toKey
		System.out.println("Sub map: "+tm.subMap(201, true, 205,true));
		
		// sorted map
		System.out.println("Head map: "+tm.headMap(201));
		System.out.println("Tail map: "+tm.tailMap(201));
		System.out.println("Sub map: "+tm.subMap(201, 205));
		
		// traversing map
		for(Map.Entry<Integer, String> m : tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		tm.remove(205);
		System.out.println("After removing: ");
		for(Map.Entry<Integer, String> m1 : tm.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}
}
