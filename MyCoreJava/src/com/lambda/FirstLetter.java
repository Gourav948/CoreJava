package com.lambda;

import java.util.*;
import java.util.function.*;
public class FirstLetter 
{

	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder();
		ArrayList <String> arr=new ArrayList<String>();
		arr.add("hii");
		arr.add("helloo");
		arr.add("Bye");
		arr.add("Gourav");
		arr.add("Snigdha");
		arr.add("Nikhil");
		arr.add("Surendra");
		
		/*Consumer<String> c=(String str)->sb.append(str.charAt(0));
		
		for(String str:arr)
		{
		  c.accept(str);	
		}*/
		//Alternate:
		
        Consumer<Character> cs=(Character c)->sb.append(c);
		
		for(String str:arr)
		{
		  cs.accept(str.charAt(0));	
		}
		
		System.out.println(sb);

	}

}
/*OUTPUT:
 * hhBGSNS
 */
 
