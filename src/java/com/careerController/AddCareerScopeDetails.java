package com.careerController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerBean.AddCarreer;
import com.careerBean.ScopeDetails;
import com.carreerDao.AddCarrereImplementation;
import com.carreerDao.ScopeDetailsImpl;

@WebServlet("/AddCareerScopeDetails")
public class AddCareerScopeDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
         ScopeDetails scopeDetails = new ScopeDetails();
         ScopeDetailsImpl spdIm = new ScopeDetailsImpl();

         scopeDetails.setCAREER_ID(Integer.parseInt(request.getParameter("cid")));
         scopeDetails.setSCOPE_ID(Integer.parseInt(request.getParameter("sid")));
         scopeDetails.setSTATUS(Integer.parseInt(request.getParameter("status")));
         
         scopeDetails.setTITLE(request.getParameter("title"));

         scopeDetails.setABOUT(request.getParameter("about"));
         scopeDetails.setELIGIBILITY(request.getParameter("elg"));
         scopeDetails.setJOBROLE(request.getParameter("jobrole"));
         scopeDetails.setSALARY(request.getParameter("salary"));
         scopeDetails.setSTUDYMATERIAL(request.getParameter("smt"));
         scopeDetails.setPROS(request.getParameter("pros"));
         scopeDetails.setCONS(request.getParameter("cons"));
         scopeDetails.setFAQ(request.getParameter("faq"));
         
	        int result = 0;	
                 
                try{
		result = spdIm.addScopeDetails(scopeDetails);
                }catch(Exception e){e.printStackTrace();}
                
		if(result>0)
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-view-scopeDetails.jsp?msg=career added successfully!");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/admin-add-scopeDetails.jsp");
		}	
		
	}

}
