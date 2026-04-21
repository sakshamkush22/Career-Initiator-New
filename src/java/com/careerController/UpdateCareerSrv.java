package com.careerController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerBean.AddCarreer;
import com.carreerDao.AddCarrereImplementation;

@WebServlet("/UpdateCareerSrv")
public class UpdateCareerSrv extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AddCarreer addCareer = new AddCarreer();

		addCareer.setcName(request.getParameter("cname"));
		addCareer.setcImage(request.getParameter("cimage"));
		addCareer.setcId(Integer.parseInt(request.getParameter("cId")));
		addCareer.setcPriority(request.getParameter("cpriority"));
		addCareer.setcStatus(request.getParameter("cstatus"));
		

		AddCarrereImplementation expCatIm = new AddCarrereImplementation();
                
		int result = 0;
                
                try{        
                result = expCatIm.updateCarreer(addCareer);
                }catch(Exception e){e.printStackTrace();}
                
		if(result>0)
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-view-carreer.jsp?msg=Career updated successfully!");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-update-carreer.jsp");
		}	
	}
}
