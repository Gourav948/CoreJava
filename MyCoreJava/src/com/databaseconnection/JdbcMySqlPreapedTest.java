package com.databaseconnection;

import java.sql.*;

public class JdbcMySqlPreapedTest 
{

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
		PreparedStatement pstmt=dbcon.prepareStatement("INSERT into emp1 (Id,name,salary) VALUES (?,?,?)");
		pstmt.setInt(1, 601);
		pstmt.setString(2, "Don");
		pstmt.setInt(3, 999999);
		System.out.println("After adding Don");
		pstmt.executeUpdate();
		PreparedStatement pstmt1=dbcon.prepareStatement("UPDATE emp1 SET name = ?, salary= ? WHERE Id = 101");
		pstmt1.setString(1, "Susree");
		pstmt1.setInt(2, 99900);
		System.out.println("After updating Sonu123 to Susree");
		pstmt1.executeUpdate();
		PreparedStatement pstmt2=dbcon.prepareStatement("DELETE FROM emp1 WHERE Id = ?");
		pstmt2.setInt(1,501);
		System.out.println("After dELETING 501");
		System.out.println("Entering into data  Table");
		pstmt2.executeUpdate();
		ResultSet rs2=stmt.executeQuery("SELECT * FROM emp1");
		while(rs2.next())
		{
			System.out.println(rs2.getInt("Id")+"--"+rs2.getString("name")+"--"+rs2.getDouble("salary"));
		}
		
		rs.close();
		rs2.close();
		pstmt.close();
		dbcon.close();

	}

}