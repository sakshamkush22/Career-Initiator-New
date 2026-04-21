
<%@page import="com.userRegistrationBean.UserRegistrationBean"%>
<%@page import="com.courseBean.Course"%>
<%@page import="com.courseDao.CourseImpl"%>
<%@page import="com.courseBean.CourseDetails"%>
<%@page import="com.courseDao.CourseDetailsImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    
    <%
      CourseDetailsImpl dao = new CourseDetailsImpl();
     CourseDetails bean = dao.getCourseDetailsById(Integer.parseInt(request.getParameter("courseId")));
      CourseImpl dao1 = new CourseImpl();
     Course bean1 = dao1.getCourseById(Integer.parseInt(request.getParameter("courseId")));
    
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
                    <img src="images/modules/user1.png" alt="">
                    <div class="carousel-caption slider-con">
                        <h1><%=bean1.getCOURSE_NAME() %></h1>
                    </div>
                </div>
        <div class="pro-menu">
            <div class="container">
                <div class="col-md-12 col-md-offset-3">
                    
                    <ul id="proMenuList">
                        
                        <li><a  class="pro-act " class="nav-link" href="#scrollspyHeading0"></a>TITLE</li>
                        <li><a href="#scrollspyHeading1">COURSE OVERVIEW</a></li>
                        <li><a href="#scrollspyHeading2">SYLLABUS AND SUBJECTS</a></li>
                        <li><a href="#scrollspyHeading3">JOB</a></li>
                        <li><a href="#scrollspyHeading4">SCOPE</a></li>
                        <li><a href="#scrollspyHeading5">SALARY</a></li>
                        <li><a href="#scrollspyHeading6">ADMISSION</a></li>
                        <li><a href="#scrollspyHeading7">PLACEMENTS</a></li>
                        
                    </ul>
                        
                </div>
            </div>
        </div>
        
  
        <div class="stu-db">
            <div class="container pg-inn">
                <div class="col-md-3">
                    <div class="pro-user">
                        <img src="images/courses/<%=bean1.getCOURSE_IMAGE() %>" alt="user">
                    </div>
                    <div class="pro-user-bio">
                        <ul>
                            <li>
                                <h4><%=bean1.getCOURSE_NAME() %></h4>
                            </li>
                         
                        </ul>
                    </div>
                </div>
                <div class="col-md-9"  >
                    <div class="udb"  >
                        <!-- Title Start -->
                        <div class="udb-sec udb-prof" id="scrollspyHeading1" >
                            <h4><img src="images/icon/db1.png" alt=""/> TITLE </h4>
                            <p><%=bean.getTITLE() %></p>
                        </div>
                        <!-- Title End -->
                        
                        <!-- COURSE OVERVIEW Start -->
                        <div class="udb-sec udb-cour" id="scrollspyHeading2">
                            <h4><img src="images/icon/db2.png" alt="" />COURSE OVERVIEW</h4>
                            <p><%=bean.getCOURSE_OVERVIEW() %></p>
                            
                        </div>
                        <!-- COURSE OVERVIEW end -->
                        
                        <!-- SYLLABUS AND SUBJECTS Start -->
                        <div class="udb-sec udb-cour-stat" id="scrollspyHeading3">
                            <h4><img src="images/icon/db3.png" alt="" />SYLLABUS AND SUBJECTS</h4> 
                            <p><%=bean.getSYLLABUS_AND_SUBJECTS() %></p>
                        </div>
                        <!-- SYLLABUS AND SUBJECTS end -->
                        
                        <!-- JOB Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading4"  >
                            <h4 ><img src="images/icon/db3.png" alt="" />JOB</h4>
                          <p><%=bean.getJOB() %></p>
                        </div>
                        <!-- JOB end -->
                        
                        <!-- SCOPE Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading5">
                            <h4><img src="images/icon/db3.png" alt="" /> SCOPE</h4>
                            <p><%=bean.getSCOPE() %></p>
                        </div>
                        <!-- SCOPE end -->
                        
                        <!-- SALARY Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading6">
                            <h4><img src="images/icon/db3.png" alt="" /> SALARY</h4>
                            <p><%=bean.getSALARY() %></p>

                        </div>
                        <!-- SALARY end -->
                        
                        <!-- ADMISSION Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading7">
                            <h4><img src="images/icon/db3.png" alt="" />ADMISSION</h4>
                            <p><%=bean.getADMISSION() %></p>

                        </div>
                        <!-- ADMISSION end -->
                        
                        <!-- PLACEMENTS Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading8">
                            <h4><img src="images/icon/db3.png" alt="" /> PLACEMENTS</h4>
                            <p><%=bean.getPLACEMENTS() %></p>

                        </div>
                        <!-- PLACEMENTS end -->
               
                        
                        
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
    <!--FOOTER-->
      <%@include file="comanpages/footer.html" %>

    <!--Import jQuery before materialize.js-->
    <script src="js/main.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/materialize.min.js"></script>
    <script src="js/custom.js"></script>
</body>


</html>