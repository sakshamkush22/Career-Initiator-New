
<%@page import="java.util.Iterator"%>
<%@page import="com.examBean.ExamDetails"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.examDao.ExamDetailsImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head><body>

	<%@ include file="header.html"%>
	<%@ include file="sidebar.html"%>

	<main id="main" class="main" Style="width: 100%; height: auto">

		<div class="pagetitle">
			<h1></h1>
			<nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="admin-dashboard.jsp">Home</a></li>
          <li class="breadcrumb-item"><a href="admin-view-College.jsp">View College</a></li>
        </ol>
			</nav>
		</div>
		<!-- End Page Title -->

		<section class="section" >
			<div class="row">
				<div class="col-lg-12">

					<div class="card">
						<div class="card-body">
							<h5 class="card-title">All Exam Details</h5>

							<!-- Table with stripped rows -->
							<table class="table datatable">
								<thead>
									<tr>
										<th scope="col">#</th>
										<th scope="col">EXAM NAME</th>
										<th scope="col">TITLE</th>
										<th scope="col">OVERVIEW</th>
										<th scope="col">EXAM_DATES</th>
										<th scope="col">ELIGIBILITY</th>
										<th scope="col">APPLICATION FORM</th>
										<th scope="col">ADMIT CARD</th>
                                                                                <th scope="col">EXAM PATTERN</th>
										<th scope="col">SYLLABUS</th>
										<th scope="col">HOW TO PREPARE</th>
										<th scope="col">BEST BPOKS</th>
										<th scope="col">PREVIOUS YEAR QP</th>
										<th scope="col">SAMPLE PAPER</th>
										<th scope="col">MOCK TEAST</th>
                                                                                <th scope="col">COCHING INSTITUTE</th>
										<th scope="col">PAPER ANALYSIS</th>
										<th scope="col">RESPONSE SHEET</th>
										<th scope="col">ANSWER KEY</th>
										<th scope="col">RESULT</th>
										<th scope="col">MERIT LIST</th>
										<th scope="col">RANK PREDICTOR</th>
                                                                                <th scope="col">COLLEGE PREDICTOR</th>
										<th scope="col">CONSLING PROCESS</th>
										<th scope="col">CHOICE FILLING</th>
										<th scope="col">SEAT ALLOTMENT</th>
										<th scope="col">CUT OFFS</th>
										<th scope="col">PARTICIPATING COLLEGES</th>
										<th scope="col">NEWS AND ARTICALES</th>
									</tr>
								</thead>
								<tbody>

									<%
									ExamDetailsImpl impI = new ExamDetailsImpl();
									ArrayList<ExamDetails> al = impI.getAllExamDetails();
                                                                        if(al!=null){
									Iterator itr = al.iterator();
									int sNo = 0;
									while (itr.hasNext()) {
										sNo++;

										ExamDetails bean = (ExamDetails)itr.next();
									%>
									<tr>
										<th scope="row"><%=sNo%></th>
										<td></td>
										<td><%=bean.getTITLE() %></td>
										<td><%=bean.getOVERVIEW() %></td>
										<td><%=bean.getEXAM_DATES() %></td>
										<td><%=bean.getELIGIBILITY() %></td>
										<td><%=bean.getAPPLICATION_FORM() %></td>
										<td><%=bean.getADMIT_CARD() %></td>
										<td><%=bean.getEXAM_PATTERN() %></td>
                                                                                <td><%=bean.getSYLLABUS() %></td>
										<td><%=bean.getHOW_TO_PREPARE() %></td>
										<td><%=bean.getBEST_BPOKS() %></td>
										<td><%=bean.getPREVIOUS_YEAR_QP() %></td>
										<td><%=bean.getSAMPLE_PAPER() %></td>
										<td><%=bean.getMOCK_TEAST() %></td>
                                                                                <td><%=bean.getCOCHING_INSTITUTE() %></td>
										<td><%=bean.getPAPER_ANALYSIS() %></td>
										<td><%=bean.getRESPONSE_SHEET() %></td>
										<td><%=bean.getANSWER_KEY() %></td>
										<td><%=bean.getRESULT() %></td>
										<td><%=bean.getMERIT_LIST() %></td>
										<td><%=bean.getRANK_PREDICTOR() %></td>
                                                                                <td><%=bean.getCOLLEGE_PREDICTOR() %></td>
										<td><%=bean.getCONSLING_PROCESS() %></td>
										<td><%=bean.getCHOICE_FILLING() %></td>
										<td><%=bean.getSEAT_ALLOTMENT() %></td>
										<td><%=bean.getCUT_OFFS() %></td>
										<td><%=bean.getPARTICIPATING_COLLEGES() %></td>
										<td><%=bean.getNEWS_AND_ARTICALES() %></td>

										<td><div class="btn-group" role="group" aria-label="Basic mixed styles example">
												<a href="update-examDetails.jsp?exmdetId=<%= bean.getEXAM_DETAILS_ID() %>" class="btn btn-warning">Update
											
												<a href="DeleteExamDetailsSrv?exmdetId=<%= bean.getEXAM_DETAILS_ID() %>" class="btn btn-danger">Delete
                                                                                                    </div></td>
									</tr>
									<%
									}}
									%>
								</tbody>
							</table>
							<!-- End Table with stripped rows -->

						</div>
					</div>

				</div>
			</div>
		</section>

	</main>

	<%
	 String msg=request.getParameter("msg");
	 if(msg!=null)
	 {%>
	<script type="text/javascript">
       alert("<%= msg%>");
    </script>
	<% }%>







	<a href="#"
		class="back-to-top d-flex align-items-center justify-content-center"><i
		class="bi bi-arrow-up-short"></i></a>

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
