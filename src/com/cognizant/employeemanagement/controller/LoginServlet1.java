package com.cognizant.employeemanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.employeemanagement.service.LoginService;
import com.cognizant.employeemanagement.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet1
 */
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet1() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher requestDispatcher=null;
		String userName=request.getParameter("userId");
		String password=request.getParameter("password");
	    
		LoginService loginService=LoginServiceImpl.getInstance();
		
		/*if("admin".equals(userId)&& userId.equals("admin"))
		{
			//System.out.println("success");
			//response.sendRedirect("admin.html");
			requestDispatcher.include(request,response);
			
		} */
		
		
		 if(loginService.authenticate(userName, password))
		 {
			
			
				int userStatus=loginService.getUserStatus(userName);
				String authorization=loginService.authorization(userName);
				if("A".equals(authorization)&&authorization.equals("A"))
				{
					if(userStatus==0)
					{
						requestDispatcher=request.getRequestDispatcher("AdminHome.html");
						requestDispatcher.forward(request,response);
					}
					else if(userStatus==1)
					{
						
						requestDispatcher=request.getRequestDispatcher("AlreadyLoggedIn.html");
						requestDispatcher.forward(request,response);
					}
					else if(userStatus==2)
					{
						requestDispatcher=request.getRequestDispatcher("UserDeactivated.html");
						requestDispatcher.forward(request,response);
					}
				}
				else if("U".equals(authorization)&& authorization.equals("U") )
				{
					if(userStatus==0)
					{
						requestDispatcher=request.getRequestDispatcher("UserHome.html");
						requestDispatcher.forward(request,response);
					}
					else if(userStatus==1)
					{
						
						requestDispatcher=request.getRequestDispatcher("AlreadyLoggedIn.html");
						requestDispatcher.forward(request,response);
					}
					else if(userStatus==2)
					{
						requestDispatcher=request.getRequestDispatcher("UserDeactivated.html");
						requestDispatcher.forward(request,response);
					}
					
				}
				else if("V".equals(authorization)&& authorization.equals("V") )
				{
					if(userStatus==0)
					{
						requestDispatcher=request.getRequestDispatcher("VendorHome.html");
						requestDispatcher.forward(request,response);
					}
					
					else if(userStatus==1)
					{
						requestDispatcher=request.getRequestDispatcher("AlreadyLoggedIn.html");
						requestDispatcher.forward(request,response);
					}
					else if(userStatus==2)
					{
						requestDispatcher=request.getRequestDispatcher("UserDeactivated.html");
						requestDispatcher.forward(request,response);
					}
				}
		 }
		 else
		 {
			 //redirect to login
			 requestDispatcher=request.getRequestDispatcher("Login.html");
				requestDispatcher.forward(request,response);
			 
		 }
		
		
	}

}
