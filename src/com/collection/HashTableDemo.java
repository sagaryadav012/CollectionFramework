package com.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*
	A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
	Java Hashtable class contains unique elements.
	Java Hashtable class doesn't allow null key or value.
	Java Hashtable class is synchronized.
	The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
*/
/*
     Insertion : put(k,v)
     Deletion : remove(k), remove(k,v), clear()
     Update : replace(k,v), replace(k, old V, new V)
     Search : containsKey(k), containsValue(v)
     Fetch : get(k)
*/
public class HashTableDemo 
{
   public static void main(String args[])
   {
	   Hashtable<Integer, String> table = new Hashtable<>();
	   table.put(559, "Sagar");
	   table.put(548, "Sharath");
	   table.put(575, "Prakash Raj");
	   table.put(564, "Sai Ram");
	   
	   Set<Integer> keys =table.keySet();
	   
	   for(int key : keys)
		   System.out.println(key+" : "+table.get(key));
	   
	   System.out.println(table.remove(559)); // return value : Sagar
	   System.out.println(table.remove(564, "Sai Ram")); // return boolean true 
	   
	   for(int key : keys)
		   System.out.println(key+" : "+table.get(key));
	   System.out.println("\n"); // for new line
		   
	   System.out.println(table.replace(548, "Sharath Goud")); // return old value : sharath
	   System.out.println(table.replace(575, "Prakash Raj", "Akhila")); // return boolean : true
	   
	   for(int key : keys)
		   System.out.println(key+" : "+table.get(key));
	   System.out.println("\n"); // for new line
	   
	   System.out.println(table.containsKey(575)); // true
	   System.out.println(table.containsValue("Sharath Goud")); // true
	   
	   System.out.println(table.get(548)); // Sharath Goud
	   
	   System.out.println(table.isEmpty()); // false
		  table.clear();
		  System.out.println(table.isEmpty()); // true
	   
	   
   }
}
