package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoTxMgt {
	public static void main(String[] args) {
		Connection conn=null;
			// TODO Auto-generated method stub
			try {
				 conn = ConnectionFactory.getConnection();
				conn.setAutoCommit(false);
				PreparedStatement ps=conn
						.prepareStatement("update account set balance=balance-10 where id=?");
				
				ps.setInt(1,1);
				ps.executeUpdate();
				
				
				ps=conn
						.prepareStatement("update account set balance=balance+10 where id=?");
				
				ps.setInt(1,2);
				
				
				ps.executeUpdate();
				conn.commit();
				//System.out.println(noOfRowsEffected);
			}catch(SQLException e) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
			}

		}

		
		
	}

