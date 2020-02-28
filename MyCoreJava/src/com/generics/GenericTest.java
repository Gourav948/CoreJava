package com.generics;


import java.util.*;

class MyGeneric <T>
{
	private T t;
	public void set(T t)
	{
		this.t=t;
	}
	public T get()
	{
		return this.t;
	}
}

public class GenericTest 
{   
	//Function for Q2
	
	public static void printNumber(List <? extends Number> list)
	{
		for(Number n :list)
		{
			System.out.println(n);
		}
	}
	//Function for Q3
	
	public static void printMapKeyValues(Map<? extends Number, ?> hm)
	{
		for(Number n :hm.keySet())
		{
			System.out.println("key "+n+"  Value -"+hm.get(n));
			
		}
	}
	public static void main(String[] args) 
	{
		MyGeneric <String> a=new MyGeneric<String>();
		a.set("Hello");
		a.set("Hii");
		System.out.println(a.get());
		System.out.println();
		
		//Ques No 2
		
		List<Number>  list=new ArrayList<Number>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		GenericTest.printNumber(list);
		System.out.println();
		
		
		List<Double>  list1=new ArrayList<Double>();
		list1.add(10.2);
		list1.add(20.5);
		list1.add(30.7);
		list1.add(40.9);
		GenericTest.printNumber(list1);
		System.out.println();
		
		/*
		 * List<Character>  list2=new ArrayList<Character>();
		list2.add('H');
		list2.add('e');
		list2.add('l');
		list2.add('o');
		
		ERROR:
		GenericTest.printNumber(list2);
		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	    The method printNumber(List<? extends Number>) in the type GenericTest is not applicable for the arguments (List<Character>)

	    at com.generics.GenericTest.main(GenericTest.java:57)

		*/
		
		
		//Ques No 2
		
		
		HashMap<Number, String>  hm=new HashMap<Number,String>();
		hm.put(1, "Gourav");
		hm.put(2, "Susree");
		hm.put(3, "Nikhil");
		hm.put(4, "Snigdha");
		hm.put(5, "Rahul");
		GenericTest.printMapKeyValues(hm);
		System.out.println();
		
		HashMap<Double, Character>  hm1=new HashMap<Double,Character>();
		hm1.put(1.1, 'H');
		hm1.put(2.2, 'e');
		hm1.put(3.3, 'l');
		hm1.put(4.4, 'l');
		hm1.put(5.5, 'o');
		GenericTest.printMapKeyValues(hm1);
		System.out.println();
		
	/*  HashMap<String, Character>  hm2=new HashMap<Double,Character>();
		hm2.put("One", 'H');
		hm2.put("Two", 'e');
		hm2.put("Three", 'l');
		hm2.put("Four", 'l');
		hm2.put("Five", 'o');
		GenericTest.printMapKeyValues(hm2);
		System.out.println();
		
		ERROR:
		Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
			Type mi
h: cannot convert from HashMap<Double,Character> to HashMap<String,Character>
			The method printMapKeyValues(Map<? extends Number,?>) in the type GenericTest is not applicable for the arguments (HashMap<String,Character>)

			at com.generics.GenericTest.main(GenericTest.java:105)

		*/
	}

}
