package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
	Comparator interface is useful for sort elements based on our requirement 
	It has method compare() to compare object
	Comparator interface is functional interface
*/
public class ComparatorDemo 
{
   public static void main(String args[])
   {
	   List<Integer> list = new ArrayList<>();
	   list.add(38);
	   list.add(53);
	   list.add(91);
	   list.add(79);
	   
	//   Collections.sort(list); // 38 53 79 91
	   
  // Here I want to sort the numbers based on last digit of number, results like 91 53 38 79
  // we can do it with help of comparator interface
	   
	   Comparator<Integer> cp = new Comparator<Integer>()
			   {
		            public int compare(Integer p, Integer q)
		            {
		            	return p%10>q%10?1:-1;  // +ve : change and -ve : no change
		            }
			   };
	   
	   Collections.sort(list, cp);
	   
	   // We can write it one line also
	   // Collections.sort(list, (p, q) -> { return p%10>q%10?1:-1; });
	   for(int i : list)
		   System.out.print(i+" ");
   }
}
