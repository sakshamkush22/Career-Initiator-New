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

@WebServlet("/UpdateCollegeServlet")
public class UpdateCollegeServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		College updateClg = new College();

		updateClg.setCOLLEGE_NAME(request.getParameter("cname"));
		updateClg.setCOLLEGE_IMAGE(request.getParameter("cimage"));
		updateClg.setCOLLEGE_LOCATION(request.getParameter("clocation"));
		updateClg.setCOLLEGE_CATEGORY(request.getParameter("ccategory"));
		updateClg.setCOLLEGE_DETAILS(request.getParameter("cdetails"));
		updateClg.setCOLLEGE_RATING(Double.parseDouble(request.getParameter("crating")));
		updateClg.setCOLLEGE_PROGRAMS(request.getParameter("cprograms"));
		updateClg.setCOLLEGE_PRIORITY(Integer.parseInt(request.getParameter("cpriority")));
		updateClg.setCOLLEGE_STATUS(Integer.parseInt(request.getParameter("cstatus")));
		updateClg.setCOLLEGE_ID(Integer.parseInt(request.getParameter("clgid")));

		CollegeInterface dao = new CollegeImpl();
                
                 int result = 0;
                
                try{
	        result = dao.updateCollege(updateClg);
                }catch(Exception e){e.printStackTrace();}
                
	    if(result>0) {
	    	
	    	response.sendRedirect("admin-view-college.jsp");
	    	
	    }else {
	    	response.sendRedirect("admin-update-college.jsp");
	    	
	    }
	

		
	}



}
