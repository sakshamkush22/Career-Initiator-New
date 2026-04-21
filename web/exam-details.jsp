
<%@page import="com.userRegistrationBean.UserRegistrationBean"%>
<%@page import="com.examBean.ExamDetails"%>
<%@page import="com.examDao.ExamDetailsImpl"%>
<%@page import="com.examBean.Exam"%>
<%@page import="com.examDao.ExamImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

  <!-- Header Start -->
     <%@include file="comanpages/header.jsp" %> 
  <!-- Header End -->

<body>

      <%
       HttpSession s1= request.getSession();
       UserRegistrationBean b1=(UserRegistrationBean)s1.getAttribute("bean");
     if(b1!=null)
         
     {
    %>
      
   <%
     ExamImpl imp = new ExamImpl();
     Exam img = imp.getExamById(Integer.parseInt(request.getParameter("examId")));
      
     ExamDetailsImpl dao = new ExamDetailsImpl();
     ExamDetails bean =  dao.getExamDetailsById(Integer.parseInt(request.getParameter("examId")));
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
                        <h1><%=img.getEXAM_NAME() %></h1>
                    </div>
                </div>
        <div class="pro-menu">
            <div class="container">
              <div class="col-md-9 col-md-offset-3">      
                    <ul id="proMenuList">
                        <li><a  class="pro-act " class="nav-link" href="#scrollspyHeading0">TITLE</a></li>
                        <li><a href="#scrollspyHeading1">OVERVIEW</a></li>
                        <li><a href="#scrollspyHeading2">EXAM_DATES</a></li>
                        <li><a href="#scrollspyHeading3">ELIGIBILITY</a></li>
                        <li><a href="#scrollspyHeading4">APPLICATION FORM</a></li>
                        <li><a href="#scrollspyHeading5">ADMIT CARD</a></li>
                        <li><a href="#scrollspyHeading6">EXAM PATTERN</a></li>
                        <li><a href="#scrollspyHeading7">SYLLABUS</a></li>
                        <li><a href="#scrollspyHeading8">HOW TO PREPARE</a></li>
                        <li><a href="#scrollspyHeading9">BEST_BPOKS</a></li>
                        <li><a href="#scrollspyHeading10">PREVIOUS YEAR QP</a></li>
                        <li><a href="#scrollspyHeading11">SAMPLE PAPER</a></li>
                        <li><a href="#scrollspyHeading12">MOCK TEAST</a></li>
                        <li><a href="#scrollspyHeading13">COCHING INSTITUTE</a></li>
                        <li><a href="#scrollspyHeading14">PAPER ANALYSIS</a></li>
                        <li><a href="#scrollspyHeading15">RESPONSE SHEET</a></li>
                        <li><a href="#scrollspyHeading16">ANSWER_KEY</a></li>
                         <li><a href="#scrollspyHeading17">RESULT</a></li>
                        <li><a href="#scrollspyHeading18">MERIT LIST</a></li>
                        <li><a href="#scrollspyHeading19">RANK PREDICTOR</a></li>
                        <li><a href="#scrollspyHeading20">COLLEGE PREDICTOR</a></li>
                        <li><a href="#scrollspyHeading21">CONSLING PROCESS</a></li>
                        <li><a href="#scrollspyHeading22">CHOICE FILLING</a></li>
                        <li><a href="#scrollspyHeading23">SEAT ALLOTMENT</a></li>
                        <li><a href="#scrollspyHeading24">CUT OFFS</a></li>
                        <li><a href="#scrollspyHeading25">PARTICIPATING COLLEGES</a></li>
                        <li><a href="#scrollspyHeading26">NEWS AND ARTICALES</a></li>
                        
                    </ul>
                     
                </div>
            </div>
        </div>
        
        
  
        <div class="stu-db">
            <div class="container pg-inn">
                <div class="col-md-3">
                    <div class="pro-user">
                        <img src="images/exam/<%=img.getEXAM_IMAGE() %>" alt="user">
                    </div>
                    <div class="pro-user-bio">
                        <ul>
                            <li>
                                <h4><%=img.getEXAM_NAME() %></h4>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-9"  >
                    <div class="udb"  >
                        <!-- Title Start -->
                        <div class="udb-sec udb-prof" id="scrollspyHeading1" >
                            <h4><img src="images/icon/db1.png" alt="" />Title</h4>
                            <p><%=bean.getTITLE() %></p>
                        </div>
                        <!-- Title End -->
                        
                        <!-- OVERVIEW Start -->
                        <div class="udb-sec udb-cour" id="scrollspyHeading2">
                            <h4><img src="images/icon/db2.png" alt="" />OVERVIEW</h4>
                            <p><%=bean.getOVERVIEW() %></p>
                            
                        </div>
                        <!-- OVERVIEW end -->
                        
                        <!-- EXAM DATES Start -->
                        <div class="udb-sec udb-cour-stat" id="scrollspyHeading3">
                            <h4><img src="images/icon/db3.png" alt="" />EXAM DATES</h4> 
                            <p><%=bean.getEXAM_DATES() %></p>
                        </div>
                        <!-- EXAM DATES end -->
                        
                        <!-- ELIGIBILITY Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading4"  >
                            <h4 ><img src="images/icon/db3.png" alt="" />ELIGIBILITY</h4>
                          <p><%=bean.getELIGIBILITY() %></p>
                        </div>
                        <!-- ELIGIBILITY end -->
                        
                        <!-- APPLICATION FORM Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading5">
                            <h4><img src="images/icon/db3.png" alt="" /> APPLICATION FORM</h4>
                            <p><%=bean.getAPPLICATION_FORM() %></p>
                        </div>
                        <!-- APPLICATION FORM end -->
                        
                        <!-- ADMIT CARD Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading6">
                            <h4><img src="images/icon/db3.png" alt="" /> ADMIT CARD</h4>
                            <p><%=bean.getADMIT_CARD() %></p>

                        </div>
                        <!-- ADMIT CARD end -->
                        
                        <!-- EXAM PATTERN Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading7">
                            <h4><img src="images/icon/db3.png" alt="" />EXAM PATTERN</h4>
                            <p><%=bean.getEXAM_PATTERN() %></p>

                        </div>
                        <!-- EXAM PATTERN end -->
                        
                        <!-- SYLLABUS Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading8">
                            <h4><img src="images/icon/db3.png" alt="" /> SYLLABUS</h4>
                            <p><%=bean.getSYLLABUS() %></p>

                        </div>
                        <!-- SYLLABUS end -->
                        
                         <!-- HOW TO PREPARE Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading9">
                            <h4><img src="images/icon/db3.png" alt="" /> HOW TO PREPARE</h4>
                            <p><%=bean.getHOW_TO_PREPARE() %></p>

                        </div>
                        <!-- HOW TO PREPARE end -->
                              <!-- BEST_BPOKS Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading10">
                            <h4><img src="images/icon/db3.png" alt="" /> BEST_BOOKS</h4>
                            <p><%=bean.getBEST_BPOKS() %></p>

                        </div>
                        <!-- BEST_BPOKS end -->
                              <!-- PREVIOUS_YEAR_QP Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading11">
                            <h4><img src="images/icon/db3.png" alt="" /> PREVIOUS YEAR QP</h4>
                            <p><%=bean.getPREVIOUS_YEAR_QP() %></p>

                        </div>
                        <!-- PREVIOUS_YEAR_QP end -->
                              <!-- SAMPLE_PAPER Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading12">
                            <h4><img src="images/icon/db3.png" alt="" />SAMPLE PAPER</h4>
                            <p><%=bean.getSAMPLE_PAPER() %></p>

                        </div>
                        <!-- SAMPLE_PAPER end -->
                              <!-- MOCK_TEAST Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading13">
                            <h4><img src="images/icon/db3.png" alt="" /> MOCK TEAST</h4>
                            <p><%=bean.getMOCK_TEAST() %></p>

                        </div>
                        <!-- MOCK_TEAST end -->
                        
                              <!-- COCHING_INSTITUTE Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading14">
                            <h4><img src="images/icon/db3.png" alt="" />COCHING INSTITUTE</h4>
                            <p><%=bean.getCOCHING_INSTITUTE() %></p>

                        </div>
                        <!-- COCHING_INSTITUTE end -->
                        
                              <!-- PAPER_ANALYSIS Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading15">
                            <h4><img src="images/icon/db3.png" alt="" /> PAPER ANALYSIS</h4>
                            <p><%=bean.getPAPER_ANALYSIS() %></p>

                        </div>
                        <!-- PAPER_ANALYSIS end -->
                        
                              <!-- RESPONSE_SHEET Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading16">
                            <h4><img src="images/icon/db3.png" alt="" />RESPONSE_SHEET</h4>
                            <p><%=bean.getRESPONSE_SHEET() %></p>

                        </div>
                        <!-- RESPONSE_SHEET end -->
                        
                              <!-- ANSWER_KEY Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading17">
                            <h4><img src="images/icon/db3.png" alt="" /> ANSWER KEY</h4>
                            <p><%=bean.getANSWER_KEY() %></p>

                        </div>
                        <!-- ANSWER_KEY end -->
                        
                              <!-- RESULT Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading18">
                            <h4><img src="images/icon/db3.png" alt="" /> RESULT</h4>
                            <p><%=bean.getRESULT() %></p>

                        </div>
                        <!-- RESULT end -->
                        
                              <!-- MERIT_LIST Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading19">
                            <h4><img src="images/icon/db3.png" alt="" /> MERIT LIST</h4>
                            <p><%=bean.getMERIT_LIST() %></p>

                        </div>
                        <!-- MERIT_LIST end -->
                        
                              <!-- RANK_PREDICTOR Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading20">
                            <h4><img src="images/icon/db3.png" alt="" /> RANK PREDICTOR</h4>
                            <p><%=bean.getRANK_PREDICTOR() %></p>

                        </div>
                        <!-- RANK_PREDICTOR end -->
                        
                              <!-- COLLEGE_PREDICTOR Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading21">
                            <h4><img src="images/icon/db3.png" alt="" /> COLLEGE PREDICTOR</h4>
                            <p><%=bean.getCOLLEGE_PREDICTOR() %></p>

                        </div>
                        <!-- COLLEGE_PREDICTOR end -->
                        
                              <!-- CONSLING_PROCESS Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading22">
                            <h4><img src="images/icon/db3.png" alt="" />CONSLING PROCESS</h4>
                            <p><%=bean.getCONSLING_PROCESS() %></p>

                        </div>
                        <!-- CONSLING_PROCESS end -->
                        
                              <!-- CHOICE_FILLING Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading23">
                            <h4><img src="images/icon/db3.png" alt="" /> CHOICE FILLING</h4>
                            <p><%=bean.getCHOICE_FILLING() %></p>

                        </div>
                        <!-- CHOICE_FILLING end -->
                        
                              <!-- SEAT_ALLOTMENT Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading24">
                            <h4><img src="images/icon/db3.png" alt="" /> SEAT ALLOTMENT</h4>
                            <p><%=bean.getSEAT_ALLOTMENT() %></p>

                        </div>
                        <!-- SEAT_ALLOTMENT end -->
                        
                              <!-- CUT_OFFS Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading25">
                            <h4><img src="images/icon/db3.png" alt="" /> CUT OFFS</h4>
                            <p><%=bean.getCUT_OFFS() %></p>

                        </div>
                        <!-- CUT_OFFS end -->
                        
                              <!-- PARTICIPATING_COLLEGES Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading26">
                            <h4><img src="images/icon/db3.png" alt="" /> PARTICIPATING COLLEGES</h4>
                            <p><%=bean.getPARTICIPATING_COLLEGES() %></p>

                        </div>
                        <!--PARTICIPATING_COLLEGES end -->
                           <!-- NEWS_AND_ARTICALES Start -->
                           <div class="udb-sec udb-cour-stat" id="scrollspyHeading27">
                            <h4><img src="images/icon/db3.png" alt="" />NEWS AND ARTICALES</h4>
                            <p><%=bean.getNEWS_AND_ARTICALES() %></p>

                        </div>
                        <!-- NEWS_AND_ARTICALES end -->
                        
                        
                        
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
