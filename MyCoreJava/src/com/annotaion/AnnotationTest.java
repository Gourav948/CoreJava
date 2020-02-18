package com.annotaion;

interface Base
{
	@Deprecated
	int x=10;
	 void print(); 
}
class AnnotationTest implements Base
{
	@Override
	public void print()
	{
		System.out.println("Overriden Print From Base");
	}
	@SuppressWarnings({"deprecation", "static-access"})
	public static void main(String[] args) 
	{
	    Base a = new AnnotationTest();
	    a.print();
	    System.out.println(a.x);	
	}
}
/*
OUTPUT:
When used wrong name of Overriden Method

H:\IBM FullStack Training\COre java>javac AnnotationTest.java
AnnotationTest.java:7: error: AnnotationTest is not abstract and does not override abstract method print() in Base
class AnnotationTest implements Base
^
AnnotationTest.java:9: error: method does not override or implement a method from a supertype
        @Override
        ^
Using a Deprecated Api        
Note: AnnotationTest.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
2 errors


After using @SupressWarnings({Deprecated})
H:\IBM FullStack Training\COre java>javac AnnotationTest.java

H:\IBM FullStack Training\COre java>java AnnotationTest
Overriden Print From Base
10


*/
