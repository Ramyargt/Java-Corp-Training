package com.rgt.training.session4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionComparision {

	private static Long getMemoryUsage() {
		Runtime runtime= Runtime.getRuntime();
		return runtime.totalMemory()-runtime.freeMemory();
	}
	
	public static void main(String[] args) {
		List<Double>arraylist=new ArrayList<>();
		List<Double>linkedlist=new LinkedList<>();
		
		Map<Integer,String>hashmap= new HashMap<>();
		Map<Integer,String>treemap= new TreeMap<>();
		
		Set<String>hashset= new HashSet<>();
		Set<String>treeset= new TreeSet<>();
		
		long startTime,endTime;
		long memoryBefore,memoryAfter;
		
		startTime=System.nanoTime();
		memoryBefore=getMemoryUsage();
		
		for(int i=0; i<100000; i++) {
		arraylist.add((double) i);
		}
		
		endTime=System.nanoTime();
		memoryAfter=getMemoryUsage();
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("ArrayList : Linear time complexity is: "+(endTime-startTime) + " ns");
		System.out.println("ArrayList : memory complexity is: "+(memoryAfter-memoryBefore)+ " bytes");
		System.out.println("--------------------------------------------------------------------------------");
		
		startTime=System.nanoTime();
		memoryBefore=getMemoryUsage();
		
		for(int i=0; i<100000; i++) {
			linkedlist.add((double) i);
		}
		
		endTime=System.nanoTime();
		memoryAfter=getMemoryUsage();
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("LinkedList : Linear time complexity is: "+(endTime-startTime)+ " ns");
		System.out.println("LinkedList : memory complexity is: "+(memoryAfter-memoryBefore)+ " bytes");
		System.out.println("--------------------------------------------------------------------------------");
		
		startTime=System.nanoTime();
		memoryBefore=getMemoryUsage();
		
		for(int i=0; i<100000; i++) {
			hashmap.put(i, "value:"+i);
		}
		
		endTime=System.nanoTime();
		memoryAfter=getMemoryUsage();
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Hashmap : Linear time complexity is: "+(endTime-startTime)+ " ns");
		System.out.println("Hashmap : memory complexity is: "+(memoryAfter-memoryBefore)+ " bytes");
		System.out.println("--------------------------------------------------------------------------------");
		
		startTime=System.nanoTime();
		memoryBefore=getMemoryUsage();
		
		for(int i=0; i<100000; i++) {
			treemap.put(i, "value:" +i);
		}
		
		endTime=System.nanoTime();
		memoryAfter=getMemoryUsage();
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("TreeMap : Linear time complexity is: "+(endTime-startTime)+ " ns");
		System.out.println("TreeMap : memory complexity is: "+(memoryAfter-memoryBefore)+ " bytes");
		System.out.println("--------------------------------------------------------------------------------");
		
		startTime=System.nanoTime();
		memoryBefore=getMemoryUsage();
		
		for(int i=0; i<100000; i++) {
			hashset.add("value:" +i);
		}
		
		endTime=System.nanoTime();
		memoryAfter=getMemoryUsage();
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("HashSet : Linear time complexity is: "+(endTime-startTime)+ " ns");
		System.out.println("HashSet : memory complexity is: "+(memoryAfter-memoryBefore)+ " bytes");
		System.out.println("--------------------------------------------------------------------------------");
		
		startTime=System.nanoTime();
		memoryBefore=getMemoryUsage();
		
		for(int i=0; i<100000; i++) {
			treeset.add("value:" +i);
		}
		
		endTime=System.nanoTime();
		memoryAfter=getMemoryUsage();
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("TreeSet : Linear time complexity is: "+(endTime-startTime)+ " ns");
		System.out.println("Treeset : memory complexity is: "+(memoryAfter-memoryBefore)+ " bytes");
		System.out.println("--------------------------------------------------------------------------------");
		
		
	}

}
