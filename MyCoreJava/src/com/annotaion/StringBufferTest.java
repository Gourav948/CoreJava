package com.annotaion;

class StringBufferTest
{
	public static void main(String[] args) 
	{
	  String a="Hii ";
	  String b ="Hello";

	  StringBuilder c= new StringBuilder("Hii");
	  a.concat(b);
	  c.append(new StringBuilder("Hello "));
	  System.out.println(a);
	  System.out.println(c);
	  
	}
}

/*
OUTPUT:
H:\IBM FullStack Training\COre java>javac StringBufferTest.java

H:\IBM FullStack Training\COre java>java StringBufferTest
Hii
HiiHello


*/