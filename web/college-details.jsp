

<%@page import="com.userRegistrationBean.UserRegistrationBean"%>
<%@page import="com.collegeBean.CollegeDetails"%>
<%@page import="com.collegeDao.CollegeDetailsImpl"%>
<%@page import="com.collegeBean.College"%>
<%@page import="com.collegeDao.CollegeImpl"%>
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
     CollegeImpl imp = new CollegeImpl();
      College clg = imp.viewCollegeByID(Integer.parseInt(request.getParameter("clgId")));
     CollegeDetailsImpl dao = new CollegeDetailsImpl();
      CollegeDetails bean =  dao.viewCollegeDetailsByID(Integer.parseInt(request.getParameter("clgId")));
     
    %> 
    
  <!-- MOBILE MENU -->
     <%@include file="comanpages/mobile-menu.jsp" %> 
     <!-- MOBILE MENU --> 

  
  
    <!-- LOGO AND MENU SECTION -->
    <%@include file="comanpages/nav-bar.jsp" %>
       
    
    <!--END HEADER SECTION-->

    <!--SECTION START-->
    <section>
        <div>
              <!--SECTION START-->
    <section class="c-all p-semi p-event">
        <div class="semi-inn">
            <div class="semi-com semi-left">
                <div class="all-title quote-title qu-new semi-text eve-reg-text">
                    <h2><%=clg.getCOLLEGE_NAME() %></h2>
                    <p><%=clg.getCOLLEGE_DETAILS() %></p>
                    <div class="semi-deta eve-deta">
                        <ul>
                            
                            <li>Location:<span><%=clg.getCOLLEGE_LOCATION() %></span></li>
                            <li>Category<span><%=clg.getCOLLEGE_CATEGORY() %></span></li>
                            <li>Programs:<span><%=clg.getCOLLEGE_PROGRAMS() %></span></li>
                            
                        </ul>
                    </div>
                    <p class="help-line">Join this for free!</p>
                </div>
            </div>
            <div class="semi-com semi-right">
                <img src="images/college/<%=clg.getCOLLEGE_IMAGE() %>" style="width: 400px; height: 300px">
                <span class="home-top-cour-rat"><%=clg.getCOLLEGE_RATING() %><i class="fa fa-star" aria-hidden="true"></i></span>
            </div>
        </div>
    </section>
    <!--SECTION END-->
        </div>
        <div class="pro-menu">
            <div class="container">
                   
                    <ul id="proMenuList">
                        <li><a  class="pro-act " class="nav-link" href="#scrollspyHeading0">OVERVIEW</a></li>
                        <li><a href="#scrollspyHeading1">COURSE</a></li>
                        <li><a href="#scrollspyHeading2">JOB READY DEGREE</a></li>
                        <li><a href="#scrollspyHeading3">ADMISSION</a></li>
                        <li><a href="#scrollspyHeading4">PLACEMENTS</a></li>
                        <li><a href="#scrollspyHeading5">CUT OFFS</a></li>
                        <li><a href="#scrollspyHeading6">GALLERY</a></li>
                        <li><a href="#scrollspyHeading7">AVRAGE PACKAGE</a></li>
                        <li><a href="#scrollspyHeading8">FEES</a></li>
                        <li><a href="#scrollspyHeading9">REVIEWS</a></li>
                        <li><a href="#scrollspyHeading10">SCHOLARSHIP</a></li>
                        <li><a href="#scrollspyHeading11">NEWS</a></li>
                        <li><a href="#scrollspyHeading12">HOSTEL</a></li>
                      
                        
                    </ul>
                     
                </div>
            </div>
        
        
        
  
        <div class="stu-db">
            <div class="container pg-inn">
                
                <div class="col-md-12"  >
                    <div class="udb"  >
                        <!-- OVERVIEW Start -->
                        <div class="udb-sec udb-prof" id="scrollspyHeading1" >
                            <h4><img src="images/icon/db1.png" alt="" />OVERVIEW</h4>
                            <p><%=bean.getOVERVIEW() %></p>
                        </div>
                        <!-- OVERVIEW End -->
                        
                        <!-- COURSE Start -->
                        <div class="udb-sec udb-cour" id="scrollspyHeading2">
                            <h4><img src="images/icon/db2.png" alt="" />COURSE</h4>
                            <p><%=bean.getCOURSE() %></p>
                            
                        </div>
                        <!-- COURSE end -->
                        
                        <!-- JOB_READY_DEGREE Start -->
                        <div class="udb-sec udb-cour-stat" id="scrollspyHeading3">
                            <h4><img src="images/icon/db3.png" alt="" />JOB READY DEGREE</h4> 
                            <p><%=bean.getJOB_READY_DEGREE() %></p>
                        </div>
                        <!-- JOB_READY_DEGREE end -->
                        
                        <!-- ADMISSION Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading4"  >
                            <h4 ><img src="images/icon/db3.png" alt="" />ADMISSION</h4>
                          <p><%=bean.getADMISSION() %></p>
                        </div>
                        <!-- ADMISSION end -->
                        
                        <!-- PLACEMENTS FORM Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading5">
                            <h4><img src="images/icon/db3.png" alt="" /> PLACEMENTS</h4>
                            <p><%=bean.getPLACEMENTS() %></p>
                        </div>
                        <!-- PLACEMENTS FORM end -->
                        
                        <!-- CUT_OFFS Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading6">
                            <h4><img src="images/icon/db3.png" alt="" /> CUT OFFS</h4>
                            <p><%=bean.getCUT_OFFS() %></p>

                        </div>
                        <!-- CUT_OFFS end -->
                        
                        <!-- GALLERY Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading7">
                            <h4><img src="images/icon/db3.png" alt="" />GALLERY</h4>
                            <p><%=bean.getGALLERY() %></p>

                        </div>
                        <!-- GALLERY end -->
                        
                        <!-- AVRAGE_PACKAGE Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading8">
                            <h4><img src="images/icon/db3.png" alt="" /> AVRAGE PACKAGE</h4>
                            <p><%=bean.getAVRAGE_PACKAGE() %></p>

                        </div>
                        <!-- AVRAGE_PACKAGE end -->
                        
                         <!-- FEES Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading9">
                            <h4><img src="images/icon/db3.png" alt="" /> FEES</h4>
                            <p><%=bean.getFEES() %></p>

                        </div>
                        <!-- FEES end -->
                              <!-- REVIEWS Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading10">
                            <h4><img src="images/icon/db3.png" alt="" /> REVIEWS</h4>
                            <p><%=bean.getREVIEWS() %></p>

                        </div>
                        <!-- REVIEWS end -->
                        
                              <!-- SCHOLARSHIP Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading11">
                            <h4><img src="images/icon/db3.png" alt="" /> SCHOLARSHIP</h4>
                            <p><%=bean.getSCHOLARSHIP() %></p>

                        </div>
                        <!-- SCHOLARSHIP end -->
                        
                              <!-- NEWS Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading12">
                            <h4><img src="images/icon/db3.png" alt="" />NEWS</h4>
                            <p><%=bean.getNEWS() %></p>

                        </div>
                        <!-- NEWS end -->
                        
                              <!--HOSTEL Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading13">
                            <h4><img src="images/icon/db3.png" alt="" /> HOSTEL</h4>
                            <p><%=bean.getHOSTEL() %></p>

                        </div>
                        <!-- HOSTEL end -->
                    
                        
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
