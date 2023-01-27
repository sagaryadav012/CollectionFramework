package com.collection;

import java.util.ArrayList;

/*
	For insertion : add(value), add(index, value)
	For deletion : remove(index)
	For searching : contains(value)
	For replacement(update) : set(index, new value) return old value
	For Fetch : get(index)
*/

public class ArrayListMethods 
{
   public static void main(String args[])
   {
	   ArrayList<Integer> list = new ArrayList<>();
	   list.add(88);
	   list.add(33);
	   list.add(55);
	   list.add(11);
	   list.add(66);
	   
	   for(int i : list)
		   System.out.print(i+" "); // 88 33 55 11 66
	   
	   System.out.println("\n "); // for new line
	   
	   list.add(3, 22); 
	   for(int i : list)
		   System.out.print(i+" "); // 88 33 55 22 11 66
	   
	   System.out.println("\n "); // for new line
	   
	   list.remove(4); // removing element by index number
	   for(int i : list)
		   System.out.print(i+" "); // 88 33 55 22 66
	   
	   System.out.println("\n "); // for new line
	   
	   System.out.println(list.contains(33)); // return true as list have 33 value
	   
	   
	   // set replaces the value at given index with given value  and returns old value
	   System.out.println(list.set(1, 65)); // 33 replaced by 65 so returns 33
	   for(int i : list)
		   System.out.print(i+" ");  // 88 65 55 22 66 
	   
	   System.out.println("\n "); // for new line
	   
	   System.out.println(list.size()); // 5
	   System.out.println(list.isEmpty()); // false
	   list.clear(); // removed all elements in list
	   System.out.println(list.isEmpty()); // true
	   
	   
	   
   }
}
