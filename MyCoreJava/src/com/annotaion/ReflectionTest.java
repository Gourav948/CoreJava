package com.annotaion;

import java.lang.reflect.*; 

class ReflectionTest
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
	
	//import reflection package
Class c = Class.forName("java.lang.String"); //loads the class forcefully into memory
Constructor con[] = c.getDeclaredConstructors(); //returns all constructors of String class
Method m[] = c.getDeclaredMethods(); //returns all methods of String class
Field f[] = c.getDeclaredFields();	
	}

}