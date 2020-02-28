package com.collection;

import java.util.HashMap;
import java.util.Iterator;

class Date
{
	 int day;
	 int month;
	 int year;
	public Date()
	{
		this.day=12;
		this.month=02;
		this.year=2020;
	}
	public Date(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	@Override
	public int hashCode()
	{
		return this.day;
	}
	@Override
	public boolean equals(Object obj) 
    { 
        if (this.day==((Date)obj).day)
        	if (this.month==((Date)obj).month)
        			return true;
        return false;
        
    } 
	@Override
	public String toString()
	{
		return this.day+"-"+this.month+"-"+this.year;
	}
	
}
public class HashMapTest 
{

	public static void main(String[] args) 
	{
         HashMap<Date,String> hm= new HashMap<Date,String>();
         hm.put(new Date(15,03,1999), "Gourav");
         hm.put(new Date(23,12,1998), "Nikhil");
         hm.put(new Date(2,07,1999), "Surendra");
         hm.put(new Date(15,03,1998), "Gourav1");
         hm.put(new Date(2,07,1997), "Animesh");
         
         Iterator<Date> itr = hm.keySet().iterator();
 		while(itr.hasNext()) 
 		{
 			Date d = itr.next();
 			System.out.println(d);
 		}
 		System.out.println();
 		for(Date dt : hm.keySet()) 
        { 
            System.out.println(hm.get(dt)); 
        } 
  
		
	}

}

/*
 * OUTPUT:
 * 2-7-1999
23-12-1998
15-3-1999

Animesh
Nikhil
Gourav1


We observe that Since Year case is ignored It wrongly maintains the data 
i.e. Keeps the previous value of Date but updates 
 * 
 * */
