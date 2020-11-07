package com.jdbc;
import java.sql.*;
public class AddEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement ps=conn
					.prepareStatement("insert into emp(ename,ecity,desi,sal)values(?,?,?,?)");
			ps.setString(1,"nandu");
			ps.setString(2, "vskp");
			ps.setString(3, "SE");
			ps.setInt(4,40000);
			
			int noOfRowsEffected=ps.executeUpdate();
			System.out.println(noOfRowsEffected);
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
