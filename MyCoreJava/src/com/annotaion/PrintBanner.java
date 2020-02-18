package com.annotaion;

import java.lang.Thread.*;

class PrintBanner
{
	public static void main(String[] args) throws Exception
	{
	  StringBuilder a= new StringBuilder("Welcome to Java");
	  for (int i =0;i<a.length() ;i++ ) 
	  {
	  	
	  	a=a.insert(0,a.charAt(a.length()-1));
	  	a=a.deleteCharAt(a.length()-1);
	  	Thread.sleep(200);	
	  	System.out.print(a+"\r");
	  }
	  
	}
}

/*
H:\IBM FullStack Training\COre java>javac PrintBanner.java

H:\IBM FullStack Training\COre java>java PrintBanner
Welcome to Java
*/