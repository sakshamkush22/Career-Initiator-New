
<%@page import="com.userRegistrationBean.UserRegistrationBean"%>
<%@page import="com.courseBean.Course"%>
<%@page import="com.courseDao.CourseImpl"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
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

	<!-- Add Cousre Main Section Start -->
	<section>
        <div class="item">
                    <img src="images/modules/course.jpg" alt="">
                    <div class="carousel-caption slider-con">
                        <h1>Choose Right Course For Bright Future</h1>
                    </div>
                </div>    
     <div class="ed-res-bg">
		<div class="container com-sp pad-bot-70 ed-res-bg">
            <div class="row">
                <div class="con-title">
                    <h2>All Courses <span></span></h2>
                    <p>What are you looking for.</p>
                </div>
            </div>
            <div class="row">
                <div class="ed-course">
                    
                <% 
                   CourseImpl dao = new CourseImpl();
                   ArrayList<Course> al = dao.getAllCourse();
                   if(al!=null){
                   Iterator<Course> itr = al.iterator();
                   int sno = 0;
                    while(itr.hasNext()){
                        Course bean = itr.next();
                        sno++;
                    
                     
                %>
                    <div class="col-md-6 col-sm-4 col-xs-12">
						<div class="home-top-cour">
                                                    <div class="col-md-4">
                                                            <img src="images/courses/<%=bean.getCOURSE_IMAGE() %>" alt="" >
							</div>
							<div class="col-md-8 home-top-cour-desc">
								<a href="course-details.html">
							<h3><%=bean.getCOURSE_NAME() %></h3>
								</a>
                                                                <div class="hom-list-share">
                                                                    <ul>
                                                                            <li><a href="course-details.html" style="color: #002147 "><p>Avrage Fees</p><i class="fa fa-inr" aria-hidden="true"></i><%=bean.getAVRAGE_FEES() %></a></li>
									    <li><a href="course-details.html" style="color: #002147 "><p>Avrage Duration</p><i class="fa fa-clock-o" aria-hidden="true"></i><%=bean.getAVRAGE_DURATION() %></a></li>
										
									</ul>
								</div>
								<p><%=bean.getDETAIL() %></p>
                                                                  <div class="hom-list-share">
									<ul>
                                                                            <li style="width: 100%; background: #002147;"><a href="course-details.jsp?courseId=<%=bean.getCOURSE_ID() %>"><i class="fa fa-eye" aria-hidden="true"></i>VIEW DETAILS</a></li>
                                                                           
										
									</ul>
								</div>
                                                                  <span class="home-top-cour-rat">Follow</span>

							
						
                    </div>
                    
                </div>
            
            </div>
                                                                     <%}}%>
        </div>
     </div>
        
    </section>
        
        <!--FOOTER SECTION-->
	  <%@include file="comanpages/footer.html" %>
          
          <%}else{
      
      response.sendRedirect("index.jsp?msg=Session Time Out!!!");
     
     }
          %>
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

