<%-- 
    Document   : user-profile-update
    Created on : 3 Feb, 2026, 5:53:31 PM
    Author     : shubh
--%>

<%@page import="com.userRegistrationBean.UserRegistrationBean"%>
<%@page import="com.userRegistrationDao.UserImplementation"%>
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
                        <h1>Update Your Career Profile</h1>
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
                            <h4><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCCxb5AeUN89cT4_xC1EmoIkGtT9d-2MxydNUaLRvv77ErFVTtMS3BQP4&s" alt="" />Update My Profile</h4>
                            <form action="./UpdateUserSrv">
                            <div class="sdb-tabl-com sdb-pro-table">
                              
                                <table class="responsive-table bordered">
                                    <tbody>
                                        <tr>
                                            <td>Student Name</td>
                                            <td>:</td>
                                            <td><input type="text" name="name" value="<%=bean.getUserName() %>" style="font-size: 14px"></td>
                                        </tr>
                                        <tr>
                                            <td>Student Email</td>
                                            <td>:</td>
                                            <td><input type="text" name="email" value="<%=bean.getEmail() %>" style="font-size: 14px"></td>
                                        </tr>
                                          <tr>
                                            <td>Phone</td>
                                            <td>:</td>
                                            <td><input type="text" name="wstnum" value="<%=bean.getWhatssapNo() %>" style="font-size: 14px"></td>
                                        </tr>
                                         <tr>
                                            <td>Stream</td>
                                            <td>:</td>
                                            <td><input type="text" name="stream" value="<%=bean.getStream() %>"style="font-size: 14px"></td>
                                        </tr>
                                         <tr>
                                            <td>Level</td>
                                            <td>:</td>
                                            <td><input type="text" name="level" value="<%=bean.getLevel() %>"style="font-size: 14px"></td>
                                        </tr>
                   
                                        <tr>
                                            <td>Address</td>
                                            <td>:</td>
                                            <td><input type="text" name="address" value="<%=bean.getAddress() %>" style="font-size: 14px"></td>
                                        </tr>
                                      
                                    </tbody>
                                </table>
                                        
                                <div class="sdb-bot-edit">
                                    <input type="hidden" name="uid" value="<%=bean.getUserId() %>">
                                    <input type="submit" class="waves-effect waves-light btn-large sdb-btn sdb-btn-edit" value="Update Profile"  >
                                </div>
                                      
                            </div>
                            </form> 
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




    <!--Import jQuery before materialize.js-->
    <script src="js/main.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/materialize.min.js"></script>
    <script src="js/custom.js"></script>
</body>


</html>

