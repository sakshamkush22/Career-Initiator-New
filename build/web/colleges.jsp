<%@page import="com.userRegistrationBean.UserRegistrationBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.collegeBean.College"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.collegeDao.CollegeImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


  <!-- MOBILE MENU -->
     <%@include file="comanpages/header.jsp" %> 
  <!-- MOBILE MENU -->

<body>
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

	
	
    <!--SECTION START-->
    <section>
       <div class="item">
                    <img src="images/modules/college1.png" alt="">
                    <div class="carousel-caption slider-con">
                        <h1>Your Dream College Starts Here</h1>
                    </div>
                </div>
		<div class="container com-sp pad-bot-70 ">
            <div class="row">
                <div class="con-title">
                    <h2>View all<span> Colleges</span></h2>
                    <p>What are you looking for.</p>
                </div>
            </div>
                <div class="cor about-sp">
                    <div class="ed-rsear">
                        <div class="ed-rsear-in">
                            
                            <ul>
                                <%
                                     CollegeImpl daoclg = new CollegeImpl();
                                     ArrayList<College> al3 = daoclg.viewAllTopCollege();
                                     if(al3!=null){
                                     Iterator<College> itr3 = al3.iterator();
                                     while(itr3.hasNext()){
                                     College bean = itr3.next();
                                %>
                                
                                <li>
									<div class="ed-rese-grid">
										<div class="ed-rsear-img ed-faci-full-top">
                                                                                    <img src="images/college/<%=bean.getCOLLEGE_IMAGE() %>" alt="" >
										</div>
										<div class="ed-rsear-dec ed-faci-full-bot">
											<h4><a href="facilities-detail.html"><%=bean.getCOLLEGE_NAME() %></a></h4>
                                                                                        <p><i class="fa fa-location-arrow" aria-hidden="true"></i>  <%=bean.getCOLLEGE_LOCATION() %>  |  <i class="fa fa-flag" aria-hidden="true"></i>  <%=bean.getCOLLEGE_CATEGORY() %>  |  <i class="fa fa-cogs" aria-hidden="true"></i>  <%=bean.getCOLLEGE_PROGRAMS() %></p>
                                                                                        <p><%=bean.getCOLLEGE_DETAILS() %></p>
                                                                                        <a href="#!" data-toggle="modal" data-target="#modal2" class="read-line-btn">View Details</a>
                                                                                        <span class="home-top-cour-rat"><%=bean.getCOLLEGE_RATING() %><i class="fa fa-star" aria-hidden="true"></i></span>
										</div>

									</div>
                                </li>
                                <%}}%>
                          
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
       
        
    </section>
    <!--SECTION END-->
         <%}else{
      
      response.sendRedirect("index.jsp?msg=Session Time Out!!!");
     
     }
     
     
     %>
    <!--HEADER SECTION-->
    <%@include file="comanpages/footer.html" %>

    <!--Import jQuery before materialize.js-->
    <script src="js/main.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/materialize.min.js"></script>
    <script src="js/custom.js"></script>
</body>


</html>