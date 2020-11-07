package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=ConnectionFactory.getConnection();
		Statement stmt;
		try {
			stmt=conn.createStatement
					(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		 ResultSet rs=stmt.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
		rs.absolute(1);
		
		rs.updateString(2, "reyansh");
		rs.updateRow();
		rs.beforeFirst();
		
		System.out.println("===============");
		while(rs.next()){
			System.out.println(rs.getString(2));
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
