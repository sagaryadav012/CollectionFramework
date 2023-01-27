package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
	Java HashMap contains values based on the key.
	Java HashMap contains only unique keys.
	Java HashMap may have one null key and multiple null values.
	Java HashMap is non synchronized.
	Java HashMap maintains no order.
	The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
*/

/*
     Insertion : put(k,v)
     Deletion : remove(k), clear()
     Searching : containsKey(key), containsValue(value)
     Fetch : get(k) : returns value
     Update : replace(k,v), replace(key, Old V, New V)
     
*/
public class HashMapDemo 
{
   public static void main(String args[])
   {
	  HashMap<Integer, String> map = new HashMap<>();
	  map.put(348, "Airtel");
	  map.put(345, "Idea");
	  map.put(249, "Jio");
	  map.put(250, "BSNL");
	  
	  // Two ways to print values
	  // MEthod 1
//	  Set<Integer> keys = map.keySet();
//	  for(int i : keys)
//		  System.out.println(i+" : "+map.get(i));
	  
	  // Method 2
	  for(Map.Entry<Integer, String> m : map.entrySet())
		  System.out.println(m.getKey()+" : "+m.getValue());
	  
	  map.remove(345);
	  for(Map.Entry<Integer, String> m : map.entrySet())
		  System.out.println(m.getKey()+" : "+m.getValue());
	  
	  System.out.println(map.containsKey(250)); // true
	  System.out.println(map.containsKey(345)); // false
	  System.out.println(map.containsValue("Airtel")); // true
	  System.out.println(map.containsValue("Idea")); // false
	  
	  System.out.println(map.replace(250, "Uninor")); // return old value
	  System.out.println(map.replace(348, "Airtel", "Docomo")); // return true
	  
	  for(Map.Entry<Integer, String> m : map.entrySet())
		  System.out.println(m.getKey()+" : "+m.getValue());
	  
	  System.out.println(map.isEmpty()); // false
	  map.clear();
	  System.out.println(map.isEmpty()); //true
	  
   }
}
