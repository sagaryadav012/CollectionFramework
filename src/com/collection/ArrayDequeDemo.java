package com.collection;

import java.util.ArrayDeque;

/*
	ArrayDeque class implements the Deque interface. 
	It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.
	ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
*/
/*
    Insertion : add(value), addAll(Collection), addFirst(), addLast(), push(value);
    add() : inserts element at last of deque
    push() : inserts element at front of the deque
    
    Deletion : remove(value), removeAll(Collection), removeFirst(), removeLast(), removeFirstOccurrence(), 
               removeLastOccurrence(), poll(), pollFirst(), pollLast(), pop(), clear();
    Search : contains(value), containsAll(Collection)
    
    Fetch : peek(), peekFirst(), peekLast()
    

*/
public class ArrayDequeDemo 
{
   public static void main(String args[])
   {
	   ArrayDeque<Object> ad = new ArrayDeque<>();
	   
	   ad.add("Oneplus");
	   ad.add("Nothing");
	   ad.add("Apple");
	   ad.add(98);
	   ad.add("Nothing");
	   ad.add("Apple");
	   
	   for(Object o : ad)
		   System.out.print(o+" ");
	   System.out.println("\n"); // for new line
	   
	   ad.addFirst("Jio_Phone");
	   ad.addLast("LG");
	   for(Object o : ad)
		   System.out.print(o+" ");
	   System.out.println("\n"); // for new line
	   
	   ad.remove("LG");  // update queue  : Jio_phone, Oneplus, Nothing, Apple, 98, Nothing, Apple
	   ad.removeFirst(); // removes : Jio_Phone
	   ad.removeLast();  // removes : Apple
	   
	   for(Object o : ad)
		   System.out.print(o+" ");  // Update Queue : Oneplus, Nothing, Apple, 98, Nothing
	   System.out.println("\n"); // for new line
	   
	   ad.add(98); // update Queue : Oneplus, Nothing, Apple, 98, Nothing, 98
	   
	   ad.removeFirstOccurrence("Nothing");
	   ad.removeLastOccurrence(98);
	   
	   for(Object o : ad)
		   System.out.print(o+" "); // updated queue : Oneplus, apple, 98, Nothing
	   System.out.println("\n");
	   
	   System.out.println(ad.contains("Apple")); //true;
	   System.out.println(ad.getFirst()); // Oneplus
	   System.out.println(ad.getLast()); // Nothing
	   
	   System.out.println(ad.peek()); // Oneplus
	   System.out.println(ad.peekFirst()); // Oneplus
	   System.out.println(ad.peekLast()); // Nothing
	   
	   System.out.println(ad.poll()); // removes Oneplus
	   System.out.println(ad.pollFirst()); // removes Apple
	   System.out.println(ad.pollLast()); // removes Nothing
	   
	   System.out.println("\n");
	   
	   for(Object o : ad)
		   System.out.print(o+" "); // updated queue : 98
	   System.out.println("\n");
	   
	   System.out.println(ad.isEmpty()); // false
	   ad.clear();
	   System.out.println(ad.isEmpty()); // true
	   
	   
	   
   }
}
