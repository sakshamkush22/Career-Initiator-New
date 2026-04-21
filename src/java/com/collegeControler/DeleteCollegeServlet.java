package com.collegeControler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collegeDao.CollegeImpl;
import com.collegeDao.CollegeInterface;


@WebServlet("/DeleteCollegeServlet")
public class DeleteCollegeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int clgId =(Integer.parseInt(request.getParameter("clgId")));

		CollegeInterface clgIm = new CollegeImpl();
                
		int delete = 0;
                
                try{
                delete = clgIm.deleteCollege(clgId);
                }catch(Exception e){e.printStackTrace();}

		if(delete>0)
		{
			response.sendRedirect("admin-view-college.jsp?msg=college deleted successfully");
		}
		else
		{
			response.sendRedirect("admin-view-college.jsp?msg=some error accour");
		}

	}



}
