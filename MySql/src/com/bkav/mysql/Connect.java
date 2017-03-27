package com.bkav.mysql;

import java.sql.*;

public class Connect {

	public static void main(String args[]) {
		Connection conn = null;
		try {
			String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://127.0.0.1:3306/mytestdb";
			// Class.forName ("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("Da ket noi CSDL");
			conn.close();
			System.out.println("Dong ket noi");
		} catch (Exception e) {
			System.err.println("KHONG THE KET NOI");
		}
	}
}
