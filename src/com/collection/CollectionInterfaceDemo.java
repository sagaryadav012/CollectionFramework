package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
The Collection interface is the interface which is implemented by 
all the classes in the collection framework.
*/

public class CollectionInterfaceDemo 
{
	 public static void main(String args[])
	   {
		   Collection<Object> c = new ArrayList<>(); // Can't instantiate Collection interface
		   
		   c.add(78);
		   c.add(90);
		   c.add(32);
		   c.add("sagar");
		   c.add("cool");
		               
		   
		  // Ways to print values
		  Iterator<Object> it = c.iterator(); 
		  while(it.hasNext())
		  {
		    System.out.print(it.next()+" ");
		  }
		  
		  System.out.println("\n "); // For a new line
		   
		   for(Object values : c)
			   System.out.print(values+" ");
		   
	   }
}
