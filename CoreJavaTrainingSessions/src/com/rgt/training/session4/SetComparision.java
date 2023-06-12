package com.rgt.training.session4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparision {

	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>();
		Set<String> treeset = new TreeSet<>();

		
		long startTime, endTime;
		// add elements to HashSet and TreeSet
		startTime = System.nanoTime();
		hashset.add("java");
		endTime = System.nanoTime();
		System.out.println("The hashset values are: " + hashset);
		System.out.println("HashSet: AddTime is " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		treeset.add("java");
		endTime = System.nanoTime();
		System.out.println("The treeset values are: " + hashset);
		System.out.println("TreeSet: AddTime is " + (endTime - startTime) + " ns");
		System.out.println("_________________________________________________________________________");

		// Get elements from HashSet and TreeSet
		startTime = System.nanoTime();
		hashset.iterator().next();
		endTime = System.nanoTime();
		System.out.println("The hashset values are: " + hashset);
		System.out.println("HashSet: GetTime is " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		treeset.iterator().next();
		endTime = System.nanoTime();
		System.out.println("The treeset values are: " + hashset);
		System.out.println("TreeSet: GetTime is " + (endTime - startTime) + " ns");
		System.out.println("_________________________________________________________________________");

		// Delete elements from HashSet and TreeSet
		startTime = System.nanoTime();
		hashset.remove("java");
		endTime = System.nanoTime();
		System.out.println("The hashset values are: " + hashset);
		System.out.println("HashSet: Deletion Time is " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		treeset.remove("java");
		endTime = System.nanoTime();
		System.out.println("The treeset values are: " + hashset);
		System.out.println("TreeSet: Deletion Time is " + (endTime - startTime) + " ns");
		System.out.println("_________________________________________________________________________");

	}
}
