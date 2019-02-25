package com.cognizant.employeemanagement.service;

import com.cognizant.employeemanagement.dao.EmployeeDAO;
import com.cognizant.employeemanagement.dao.EmployeeDAOImpl;
import com.cognizant.employeemanagement.dao.LoginDAO;
import com.cognizant.employeemanagement.dao.LoginDAOImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
private static EmployeeServiceImpl employeeServiceImpl;
	
	private EmployeeDAO dao=EmployeeDAOImpl.getInstance();
	
	public static EmployeeServiceImpl getInstance()
	{
		if(employeeServiceImpl==null)
		{
			employeeServiceImpl =new EmployeeServiceImpl();
			return employeeServiceImpl;
		}
		else
		{
			return employeeServiceImpl;
		}
	}
	
	private EmployeeServiceImpl()
	{
		
	}

	public String insertEmployee(String empId, String firstName, String lastName, float salary) {
		// TODO Auto-generated method stub
		return dao.insertEmployee(empId, firstName, lastName, salary);
	}

	public String deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(empId);
	}

}
