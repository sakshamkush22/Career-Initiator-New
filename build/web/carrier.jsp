<%@page import="com.userRegistrationBean.UserRegistrationBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.careerBean.AddCarreer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.carreerDao.AddCarrereImplementation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">


  <!-- MOBILE MENU -->
     <%@include file="comanpages/header.jsp" %> 
  <!-- MOBILE MENU -->

<body>

    <!-- MOBILE MENU -->
     <%
       HttpSession s1= request.getSession();
       UserRegistrationBean b1=(UserRegistrationBean)s1.getAttribute("bean");
     if(b1!=null)
         
     {
    %>
    
      <!-- MOBILE MENU -->
     <%@include file="comanpages/mobile-menu.jsp" %> 
     <!-- MOBILE MENU --> 
 
        <!-- LOGO AND MENU SECTION -->
      <%@include file="comanpages/nav-bar.jsp" %>
    <!--END HEADER SECTION-->
    
<!-- Career Module -->
    <section>
        <div class="item">
                    <img src="images/modules/career.jpg" alt="">
                    <div class="carousel-caption slider-con">
                        <h1>Career Option Choices</h1>
<!--                        <p>Choose the best career options with expert guidance, smart planning, and a clear roadmap to build your successful future.</p>-->
                    </div>
      </div>   
     <div class="ed-res-bg">
		<div class="container com-sp pad-bot-70 ed-res-bg">
            <div class="row">
                <div class="con-title">
                    <h2>All Career <span></span></h2>
                    <p>What are you looking for.</p>
                </div>
            </div>
            <div class="row">
                <div class="ed-course">
                    							<%
                                                                        	AddCarrereImplementation impI = new AddCarrereImplementation();
	                                                                        ArrayList<AddCarreer> al = impI.viewAll();
                                                                                if(al!=null){
	                                                                        Iterator itr = al.iterator();
	                                                                        int sNo = 0;    
									    while (itr.hasNext()) {
										sNo++;

										AddCarreer bean = (AddCarreer)itr.next();
									%>
                    <div class="col-md-3 col-sm-4 col-xs-12">
                        <div class="ed-course-in">
                            <a  class="course-overlay" href="career-scope.jsp?carId=<%=bean.getcId() %>">
                                <img src="images/career/<%=bean.getcImage() %>" alt="" style="height: 100%; width: 100%">
                                <span><%=bean.getcName() %></span>
                            </a>
                        </div>
                    </div>
                 <%}}%>
                </div>
                
            </div>
        </div>
     </div>
        
    </section>
   <!-- Carrier module end -->
  
   
    <!--FOOTER SECTION-->
    <%@include file="comanpages/footer.html" %>
    <%}else{
      
      response.sendRedirect("index.jsp?msg=Session Time Out!!!");
     
     }%>
      <%
	 String msg=request.getParameter("msg");
	 if(msg!=null)
	 {%>
	<script type="text/javascript">
       alert("<%= msg%>");
    </script>
	<% }%>
    <!--Import jQuery before materialize.js-->
    <script src="js/main.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/materialize.min.js"></script>
    <script src="js/custom.js"></script>
</body>


</html>
