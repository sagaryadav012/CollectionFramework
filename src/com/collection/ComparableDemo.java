package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
	Comparable interface is useful to sort elements, we can sort based on our requirement
	The only difference between comparator and comparable 
	- Both are same and used for sorting
	- Collections.sort method accepts Comparator object only not Comparable
	- When we don't have access to change code of some class example student at that time we can
	  use comparator to sort elements by using sort method of Collections class but we can't
	  sort using Comparable
	- Comparable only useful when we have access to change code of student class 
	
*/
public interface ComparableDemo 
{
   public static void main(String args[])
   {
	   Student s1 = new Student();
	   s1.setName("Ashok");
	   s1.setMarks(734);
	   
	   Student s2 = new Student();
	   s2.setName("Liger");
	   s2.setMarks(699);
	   
	   Student s3 = new Student();
	   s3.setName("Hema");
	   s3.setMarks(953);
	    
	   List<Student> list = new ArrayList<>();
	   list.add(s1);
	   list.add(s2);
	   list.add(s3);
	   
	   Collections.sort(list); // We have written sorting technique in student class with help of comparable interface
	   
	   for(Student s : list)
		   System.out.println(s);
	  
   }
}
