package com.annotaion;

import java.util.*;
interface Sortable
{
	//void sort(Object a);
	boolean compare (Sortable a);
}
class Employee3 implements Sortable
{
	String name;
	public Employee3(String name)
	{
		this.name=name;
	}

	public boolean compare(Sortable a)
	{
		return (this.name).compareTo(((Employee3)a).name)>0;
	}
	public String toString()
	{
		return this.name+" ";
	}
}
class Circle implements Sortable
{
	int radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	public boolean compare(Sortable a)
	{
       return (this.radius)>(((Circle)a).radius);
	}
	public String toString()
	{
		return this.radius+" ";
	}
	
}
class SortableTest
{
	Scanner sc =new Scanner (System.in);

	public static void main(String[] args) 
	{
	   Employee3 a[] =new Employee3[5];
	   a[0]= new Employee3("Gourav");
	   a[1]= new Employee3("Adarsh");
	   a[2]= new Employee3("Snigdha");
	   a[3]= new Employee3("Surendra");
	   a[4]= new Employee3("Nikhil");
	   Circle b[] =new Circle[5];
	   b[0]= new Circle(6);
	   b[1]= new Circle(4);
	   b[2]= new Circle(2);
	   b[3]= new Circle(8);
	   b[4]= new Circle(1);
       Sortable c [] =a;
       Sortable c1 []= b;
       SortableTest.sortAll(c);
       SortableTest.sortAll(c1);
       for (int i=0;i<c.length ;i++ )
       {
       	System.out.println(c[i]);
       	
       }
       for (int i=0;i<c1.length ;i++ )
       {
       	System.out.println(c1[i]);
       	
       }
	}
	public static void sortAll(Sortable s[])
	{
		for(int i = 0; i<s.length-1; i++) {
         for (int j = i+1; j<s.length; j++) {
            if(s[i].compare(s[j]))
             {
               Sortable temp = s[i];
               s[i]= s[j];
               s[j] = temp;
            }
         }
      }
	}
}


