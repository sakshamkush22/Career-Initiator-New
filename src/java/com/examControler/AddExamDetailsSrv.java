
package com.examControler;

import com.examBean.ExamDetails;
import com.examDao.ExamDetailsImpl;
import com.examDao.ExamDetailsInterface;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AddExamDetailsSrv", urlPatterns = {"/AddExamDetailsSrv"})
public class AddExamDetailsSrv extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          ExamDetails bean = new ExamDetails();

		bean.setEXAM_ID(Integer.parseInt(request.getParameter("exmdetid")));
		bean.setTITLE(request.getParameter("title"));
		bean.setOVERVIEW(request.getParameter("ovr"));
		bean.setEXAM_DATES(request.getParameter("exmd"));
		bean.setELIGIBILITY(request.getParameter("elgib"));
                bean.setAPPLICATION_FORM(request.getParameter("appform"));
                bean.setADMIT_CARD(request.getParameter("admcrd"));
		bean.setEXAM_PATTERN(request.getParameter("exmpt"));
		bean.setSYLLABUS(request.getParameter("sylb"));
		bean.setHOW_TO_PREPARE(request.getParameter("htp"));
                bean.setBEST_BPOKS(request.getParameter("bbooks"));
                bean.setPREVIOUS_YEAR_QP(request.getParameter("prqp"));
		bean.setSAMPLE_PAPER(request.getParameter("sampaper"));
                bean.setMOCK_TEAST(request.getParameter("mockt"));
                bean.setCOCHING_INSTITUTE(request.getParameter("chginsti"));
		bean.setPAPER_ANALYSIS(request.getParameter("paperana"));
		bean.setRESPONSE_SHEET(request.getParameter("respsheet"));
		bean.setANSWER_KEY(request.getParameter("anskey"));
                bean.setRESULT(request.getParameter("result"));
                bean.setMERIT_LIST(request.getParameter("meritlist"));
		bean.setRANK_PREDICTOR(request.getParameter("rankpred"));
		bean.setCOLLEGE_PREDICTOR(request.getParameter("clgpredec"));
		bean.setCONSLING_PROCESS(request.getParameter("counspro"));
                bean.setCHOICE_FILLING(request.getParameter("choicefill"));
                bean.setSEAT_ALLOTMENT(request.getParameter("seatall"));
		bean.setCUT_OFFS(request.getParameter("cutoffs"));
                bean.setPARTICIPATING_COLLEGES(request.getParameter("particolle"));
                bean.setNEWS_AND_ARTICALES(request.getParameter("newsandarti"));

		

		ExamDetailsInterface dao = new ExamDetailsImpl();
                
		int result = 0;
                
                try{
                result = dao.addExamDetails(bean);
                }catch(Exception e){e.printStackTrace();}
                
		if(result>0)
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/view-examDetails.jsp?msg=college added successfully!");
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/AdminPages/view-examDetails.jsp");
		

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
