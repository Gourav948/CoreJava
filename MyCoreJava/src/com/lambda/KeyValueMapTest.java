package com.lambda;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Consumer;

public class KeyValueMapTest 
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder();
		Map <Integer,Character> mp=new HashMap<Integer,Character>();
		mp.put(1, 'h');
		mp.put(2, 'e');
		mp.put(3, 'l');
		mp.put(4, 'l');
		mp.put(5, 'o');
        
		Consumer <Integer> intToString=(Integer i)->sb.append(i.toString());
		Consumer <Character> charToString=(Character ch)->sb.append(ch.toString());
        Set<Entry<Integer, Character>> s=mp.entrySet();  
        Iterator itr =s.iterator();
        while(itr.hasNext())
        {
        	Map.Entry<Integer, Character> entry=(Entry<Integer, Character>) itr.next();
        	intToString.accept(entry.getKey());
        	charToString.accept(entry.getValue());
        }
        System.out.println(sb);
	}

}

/*
 * OUTPUT:
 * 1h2e3l4l5o

 * 
 * */
