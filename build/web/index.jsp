
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


<head>
    <title>Career Initiator- Find top colleges and University</title>
    <!-- META TAGS -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Career Initiator is a free career guidance platform helping students choose the right career path. Get expert advice, college suggestions, and personalized career support to build a successful future.">
    <meta name="keyword" content="education html template, university template, college template, school template, online education template, tution center template">
    <!-- FAV ICON(BROWSER TAB ICON) -->
    <link rel="shortcut icon" href="images/miniLogo1.png" type="image/x-icon">
    <!-- GOOGLE FONT -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700%7CJosefin+Sans:600,700" rel="stylesheet">
    <!-- FONTAWESOME ICONS -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <!-- ALL CSS FILES -->
<a href="../view-examDetails.jsp"></a>
    <link href="css/materialize.css" rel="stylesheet">
    <link href="css/bootstrap.css" rel="stylesheet" />
    <link href="css/style.css" rel="stylesheet" />
    <!-- RESPONSIVE.CSS ONLY FOR MOBILE AND TABLET VIEWS -->
    <link href="css/style-mob.css" rel="stylesheet" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
	<script src="js/html5shiv.js"></script>
	<script src="js/respond.min.js"></script>
	<![endif]-->
    
    
</head>

<body>

    <!-- MOBILE MENU -->
    <section>
        <div class="ed-mob-menu">
            <div class="ed-mob-menu-con">
                <div class="ed-mm-left">
                    <div class="wed-logo">
                        <a href="index.jsp"><img src="images/mainlogoclg.png" alt="" />
						</a>
                    </div>
                </div>
                <div class="ed-mm-right">
                    <div class="ed-mm-menu">
                        <a href="#!" class="ed-micon"><i class="fa fa-bars"></i></a>
                        <div class="ed-mm-inn">
                            <a href="#!" class="ed-mi-close"><i class="fa fa-times"></i></a>
                            <h4>Browse Categories</h4>
                            <ul>
                                <li><a href="" data-toggle="modal" data-target="#modal2">Career</a></li>
                                <li><a href=""data-toggle="modal" data-target="#modal2">Course</a></li>
                                <li><a href="" data-toggle="modal" data-target="#modal2">Exam</a></li>
                                <li><a href=""data-toggle="modal" data-target="#modal2">College</a></li>
                                <li><a href=""data-toggle="modal" data-target="#modal2">About Us</a></li>
                                <li><a href=""data-toggle="modal" data-target="#modal2">Contect Us</a></li>
                            </ul>
                            <h4>User Account</h4>
                            <ul>
                                <li><a href="#!" data-toggle="modal" data-target="#modal11">Sign In</a></li>
                                <li><a href="#!" data-toggle="modal" data-target="#modal2">Register</a></li>
                            </ul>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
   <!-- MOBILE MENU END -->  
    <!--HEADER SECTION-->
    <section>
        <!-- TOP BAR -->
        <div class="ed-top">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="ed-com-t1-left">
                            <ul>
                                <li><a href="#">Contact: Apsara Talkies Bhopal</a>
                                </li>
                                <li><a href="#">Phone: +917987081188</a>
                                </li>
                            </ul>
                        </div>
                        
                        <div class="ed-com-t1-right">
                            <ul>
                                <li><a href="#!" data-toggle="modal" data-target="#modal11">Sign In</a>
                                </li>
                                <li><a href="#!" data-toggle="modal" data-target="#modal2">Sign Up</a>
                                </li>
                            </ul>
                        </div>
                        <div class="ed-com-t1-social">
                            <ul>
                                
                                <li><a href="https://www.facebook.com/profile.php?id=61582953866454"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                                </li>
                                <li><a href="https://www.instagram.com/careerinitiator.in?igsh=eDNxdHpiOG5jYXR6"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                                </li>
                                <li><a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a>
                                </li>
                                 <li><a href="https://wa.me/message/3W6GPGQIIVWUH1"><i class="fa fa-whatsapp" aria-hidden="true"></i></a>
                                </li>
                                 <li><a href="https://youtube.com/@careerinitiator?si=HmvNXbnv0tPfisuP"><i class="fa fa-youtube" aria-hidden="true"></i></a>
                                </li>
                            </ul>
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>

    <!-- LOGO AND MENU SECTION -->
        <div class="top-logo" data-spy="affix" data-offset-top="250">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="wed-logo">
                            <a href="index.jsp"><img src="images/mainlogoclg.png" alt="" />
                            </a>
                        </div>
                        <div class="main-menu">
                            <ul>
                                <li><a href="#!" data-toggle="modal" data-target="#modal2">Home</a>
                                </li>
                                   <li class="about-menu">
                                    <a href="#!" data-toggle="modal" data-target="#modal2" class="mm-arr">Career</a>
                                   </li>
                                 <li><a href="#!" data-toggle="modal" data-target="#modal2">Course</a>
                                </li>
                                 <li><a href="#!" data-toggle="modal" data-target="#modal2">Exam</a>
                                </li>
                                 <li><a href="#!" data-toggle="modal" data-target="#modal2">College</a>
                                </li>
                                <li><a href="#!" data-toggle="modal" data-target="#modal2">About Us</a>
                                </li>
                                 <li><a href="#!" data-toggle="modal" data-target="#modal2">Contect Us</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="all-drop-down-menu">

                    </div>

                </div>
            </div>
        </div>
      
    </section>
    <!--END HEADER SECTION-->

    <!-- SLIDER -->
    <section>
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Wrapper for slides -->
            <div class="carousel-inner">
                 <div class="item slider1 active">
                    <img src="images/slider/sld6.png" alt="">
                    <div class="carousel-caption slider-con">
                        <h2>Right <span>Career.</span> Right <span>Course.</span> Right<span> Exam.</span>  Right<span> College.</span></h2>
                        <p>Career Initiator is Career Guidance Platform to provide free career guidnace to choice right career path and build your future</p>
