package com.jdbc;

import java.sql.*;

public class showAllEmpWithPropertyFile {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		/* InputStream is=showAllEmpWithPropertyFile
	                .class.getClassLoader()
	                .getResourceAsStream("db.properties");
	       
	       
	        Properties properties=new Properties();
	      try {
	    	  properties.load(is);
	      }catch(IOException e1) {
	    	  
	      }
	
		String driver=properties.getProperty("db.driver");
		String url=properties.getProperty("db.url");
		String username=properties.getProperty("db.username");
		String pwd=properties.getProperty("db.pwd");
		try {
			Class.forName(driver);
			System.out.println("Driver is loaded...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2.Get a connection object
		Connection conn=null;
		
		try {
			 conn=DriverManager.getConnection
					 (url,username,pwd);
			 
			 Statement stmt=conn.createStatement();
			 ResultSet rs=stmt.executeQuery("select * from employee");*/
			
		Connection conn=ConnectionFactory.getConnection();
		Statement stmt;
		try {
			stmt = conn.createStatement();
		
		 ResultSet rs=stmt.executeQuery("select * from employee");
		while(rs.next()) {
				 System.out.println(rs.getInt("eid")+":"+rs.getString("ename")+":"+rs.getInt("did"));
				
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
			 
		/*	 
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

	}*/

}
	}

