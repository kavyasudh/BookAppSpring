package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DelEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement ps=conn
					.prepareStatement("delete from emp where id=?");
			
			ps.setInt(1,4);
			
			int noOfRowsEffected=ps.executeUpdate();
			System.out.println(noOfRowsEffected);
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
