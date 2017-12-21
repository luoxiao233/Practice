package com.zkc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.junit.Test

public class Test {
	
	@Test
	public void testInsert(){
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop?allowMultiQueries=true", "root",
				"root");
		String sql = "INSERT INTO student VALUES(?,?);";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setint(1, 5);
		stmt.setString(2, "ะกอ๕");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			System.out.print(rs.getInt("s_id") + "\t");
			System.out.print(rs.getString("s_name") + "\t");
			System.out.println();
		}
		rs.close();
		stmt.close();
		conn.close();
	}

}
