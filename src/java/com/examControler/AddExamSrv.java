
package com.examControler;

import com.examBean.Exam;
import com.examDao.ExamImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AddExamSrv", urlPatterns = {"/AddExamSrv"})
public class AddExamSrv extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
             Exam bean = new Exam();
        ExamImpl dao = new ExamImpl();
        
        bean.setEXAM_NAME(request.getParameter("name"));
        bean.setEXAM_IMAGE(request.getParameter("image"));
        bean.setEXAM_FEILD(request.getParameter("feild"));
        bean.setEXAM_DETAIL(request.getParameter("detail"));
        bean.setPRIORITY(Integer.parseInt(request.getParameter("priority")));
        bean.setSTATUS(Integer.parseInt(request.getParameter("status")));

        
        int r=0;
        try{
         r= dao.addExam(bean);
        }catch(Exception e){e.printStackTrace();}
        
        if(r>0){
          response.sendRedirect(request.getContextPath()+"/AdminPages/view-exam.jsp");
        }else{
          response.sendRedirect(request.getContextPath()+"/AdminPages/add-exam.jsp");
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
