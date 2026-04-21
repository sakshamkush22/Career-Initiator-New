
package com.courseControler;

import com.courseBean.CourseDetails;
import com.courseDao.CourseDetailsImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateCourseDetailsSrv", urlPatterns = {"/UpdateCourseDetailsSrv"})
public class UpdateCourseDetailsSrv extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         CourseDetails bean = new CourseDetails();
        CourseDetailsImpl dao = new CourseDetailsImpl();
        
        bean.setCOURSE_OVERVIEW(request.getParameter("cov"));
        bean.setSYLLABUS_AND_SUBJECTS(request.getParameter("sns"));
        bean.setJOB(request.getParameter("job"));
        bean.setSCOPE(request.getParameter("scope"));
        bean.setSALARY(request.getParameter("sal"));
        bean.setADMISSION(request.getParameter("adm"));
        bean.setPLACEMENTS(request.getParameter("plcm"));
        bean.setTITLE(request.getParameter("title"));
        bean.setCOURSE_DETAILS_ID(Integer.parseInt(request.getParameter("cdid")));
        
        int r=0;
        try{
         r= dao.updateCourseDetails(bean);
        }catch(Exception e){e.printStackTrace();}
        
        if(r>0){
          response.sendRedirect(request.getContextPath()+"/AdminPages/view-courseDetails.jsp");
        }else{
          response.sendRedirect(request.getContextPath()+"/AdminPages/update-courseDetails.jsp");
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
