package com.zkc.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;

public class jdbc01 {
	public static void getData(String sql,int num) throws Exception{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			for (int i = 0; i < num; i++) {
				System.out.print(rs.getObject(i+1) + "\t");
			}
			System.out.println();
		}
		rs.close();
		stmt.close();
		conn.close();
	}

	public static void main(String[] args) throws Exception {
		String sql1 = "SELECT AVG(prod_price) FROM products WHERE vend_id=1001";
		getData(sql1,1);
		String sql2 = "SELECT COUNT(*) FROM customers";
		getData(sql2,1);
		String sql3 = "SELECT MAX(prod_price) FROM products";
		getData(sql3,1);
		String sql4 = "SELECT SUM(order_item) FROM orderitems;";
		getData(sql4,1);
		String sql5 = "SELECT SUM(order_item) FROM orderitems WHERE order_num=20005;";
		getData(sql5,1);
		String sql6 = "SELECT COUNT(*),MAX(prod_price),MIN(prod_price),AVG(prod_price) FROM products;";
		getData(sql6,4);
		String sql7 = "SELECT COUNT(*),vend_id FROM products GROUP BY vend_id";
		getData(sql7,2);
		String sql8 = "SELECT COUNT(*),vend_id FROM products GROUP BY vend_id HAVING COUNT(*)>2";
		getData(sql8,2);
		String sql9 = "SELECT cust_name,(SELECT COUNT(*) FROM orders WHERE orders.cust_id=customers.cust_id)FROM customers";
		getData(sql9,2);
	}
}
