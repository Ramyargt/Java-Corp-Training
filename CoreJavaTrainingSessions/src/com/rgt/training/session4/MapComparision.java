package com.rgt.training.session4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparision {

	public static void main(String[] args) {

		Map<Integer, String> hashmap = new HashMap<>();
		Map<Integer, String> treemap = new TreeMap<>();

		long startTime, endTime;
		// add elements to HashMap and TreeMap
		startTime = System.nanoTime();
		hashmap.put(0, "development");
		endTime = System.nanoTime();
		System.out.println("The hashmap values are: " + hashmap);
		System.out.println("HashMap: AddTime is " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		treemap.put(0, "development");
		endTime = System.nanoTime();
		System.out.println("The treemap values are: " + treemap);
		System.out.println("TreeMap: AddTime is " + (endTime - startTime) + " ns");
		System.out.println("_________________________________________________________________________");

		// Get elements from HashMap and TreeMap
		startTime = System.nanoTime();
		hashmap.get(0);
		endTime = System.nanoTime();
		System.out.println("The hashmap value at index '0' is: " + hashmap.get(0));
		System.out.println("HashMap: Get Time is " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		treemap.get(0);
		endTime = System.nanoTime();
		System.out.println("The treemap value at index '0' is: " + treemap.get(0));
		System.out.println("TreeMap: Get Time is " + (endTime - startTime) + " ns");
		System.out.println("_________________________________________________________________________");

		// Delete elements from HashMap and TreeMap
		startTime = System.nanoTime();
		hashmap.remove(0);
		endTime = System.nanoTime();
		System.out.println("The hashmap values are: " + hashmap);
		System.out.println("HashMap: Deletion Time is " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		treemap.remove(0);
		endTime = System.nanoTime();
		System.out.println("The treemap values are: " + treemap);
		System.out.println("TreeMap: Deletion Time is " + (endTime - startTime) + " ns");
		System.out.println("_________________________________________________________________________");

	}
}
