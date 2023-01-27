package com.collection;

import java.util.LinkedList;

/*
For Insertion : add(value), add(index, value), addFirst(value), addLast(value)
For Deletion : remove(), remove(index), removeFirst(), removeLast(), removeFirstOccurance(), 
               removeLastOccurance(), poll(), pollFirst(), pollLast()
For Fetch : get(index), getFirst(), getLast(), peek(), peekFirst(), peekLast()
For Update : set(index, value)
For Search : contains(value)
*/
public class LinkedListMethods  
{
   public static void main(String args[])
   {
	   LinkedList<Object> list = new LinkedList<>();
	   
	   // Insertion Methods
	   
	   list.add("Weird");
	   list.add(56);
	   list.add(78);
	   list.add('S');
	  
	   
	   for(Object o : list)
		   System.out.print(o+" ");  // Weird 56 78 S
	   
	   System.out.println("\n ");  // for a new line
	   
	   list.add(2, "Something");
	   for(Object o : list)
		   System.out.print(o+" "); // Weird 56 Something 78 S 
	   
	   System.out.println("\n ");  // for a new line
	   
	   list.addFirst("Happened"); // Happened added at first
	   list.addLast("Know?"); // Know? added at last
	   for(Object o : list)
		   System.out.print(o+" "); // Happened Weird 56 Something 78 S Know?
	   
	   System.out.println("\n ");  // for a new line
	   
	   // Deletion Methods
	   
	   list.remove(); // It retrieves and delete head of the list, means Happened will be removed
	   // now updated list is : Weird 56 Something 78 S Know?
	   
	   list.remove(1); // removes at index 1 means 56;
	// now updated list is : Weird Something 78 S Know?
	   
	   list.removeFirst(); // removes First element, means : Weird
	// now updated list is : Something 78 S Know?
	   
	   list.removeLast(); // removes Last element, means : Know?
	// now updated list is : Something 78 S
	   
	   list.addLast("Something");
	   list.addFirst('S');
	   
	// now updated list is : S Something 78 S Something
	   
	   list.removeFirstOccurrence("Something"); // updated list : S 78 S Something
	   list.removeLastOccurrence('S'); // // updated list : S 78 Something
	   
	   for(Object o : list)
		   System.out.print(o+" ");
	   System.out.println("\n ");  // for a new line
	   
	   // Fetch methods 
	   System.out.println(list.get(1)); // 78
	   System.out.println(list.getFirst()); // S
	   System.out.println(list.getLast()); // Something
	   System.out.println(list.peek()); // S
	   System.out.println(list.peekFirst()); // S
	   System.out.println(list.peekLast()); // Something
	   
	   // update method
	   System.out.println(list.set( 1, 87)); // return 78 old value
	   for(Object o : list)
		   System.out.print(o+" ");
	   System.out.println("\n ");  // for a new line
	   
	  System.out.println(list.contains('S')); // true;
	  System.out.println(list.isEmpty()); // false
	  
	  list.clear(); // removes all elements from list

	  System.out.println(list.isEmpty()); // true
	  
	  
	  
	  
   }
}
