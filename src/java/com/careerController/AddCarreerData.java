package com.careerController;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connectionDataBase.MyConnection;
import com.careerBean.AddCarreer;
import com.carreerDao.AddCarrereImplementation;
@WebServlet("/addCarrer")
public class AddCarreerData extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		AddCarreer addCareer = new AddCarreer();
                AddCarrereImplementation expCatIm = new AddCarrereImplementation();

		addCareer.setcName(request.getParameter("cname"));
		addCareer.setcImage(request.getParameter("cimage"));
		addCareer.setcPriority(request.getParameter("cpriority"));
		addCareer.setcStatus(request.getParameter("cstatus"));
		

		int result = 0;
                
                try{
                result = expCatIm.addCarreer(addCareer);
                }catch(Exception e){e.printStackTrace();}
                
		if(result>0)
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-view-carreer.jsp?msg=career added successfully!");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-view-carreer.jsp");
		}	
	}

}
