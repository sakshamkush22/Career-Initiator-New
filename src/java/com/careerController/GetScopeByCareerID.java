

import com.careerBean.CareerScope;
import com.carreerDao.CarrereScopeImplementation;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class GetScopeByCareerID
 */
@WebServlet("/get-scope")
public class GetScopeByCareerID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetScopeByCareerID() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String scID=request.getParameter("scopeid");
//		System.out.println(scID);
		int scId=Integer.parseInt(scID);
		ArrayList<CareerScope> al = null;
            try {
                al = new CarrereScopeImplementation().viewAllScopeByCID(scId);
            } catch (SQLException ex) {
                Logger.getLogger(GetScopeByCareerID.class.getName()).log(Level.SEVERE, null, ex);
            }
		
		Iterator<CareerScope> itr=al.iterator();
		String str="";
		while(itr.hasNext()) {
			CareerScope bean= itr.next();
//			System.out.println("<option value='"+bean.getsId()+"'>"+bean.getsName()+"</option>");
			
			str=str+"<option value='"+bean.getsId()+"'>"+bean.getsName()+"</option>";
		}
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/HTML");
		out.print(str);
		
	}

}
