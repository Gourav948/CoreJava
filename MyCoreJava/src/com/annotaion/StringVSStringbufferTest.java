package com.annotaion;

class StringVSStringbuffer
{
	public static void main(String[] args) 
	{
	  String a="Hii ";
	  String b ="Hello";

	  StringBuilder c= new StringBuilder("Hii");
	  a+="hyy";
	  //c+="Byy ";
	  System.out.println(a);
	  System.out.println(c);	
	}
}