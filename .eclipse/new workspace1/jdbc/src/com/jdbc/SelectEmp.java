package com.jdbc;
import java.sql.*;

public class SelectEmp {

	public static void main(String[] args) {
		//1.load the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded...");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//2.Get a connection object
	Connection conn=null;
	
	try {
		 conn=DriverManager.getConnection
				 ("jdbc:mysql://localhost:3306/hcl_batch3", "root","oracle");
		 
		 Statement stmt=conn.createStatement();
		 ResultSet rs=stmt.executeQuery("select * from employee");
		 while(rs.next()) {
			 System.out.println(rs.getInt("eid")+":"+rs.getString("ename")+":"+rs.getInt("did"));
			
		 }
		 
		 
		 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
