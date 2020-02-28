package com.collection;

import java.util.*;


class PersonSort implements Comparator<Person>
{

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.weight > p2.weight) 
		{
			return -1;
		}
		else if(p1.weight < p2.weight) 
		{
			return 1;
		}
		else
		{
			if(p1.height > p2.height) 
			{
				return -1;
			}
			else if(p1.height < p2.height) 
			{
				return 1;
			}
			else
				return 0;
		}
	}
	
}

class Person implements Comparable<Person>
{
	String name;
	double height;
	double weight;
	
	public Person() 
	{
		super();
	}

	public Person(String name,  double weight,double height)
	{
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
    
	@Override
	public String toString() 
	{
		return "Person [Name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}
    @Override
	public int compareTo(Person p) 
    {
		if(this.weight > p.weight) 
		{
			return 1;
		}
		else if(this.weight < p.weight) 
		{
			return -1;
		}
		else
		{
			if(this.height > p.height) 
			{
				return 1;
			}
			else if(this.height < p.height) 
			{
				return -1;
			}
			else
				return 0;
		}
	}
	
	
}

public class TreeSetTest 
{

	public static void main(String[] args) 
	{
		System.out.println("\t\tUsing TreeSet comparable interface");
		Set <Person> tss =new TreeSet<Person>();
		tss.add(new Person("Gourav",60,5.5));
		tss.add(new Person("Surendra",70,5.1));
		tss.add(new Person("Snigdha",40,4.5));
		tss.add(new Person("Nikhil",60,5.2));
		tss.add(new Person("Rahul",63,5));
		
		Iterator<Person> itr0 = tss.iterator();
		while(itr0.hasNext()) 
		{
			Person a = itr0.next();
			System.out.println(a);
		}
		System.out.println("Ascending Order of Insertion maintained");
		System.out.println();
		System.out.println();
		System.out.println("\t\tUsing TreeSet comparator interface");
		System.out.println();
		Set <Person> ts =new TreeSet<Person>(new PersonSort());
		ts.add(new Person("Gourav",60,5.5));
		ts.add(new Person("Surendra",70,5.1));
		ts.add(new Person("Snigdha",40,4.5));
		ts.add(new Person("Nikhil",60,5.2));
		ts.add(new Person("Rahul",63,5));
		
		Iterator<Person> itr = ts.iterator();
		while(itr.hasNext()) 
		{
			Person a = itr.next();
			System.out.println(a);
		}
		System.out.println("Descending Order of Insertion maintained");
		System.out.println();
		System.out.println("\t\tUsing HashSet");
		System.out.println();
		Set <Person> hs =new HashSet<Person>();
		hs.add(new Person("Gourav",60,5.5));
		hs.add(new Person("Surendra",70,5.1));
		hs.add(new Person("Snigdha",40,4.5));
		hs.add(new Person("Nikhil",60,5.2));
		hs.add(new Person("Rahul",63,5));
		
		Iterator<Person> itr1 = hs.iterator();
		while(itr1.hasNext()) 
		{
			Person a = itr1.next();
			System.out.println(a);
		}
		System.out.println("Order of Insertion 'Not' maintained");
		System.out.println();
		System.out.println("\t\tUsing LinkedHashSet");
		System.out.println();
		Set <Person> lhs =new LinkedHashSet<Person>();
		lhs.add(new Person("Gourav",60,5.5));
		lhs.add(new Person("Surendra",70,5.1));
		lhs.add(new Person("Snigdha",40,4.5));
		lhs.add(new Person("Nikhil",60,5.2));
		lhs.add(new Person("Rahul",63,5));
		
		Iterator<Person> itr2 = lhs.iterator();
		while(itr2.hasNext()) 
		{
			Person a = itr2.next();
			System.out.println(a);
		}
		System.out.println("Order of Insertion maintained");
		System.out.println();
		System.out.println();
		
		System.out.println("ArrayList In ReverseOrder using ListIterator");
		ArrayList < Integer > numbers = new ArrayList < Integer > ();  
        numbers.add(23);  
        numbers.add(12);  
        numbers.add(8);
        numbers.add(51);
        numbers.add(99);
        ListIterator < Integer > listIterator = numbers.listIterator();
        System.out.println("Original List");
			while (listIterator.hasNext()) 
				{  
				System.out.println(listIterator.next());  
				}  
			 System.out.println("In Backwarad Direction ");
			while (listIterator.hasPrevious()) 
			{  
				System.out.println(listIterator.previous());  
			}  
		
		
	}

}
