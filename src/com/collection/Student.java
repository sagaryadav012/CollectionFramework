package com.collection;

public class Student implements Comparable<Student>
{
   private String name;
   private int marks;
   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.marks<s.marks?1:-1;  // Descending order
	}
   
}
