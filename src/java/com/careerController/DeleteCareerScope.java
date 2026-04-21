package com.careerController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carreerDao.AddCarrereImplementation;
import com.carreerDao.CareerScopeInterface;
import com.carreerDao.CarrereScopeImplementation;

@WebServlet("/DeleteCareerScope")
public class DeleteCareerScope extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int scpId =(Integer.parseInt((request.getParameter("sId"))));

		CareerScopeInterface dao = new CarrereScopeImplementation();
                
		int delete = 0;
                try{
                delete = dao.deleteCareerScope(scpId);
                }catch(Exception e ){e.printStackTrace();}

		if(delete>0)
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-view-scope.jsp?msg=Scope deleted successfully");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-view-scope.jsp?msg=some error accour");
		}

		
	}

}
