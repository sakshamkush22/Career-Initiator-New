
package com.collegeControler;

import com.collegeBean.CollegeDetails;
import com.collegeDao.CollegeDetailsImpl;
import com.collegeDao.CollegeDetailsInterface;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "AddCollegeDetailsSrv", urlPatterns = {"/AddCollegeDetailsSrv"})
public class AddCollegeDetailsSrv extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
               CollegeDetails bean = new CollegeDetails();

		bean.setCOLLEGE_ID(Integer.parseInt(request.getParameter("clgid")));
		bean.setOVERVIEW(request.getParameter("overview"));
		bean.setCOURSE(request.getParameter("course"));
		bean.setJOB_READY_DEGREE(request.getParameter("jrd"));
		bean.setADMISSION(request.getParameter("addms"));
                bean.setPLACEMENTS(request.getParameter("plcm"));
                bean.setCUT_OFFS(request.getParameter("ctof"));
		bean.setGALLERY(request.getParameter("gall"));
		bean.setAVRAGE_PACKAGE(request.getParameter("avgp"));
		bean.setFEES(request.getParameter("fees"));
                bean.setREVIEWS(request.getParameter("rew"));
                bean.setSCHOLARSHIP(request.getParameter("schl"));
		bean.setNEWS(request.getParameter("news"));
                bean.setHOSTEL(request.getParameter("hst"));


		

		CollegeDetailsInterface dao = new CollegeDetailsImpl();
                
		int result = 0;
                
                try{
                result = dao.addCollegeDetails(bean);
                }catch(Exception e){e.printStackTrace();}
                
		if(result>0)
		{
			response.sendRedirect("view-collegeDetails.jsp?msg=college added successfully!");
		}
		else
		{
			response.sendRedirect("view-collegeDetails.jsp");
		

    }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
