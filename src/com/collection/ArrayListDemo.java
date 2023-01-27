package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
	The ArrayList class implements the List interface. 
	It uses a dynamic array to store the duplicate element of different data types. 
	Java ArrayList class can contain duplicate elements.
	Java ArrayList class maintains insertion order.
	Java ArrayList class is non synchronized.
	Java ArrayList allows random access because the array works on an index basis.
	In ArrayList, manipulation is a little bit slower than the LinkedList in Java because
	a lot of shifting needs to occur if any element is removed from the array list.
*/

public class ArrayListDemo 
{
    public static void main(String args[])
    {
    	ArrayList<String> list1 = new ArrayList<>();
    	list1.add("India");
    	list1.add("UK");
    	list1.add("USA");
    	
    	// No.of ways to print values
    	// 1. Normal for loop
    	for(int i=0;i<list1.size();i++)
    		System.out.print(list1.get(i)+" ");
    	
    	System.out.println("\n"); // for new Line
    	
    	// 2. Enhanced For loop
    	for(String s : list1)
    		System.out.print(s+" ");
    	
    	System.out.println("\n"); // for new Line
    	
    	// 3. Iterator to print vlaues
    	Iterator<String> itr = list1.iterator();
    	while(itr.hasNext())      // hasNext() : It returns true if the iterator has more elements otherwise it returns false.
    		System.out.print(itr.next()+" "); // next() : It returns the element and moves the cursor pointer to the next element.
    	
    	
    }
}