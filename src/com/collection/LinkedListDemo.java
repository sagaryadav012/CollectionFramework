package com.collection;

import java.util.LinkedList;

/*
	LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. 
	It can store the duplicate elements. 
	It maintains the insertion order and is not synchronized. 
	In LinkedList, the manipulation is fast because no shifting is required.
*/
public class LinkedListDemo 
{
   public static void main(String args[])
   {
	   LinkedList<Object> list = new LinkedList<>();
	   list.add(33);
	   list.add("Sagar Yadav");
	   list.add(99);
	   list.add(12);
	   list.add("Welcome");
	   
	   // Check ArrayListDemo class for how many ways to print values
	   
	   // Enhanced for loop : Easy way
	   for(Object o : list)
		   System.out.print(o+" ");
   }
}
