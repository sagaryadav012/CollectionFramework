package com.collection;

import java.util.ArrayList;
import java.util.Vector;

/*
ArrayList size increases 50% once it reached it's capacity
Vector size increases 100% once it reached it's capacity
*/
public class ArrayListVsVector 
{
	public static void main(String args[])
	   {
		   ArrayList<Integer> list = new ArrayList<>(); // 50% , Not ThreadSafe, Fast
		   
		   list.add(67);
		   list.add(94);
		   list.add(56);
		   list.add(23);
		   list.add(34);
		   list.add(94);
		   list.add(56);
		   list.add(23);
		   list.add(23);
		   list.add(34);
		   list.add(94);
		   list.add(56);
		   list.add(56);
		   list.add(23);
		   list.add(23);
		   
		   System.out.println("Capacity : "+ list.size());
		   
		   Vector<Integer> v = new Vector<>(); // 100 % size , ThreadSafe, Slow
		   v.add(45);
		   v.add(65);
		   v.add(23);
		   v.add(32);
		   v.add(91);
		   v.add(45);
		   v.add(65);
		   v.add(23);
		   v.add(32);
		   v.add(91);
		   v.add(65);
		   v.add(23);
		   
		   
		   System.out.println("Capacity : "+ v.capacity());
		   
	   }
}
