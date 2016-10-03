package com.blackbook.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class Example2Callable {

	public static void main(String [] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		//IN parameters
		
		/*CallableStatement cs=con.prepareCall("{call createAccount(?,?,?,?,?,?)}");
		cs.setInt(1, 101);
		cs.setInt(2, 9);
		cs.setString(3, "Puja");
		cs.setDouble(4, 10000);
		cs.setString(5, "Coimbatore");
		cs.setInt(6, 123456789);
		cs.execute();
		System.out.println("Account Created");*/
		
		//registering OUT parameters
		
		/*CallableStatement cs1=con.prepareCall("{call getBalance(?,?)}");
		cs1.setInt(1,Integer.parseInt(args[0]));
		cs1.registerOutParameter(2, Types.DOUBLE);
		cs1.execute();
		System.out.println("Balance using procedure : "+cs1.getDouble(2));*/
		
		//calling functions using callable
		
		/*CallableStatement cs2=con.prepareCall("{call ?:=getBalanceF(?)}");
		cs2.registerOutParameter(1, Types.INTEGER);
		cs2.setInt(2,101);
		cs2.execute();
		System.out.println("Balance using function : "+cs2.getDouble(1));
		con.close();
		*/
		
		//Using cursors in callable statements
		CallableStatement cs3=con.prepareCall("{call ?:=getAccountDetails(?)}");
		cs3.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
		cs3.setInt(2,Integer.parseInt(args[0]));
		cs3.execute();
		ResultSet rs=(ResultSet)cs3.getObject(1);
		
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getDouble(3)+"\t");
		}
		
		con.close();
		

	}

}
