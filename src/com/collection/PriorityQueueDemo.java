package com.collection;

import java.util.PriorityQueue;

/*
	The PriorityQueue class implements the Queue interface. 
	It holds the elements or objects which are to be processed by their priorities. 
	PriorityQueue doesn't allow null values to be stored in the queue.
*/
/*
	Insertion : add(value), addAll(Collection)
	Deletion : remove(value), removeAll(Collection), poll()
	Searching : contains(value), containsAll(Collection)
	Fetch : peek(), element() :: element() throws exception but peek() gives null if queue is empty
*/

public class PriorityQueueDemo 
{
   public static void main(String args[])
   {
	   PriorityQueue<Object> pq = new PriorityQueue<>();
	   
	   pq.add("Nothing");
	   pq.add("Oneplus");
	   pq.add("Apple");
	   pq.add("Samsung");
	   
	   for(Object o : pq)
		   System.out.print(o+" ");
	   
	   System.out.println("\n"); // For new line
	   
	   pq.remove("Samsung");
	   for(Object o : pq)
		   System.out.print(o+" ");
	   System.out.println("\n"); // For new line
	   
	  System.out.println(pq.contains("Oneplus")); // true
	  
	  System.out.println(pq.peek()); // Apple
	  System.out.println(pq.poll());  // removes Head(Apple)
	  
	  for(Object o : pq)
		   System.out.print(o+" ");
	  System.out.println("\n"); // For new line
	  
	  System.out.println(pq.element()); // Retrieves Head : Nothing
	  
	  System.out.println(pq.isEmpty()); // False
	  pq.clear();
	  System.out.println(pq.isEmpty());  // True
	   
	   
   }
}
