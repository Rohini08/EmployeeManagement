package com.cognizant.employeemanagement.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String empId=request.getParameter("empId");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		int salary=Integer.parseInt(request.getParameter("salary"));
		
		
		System.out.println(empId);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(salary);
		
	}

}


