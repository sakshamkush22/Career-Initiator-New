/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.userRegistrationControler;

import com.userRegistrationBean.UserRegistrationBean;
import com.userRegistrationDao.UserLogInImplementation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LogInServ", urlPatterns = {"/LogInServ"})
public class LogInServ extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email=request.getParameter("uemail");
        String pass=request.getParameter("upass");
        UserLogInImplementation dao=new UserLogInImplementation();

       int a= dao.loginValidate(email, pass);
       if(a>0)
       {
         HttpSession session = request.getSession(false);
         UserRegistrationBean bean= dao.getDetails(pass,email);
         if(bean!=null)
         {
            session.setAttribute("bean", bean);
            response.sendRedirect("Home.jsp?msg=Login Successfull");

         }
         else
         {
           response.sendRedirect("index.jsp?msg=Some Error Accure!!!!!!");

         }
           
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
