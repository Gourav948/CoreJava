package com.annotaion;

interface Printable
{
	String print();
}
class Employee2 implements Printable
{
	public String print()
	{
		return "Printing Employee";
	}
}
class Circle1 implements Printable
{
	public String print()
	{
		return "Printing Circle";
	}
}
class InterfaceTest 
{
	public static void main(String[] args) 
	{
		Printable a[] = new Printable[2];
		a[0]=new Employee2();
		a[1]=new Circle1();
		InterfaceTest.printAll(a);
	}
	public static void  printAll(Printable [] a)
	{
	 	for (int i=0;i<a.length;i++) 
	 	{
	 		System.out.println(a[i].print());
	 	}
	 }
}

