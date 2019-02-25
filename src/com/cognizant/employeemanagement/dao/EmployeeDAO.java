package com.cognizant.employeemanagement.dao;

import com.cognizant.employeemanagement.bean.Employee;

public interface EmployeeDAO {
	
		public String insertEmployee(String empId,String firstName,String lastName,float salary);
		public String deleteEmployee(String empId);
		
	
	

}
