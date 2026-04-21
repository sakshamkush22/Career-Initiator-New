
package com.userRegistrationControler;

import com.userRegistrationBean.UserRegistrationBean;
import com.userRegistrationDao.UserImplementation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ForgetPasswordSrv", urlPatterns = {"/ForgetPasswordSrv"})
public class ForgetPasswordSrv extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        UserRegistrationBean bean = new UserRegistrationBean();
        UserImplementation dao = new UserImplementation();
        
        String FEmail = request.getParameter("femail");
        String FOldPass = request.getParameter("fopass");
        String FNewPass = request.getParameter("fnpass");

        
        int r=0;
        try{
         r= dao.forgetPassword(FEmail,FOldPass,FNewPass);
        }catch(Exception e){e.printStackTrace();}
        
        if(r>0){
           response.sendRedirect("index.jsp?msg=Password Updated Successfully");
        }else{
         response.sendRedirect("index.jsp?msg=Invalid Old password");
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
