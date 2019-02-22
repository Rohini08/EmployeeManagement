

package com.cognizant.employeemanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognizant.employeemanagement.util.DBUtils;

public class LoginDAOImpl implements LoginDAO {
	private static LoginDAOImpl loginDAOImpl;
	public static LoginDAOImpl getInstance()
	{
		if(loginDAOImpl==null)
		{
			loginDAOImpl =new LoginDAOImpl();
			return loginDAOImpl;
		}
		else
		{
			return loginDAOImpl;
		}
	}
	
	private LoginDAOImpl()
	{
		
	}
	
	public int getUserStatus(String id)
	{
		String query="select status from login where userid=?";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		connection=DBUtils.getConnection();
		try {
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			resultSet=preparedStatement.executeQuery();
			if (resultSet.next()) {
				return resultSet.getInt("status");
				
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		return -1;
	}
	public String getUserType(String id)
	{
		String query="select usertype from login where userid=?";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		connection=DBUtils.getConnection();
		try {
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			resultSet=preparedStatement.executeQuery();
			if (resultSet.next()) {
				return resultSet.getString("usertype");
				
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
	public boolean authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		 String query="select * from login where userid=? and password=?";
		 Connection connection=null;
			PreparedStatement preparedStatement=null;
			ResultSet resultSet=null;
			connection=DBUtils.getConnection();
			
			try {
				preparedStatement=connection.prepareStatement(query);
				preparedStatement.setString(1,userName);
				preparedStatement.setString(2,password);
				resultSet=preparedStatement.executeQuery();
				System.out.println("error in try");
				if (resultSet.next()) {
					
					return true;
					
					
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("error in ");
				
			}
		return false;
	}

	public String authorization(String userName) {
		// TODO Auto-generated method stub
		
		return loginDAOImpl.getUserType(userName);
	}
	
	

}

