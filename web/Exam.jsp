<%@page import="com.userRegistrationBean.UserRegistrationBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.examBean.Exam"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.examDao.ExamImpl"%>
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

    <!--HEADER SECTION-->


    <!-- LOGO AND MENU SECTION -->
      <%@include file="comanpages/nav-bar.jsp" %>
    <!--END HEADER SECTION--> 
              
    <!--SECTION START-->
    
    <section>
    <div class="item">
                    <img src="images/modules/exam3.png" alt="">
                    <div class="carousel-caption slider-con">
                        <h1>FIND THE RIGHT EXAM FOR YOUR CAREER</h1 >
                    </div>
                </div>    
     <div class="ed-res-bg">
		<div class="container com-sp pad-bot-70 ed-res-bg">
            <div class="row">
                <div class="con-title">
                    <h2>All Exams <span></span></h2>
                    <p>What are you looking for.</p>
                </div>
            </div>
            <div class="row">
                <div class="ed-course">
                    
                <% 
                   ExamImpl dao = new ExamImpl();
                   ArrayList<Exam> al = dao.getAllExam();
                   if(al!=null){
                   Iterator<Exam> itr = al.iterator();
                   int sno = 0;
                    while(itr.hasNext()){
                        Exam bean = itr.next();
                        sno++;
                    
                     
                %>
                    <div class="col-md-6 col-sm-4 col-xs-12">
						<div class="home-top-cour">
							<!--POPULAR COURSES IMAGE-->
							<div class="col-md-4">
                                                            <img src="images/exam/<%=bean.getEXAM_IMAGE() %>" alt="">
							</div>
							<!--POPULAR COURSES: CONTENT-->
							<div class="col-md-8 home-top-cour-desc">
                                                            <a href="exam-details.jsp?examId=<%=bean.getEXAM_ID() %>">
							<h3><%=bean.getEXAM_NAME() %></h3>
								</a>
                                                                <div class="ed-rsear-dec">
											
                                                                    <a href="#"><span>Field : </span><%=bean.getEXAM_FEILD() %></a><br>
								    <a href="#"><span>Detail : </span><%=bean.getEXAM_DETAIL() %></a><br>			
											
										</div>
								
<!--                                                                  <div class="hom-list-share">
									<ul>
                                                                            <li style="width: 80%; background: darkslategray; " ><a href="exam-details.jsp?examId=<%=bean.getEXAM_ID() %>"><i class="fa fa-eye" aria-hidden="true"></i>VIEW DETAILS</a></li>
                                                                           
										
									</ul>
								</div>-->
                                                                 

							
						
                    </div>
                    
                </div>
            
            </div>
                                                                     <%}}%>
        </div>
     </div>
        
    </section>
    <!--SECTION END-->
      <%}else{
      
      response.sendRedirect("index.jsp?msg=Session Time Out!!!");
     
     }
     
     
     %>

    <!--FOOTER SECTION START-->
      <%@include file="comanpages/footer.html" %>
       <!--FOOTER SECTION END-->

    <!--Import jQuery before materialize.js-->
    <script src="js/main.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/materialize.min.js"></script>
    <script src="js/custom.js"></script>
</body>


</html>