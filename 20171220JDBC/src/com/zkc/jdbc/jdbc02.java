package com.zkc.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zkc.bean.Customers;

public class jdbc02 {
	
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","root");
		String sql = "select * from customers";
		Statement stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery(sql);
		List<Customers> list = new ArrayList<>();
		while(rs.next()){
			Customers customer = new Customers();
			customer.setCust_id(rs.getInt("cust_id"));
			customer.setCust_country(rs.getString("cust_country"));
			customer.setCust_city(rs.getString("cust_city"));
			list.add(customer);
		}
		rs.close();
		stmt.close();
		conn.close();
		for (Customers customers : list) {
			System.out.println(customers.getCust_id());
			System.out.println(customers.getCust_city());
		}
	}

}
