package com.blackbook.jdbc;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Example3BatchUpdates {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			Connection conn=ForConnection.getConn();
			Statement s=conn.createStatement();
			s.addBatch("insert into bank2 values(101,'Harsh',20000,10)");
			s.addBatch("insert into bank2 values(102,'Ankit',10000,11)");
			s.addBatch("update bank2 set bal=20000 where accno="+103);
			s.addBatch("insert into bank2 values(104,'Raj',20000,12)");
			try
			{
			int count[]=s.executeBatch();
			System.out.println("Batch executed successfully");
			for(int i=0;i<count.length;i++)
			{
				System.out.println("Number of records effected "+(i+1)+":"+count[i]);
			}
			}
			catch(BatchUpdateException e)
			{
				e.printStackTrace();
				System.out.println("batch terminated");
				int[] count=e.getUpdateCounts();
				System.out.println("Batch terminated at "+(count.length+1));
				for(int i=0;i<count.length;i++)
				{
					System.out.println("Number of records effected "+(i+1)+":"+count[i]);
				}
			}
			conn.close();
	}

}
