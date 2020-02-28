package com.lambda;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class UpperCaseEquivalent {

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
		
		System.out.println("\t\tOriginal List");
		for(String str : arr)
		{
			System.out.println(str);
		}
		System.out.println("\n\n");
		//UnaryOperator<String> uo=(String str)->str.toUpperCase();//Using Lambda Expression
		UnaryOperator<String> uo=String::toUpperCase;//Using Method references
		arr.replaceAll(uo);
		System.out.println("\t\tAfter modification");
		for(String str : arr)
		{
			System.out.println(str);
		}
	}

}


/*
 * OUTPUT:
 * 		Original List
hii
helloo
Bye
Gourav
Snigdha
Nikhil
Surendra



		After modification
HII
HELLOO
BYE
GOURAV
SNIGDHA
NIKHIL
SURENDRA
 * 
 */
