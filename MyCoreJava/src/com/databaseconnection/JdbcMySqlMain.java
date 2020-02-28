package com.databaseconnection;

import java.sql.*;

public class JdbcMySqlMain {

	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");//Type IV Driver Name
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "mysql");
		System.out.println("Connection Established");
		Statement stmt=dbcon.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM emp1");
		while(rs.next())
		{
			System.out.println(rs.getInt("Id")+"--"+rs.getString("name")+"--"+rs.getDouble("salary"));
		}
		
		stmt.executeUpdate("INSERT into emp1 (Id,name,salary) VALUES (501,'Rajat',72000)");
		System.out.println("After adding Ajay");
		stmt.executeUpdate("UPDATE emp1 SET name = 'Sonu123', salary= 55000 WHERE Id = 101");
		System.out.println("After updating Gourav to Sonu123");
		stmt.executeUpdate("DELETE FROM emp1 WHERE Id = 1001");
		System.out.println("After dELETING 1001");

		
		System.out.println("Entering into data  Table");
		ResultSet rs2=stmt.executeQuery("SELECT * FROM emp1");
		while(rs2.next())
		{
			System.out.println(rs2.getInt("Id")+"--"+rs2.getString("name")+"--"+rs2.getDouble("salary"));
		}
		
		rs.close();
		
		stmt.close();
		dbcon.close();

	}

}
/*

Connection Established
101--Sonu123--55000.0
201--Nikhil--20000.0
501--Surendra--99000.0
701--Ajay--72000.0
901--Snigdha--72000.0
After adding Ajay
After updating Gourav to Sonu123
After dELETING 1001
Entering into data  Table
101--Sonu123--55000.0
201--Nikhil--20000.0
501--Surendra--99000.0
701--Ajay--72000.0
901--Snigdha--72000.0
501--Rajat--72000.0

*/