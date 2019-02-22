package com.cognizant.employeemanagement.dao;

public interface LoginDAO {
	
	public int getUserStatus(String id);
	public String getUserType(String id);
	public boolean authenticate(String userName,String password);
	public String authorization(String userName);


}
