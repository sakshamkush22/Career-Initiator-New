
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


  <!-- MOBILE MENU -->
     <%@include file="comanpages/header.jsp" %> 
  <!-- MOBILE MENU -->

<body>

    <!-- MOBILE MENU -->
     <%@include file="comanpages/mobile-menu.jsp" %> 
     <!-- MOBILE MENU --> 

    <!-- LOGO AND MENU SECTION START -->
   <%@include file="comanpages/nav-bar.jsp" %>
   <!-- LOGO AND MENU SECTION END -->

    <!--SECTION START-->
    <section>
        <div class="container com-sp pad-bot-70">
            <div class="row">
                <div class="cor about-sp">
                    <div class="ed-about-tit">
                        <div class="con-title">
                            <h2>Contact <span> Us</span></h2>
                            <p>Reach out to us for free career guidance and expert support to shape your future.</p>
                        </div>
                    </div>
                    <div class="pg-contact">
                        <div class="col-md-3 col-sm-6 col-xs-12 new-con new-con1">
                            <h2>Career <span>Initiator</span></h2>
                            <p>Career Initiator helps students choose the right career, courses, colleges, and exams.</p>
                        </div>
                        <div class="col-md-3 col-sm-6 col-xs-12 new-con new-con1"> <img src="img/contact/1.html" alt="">
                            <h4>Address</h4>
                            <p>Floor First, 141, <br>Old Subhash Nagar Colony,<br> Govindpura, Bhopal</p>
                        </div>
                        <div class="col-md-3 col-sm-6 col-xs-12 new-con new-con3"> <img src="img/contact/2.html" alt="">
                            <h4>CONTACT INFO:</h4>
                            <p> <a href="tel://0099999999" class="contact-icon">Phone: 91 79870 81188</a>
                                <br> <a href="tel://0099999999" class="contact-icon">Mobile: 91 75095 79180</a>
                                <br> <a href="mailto:mytestmail@gmail.com" class="contact-icon">Email: careerinitiator1188@gmail.com</a> </p>
                        </div>
                        <div class="col-md-3 col-sm-6 col-xs-12 new-con new-con4"> <img src="img/contact/3.html" alt="">
                            <h4>Website</h4>
                            <p> <a href="https://careerinitiator.in/">Website: Visit Our Website</a>
                                <br> <a href="https://www.facebook.com/profile.php?id=61582953866454">FaceBook : Visit Our Facebook Page</a>
                                <br> <a href="https://www.instagram.com/careerinitiator.in?igsh=eDNxdHpiOG5jYXR6">Instagram :  Visit Our Instagram Page</a> </p>
                        </div>
                    </div>
                </div>
            </div>  
        </div>
    </section>
    <!--SECTION END-->

    <section id="map">
        <div class="row contact-map">
            <!-- IFRAME: GET YOUR LOCATION FROM GOOGLE MAP -->
            <iframe src="https://www.google.com/maps?q=23.25275,77.43606&z=16&output=embed"
                allowfullscreen=""></iframe>
            <div class="container">
                <div class="overlay-contact footer-part footer-part-form">
                    <div class="map-head">
                        <p>Send Us Now</p>
                        <h2>GetIn Touch</h2> <span class="footer-ser-re">Service Request Form</span> </div>
                    <!-- ENQUIRY FORM -->
                    <form id="contact_form" name="contact_form" action="http://rn53themes.net/themes/demo/education-master/send.php">
                        <ul>
                            <li class="col-md-12 col-sm-12 col-xs-12 contact-input-spac">
                                <textarea id="f5" name="f5" required=""></textarea>
                            </li>
                            <li class="col-md-6">
                                <input type="submit" value="SUBMIT">
                            </li>
                        </ul>
                    </form>
                </div>
            </div>
        </div>
    </section>

     <!--FOOTER START-->
    <%@include file="comanpages/footer.html" %>
     <!--FOOTER END-->




    <!--Import jQuery before materialize.js-->
    <script src="js/main.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/materialize.min.js"></script>
    <script src="js/custom.js"></script>
</body>


</html>