

<%@page import="java.util.Iterator"%>
<%@page import="com.collegeBean.CollegeDetails"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.collegeDao.CollegeDetailsImpl"%>
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
							<h5 class="card-title">All College Details</h5>

							<!-- Table with stripped rows -->
							<table class="table datatable">
								<thead>
									<tr>
										<th scope="col">#</th>
										<th scope="col">COLLEGE NAME</th>
										<th scope="col">OVERVIEW</th>
										<th scope="col">COURSE</th>
										<th scope="col">JOB READY DEGREE</th>
										<th scope="col">ADMISSION</th>
										<th scope="col">PLACEMENTS</th>
										<th scope="col">CUT OFFS</th>
                                                                                <th scope="col">GALLERY</th>
										<th scope="col">AVRAGE PACKAGE</th>
										<th scope="col">FEES</th>
										<th scope="col">REVIEWS</th>
										<th scope="col">SCHOLARSHIP</th>
										<th scope="col">NEWS</th>
										<th scope="col">HOSTEL</th>
									</tr>
								</thead>
								<tbody>

									<%
									CollegeDetailsImpl impI = new CollegeDetailsImpl();
									ArrayList<CollegeDetails> al = impI.viewAllCollegeDetails();
                                                                        if(al!=null){
									Iterator itr = al.iterator();
									int sNo = 0;
									while (itr.hasNext()) {
										sNo++;

										CollegeDetails bean = (CollegeDetails)itr.next();
									%>
									<tr>
										<th scope="row"><%=sNo%></th>
										<td></td>
										<td><%=bean.getOVERVIEW() %></td>
										<td><%=bean.getCOURSE() %></td>
										<td><%=bean.getJOB_READY_DEGREE() %></td>
										<td><%=bean.getADMISSION() %></td>
										<td><%=bean.getPLACEMENTS() %></td>
										<td><%=bean.getCUT_OFFS() %></td>
										<td><%=bean.getGALLERY() %></td>
                                                                                <td><%=bean.getAVRAGE_PACKAGE() %></td>
										<td><%=bean.getFEES() %></td>
										<td><%=bean.getREVIEWS() %></td>
										<td><%=bean.getSCHOLARSHIP() %></td>
										<td><%=bean.getNEWS() %></td>
										<td><%=bean.getHOSTEL() %></td>
										

										<td><div class="btn-group" role="group" aria-label="Basic mixed styles example">
												<a href="update-collegeDetails.jsp?clgdetId=<%= bean.getCOLLEGE_DETAILS_ID() %>" class="btn btn-warning">Update
											
												<a href="DeleteCollegeDetailsSrv?clgdetId=<%= bean.getCOLLEGE_DETAILS_ID() %>" class="btn btn-danger">Delete
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