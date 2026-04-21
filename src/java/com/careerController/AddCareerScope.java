package com.careerController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerBean.CareerScope;
import com.carreerDao.CareerScopeInterface;
import com.carreerDao.CarrereScopeImplementation;


@WebServlet("/AddCareerScope")
public class AddCareerScope extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 CareerScope addCareerScope = new CareerScope();
	         CareerScopeInterface dao = new CarrereScopeImplementation();

		 addCareerScope.setcId(Integer.parseInt(request.getParameter("cid")));
		 addCareerScope.setsName(request.getParameter("sname"));
		 addCareerScope.setsImage(request.getParameter("simage"));
		 addCareerScope.setsPriority(request.getParameter("spriority"));
		 addCareerScope.setsStatus(request.getParameter("sstatus"));
		
                int result =0; 
                try{
		result = dao.addCarreerScope(addCareerScope);
                }catch(Exception e){e.printStackTrace();}
                
           
		if(result>0)
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-view-scope.jsp?msg=scope added successfully!");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-add-scope.jsp");
		}	
		
	}

}
