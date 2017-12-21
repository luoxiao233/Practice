package com.zkc.curd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.zkc.connnnn.MyFirstDBUtil;

public class CURD {
	@Test
	public void InsertDB() throws SQLException {
		Connection conn = MyFirstDBUtil.getConnection();
		String sql = "INSERT INTO student VALUES(?,?)";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, 4);
		stmt.setString(2, "haha");
		System.out.println(stmt.executeUpdate());
		MyFirstDBUtil.turnOf(null, stmt, conn);
	}
	@Test
	public void SelectDB() throws SQLException {
		Connection conn = MyFirstDBUtil.getConnection();
		String sql = "SELECT * FROM student WHERE s_name=?;";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, "haha");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			System.out.println(rs.getObject(1));
		}
		MyFirstDBUtil.turnOf(rs, stmt, conn);
	}
	@Test
	public void updateDB() throws SQLException {
		Connection conn = MyFirstDBUtil.getConnection();
		String sql = "UPDATE student SET s_name=? WHERE s_id=?;";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, "laowang");
		stmt.setInt(2, 2);
		System.out.println(stmt.executeUpdate());
		MyFirstDBUtil.turnOf(null, stmt, conn);
	}
	@Test
	public void deleteDB() throws SQLException {
		Connection conn = MyFirstDBUtil.getConnection();
		String sql = "DELETE FROM student WHERE s_id=?;";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, 2);
		System.out.println(stmt.executeUpdate());
		MyFirstDBUtil.turnOf(null, stmt, conn);
	}
}