<!--                        <a href="#" class="bann-btn-1">Admission</a><a href="#" class="bann-btn-2">Read More</a>-->
                    </div>
                </div>
               <div class="item">
                    <img src="images/slider/sld7.png" alt="" >
                    <div class="carousel-caption slider-con">
                        <h2>Register <span>Now... </h2>
                        <p>Register today and shaping your future with the right guidance... </p>
<!--                        <a href="#" class="bann-btn-1">Admission</a><a href="#" class="bann-btn-2">Read More</a>-->
                    </div>
                </div>
<!--                <div class="item">
                    <img src="images/slider/sld02.png" alt="">
                    <div class="carousel-caption slider-con">
                        <h2>Right <span>Career.</span> Right <span>Course.</span> Right<span>Exam.</span>  Right<span>College.</span>  </h2>
                        <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form</p>
                        <a href="#" class="bann-btn-1">Admission</a><a href="#" class="bann-btn-2">Read More</a>
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
                            <a class="course-overlay" href="#!" data-toggle="modal" data-target="#modal2">
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
                                                                            <li style="width: 100%; background: #002147;"><a href="#!" data-toggle="modal" data-target="#modal2"><i class="fa fa-eye" aria-hidden="true"></i>VIEW DETAILS</a></li>
                                                                           
										
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
                    <h2>Important <span> Exams </span></h2>
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
								<a href="#!" data-toggle="modal" data-target="#modal2">
							<h3><%=bean.getEXAM_NAME() %></h3>
								</a>
                                                                <div class="ed-rsear-dec">
											
                                                                    <a href="#!" data-toggle="modal" data-target="#modal2"><span>Field : </span><%=bean.getEXAM_FEILD() %></a><br>
								    <a href="#!" data-toggle="modal" data-target="#modal2"><span>Detail : </span><%=bean.getEXAM_DETAIL() %></a><br>			
											
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
    <!-- COLLEGE MODULE END-->
    

    <!-- FOOTER -->
    <section class="wed-hom-footer">
        <div class="container">
            <div class="row wed-foot-link">
                <div class="col-md-4 foot-tc-mar-t-o">
                    <h4>Top Career</h4>
                    <ul>
                        <li><a href="#">Engineering</a></li>
                        <li><a href="#">Medical / Doctor</a></li>
                        <li><a href="#">Data Science & AI</a></li>
                        <li><a href="#">Software Developer</a></li>
                        <li><a href="#">Business Management</a></li>
                        <li><a href="#">Chartered Accountant</a></li>
                        <li><a href="#">Government Jobs</a></li>
                        <li><a href="#">Law / Advocate</a></li>
                    </ul>
                </div>
                <div class="col-md-4">
                    <h4>Top Courses</h4>
                    <ul>
                        <li><a href="#">B.Tech</a></li>
                        <li><a href="#">MBBS</a></li>
                        <li><a href="#">MBA</a></li>
                        <li><a href="#">BCA</a></li>
                        <li><a href="#">MCA</a></li>
                        <li><a href="#">Data Science</a></li>
                        <li><a href="#">Artificial Intelligence</a></li>
                        <li><a href="#">CA</a></li>
                    </ul>
                </div>
                <div class="col-md-4">
                    <h4>HELP & SUPPORT</h4>
                    <ul>
                        <li><a href="#">24x7 Live help</a>
                        </li>
                        <li><a href="#">Contact us</a>
                        </li>
                        <li><a href="#">Feedback</a>
                        </li>
                        <li><a href="#">FAQs</a>
                        </li>
                        <li><a href="#">Student Support</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="row wed-foot-link-1">
                <div class="col-md-4 foot-tc-mar-t-o">
                    <h4>Get In Touch</h4>
                    <p>Address: Floor First, 141, <br>Old Subhash Nagar Colony, Govindpura, Bhopal</p>
                    <p>Phone: <a href="#!">+91 79870 81188</a></p>
                    <p>Email: <a href="#!">careerinitiator1188@gmail.com</a></p>
                </div>
                
                <div class="col-md-4 foot-tc-mar-t-o">
                    <h4>Quick Links</h4>
                    <p><a href="#">Career</a></p>
                    <p><a href="#">Course</a></p>
                    <p><a href="#">Exam</a></p>
                    <p><a href="#">College</a></p>
                    
                </div>
               
                <div class="col-md-4">
                    <h4>SOCIAL MEDIA</h4>
                    <ul>
                        <li><a href="https://www.facebook.com/profile.php?id=61582953866454"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                        </li>
                        <li><a href="https://www.instagram.com/careerinitiator.in?igsh=eDNxdHpiOG5jYXR6"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                        </li>
                        <li><a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a>
                        </li>
                        <li><a href="https://youtube.com/@careerinitiator?si=HmvNXbnv0tPfisuP"><i class="fa fa-youtube" aria-hidden="true"></i></a>
                        </li>
                        <li><a href="https://wa.me/message/3W6GPGQIIVWUH1"><i class="fa fa-whatsapp" aria-hidden="true"></i></a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
