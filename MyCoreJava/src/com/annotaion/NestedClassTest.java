package com.annotaion;

import java.util.*;
import java.sql.*;

class MyApp
{
	private static class Cache
	{
	public static HashMap<Integer,String> map=new HashMap<Integer,String>();   
	 public static void addData(int a,String b)
	 {
	 	map.put(a,b);
	 }
	 public static String getData (int a)
	 {
	 	return map.get(a);
	 }
   }
       public void addData(int a,String b)
		{
			MyApp.Cache.addData(a,b);
		}
		public String getData(int a)
		{
			return MyApp.Cache.getData(a);
		}
}
class NestedClassTest
{
public static void main(String[] args) 
		{		
		MyApp a=new MyApp();	
		a.addData(101,"Gourav");
		a.addData(105,"Surendra");
		Timestamp ts = new Timestamp(10000); 
        System.out.println("Timestamp time : "+ ts.toString()); 
		a.addData(104,"Nikhil");
		a.addData(103,"Snigdha");
		System.out.println(a.getData(104));
	    }
}