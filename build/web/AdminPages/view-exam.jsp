

<%@page import="java.util.Iterator"%>
<%@page import="com.examBean.Exam"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.examDao.ExamImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

  <!-- ======= Header ======= -->
	<%@ include file="header.html"%>

  <!-- ======= Sidebar ======= -->
	<%@ include file="sidebar.html"%>
  
    <!-- ======= Main ======= -->
  <main id="main" class="main" Style="width: 100%; height: auto	">

    <div class="pagetitle">
      <h1>ALL EXAMS</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="index.html">Home</a></li>
          <li class="breadcrumb-item">Tables</li>
          <li class="breadcrumb-item active">Data</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <section class="section">
      <div class="row">
        <div class="col-lg-12">

          <div class="card">
            <div class="card-body">
              <h5 class="card-title">All Exam</h5>

              <!-- Table with stripped rows -->
              <table class="table datatable">
                <thead>
                  <tr>
                    <th>Sno</th>
                    <th>Exam Name</th>
                    <th>Exam Image</th>
                    <th>Field</th>
                    <th>Detail</th>
                    <th>Priority</th>
                    <th>Status</th>

                  </tr>
                </thead>
                <tbody>
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
                    
                    
                  <tr>
                    <td><%= sno %></td>
                    <td><%= bean.getEXAM_NAME() %></td>
                     <td><%= bean.getEXAM_IMAGE() %></td>
                    <td><%= bean.getEXAM_FEILD() %></td>
                    <td><%= bean.getEXAM_DETAIL() %></td>
                    <td><%= bean.getPRIORITY() %></td>
                    <td><%= bean.getSTATUS() %></td>
                    
                    <td><div class="btn-group" role="group" aria-label="Basic mixed styles example">
                            <a href="update-exam.jsp?exmId=<%= bean.getEXAM_ID() %>"><button type="button" class="btn btn-warning">Update</button></a>
                            <a href="DeleteExamSrv?exmId=<%= bean.getEXAM_ID() %>"><button type="button" class="btn btn-success">Delete</button></a>
                </div></td>
                  </tr>
                  
                  <%}}%>
        
                </tbody>
              </table>
              <!-- End Table with stripped rows -->

            </div>
          </div>

        </div>
      </div>
    </section>

  </main><!-- End #main -->


    <!-- ======= Bottom Links ======= -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/apexcharts/apexcharts.min.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/chart.js/chart.umd.js"></script>
  <script src="assets/vendor/echarts/echarts.min.js"></script>
  <script src="assets/vendor/quill/quill.js"></script>
  <script src="assets/vendor/simple-datatables/simple-datatables.js"></script>
  <script src="assets/vendor/tinymce/tinymce.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>
