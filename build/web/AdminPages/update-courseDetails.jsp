
<%@page import="com.courseBean.CourseDetails"%>
<%@page import="com.courseDao.CourseDetailsImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Forms / Elements - NiceAdmin Bootstrap Template</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/quill/quill.snow.css" rel="stylesheet">
  <link href="assets/vendor/quill/quill.bubble.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/simple-datatables/style.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: NiceAdmin - v2.2.2
  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>
       <%
      CourseDetailsImpl dao = new CourseDetailsImpl();
      CourseDetails bean = dao.getCourseDetailsById(Integer.parseInt(request.getParameter("cdId")));
    
    %>

  <!-- ---add header -->
  <%@ include file="header.html" %>

  <!-- --add side bar -->
    <%@ include file="sidebar.html" %>

  <main id="main" class="main">

    <div class="pagetitle">
      <h1>COURSE DETAILS</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="admin-dashboard.jsp">Home</a></li>
          <li class="breadcrumb-item"><a href="admin-view-College.jsp">View College</a></li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <section class="section">
      <div class="row">
        <div class="col-lg-6">

          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Update Course Details</h5>

              <!-- General Form Elements -->
              <form action="../UpdateCourseDetailsSrv">
             <div class="row mb-3">
			<div class="col-sm-10">
                            <textarea class="form-control" style="height: 100px "placeholder="Course OverView" name="cov" ><%=bean.getCOURSE_OVERVIEW() %></textarea>
			</div>
        	</div>
             <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control" style="height: 100px "placeholder="Syllabus and Subjects" name="sns" ><%=bean.getSYLLABUS_AND_SUBJECTS() %></textarea>
			</div>
        	</div>
                  <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control" style="height: 100px "placeholder="Job" name="job" ><%=bean.getJOB() %></textarea>
			</div>
        	</div>
                  <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control" style="height: 100px "placeholder="Scope" name="scope" ><%=bean.getSCOPE() %></textarea>
			</div>
        	</div>
                  <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control" style="height: 100px "placeholder="Salary" name="sal" ><%=bean.getSALARY() %></textarea>
			</div>
        	</div>
                  <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control" style="height: 100px "placeholder="Admission" name="adm" ><%=bean.getADMISSION() %></textarea>
			</div>
        	</div>
                  <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control" style="height: 100px "placeholder="Placements" name="plcm" ><%=bean.getPLACEMENTS() %></textarea>
			</div>
        	</div>
                   <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control" style="height: 100px "placeholder="Title" name="title" ><%=bean.getTITLE() %></textarea>
			</div>
        	</div>
                <input type="hidden" name="cdid" value="<%=bean.getCOURSE_DETAILS_ID() %>">
                <div class="row mb-3">
                  <div class="col-sm-10">  
                    <button type="submit" class="btn btn-primary">UPDATE</button>
                  </div>
                </div>

              </form><!-- End General Form Elements -->

            </div>
          </div>

        
        </div>
      </div>
    </section>

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/apexcharts/apexcharts.min.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/chart.js/chart.min.js"></script>
  <script src="assets/vendor/echarts/echarts.min.js"></script>
  <script src="assets/vendor/quill/quill.min.js"></script>
  <script src="assets/vendor/simple-datatables/simple-datatables.js"></script>
  <script src="assets/vendor/tinymce/tinymce.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>