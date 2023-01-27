package com.collection;

import java.util.HashSet;

/*
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16
*/
/*
    Insertion : add(value)
    Deletion : remove(value)
    Searching : contains(value)
    
    we don't have methods for fetch specific and updation methods because set doesn't work with indexes
    
*/
public class HashSetDemo 
{
  public static void main(String args[])
  {
	  HashSet<Object> set = new HashSet<>();
	  set.add("Hello");
	  set.add(65);
	  set.add(23);
	  set.add("Hello"); // duplicate value
	  set.add(23);  // duplicate value
	  
	  for(Object o : set)
		  System.out.print(o+" ");
	  System.out.println("\n"); // For new line
	  
	  set.remove(23);
	  for(Object o : set)
		  System.out.print(o+" ");
	  System.out.println("\n"); // For new line
	  
	 System.out.println(set.contains("Hello")); // true
	 
	  
  }
}