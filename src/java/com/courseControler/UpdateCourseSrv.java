
package com.courseControler;

import com.courseBean.Course;
import com.courseDao.CourseImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateCourseSrv", urlPatterns = {"/UpdateCourseSrv"})
public class UpdateCourseSrv extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Course bean = new Course();
        CourseImpl dao = new CourseImpl();
        
        bean.setCOURSE_NAME(request.getParameter("name"));
        bean.setCOURSE_IMAGE(request.getParameter("image"));
        bean.setAVRAGE_DURATION(request.getParameter("duration"));
        bean.setAVRAGE_FEES(request.getParameter("fees"));
        bean.setDETAIL(request.getParameter("detail"));
        bean.setCOURSE_ID(Integer.parseInt(request.getParameter("csid")));
        
        int r=0;
        try{
         r= dao.updateCourse(bean);
        }catch(Exception e){e.printStackTrace();}
        
        if(r>0){
          response.sendRedirect(request.getContextPath()+"/AdminPages/view-course.jsp");
        }else{
          response.sendRedirect(request.getContextPath()+"/AdminPages/update-course.jsp");
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
