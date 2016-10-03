package com.blackbook.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

public class Example1 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		String driverClassName="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521/XE";
		String username="hr";
		String password="hr";
		/*String query="INSERT INTO students VALUES (101,\'kumar\')";
		String query1="INSERT INTO students VALUES(?,?)";
		Class.forName(driverClassName);
		Connection con=DriverManager.getConnection(url, username, password);
		//Use of statement
		Statement st=con.createStatement();
		int count=st.executeUpdate(query);
		System.out.println("Number of rows effected by this query= " +count);
		//Use of preparedStatement
		PreparedStatement ps=con.prepareStatement(query1);
		ps.setInt(1, 102);
		ps.setString(2, "kumari");
		int n=ps.executeUpdate();
		System.out.println("Number of rows effected by this query= " +n);
		con.close();*/
		Date dt=new Date();
		
		java.sql.Date d=(java.sql.Date)dt;
		System.out.println("sql date: "+d);
		System.out.println("util date: "+dt);
		String query1="INSERT INTO students VALUES(?,?)";
		Class.forName(driverClassName);
		Connection con=DriverManager.getConnection(url, username, password);
		//Use of preparedStatement
		PreparedStatement ps=con.prepareStatement(query1);
		ps.setString(1, "Puja");
		ps.setDate(2,d);
		int n=ps.executeUpdate();
		System.out.println("Number of rows effected by this query= " +n);
		
	}

}
