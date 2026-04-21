<%@page import="com.collegeDao.CollegeInterface"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.collegeBean.College"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.collegeDao.CollegeImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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

		<section class="section">
			<div class="row">
				<div class="col-lg-12">

					<div class="card">
						<div class="card-body">
							<h5 class="card-title">All College</h5>

							<!-- Table with stripped rows -->
							<table class="table datatable">
								<thead>
									<tr>
										<th scope="col">#</th>
										<th scope="col">Name</th>
										<th scope="col">Image</th>
										<th scope="col">Location</th>
										<th scope="col">Category</th>
										<th scope="col">Details</th>
										<th scope="col">Rating</th>
										<th scope="col">Programs</th>
                                        <th scope="col">Priority</th>
                                        <th scope="col">Status</th>
									</tr>
								</thead>
								<tbody>

									<%
									CollegeInterface impI = new CollegeImpl();
									ArrayList<College> al = impI.viewAllCollege();
                                                                        if(al!=null){
									Iterator itr = al.iterator();
									int sNo = 0;
									while (itr.hasNext()) {
										sNo++;

										College bean = (College)itr.next();
									%>
									<tr>
										<th scope="row"><%=sNo%></th>
										<td><img src="<%=bean.getCOLLEGE_IMAGE() %>" height="40px"
											width="40px"></td>
										<th scope="row"><%=bean.getCOLLEGE_NAME() %></th>

										<td><%=bean.getCOLLEGE_LOCATION() %></td>
										<td><%=bean.getCOLLEGE_CATEGORY() %></td>
										<td><%=bean.getCOLLEGE_DETAILS() %></td>
										<td><%=bean.getCOLLEGE_RATING() %></td>
										<td><%=bean.getCOLLEGE_PROGRAMS() %></td>
										<td><%=bean.getCOLLEGE_PRIORITY() %></td>
										<td><%=bean.getCOLLEGE_STATUS() %></td>

										<td><button type="button" class="btn btn-primary">
												<a href="admin-update-college.jsp?clgId=<%=bean.getCOLLEGE_ID() %>">Update
											</button>
											<button type="button" class="btn btn-danger">
												<a href="DeleteCollegeServlet?clgId=<%=bean.getCOLLEGE_ID() %>">Delete
											</button></td>
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