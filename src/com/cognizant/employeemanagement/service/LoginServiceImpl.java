
package com.cognizant.employeemanagement.service;

import com.cognizant.employeemanagement.dao.LoginDAO;
import com.cognizant.employeemanagement.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {
	
	private static LoginServiceImpl loginServiceImpl;
	
	private LoginDAO dao=LoginDAOImpl.getInstance();
	
	public static LoginServiceImpl getInstance()
	{
		if(loginServiceImpl==null)
		{
			loginServiceImpl =new LoginServiceImpl();
			return loginServiceImpl;
		}
		else
		{
			return loginServiceImpl;
		}
	}
	
	private LoginServiceImpl()
	{
		
	}

	public int getUserStatus(String id) {
		// TODO Auto-generated method stub
		return dao.getUserStatus(id);
	}

	public String getUserType(String id) {
		// TODO Auto-generated method stub
		return dao.getUserType(id);
	}

	public boolean authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(userName, password);
	}

	public String authorization(String userName) {
		// TODO Auto-generated method stub
		return dao.getUserType(userName);
		
	}
	

}

