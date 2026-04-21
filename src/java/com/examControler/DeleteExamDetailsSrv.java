
package com.examControler;

import com.examDao.ExamDetailsImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DeleteExamDetailsSrv", urlPatterns = {"/DeleteExamDetailsSrv"})
public class DeleteExamDetailsSrv extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ExamDetailsImpl dao = new ExamDetailsImpl();
        
               int delete = 0;
                
                try{
                delete = dao.deleteExamDetails(Integer.parseInt(request.getParameter("exmdetId")));
                }catch(Exception e){e.printStackTrace();}

		if(delete>0)
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/view-examDetails.jsp?msg=college Details deleted successfully");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/view-examDetails.jsp?msg=some error accour");
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
