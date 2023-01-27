package com.collection;

import java.util.LinkedHashMap;
import java.util.Set;

/*
	Java LinkedHashMap contains values based on the key.
	Java LinkedHashMap contains unique elements.
	Java LinkedHashMap may have one null key and multiple null values.
	Java LinkedHashMap is non synchronized.
	Java LinkedHashMap maintains insertion order.
	The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
*/
/*
    Insertion : put(K,V)
    Deletion : remove(key)
    Searching : contains(k), contains(V)
    Fetch : get(k)
    Update : replace(k,v) : return old value and replace(k,old V, New V) : return boolean
    
    
*/
public class LinkedHashMapDemo 
{
  public static void main(String args[])
  {
	  LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
	  map.put(3, "Nothing");
	  map.put(2, "Oneplus");
	  map.put(4, "Samsung");
	  
	  Set<Integer> keys = map.keySet();
	  
	  for(int key : keys)
		  System.out.println(key+" : "+map.get(key));
	  
	  System.out.println("\n");
	  
	  map.remove(4);
	  for(int key : keys)
		  System.out.println(key+" : "+map.get(key));
	  
	 System.out.println(map.containsKey(3)); // true
	 System.out.println(map.containsValue("Oneplus")); // true
	 
	 System.out.println(map.replace(3, "Apple")); // return old value : Nothing
	  System.out.println(map.replace(2, "Oneplus", "Redmi")); // return true
	  
	  for(int key : keys)
		  System.out.println(key+" : "+map.get(key));
	  
	  System.out.println(map.isEmpty()); // false
	  map.clear();
	  System.out.println(map.isEmpty()); //true
	  
  }
}

