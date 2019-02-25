package com.cognizant.employeemanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognizant.employeemanagement.bean.Employee;
import com.cognizant.employeemanagement.util.DBUtils;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static EmployeeDAOImpl employeeDAOImpl;
	public static EmployeeDAOImpl getInstance()
	{
		if(employeeDAOImpl==null)
		{
			employeeDAOImpl =new EmployeeDAOImpl();
			return employeeDAOImpl;
		}
		else
		{
			return employeeDAOImpl;
		}
	}
	
	private EmployeeDAOImpl()
	{
		
	}

	

	public String deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		String query="delete from employee where userid=?";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		connection=DBUtils.getConnection();
		try {
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1,empId);
			int result=preparedStatement.executeUpdate();
			
			System.out.print(result);
				
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}

	public String insertEmployee(String empId, String firstName, String lastName, float salary) {
		// TODO Auto-generated method stub
		String query="insert into employee values(?,?,?,?)";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		connection=DBUtils.getConnection();
		try {
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1,empId);
			preparedStatement.setString(2,firstName);
			preparedStatement.setString(3,lastName);
			preparedStatement.setFloat(4, salary);
			
			int result=preparedStatement.executeUpdate();
			
			System.out.print(result);
				
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}

}
