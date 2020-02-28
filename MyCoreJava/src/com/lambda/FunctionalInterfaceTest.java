package com.lambda;

import java.util.*;
import java.util.Random;
import java.util.function.*;

public class FunctionalInterfaceTest {

	public static void main(String[] args) 
	{
		ArrayList <String> arr=new ArrayList<String>();
		arr.add("hii");
		arr.add("helloo");
		arr.add("Bye");
		arr.add("Gourav");
		arr.add("snigdha");
		arr.add("Nikhil");
		arr.add("surendra");
		Consumer<String> consumer = (String x)->System.out.println(x);
		
		 for(String str: arr)
		 {
			 consumer.accept(str);
		 }
		
		Predicate<String> startsWithUpperCase=(String s) -> Character.isUpperCase(s.charAt(0));
		for(String str :arr)
		{
		if(startsWithUpperCase.test(str))
			System.out.println(str);
		}
		
		Supplier<String> supplier = () -> arr.iterator().toString();
		
		
		
	}

}
