package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement ps=conn
					.prepareStatement("update emp set sal=? where id=?");
			
			ps.setInt(1,80000);
			ps.setInt(2, 1);
			
			int noOfRowsEffected=ps.executeUpdate();
			System.out.println(noOfRowsEffected);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
