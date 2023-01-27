package com.collection;

import java.util.Stack;

/*
The stack is the subclass of Vector. It implements the last-in-first-out data structure, 
i.e., Stack. The stack contains all of the methods of Vector class and also provides its methods
like boolean push(), boolean peek(), boolean push(object o), which defines its properties.
*/

// Insertion Method : add(value), add(index, value), push(value)
// Deletion Method : remove(value), removeElementAt(index), pop
// Fetch : peek(), get(index), firstElement(), LastElement()
// Update : set(index, value)
// Search : contains()

public class StackDemo 
{
   public static void main(String args[])
   {
	   Stack<Object> st = new Stack<>();
	   st.add("Hi");
	   st.push("Hello");
	   st.push(44);
	   st.push(78);
	   st.push(56);
	   
	   for(Object o : st)
		   System.out.print(o+" ");
	   System.out.println("\n"); // For new line
	   
	   System.out.println(st.peek());
	   System.out.println(st.pop()); // removes first object means : 56
	   
	   System.out.println("\n"); // For new line
	   
	   for(Object o : st)
		   System.out.print(o+" ");
	   System.out.println("\n"); // For new line
	   
	   System.out.println(st.firstElement());
	   System.out.println(st.lastElement());
   }
}
