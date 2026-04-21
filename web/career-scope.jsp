
<%@page import="com.userRegistrationBean.UserRegistrationBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.careerBean.CareerScope"%>
<%@page import="com.carreerDao.CarrereScopeImplementation"%>
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
     <!-- MOBILE MENU -->
     <%@include file="comanpages/mobile-menu.jsp" %> 
     <!-- MOBILE MENU --> 
 
        <!-- LOGO AND MENU SECTION -->
      <%@include file="comanpages/nav-bar.jsp" %>
    <!--END HEADER SECTION-->
    
<!-- Career Scope Module -->
    <section>
     <div class="item">
                    <img src="images/modules/scope.png" alt="">
                    <div class="carousel-caption slider-con">
                      <h1>Choice Best Career Scope</h1>
<!--                        <p>Explore wide career scope with future-ready skills, growing opportunities, and clear paths to success in every industry.</p>-->
<!--                        <a href="#" class="bann-btn-1">Admission</a><a href="#" class="bann-btn-2">Read More</a>-->
                    </div>
                </div>     
     <div class="ed-res-bg">
		<div class="container com-sp pad-bot-70 ed-res-bg">
            <div class="row">
                <div class="con-title">
                    <h2>All Career Scopes <span></span></h2>
                    <p>What are you looking for.</p>
                </div>
            </div>
            <div class="row">
                <div class="ed-course">
                    <%
                      CarrereScopeImplementation dao = new CarrereScopeImplementation();
                      ArrayList<CareerScope> al = dao.viewAllScopeByCID(Integer.parseInt(request.getParameter("carId")));
                      if(al!=null){
                       Iterator<CareerScope> itr= al.iterator();
                        
                    while(itr.hasNext())
                    {
                        CareerScope scop=itr.next();
                        %>
                            <div class="col-md-3 col-sm-4 col-xs-12">
                        <div class="ed-course-in">
                            <a  class="course-overlay" href="scope-details.jsp?sId=<%=scop.getsId() %>">
                                <img src="images/scope/<%=scop.getsImage() %>" alt="" style="height: 100%; width: 100%" >
                                <span><%=scop.getsName() %></span>
                            </a>
                        </div>
                    </div>
                  <%  }
}
                    
                    %>
                    
                
               
                </div>
            </div>
        </div>
     </div>
        
    </section>
   <!-- Carrier module end -->
   <%}else{
      
      response.sendRedirect("index.jsp?msg=Session Time Out!!!");
     
     }
     
     
     %>
   
    <!--FOOTER SECTION-->
    <%@include file="comanpages/footer.html" %>

    <!--Import jQuery before materialize.js-->
    <script src="js/main.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/materialize.min.js"></script>
    <script src="js/custom.js"></script>
</body>


</html>
