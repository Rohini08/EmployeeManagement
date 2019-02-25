package com.cognizant.employeemanagement.service;

public interface EmployeeService {

	public String insertEmployee(String empId,String firstName,String lastName,float salary);
	public String deleteEmployee(String empId);
}
