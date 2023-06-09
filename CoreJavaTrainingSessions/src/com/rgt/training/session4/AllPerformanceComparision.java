package com.rgt.training.session4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllPerformanceComparision {

	public static void main(String[] args) {
		compareAddition(100000);
		compareGet(100000, 100000);
		compareInsertion(100000, 9000);
		compareDeletion(100000, 10000);
	}

	public static void compareAddition(int numberOfElements) {

		List<Double> arraylist = new ArrayList<>();
		List<Double> linkedlist = new LinkedList<>();

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfElements; i++) {
			arraylist.add((double) i);
		}
		long arrayListTime = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfElements; i++) {
			linkedlist.add((double) i);
		}
		long linkedListTime = System.currentTimeMillis() - startTime;
		System.out.printf("Addition: Arraylist= %d ms, Linkedlist= %d ms\n", arrayListTime, linkedListTime);
	}

	public static void compareGet(int numberOfElements, int numberOfOperations) {
		List<Double> arraylist = new ArrayList<>(numberOfElements);
		List<Double> linkedlist = new LinkedList<>();

		for (int i = 0; i < numberOfElements; i++) {
			arraylist.add((double) i);
			linkedlist.add((double) i);
		}

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfOperations; i++) {
			double index = (double) (Math.random() * numberOfOperations);
			arraylist.get((int) index);
		}
		long arrayListTime = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfOperations; i++) {
			double index = (double) (Math.random() * numberOfOperations);
			linkedlist.get((int) index);
		}
		long linkedListTime = System.currentTimeMillis() - startTime;
		System.out.printf("Get: Arraylist= %d ms, Linkedlist= %d ms\n", arrayListTime, linkedListTime);
	}

	public static void compareInsertion(int numberOfElements, int numberOfOperations) {

		List<Double> arraylist = new ArrayList<>(numberOfElements);
		List<Double> linkedlist = new LinkedList<>();

		for (int i = 0; i < numberOfElements; i++) {
			arraylist.add((double) i);
			linkedlist.add((double) i);
		}

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfOperations; i++) {

			double index = (double) (Math.random() * numberOfOperations);
			arraylist.add((int) index, (double) i);
		}
		long arrayListTime = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfOperations; i++) {
			double index = (double) (Math.random() * numberOfOperations);
			linkedlist.add((int) index, (double) i);
		}
		long linkedListTime = System.currentTimeMillis() - startTime;
		System.out.printf("Insertion: Arraylist= %d ms, Linkedlist= %d ms\n", arrayListTime, linkedListTime);
	}

	public static void compareDeletion(int numberOfElements, int numberOfOperations) {

		List<Double> arraylist = new ArrayList<>(numberOfElements);
		List<Double> linkedlist = new LinkedList<>();

		for (int i = 0; i < numberOfElements; i++) {
			arraylist.add((double) i);
			linkedlist.add((double) i);
		}

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfOperations; i++) {

			double index = (double) (Math.random() * numberOfOperations);
			arraylist.remove((int) index);
		}
		long arrayListTime = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfOperations; i++) {
			double index = (double) (Math.random() * numberOfOperations);
			linkedlist.remove((int) index);
		}
		long linkedListTime = System.currentTimeMillis() - startTime;
		System.out.printf("Deletion: Arraylist= %d ms, Linkedlist= %d ms\n", arrayListTime, linkedListTime);
	}
}
