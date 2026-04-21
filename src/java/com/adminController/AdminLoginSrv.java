package com.adminController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminLoginSrv")
public class AdminLoginSrv extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		
		if(email.equals("admin@gmail.com") && password.equals("Sakshu@22"))
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-dashboard.jsp?msg=login successfully");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-dashboard.jsp?msg=invalid email or password");
			
		}
		
	}
	
}
