package com.zkc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc03 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop?allowMultiQueries=true", "root",
				"root");
		String sql = "SELECT * FROM products;";
		sql += "SELECT * FROM vendors;";
		PreparedStatement stmt = conn.prepareStatement(sql);
		boolean havemore = stmt.execute();
		ResultSet rs = null;
		while(true){
			if (havemore) {
				rs = stmt.getResultSet();
				while(rs.next()){
					System.out.print(rs.getObject(1) + "\t");
					System.out.print(rs.getObject(2) + "\t");
					System.out.println();
				}
				rs.close();
			}else {
				break;
			}
			havemore = stmt.getMoreResults();
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
