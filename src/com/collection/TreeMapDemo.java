package com.collection;

import java.util.Map;
import java.util.TreeMap;
/*
	Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
	Java TreeMap contains only unique elements.
	Java TreeMap cannot have a null key but can have multiple null values.
	Java TreeMap is non synchronized.
	Java TreeMap maintains ascending order.
*/

/*
	Insertion : put(k,v)
	Deletion : remove(k), clear()
	Searching : containKey(k), containsValue(v)
	Fetch : get(k), lowerKey(k), higherKey(k),
	Update : replace(k,v), replace(k, old V, new V)
*/

public class TreeMapDemo 
{
  public static void main(String args[])
  {
	  TreeMap<Integer,String> map = new TreeMap<>();
	  
	  map.put(5, "USA");
	  map.put(2, "China");
	  map.put(1, "India");
	  map.put(4, "Russia");
	  map.put(3, "Koria");
	  
	  for(Map.Entry<Integer, String> m : map.entrySet())
		  System.out.println(m.getKey()+" : "+m.getValue());
	  System.out.println("\n"); // for new line
	  
	  System.out.println(map.remove(3)); // removes 3 : koria
	  System.out.println(map.replace(4, "Uganda")); // returns old value : Russia
	  System.out.println(map.replace(5, "USA", "Uk")); // returns boolean : true
	  
	  for(Map.Entry<Integer, String> m : map.entrySet())
		  System.out.println(m.getKey()+" : "+m.getValue());
	  System.out.println("\n"); // for new line 
	  
		/*
		 * updated map : 1 : India, 2 : China, 4 : Uganda, 5 : Uk
		 */
	  
	  System.out.println(map.containsKey(4)); // true
	  System.out.println(map.containsValue("Uk")); // true
	  
	  System.out.println(map.lowerKey(2)); // return key less than 2
	  System.out.println(map.higherKey(4)); // return key higher than 4
	  
	  Map.Entry<Integer, String> fe = map.firstEntry();
	  System.out.println(fe.getKey()+" : "+fe.getValue()); // 1 : India
	  Map.Entry<Integer, String> le = map.lastEntry();
	  System.out.println(le.getKey()+" : "+le.getValue()); // 5 : Uk
	  
	  System.out.println(map.firstKey()); // return lowest key : 1
	  System.out.println(map.lastKey());  // return highest key : 5
	  
	  System.out.println(map.isEmpty()); // false
	  map.clear();
	  System.out.println(map.isEmpty()); // true
	  
	  
  }
}
