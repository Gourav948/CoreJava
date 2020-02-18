package com.annotaion;

class Date1 implements Cloneable
{
	private int day;
	private int month;
	private int year;
	public Date1(int day, int month, int year)
	{
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date1() {
		this.day = 14;
		this.month = 02;
		this.year = 2020;
	}
	@Override
	public String toString() 
	{
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	@Override
    public Object clone() throws CloneNotSupportedException {
    return super.clone();
}
}
class Employee1 implements Cloneable
{
	Date1 dob;

	public Employee1(Date1 dob) {
		this.dob = dob;
	}
	public Employee1() {
		
	}
	
	public Date1 getDob() {
		return dob;
	}
	public void setDob(Date1 dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [DOB =" + dob + "]";
	}

	@Override
	public Object clone() { 
		try 
		{

			Employee1 cloned = (Employee1)super.clone();
            cloned.setDob((Date1)cloned.getDob().clone());
			return cloned;
		} 
		catch (CloneNotSupportedException e) 
		{
			e.printStackTrace();
			return null;
		}
	}
}
class ClonableTest
{
	public static void main(String[] args) 
	{
	   Date1 dt = new Date1(12, 8, 2019);
		Employee1 e = new Employee1(dt);
		Employee1 e2 = (Employee1)e.clone();//Shallow copy
		// Shallow Copy i.e Created the Cole of Employee object only Not Date
System.out.println("Shallow: " + (e.getDob()==e2.getDob()));
	}
}

/*
OUTPUT:
fIRST COMPILED WITHOUT OVERRIDING CLONE FUNCTION
H:\IBM FullStack Training\COre java>javac ClonableTest.java
ClonableTest.java:23: error: clone() has protected access in Object
           Employee b=(Employee)a.clone();
1 error

After overriding Clone

H:\IBM FullStack Training\COre java>javac ClonableTest.java

H:\IBM FullStack Training\COre java>java ClonableTest
Employee@ed17bee
java.lang.CloneNotSupportedException: Employee
        at java.base/java.lang.Object.clone(Native Method)
        at Employee.clone(ClonableTest.java:42)
        at ClonableTest.main(ClonableTest.java:55)
null           
 

So have to implements Cloneable                              ^



*/