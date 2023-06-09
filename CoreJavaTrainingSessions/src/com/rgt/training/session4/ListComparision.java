package com.rgt.training.session4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparision {

	public static void main(String[] args) {

		List<Double> arraylist = new ArrayList<>();
		List<Double> linkedlist = new LinkedList<>();
		int index = 0;

		long startTime, endTime;
		// add elements to ArrayList and LinkedList
		startTime = System.nanoTime();
		arraylist.add((double) 10000);
		endTime = System.nanoTime();
		System.out.println("ArrayList: addTime is " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		linkedlist.add((double) 10000);
		endTime = System.nanoTime();
		System.out.println("LinkedList: addTime is " + (endTime - startTime) + " ns");
		System.out.println("_________________________________________________________________________");

		// Get elements from ArrayList and LinkedList
		startTime = System.nanoTime();
		arraylist.get(index);
		endTime = System.nanoTime();
		System.out.println("The ArrayList value at "+index+ ": is" + arraylist.get(index));
		System.out.println("ArrayList: GetTime is " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		linkedlist.get(index);
		endTime = System.nanoTime();
		System.out.println("The LinkedList value at "+index+ ": is" + linkedlist.get(index));
		System.out.println("LinkedList: GetTime is " + (endTime - startTime) + " ns");
		System.out.println("_________________________________________________________________________");

		// Insert elements to ArrayList and LinkedList
		startTime = System.nanoTime();
		arraylist.add(index, (double) 10000);
		endTime = System.nanoTime();
		System.out.println("ArrayList: InsertionTime is " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		linkedlist.add(index, (double) 10000);
		endTime = System.nanoTime();
		System.out.println("LinkedList: InsertionTime is " + (endTime - startTime) + " ns");
		System.out.println("_________________________________________________________________________");

		// Delete elements from ArrayList and LinkedList
		startTime = System.nanoTime();
		arraylist.remove(index);
		endTime = System.nanoTime();
		System.out.println("ArrayList: DeletionTime is " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		linkedlist.remove(index);
		endTime = System.nanoTime();
		System.out.println("LinkedList: DeletionTime is " + (endTime - startTime) + " ns");
	}

}
