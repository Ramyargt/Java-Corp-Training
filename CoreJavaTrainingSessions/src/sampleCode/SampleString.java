package sampleCode;

import java.util.Scanner;

public class SampleString {
	static int	i=0;
	static String[] array= new String[3];
	public static String name;
	static boolean duplicatename;
	
	public static void addname(String Name) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<=i; j++) {
		if(array[j]!=null) {
		 duplicatename= array[j].equalsIgnoreCase(Name);
		}
		if(duplicatename)
			System.out.println("name already exists-----------"+Name);
	}
		
		}
		 
		/*
		 * else { array[i]=name; System.out.println("name added ----------"); i++; }
		 */
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc= new Scanner(System.in);
		 * System.out.println("Enter string name --------"); name= sc.next();
		 * addname(name);
		 */
		String arr= "Ramya"+"Krishna";
		System.out.println(arr);
		
	}
	

}


/*
 * for (int j=0;j<=i; j++) { if(array[i-j].equalsIgnoreCase(Name)) {
 * System.out.println("name already exists-----------");
 * System.out.println("Try with other name-----"); }
 * 
 * if(i<=array.length){ array[i]=name; i++;
 * System.out.println("name added ----------"); } }
 */	