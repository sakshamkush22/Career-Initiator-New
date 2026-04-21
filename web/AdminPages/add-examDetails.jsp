
<%@page import="java.util.Iterator"%>
<%@page import="com.examBean.Exam"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.examDao.ExamImpl"%>
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

  <!-- ---add header -->
  <%@ include file="header.html" %>

  <!-- --add side bar -->
    <%@ include file="sidebar.html" %>

  <main id="main" class="main">

    <div class="pagetitle">
      <h1>COLLEGE DETAILS</h1>
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
              <h5 class="card-title">Add Exam Details</h5>

              <!-- General Form Elements -->
              <form action="../AddExamDetailsSrv">
                  
                  <div class="row mb-3">
                  <div class="col-sm-10">
                    <select  name="exmdetid" class="form-control">
                    <option class="form-control">Select Exam</option>
                  <% 
                   ExamImpl dao = new ExamImpl();
                   ArrayList<Exam> al = dao.getAllExam();
                   if(al!=null){
                   Iterator<Exam> itr = al.iterator();
                   int sno = 0;
                    while(itr.hasNext()){
                        Exam bean = itr.next();
                        sno++;
                    
                     
                %>
                    	<option class="form-control" value="<%= bean.getEXAM_ID() %>"><%= bean.getEXAM_NAME() %></option>
                 <%  }}%>  
                    
                    
                    </select>
                  </div>
                </div>
                 
                <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="TITLE" name="title"></textarea>
			</div>
        	</div> 
             <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="OVERVIEW" name="ovr"></textarea>
			</div>
        	</div>
             <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="EXAM DATES" name="exmd"></textarea>
			</div>
        	</div>
                  <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="ELIGIBILITY" name="elgib"></textarea>
			</div>
        	</div>
                  <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="APPLICATION FORM" name="appform"></textarea>
			</div>
        	</div>
                  <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="ADMIT CARD" name="admcrd"></textarea>
			</div>
        	</div>
                  <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control" style="height: 100px "placeholder="EXAM PATTERN" name="exmpt"></textarea>
			</div>
        	</div>
                  <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="SYLLABUS" name="sylb"></textarea>
			</div>
        	</div>
                   <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="HOW TO PREPARE" name="htp"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="BEST BPOKS" name="bbooks"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="PREVIOUS YEAR_QP" name="prqp"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="SAMPLE PAPER" name="sampaper"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="MOCK TEAST" name="mockt"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="COCHING INSTITUTE" name="chginsti"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="PAPER ANALYSIS" name="paperana"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="RESPONSE SHEET" name="respsheet"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="ANSWER KEY" name="anskey"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="RESULT" name="result"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="MERIT LIST" name="meritlist"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="RANK PREDICTOR" name="rankpred"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="COLLEGE PREDICTOR" name="clgpredec"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="CONSLING PROCESS" name="counspro"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="CHOICE FILLING" name="choicefill"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="SEAT ALLOTMENT" name="seatall"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="CUT OFFS" name="cutoffs"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="PARTICIPATING COLLEGES" name="particolle"></textarea>
			</div>
        	</div>
                 <div class="row mb-3">
			<div class="col-sm-10">
			<textarea class="form-control tinymce-editor" style="height: 100px "placeholder="NEWS AND ARTICALES" name="newsandarti"></textarea>
			</div>
        	</div>
              
                  
                <div class="row mb-3">
                  <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary">ADD</button>
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

