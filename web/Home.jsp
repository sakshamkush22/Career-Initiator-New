
<%@page import="com.userRegistrationBean.UserRegistrationBean"%>
<%@page import="com.examBean.Exam"%>
<%@page import="com.examDao.ExamImpl"%>
<%@page import="com.collegeBean.College"%>
<%@page import="com.collegeDao.CollegeImpl"%>
<%@page import="com.courseBean.Course"%>
<%@page import="com.courseDao.CourseImpl"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.careerBean.AddCarreer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.carreerDao.AddCarrereImplementation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    
  <!-- Header Start -->
     <%@include file="comanpages/header.jsp" %> 
  <!-- Header End -->

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

    <!--HEADER SECTION-->

        <%@include file="comanpages/nav-bar.jsp" %>
       
    <!--END HEADER SECTION-->

    <!-- SLIDER -->
    <section>
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Wrapper for slides -->
            <div class="carousel-inner">
                <div class="item slider1 active">
                    <img src="images/slider/sld6.png" alt="" >
                     <div class="carousel-caption slider-con">
                        <h2>Welcome To <span>Career</span> Initiator</h2>
                        <p>Career Initiator is Career Guidance Platform to provide free career guidnace to choice right career path and build your future</p>
<!--                        <a href="#" class="bann-btn-1">Admission</a><a href="#" class="bann-btn-2">Read More</a>-->
                    </div>
                   
                </div>
                <div class="item">
                    <img src="images/slider/sld7.png" alt="" >
                    <div class="carousel-caption slider-con">
                        <h2>Start Your<span> Career</span></h2>
                        <p>Finding best career opportunity with career initiator... </p>
<!--                        <a href="#" class="bann-btn-1">Admission</a><a href="#" class="bann-btn-2">Read More</a>-->
                    </div>
                </div>
<!--                <div class="item">
                    <img src="images/slider/slider3.jpg" alt="">
                    <div class="carousel-caption slider-con">
                        <h2>Education <span>Master</span></h2>
                        <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form</p>
                        <a href="#" class="bann-btn-1">All Courses</a><a href="#" class="bann-btn-2">Read More</a>
                    </div>
                </div>-->
            </div>

        
        </div>
    </section>

   
    <!-- Career Module -->
    <section>
        <div class="container com-sp pad-bot-70">
            <div class="row">
                <div class="con-title">
                    <h2>Explore<span> Careers</span></h2>
                    <p>What are you looking for.</p>
                </div>
            </div>
            <div class="row">
                <div class="ed-course">
                    	<%                                                   
                                                                        	AddCarrereImplementation impI = new AddCarrereImplementation();
	                                                                        ArrayList<AddCarreer> al = impI.viewAllTops();
                                                                                if(al!=null){
	                                                                        Iterator itr = al.iterator();
	                                                                        int sNo = 0;    
									    while (itr.hasNext()) {
										sNo++;

										AddCarreer bean = (AddCarreer)itr.next();
									%>
                    <div class="col-md-3 col-sm-4 col-xs-12">
                        <div class="ed-course-in">
                            <a class="course-overlay" href="career-scope.jsp?carId=<%=bean.getcId() %>">
                                <img src="images/career/<%=bean.getcImage() %>" alt="" >
                                <span><%=bean.getcName() %></span>
                            </a>
                        </div>
                    </div>
                <%}}%>
                </div>
            </div>
        </div>
    </section>
   <!-- Carrier module end -->

    <!-- COURSES MODULE -->
    <section>
   
	    <div class="container com-sp pad-bot-70">
            <div class="row">
                <div class="con-title">
                    <h2>Popular<span> Courses</span></h2>
                    <p>What are you looking for.</p>
                </div>
            </div>
            <div class="row">
                <div class="ed-course">
                    
                <% 
                   CourseImpl dao = new CourseImpl();
                   ArrayList<Course> al2 = dao.getAllTopCourse();
                   if(al!=null){
                   Iterator<Course> itr2 = al2.iterator();
                   int sno = 0;
                    while(itr2.hasNext()){
                        Course bean = itr2.next();
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
     </div>
        
        
    </section>
    <!-- COURSES MODULE END -->
    
    <!--SECTION EXAM START-->
    <section>
		<div class="container com-sp pad-bot-70">
            <div class="row">
                <div class="con-title">
                    <h2>Important <span>Exams </span></h2>
                    <p>What are you looking for.</p>
                </div>
            </div>
            <div class="row">
                <div class="ed-course">
                    
                <% 
                   ExamImpl daoexm = new ExamImpl();
                   ArrayList<Exam> al4 = daoexm.getAllTopExam();
                   if(al4!=null){
                   Iterator<Exam> itr4 = al4.iterator();
                   int sno = 0;
                    while(itr4.hasNext()){
                        Exam bean = itr4.next();
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
								<a href="course-details.html">
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
                </div>
        
    </section>
    <!--SECTION EXAM END-->
    
    
    <!-- COLLEGE MODULE START -->
    <section>
      
		<div class="container com-sp pad-bot-70 ">
            <div class="row">
                <div class="con-title">
                    <h2>Choose Best<span> Colleges</span></h2>
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
                                                                                        <a href="college-details.jsp?clgId=<%=bean.getCOLLEGE_ID() %>" class="read-line-btn">View Details</a>
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
    <!-- COLLEGE MODULE END-->
    

    <!-- FOOTER -->
    <%@include file="comanpages/footer.html" %>
    <!-- FOOTER END --> 

     <%}else{
      
      response.sendRedirect("index.jsp?msg=Session Time Out!!!");
     
     }     
     %>

    <!--Import jQuery before materialize.js-->
    <%
	 String msg=request.getParameter("msg");
	 if(msg!=null)
	 {%>
	<script type="text/javascript">
       alert("<%= msg%>");
    </script>
	<% }%>
   
    <script src="js/main.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/materialize.min.js"></script>
    <script src="js/custom.js"></script>
    <script src="myScript.js" ></script>

</body>

</html>