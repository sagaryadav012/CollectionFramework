package com.collection;

import java.util.TreeSet;

/*
	Java TreeSet class contains unique elements only like HashSet.
	Java TreeSet class access and retrieval times are quiet fast.
	Java TreeSet class doesn't allow null element.
	Java TreeSet class is non synchronized.
	Java TreeSet class maintains ascending order.
*/

/*
	Insertion : add(value)
	Deletion : remove(value), clear()
	Searching : contains(value)
	
	we don't have methods for fetch specific and updation methods because set doesn't work with indexes

*/

public class TreeSetDemo 
{
    public static void main(String agrs[])
    {
    	TreeSet<Integer> set = new TreeSet<>();
    	set.add(45);
    	set.add(68);
    	set.add(23);
    	set.add(45); // duplicate value
    	set.add(90);
    	
    	for(int i : set)
    		System.out.print(i+" "); // Values in ascending order
    	System.out.println("\n "); // new line
    	
    	set.remove(45);
    	for(int i : set)
    		System.out.print(i+" ");
    	System.out.println("\n "); // new line
    	
    	System.out.println(set.contains(68)); // true
    	
    	
    }
}

