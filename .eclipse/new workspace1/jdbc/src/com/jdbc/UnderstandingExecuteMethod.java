package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UnderstandingExecuteMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn=ConnectionFactory.getConnection();
		Statement stmt;
		try {
			stmt = conn.createStatement();
		
		 boolean status=stmt.execute("select * from employee");
		 System.out.println(status);
		if(status) {
			ResultSet rs=stmt.getResultSet();
			while(rs.next()) {
				 System.out.println(rs.getInt("eid")+":"+rs.getString("ename")+":"+rs.getInt("did"));
				
			 }
		}else {
			int rowsEffected=stmt.getUpdateCount();
			System.out.println(rowsEffected);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 

	}

}
