package com.blackbook.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example4BLOB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
		Connection conn=ForConnection.getConn();
		PreparedStatement ps=conn.prepareStatement("insert into blobexample(empno,photo) values(?,?)");
		ps.setInt(1, Integer.parseInt(args[0]));
		File f=new File("D:\\snaps\\SECOND YEAR\\004.jpg");
		FileInputStream fis=new FileInputStream(f);
		ps.setBinaryStream(2, fis,(int)f.length());
		int i=ps.executeUpdate();
		System.out.println("Record inserted, count "+i);
		conn.close();
	}

}
