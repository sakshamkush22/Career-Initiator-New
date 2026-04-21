package com.collegeControler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collegeDao.CollegeImpl;
import com.collegeDao.CollegeInterface;
import com.collegeBean.College;

@WebServlet("/AddCollegeServlet")
public class AddCollegeServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		College addClg = new College();

		addClg.setCOLLEGE_NAME(request.getParameter("cname"));
		addClg.setCOLLEGE_IMAGE(request.getParameter("cimage"));
		addClg.setCOLLEGE_LOCATION(request.getParameter("clocation"));
		addClg.setCOLLEGE_CATEGORY(request.getParameter("ccategory"));
		addClg.setCOLLEGE_DETAILS(request.getParameter("cdetails"));
		addClg.setCOLLEGE_RATING(Double.parseDouble(request.getParameter("crating")));
		addClg.setCOLLEGE_PROGRAMS(request.getParameter("cprograms"));
		addClg.setCOLLEGE_PRIORITY(Integer.parseInt(request.getParameter("cpriority")));
		addClg.setCOLLEGE_STATUS(Integer.parseInt(request.getParameter("cstatus")));

		

		CollegeInterface dao = new CollegeImpl();
                
		int result = 0;
                
                try{
                result = dao.addCollege(addClg);
                }catch(Exception e){e.printStackTrace();}
                
		if(result>0)
		{
			response.sendRedirect("admin-view-college.jsp?msg=college added successfully!");
		}
		else
		{
			response.sendRedirect("admin-view-college.jsp");
		

	}

}
	}