<section class="wed-rights">
        <div class="container">
            <div class="row">
                <div class="copy-right">
                   <a target="_blank" href="AdminPages/admin-login.jsp">© 2026 Career Initiator. All Rights Reserved.</a>
                </div>
            </div>
        </div>
    </section>

    <!-- FOOTER END --> 

    <!--SECTION LOGIN, REGISTER AND FORGOT PASSWORD-->
    <section>
        <!-- LOGIN SECTION -->
        <div id="modal11" class="modal" role="dialog">
            <div class="log-in-pop">
<!--                <div class="log-in-pop-left">
                    <h1>Hello...</h1>
                    <p>Don't have an account? Create your account. It's take less then a minutes</p>
                    <h4>Login with social media</h4>
                    <ul>
                        <li><a href="#"><i class="fa fa-facebook"></i> Facebook</a>
                        </li>
                        <li><a href="#"><i class="fa fa-google"></i> Google+</a>
                        </li>
                        <li><a href="#"><i class="fa fa-twitter"></i> Twitter</a>
                        </li>
                    </ul>
                </div>-->
                <div class="log-in-pop-right">
                    <a href="#" class="pop-close" data-dismiss="modal"><img src="images/cancel.png" alt="" />
                    </a>
                    <h4>Login</h4>
                    <p>Don't have an account? Create your account. It's take less then a minutes</p>
                    <form class="s12" action="./LogInServ" id="loginForm">
                        <div>
                            <div class="input-field s12">
                                <input type="email" data-ng-model="name" class="validate" name="uemail">
                                <label>Email</label>
                            </div>
                        </div>
                        <div>
                            <div class="input-field s12">
                                <input type="password" class="validate" name="upass">
                                <label>Password</label>
                            </div>
                        </div>
                        
                        <div>
                            <div class="input-field s4">
                                <input type="submit" value="Login" class="waves-effect waves-light log-in-btn"> </div>
                        </div>
                        <div>
                            <div class="input-field s12"> <a href="#" data-dismiss="modal" data-toggle="modal" data-target="#modal3">Forgot password</a> | <a href="#" data-dismiss="modal" data-toggle="modal" data-target="#modal2">Create a new account</a> </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- REGISTER SECTION -->
        <div id="modal2" class="modal fade" role="dialog">
            <div class="log-in-pop">
