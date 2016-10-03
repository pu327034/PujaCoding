package com.blackbook.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ForConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}
public static Connection getConn() throws ClassNotFoundException, SQLException
{
	String driverClassName="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521/XE";
	String username="hr";
	String password="hr";
	Class.forName(driverClassName);
	Connection con=DriverManager.getConnection(url, username, password);
	return con;
}
}
