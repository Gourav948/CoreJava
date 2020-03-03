package com.collection;

import java.util.HashMap;
import java.util.Iterator;

class Employee
{
	String name;
	int id;
	int salary;
	
	
	public Employee() 
	{
		super();
	}


	public Employee(String name, int id, int salary) 
	{
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
    
	@Override
	public int hashCode()
	{
		return this.id;
	}
	@Override
	public boolean equals(Object obj) 
    { 
        return true;
        
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	
	
}
public class EmployeeHashMapTest 
{

	public static void main(String[] args) 
	{
		HashMap<Employee,String> hm= new HashMap<Employee,String>();
        hm.put(new Employee("Gourav",101,10000), "CEO");
        hm.put(new Employee("Snigdha",301,45000), "Manager");
        hm.put(new Employee("Nikhil",501,20000), "Junior Engineer");
        hm.put(new Employee("Surendra",201,99000), "Senior Executive");
        hm.put(new Employee("Gourav",101,10000), "HR");
        
        Iterator<Employee> itr = hm.keySet().iterator();
		while(itr.hasNext()) 
		{
			Employee ee = itr.next();
			System.out.println("\n");
			System.out.println(hm.get(ee));
			System.out.println("\n\n");
		}
		
	}

}
