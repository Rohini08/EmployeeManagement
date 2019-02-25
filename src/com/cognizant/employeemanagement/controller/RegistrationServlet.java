package com.cognizant.employeemanagement.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.employeemanagement.dao.LoginDAO;
import com.cognizant.employeemanagement.dao.LoginDAOImpl;
import com.cognizant.employeemanagement.service.EmployeeService;
import com.cognizant.employeemanagement.service.EmployeeServiceImpl;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String empId=request.getParameter("employeeID");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		float salary=Float.parseFloat(request.getParameter("salary"));
		
		
		EmployeeService employeeService=EmployeeServiceImpl.getInstance();
		  
		employeeService.insertEmployee(empId, firstName, lastName, salary);
		employeeService.deleteEmployee(empId);
		
		
		
		
	}

}


