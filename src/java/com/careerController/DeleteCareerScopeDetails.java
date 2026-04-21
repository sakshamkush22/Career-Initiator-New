package com.careerController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carreerDao.CareerScopeInterface;
import com.carreerDao.CarrereScopeImplementation;
import com.carreerDao.ScopeDetailsImpl;

/**
 * Servlet implementation class DeleteCareerScopeDetails
 */
@WebServlet("/DeleteCareerScopeDetails")
public class DeleteCareerScopeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int scpdId =(Integer.parseInt((request.getParameter("sdId"))));

		ScopeDetailsImpl dao = new ScopeDetailsImpl();
		int delete = 0;
                try{        
                delete = dao.deleteScopeDetails(scpdId);
                }catch(Exception e){e.printStackTrace();}

		if(delete>0)
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-view-scopeDetails.jsp?msg=scopeDetails deleted successfully");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-view-scopeDetails.jsp?msg=some error accour");
		}
	
	}

}
