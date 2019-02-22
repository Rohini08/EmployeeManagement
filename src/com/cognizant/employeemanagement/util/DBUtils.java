
package com.cognizant.employeemanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils
{

		
		public final static String url="jdbc:oracle:thin:@localhost:1521:XE";
		public final static String driverName="oracle.jdbc.driver.OracleDriver";
		public final static String userName="XE";
		public final static String password="root";
		
	public static Connection getConnection()
		{
			//System.out.println("1");
			Connection connection=null;
			//System.out.println("2");
			try
			{
				Class.forName(driverName);
				//System.out.println("3");
				connection=DriverManager.getConnection(url, userName, password);
				return connection;
				
			}catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}
			
			
			return null;
			
		}
	public static void closeConnection(Connection connection)
	{
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}





