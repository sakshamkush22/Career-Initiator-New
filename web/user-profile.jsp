<%-- 
    Document   : user-profile
    Created on : 1 Feb, 2026, 5:34:06 PM
    Author     : shubh
--%>

<%@page import="com.userRegistrationBean.UserRegistrationBean"%>
<%@page import="com.userRegistrationDao.UserImplementation"%>
<%@page import="com.userRegistrationDao.UserLogInImplementation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

  <!-- MOBILE MENU -->
     <%@include file="comanpages/header.jsp" %> 
  <!-- MOBILE MENU -->

<body>
  <%
   HttpSession session1=request.getSession();
   UserRegistrationBean bean1=(UserRegistrationBean)session1.getAttribute("bean");
  

UserImplementation dao=new UserImplementation();
UserRegistrationBean bean=dao.viewUser(bean1.getUserId());
   
   
  
  %>
     <!-- MOBILE MENU -->
     <%@include file="comanpages/mobile-menu.jsp" %> 
     <!-- MOBILE MENU --> 

    <!--HEADER SECTION-->
   <%@include file="comanpages/nav-bar.jsp" %>
    <!--END HEADER SECTION-->

    <!--SECTION START-->
    <section>
         <div class="item">
                    <img src="images/modules/user1.png" alt="">
                    <div class="carousel-caption slider-con">
                        <h1>Welcome to Your Career Profile</h1>
<!--                        <p>Choose the best career options with expert guidance, smart planning, and a clear roadmap to build your successful future.</p>-->
                    </div>
      </div>
 
        <div class="stu-db">
            <div class="container pg-inn">
                <div class="col-md-3">
                    <div class="pro-user">
                        <img src="images/userupdate.png" alt="user">
                    </div>
                    <div class="pro-user-bio">
                        <ul>
                            <li>
                                <h4><%=bean.getUserName() %></h4>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-9">
                    <div class="udb">

                        <div class="udb-sec udb-prof">
                            <h4><img src="images/icon/db1.png" alt="" /> My Profile</h4>
                          
                            <div class="sdb-tabl-com sdb-pro-table">
                                <table class="responsive-table bordered">
                                    <tbody>
                                        <tr>
                                            <td>Student Name</td>
                                            <td>:</td>
                                            <td><%=bean.getUserName() %></td>
                                        </tr>
                                        <tr>
                                            <td>Student Email</td>
                                            <td>:</td>
                                            <td><%=bean.getEmail() %></td>
                                        </tr>
                                      
                                        <tr>
                                            <td>Phone</td>
                                            <td>:</td>
                                            <td><%=bean.getWhatssapNo() %></td>
                                        </tr>
                                          <tr>
                                            <td>Stream</td>
                                            <td>:</td>
                                            <td><%=bean.getStream() %></td>
                                        </tr>
                                          <tr>
                                            <td>Level</td>
                                            <td>:</td>
                                            <td><%=bean.getLevel() %></td>
                                        </tr>
                                        <tr>
                                            <td>Address</td>
                                            <td>:</td>
                                            <td><%=bean.getAddress() %>.</td>
                                        </tr>
                                        
                                      
                                    </tbody>
                                </table>
                                <div class="sdb-bot-edit">
                                    <a href="user-profile-update.jsp" class="waves-effect waves-light btn-large sdb-btn sdb-btn-edit"><i class="fa fa-pencil"></i> Edit my profile</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--SECTION END-->

  <!--FOOTERE SECTION-->
    
<%@include file="comanpages/footer.html" %>

  
    <!--END FOOTERE SECTION-->

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
