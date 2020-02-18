package com.annotaion;

class StringEqualsTest
{
	public static void main(String[] args) 
	{
	   String a ="ABC";
	   String b ="ABC";
	   String c= new String("ABC");
	   String d= new String("abc");
       
       System.out.println("Using == a & b "+ (a==b));
       System.out.println("Using == a & c "+ (a==c));
       System.out.println("Using .equals a & b "+ a.equals(b));
       System.out.println("Using .equals a & c "+ (a.equals(c)));
       System.out.println("Using .equals a & d "+ (a.equals(d)));
       System.out.println("Using .equalsIgnoreCase a & d "+ (a.equalsIgnoreCase(c)));
       
	}
}

/*
OUTPUT:

H:\IBM FullStack Training\COre java>javac StringEqualsTest.java

H:\IBM FullStack Training\COre java>java StringEqualsTest
Using == a & b true
Using == a & c false
Using .equals a & b true
Using .equals a & c true
Using .equals a & d false
Using .equalsIgnoreCase a & d true

*/
