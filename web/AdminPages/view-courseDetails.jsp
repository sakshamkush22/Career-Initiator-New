

<%@page import="java.util.Iterator"%>
<%@page import="com.courseBean.CourseDetails"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.courseDao.CourseDetailsImpl"%>
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
      <h1>COURSE DETAILS</h1>
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
              <h5 class="card-title">All Course Details</h5>

              <!-- Table with stripped rows -->
              <table class="table datatable">
                <thead>
                  <tr>
                    <th>Sno</th>
                    <th>Overview</th>
                    <th>Syllabus and Subjects</th>
                    <th>Job</th>
                    <th>Scope</th>
                    <th>Salary</th>
                    <th>Admission</th>
                    <th>Placements</th>
                    <th>Title</th>

                  </tr>
                </thead>
                <tbody>
                <% 
                   CourseDetailsImpl dao = new CourseDetailsImpl();
                   ArrayList<CourseDetails> al = dao.getAllCourseDetails();
                   if(al!=null){
                   Iterator<CourseDetails> itr = al.iterator();
                   int sno = 0;
                    while(itr.hasNext()){
                        CourseDetails bean = itr.next();
                        sno++;
                    
                     
                %>
                    
                    
                  <tr>
                    <td><%= sno %></td>
                    <td><%= bean.getCOURSE_OVERVIEW() %></td>
                     <td><%= bean.getSYLLABUS_AND_SUBJECTS() %></td>
                    <td><%= bean.getJOB() %></td>
                    <td><%= bean.getSCOPE() %></td>
                    <td><%= bean.getSALARY() %></td>
                    <td><%= bean.getADMISSION() %></td>
                    <td><%= bean.getPLACEMENTS() %></td>
                    <td><%= bean.getTITLE() %></td>
                    
                    <td><div class="btn-group" role="group" aria-label="Basic mixed styles example">
                            <a href="update-courseDetails.jsp?cdId=<%= bean.getCOURSE_DETAILS_ID() %>"><button type="button" class="btn btn-warning">Update</button></a>
                            <a href="DeleteCourseDetailsSrv?cdId=<%= bean.getCOURSE_DETAILS_ID() %>"><button type="button" class="btn btn-success">Delete</button></a>
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

