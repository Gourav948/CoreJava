package com.lambda;
import java.util.*;
import java.util.function.*;
public class WordTest 
{

	public static void main(String[] args) 
	{
		ArrayList <String> arr=new ArrayList<String>();
		arr.add("hii");
		arr.add("helloo");
		arr.add("Bye");
		arr.add("Gourav");
		arr.add("Snigdha");
		arr.add("Nikhil");
		arr.add("Surendra");
		System.out.println("Original List");
		for(String a :arr)
		{
			System.out.println(a);
		}
		System.out.println("\n\n");
		System.out.println("After modification");
		Predicate <String> p=(String str)->str.length()%2!=0;
         
		arr.removeIf(p);
		for(String a :arr)
		{
			System.out.println(a);
		}
	}

}
/*
 * OUTPUT:
 * Original List
hii
helloo
Bye
Gourav
Snigdha
Nikhil
Surendra



After modification
helloo
Gourav
Nikhil
Surendra

 * */
