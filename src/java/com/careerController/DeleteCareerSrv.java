package com.careerController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carreerDao.AddCarrereImplementation;

@WebServlet("/DeleteCareer")
public class DeleteCareerSrv extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int catId =(Integer.parseInt((request.getParameter("cId"))));

		AddCarrereImplementation expIm = new AddCarrereImplementation();
                
		int delete =0;
                try{
                delete = expIm.deleteCareer(catId);
                }catch(Exception e ){e.printStackTrace();}

		if(delete>0)
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-view-carreer.jsp?msg=career deleted successfully");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-view-carreer.jsp?msg=some error accour");
		}


	}

}
