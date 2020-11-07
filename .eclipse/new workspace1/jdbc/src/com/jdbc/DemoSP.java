package com.jdbc;

import java.sql.*;

public class DemoSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn = ConnectionFactory.getConnection();
			CallableStatement cs=conn
					.prepareCall("call calculator(?,?,?)");
			
			cs.setInt(1,2);
			cs.setInt(2,2);
			cs.registerOutParameter(3, Types.INTEGER);
			cs.execute();
			System.out.println(cs.getInt(3));
		}catch(SQLException e) {
			e.printStackTrace();
		}


	}

}