<!--                <div class="log-in-pop-left">
                    <h1>Hello...</h1>
                    <p>Don't have an account? Create your account. It's take less then a minutes</p>
                    <h4>Login with social media</h4>
                    <ul>
                        <li><a href="#"><i class="fa fa-facebook"></i> Facebook</a>
                        </li>
                        <li><a href="#"><i class="fa fa-google"></i> Google+</a>
                        </li>
                        <li><a href="#"><i class="fa fa-twitter"></i> Twitter</a>
                        </li>
                    </ul>
                </div>-->
                <div class="log-in-pop-right">
                    <a href="#" class="pop-close" data-dismiss="modal"><img src="images/cancel.png" alt="" />
                    </a>
                    <h4>Create an Account</h4>
                    <p>Don't have an account? Create your account. It's take less then a minutes</p>
                    <form class="s12" id="signupForm">
                        <div>
                            <div class="input-field s12">
                                <input type="text" data-ng-model="name1" class="validate" name="uname" required pattern="^[A-Za-z]+(?: [A-Za-z]+)*$" title="Name should be in character latter">
                                <label>Full Name</label>
                            </div>
                        </div>
                        <div>
                            <div class="input-field s12">
                                <input type="email" class="validate" name="uemail" required pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$" title="Please enter a valid email address (e.g., user@example.com)">
                                <label>Email id</label>
                            </div>
                        </div>
                        <div>
                            <div class="input-field s12">
                                <input type="text" class="validate" name="uwts" required pattern="[6-9][0-9]{9}" title="Enter a valid 10-digit Indian mobile number starting with 6-9">
                                <label>Whatssap No</label>
                            </div>
                        </div>
                          <div>
                            <div class="input-field s12">
                                <select name="stream" required>
                                    <option>Select Stream</option>
                                    <option>Engineering</option>
                                    <option>Medical</option>
                                    <option>Commerce & Management</option>
                                    <option>Law</option>
                                    <option>Education / Teaching</option>
                                    <option>Government Exams / Civil Services</option>
                                    <option>IT & Software</option>
                                    <option>Others</option>
                                    
                                </select>
                                
                              
                            </div>
                        </div>
                                 <div>
                            <div class="input-field s12">
                                <select name="level" required>
                                    <option>Select Level</option>
                                    <option>High School</option>
                                    <option>High Secondary School</option>
                                    <option>Ug</option>
                                    <option>PG</option>
                                    <option>Diploma</option>
                                    <option>P.hd</option>
                                    <option>Certificate</option>
                                    <option>Others</option>
                                    
                                </select>
                                
                              
                            </div>
                        </div>
                       
                        <div>
                            <div class="input-field s12">
                                <input type="password" class="validate" name="upass" required pattern=".{6,}" title="Password must be at least 6 characters long" >
                                <label>Password</label>
                            </div>
                        </div>
                        <div>
                            <div class="input-field s12">
                                <input type="text" required class="validate" name="uaddress">
                                <label>Address</label>
                            </div>
                        </div>
                        <div>
                            <div class="input-field s4">
                                <input type="submit" value="Register" class="waves-effect waves-light log-in-btn" >
                            </div>
                        </div>
                        <div>
                            <div class="input-field s12"> <a href="#" data-dismiss="modal" data-toggle="modal" data-target="#modal11">Are you a already member ? Login</a> </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- FORGOT SECTION -->
        <div id="modal3" class="modal fade" role="dialog">
            <div class="log-in-pop">
<!--                <div class="log-in-pop-left">
                    <h1>Hello... </h1>
                    <p>Don't have an account? Create your account. It's take less then a minutes</p>
                    <h4>Login with social media</h4>
                    <ul>
                        <li><a href="#"><i class="fa fa-facebook"></i> Facebook</a>
                        </li>
                        <li><a href="#"><i class="fa fa-google"></i> Google+</a>
                        </li>
                        <li><a href="#"><i class="fa fa-twitter"></i> Twitter</a>
                        </li>
                    </ul>
                </div>-->
                <div class="log-in-pop-right">
                    <a href="#" class="pop-close" data-dismiss="modal"><img src="images/cancel.png" alt="" />
                    </a>
                    <h4>Forgot password</h4>
                    <p>Don't have an account? Create your account. It's take less then a minutes</p>
                    <form class="s12"action="./ForgetPasswordSrv">
                        <div>
                            <div class="input-field s12">
                                <input type="text" data-ng-model="name3" required class="validate" name="femail">
                                <label>Enter Email Id</label>
                            </div>
                            <div class="input-field s12">
                                <input type="text" data-ng-model="name3" required class="validate" name="fopass">
                                <label>Enter Old Password</label>
                            </div>
                            <div class="input-field s12">
                                <input type="text" data-ng-model="name3" required class="validate" name="fnpass">
                                <label>Enter New Password</label>
                            </div>
                        </div>
                        <div>
                            <div class="input-field s4">
                                <input type="submit" value="Submit" class="waves-effect waves-light log-in-btn"> </div>
                        </div>
                        <div>
                            <div class="input-field s12"> <a href="#" data-dismiss="modal" data-toggle="modal" data-target="#modal11">Are you a already member ? Login</a> | <a href="#" data-dismiss="modal" data-toggle="modal" data-target="#modal2">Create a new account</a> </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
   <!--SECTION LOGIN, REGISTER AND FORGOT PASSWORD END-->

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