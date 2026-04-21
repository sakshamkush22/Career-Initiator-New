package com.careerController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerBean.AddCarreer;
import com.careerBean.CareerScope;
import com.carreerDao.AddCarrereImplementation;
import com.carreerDao.CareerScopeInterface;
import com.carreerDao.CarrereScopeImplementation;

@WebServlet("/UpdateCareerScope")
public class UpdateCareerScope extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CareerScope addCareerScope = new CareerScope();

		addCareerScope.setsName(request.getParameter("sname"));
		addCareerScope.setsImage(request.getParameter("simage"));
		addCareerScope.setsId(Integer.parseInt(request.getParameter("sId")));
		addCareerScope.setsPriority(request.getParameter("spriority"));
		addCareerScope.setsStatus(request.getParameter("sstatus"));
		

		CareerScopeInterface dao = new CarrereScopeImplementation();
                
		int result = 0;
                
                try{
                result = dao.updateCarreerScope(addCareerScope);
                }catch(Exception e){e.printStackTrace();}
                
		if(result>0)
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-view-scope.jsp?msg=Scope updated successfully!");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-update-scope.jsp");
		}	
		
	}

}
