
<%@page import="com.userRegistrationBean.UserRegistrationBean"%>
<%@page import="com.careerBean.CareerScope"%>
<%@page import="com.carreerDao.CarrereScopeImplementation"%>
<%@page import="com.careerBean.ScopeDetails"%>
<%@page import="com.carreerDao.ScopeDetailsImpl"%>
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
     CarrereScopeImplementation imp = new CarrereScopeImplementation();
      CareerScope img = imp.viewScopeByID(Integer.parseInt(request.getParameter("sId")));
      
     ScopeDetailsImpl dao = new ScopeDetailsImpl();
      ScopeDetails bean =  dao.viewScopeDetailsByID(Integer.parseInt(request.getParameter("sId")));
     
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
                        <h1>How to Become a <%=img.getsName() %> </h1>
                    </div>
                </div> 
        <div class="pro-menu">
            <div class="container">
                <div class="col-md-9 col-md-offset-3">
                    
                    <ul>
                        <li><a  class="pro-act " class="nav-link" href="#scrollspyHeading0">TITLE</a></li>
                        <li><a href="#scrollspyHeading1">ABOUT</a></li>
                        <li><a href="#scrollspyHeading2">ELIGIBILITY</a></li>
                        <li><a href="#scrollspyHeading3">JOBROLE</a></li>
                        <li><a href="#scrollspyHeading4">SALARY</a></li>
                        <li><a href="#scrollspyHeading5">STUDYMATERIAL</a></li>
                        <li><a href="#scrollspyHeading6">PROS</a></li>
                        <li><a href="#scrollspyHeading7">CONS</a></li>
                        <li><a href="#scrollspyHeading8">FAQ</a></li>
                    </ul>
                        
                </div>
            </div>
        </div>
        
  
        <div class="stu-db">
            <div class="container pg-inn">
                <div class="col-md-3">
                    <div class="pro-user">
                        <img src="images/scope/<%=img.getsImage()%>" alt="user">
                    </div>
                    <div class="pro-user-bio">
                        <ul>
                            <li>
                                <h4><%=img.getsName()%></h4>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-9"  >
                    <div class="udb"  >
                        <!-- Title Start -->
                        <div class="udb-sec udb-prof" id="scrollspyHeading1" >
                            <h4><img src="images/icon/db1.png" alt="" />Title</h4>
                            <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed
                                to using 'Content here, content here', making it look like readable English.</p>
                        </div>
                        <!-- Title End -->
                        
                        <!-- About Start -->
                        <div class="udb-sec udb-cour" id="scrollspyHeading2">
                            <h4><img src="images/icon/db2.png" alt="" />About</h4>
                            <p><%=bean.getABOUT() %></p>
                            
                        </div>
                        <!-- About end -->
                        
                        <!-- ELIGIBILITY Start -->
                        <div class="udb-sec udb-cour-stat" id="scrollspyHeading3">
                            <h4><img src="images/icon/db3.png" alt="" />ELIGIBILITY</h4> 
                            <p><%=bean.getELIGIBILITY() %></p>
                        </div>
                        <!-- ELIGIBILITY end -->
                        
                        <!-- JOBROLE Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading4"  >
                            <h4 ><img src="images/icon/db3.png" alt="" />JOBROLE</h4>
                          <p><%=bean.getJOBROLE() %></p>
                        </div>
                        <!-- JOBROLE end -->
                        
                        <!-- SALARY Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading5">
                            <h4><img src="images/icon/db3.png" alt="" /> SALARY</h4>
                            <p><%=bean.getSALARY() %></p>
                        </div>
                        <!-- SALARY end -->
                        
                        <!-- STUDYMATERIAL Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading6">
                            <h4><img src="images/icon/db3.png" alt="" /> STUDYMATERIAL</h4>
                            <p><%=bean.getSTUDYMATERIAL() %></p>

                        </div>
                        <!-- STUDYMATERIAL end -->
                        
                        <!-- PROS Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading7">
                            <h4><img src="images/icon/db3.png" alt="" />PROS</h4>
                            <p><%=bean.getPROS() %></p>

                        </div>
                        <!-- PROS end -->
                        
                        <!-- CONS Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading8">
                            <h4><img src="images/icon/db3.png" alt="" /> CONS</h4>
                            <p><%=bean.getCONS() %></p>

                        </div>
                        <!-- CONS end -->
                        
                         <!-- FAQ Start -->
                           <div class="udb-sec udb-cour-stat">
                            <h4><img src="images/icon/db3.png" alt="" /> FAQ</h4>
                            <p><%=bean.getFAQ() %></p>

                        </div>
                        <!-- FAQ end -->
                        
                        
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