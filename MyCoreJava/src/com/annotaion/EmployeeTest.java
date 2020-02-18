package com.annotaion;

class Employee
{
	private int id;
	private String name;
	private int salary;
	public Employee(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getSalary()
	{
		return this.salary;
	}
	public String toString()
	{
		return this.id +"-"+this.name+"-"+this.salary;
	}
}
class Manager extends Employee
{
private int incentive;
public Manager(int id, String name,int salary, int incentive)
{
	super(id,name,salary);
	this.incentive=incentive;
}
public int getSalary()
	{
		return super.getSalary()+this.incentive;
	}
public String toString()
	{
		return super.toString()+"-"+this.incentive;
	}
}
class Labour extends Employee
{
	private int overtime;
	public Labour(int id, String name,int salary, int overtime)
{
	super(id,name,salary);
	this.overtime=overtime;
}
public int getSalary()
	{
		return super.getSalary()+this.overtime;
	}
public String toString()
	{
		return super.toString()+"-"+this.overtime;
	}
}
class EmployeeTest
{
	public static void main(String[] args) 
	{
		Employee e[]=new Employee[4];
		e[0] = new Manager(101,"Gourav",20000,5000);
		e[1] = new Manager(104,"Surendra",50000,10000);
		e[2] = new Labour(201,"Nikhil",5000,500);
		e[3] = new Labour(301,"Snigdha",7000,1000);
		System.out.println("Total Salary ="+EmployeeTest.totalSalary(e));
	}
	public static int totalSalary(Employee e[])
	{
		int sal=0;
		for (int i=0;i<e.length ;i++ ) 
		{
			sal+=e[i].getSalary();
			System.out.println(e[i]);
		}
		return sal;
	}
}
/*
OUTPUT:

H:\IBM FullStack Training\COre java>javac EmployeeTest.java

H:\IBM FullStack Training\COre java>java EmployeeTest
101-Gourav-20000-5000
104-Surendra-50000-10000
201-Nikhil-5000-500
301-Snigdha-7000-1000
Total Salary =98500
*/