package com.annotaion;

class Date
{
	private int day;
	private int month;
	private int year;
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
	/*public void setDay(int day)
	{
		this.day=day;
	}

	public void setMonth(int month)
	{
		this.month=month;
	}

	public void setYear(int year)
	{
		this.year=year;
	}
	public int getDay()
	{
		return this.day;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getYear()
	{
		return this.year;
	}*/
	public String toString()
	{
		return this.day+"-"+this.month+"-"+this.year;
	}
	public static void swapDate(Date [] d)
	{
		Date temp =d[0];

	}
}
class DateTest
{
	public static void main(String[] args) 
	{
	  Date a [] =new Date[2];
	  a[0] =new Date(12,02,2020);
	  a[1] =new Date(01,01,2020);
	  System.out.println("Date a[0] ="+ a[0]);	
	  System.out.println("Date a[1] ="+ a[1]);
	  System.out.println("After Swapping Date");
	  Date.swapDate(a);
	  System.out.println("Date a[0]="+ a[0]);
	  System.out.println("Date b[0]="+ a[1]);
	}
}


/*

OUTPUT:
H:\IBM FullStack Training\COre java>javac DateTest.java

H:\IBM FullStack Training\COre java>java DateTest
Date a[0] =12-2-2020
Date a[1] =1-1-2020
After Swapping Date
Date a[0]=12-2-2020
Date b[0]=1-1-2020


*/