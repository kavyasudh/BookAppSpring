package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.sql.Date;

public class HowToReturnAutoGenKeyAndPlayWithDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	final String Add_Book_Query="insert into books(isbn,title,author,pubDate,price) values(?,?,?,?,?)";
	SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
	
		
		try {
			Date date=format.parse("08/07/2019");
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement ps=conn
					.prepareStatement(Add_Book_Query,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, "45AG5");
			ps.setString(2, "ML");
			ps.setString(3, "kavya");
			ps.setDate(4, new java.sql.Date(date.getTime()));
			ps.setDouble(5,990.05);
			
			ps.executeUpdate();
			System.out.println("done");
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
