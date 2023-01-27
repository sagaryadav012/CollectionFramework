package com.collection;

import java.util.LinkedHashSet;

/*
	Java LinkedHashSet class contains unique elements only like HashSet.
	Java LinkedHashSet class provides all optional set operations and permits null elements.
	Java LinkedHashSet class is non-synchronized.
	Java LinkedHashSet class maintains insertion order.
*/

/*
	Insertion : add(value)
	Deletion : remove(value), clear()
	Searching : contains(value)
	
	we don't have methods for fetch specific and updation methods because set doesn't work with indexes

*/

public class LinkedHashSetDemo 
{
   public static void main(String args[])
   {
	   LinkedHashSet<Object> set = new LinkedHashSet<>();
	   set.add("Weird");
	   set.add('M');
	   set.add(45);
	   set.add(23);
	   set.add(45);  // duplicate value
	   set.add('M');  // duplicate value
	   
	   for(Object o : set)
		   System.out.print(o+" ");  // maintains insertion order
	   
	   System.out.println("\n"); // For new line
		  
		  set.remove(23);
		  for(Object o : set)
			  System.out.print(o+" ");
		  System.out.println("\n"); // For new line
		  
		 System.out.println(set.contains(45)); // true
   }
}
