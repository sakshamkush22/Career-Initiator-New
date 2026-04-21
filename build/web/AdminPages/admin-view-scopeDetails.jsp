<%@page import="java.util.Iterator"%>
<%@page import="com.careerBean.ScopeDetails"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.carreerDao.ScopeDetailsImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
							<h5 class="card-title">All SCope Details</h5>

							<!-- Table with stripped rows -->
							<table class="table datatable">
								<thead>
									<tr>
										<th scope="col">#</th>
										<th scope="col">Staus</th>
										<th scope="col">Title</th>
										<th scope="col">About</th>
										<th scope="col">Eligiliblity</th>
										<th scope="col">Job role</th>
										<th scope="col">Salary</th>
										<th scope="col">Study Material</th>
                                        <th scope="col">Pros</th>
                                        <th scope="col">Cons</th>
                                        <th scope="col">Faq</th>
									</tr>
								</thead>
								<tbody>

									<%
									ScopeDetailsImpl impI = new ScopeDetailsImpl();
									ArrayList<ScopeDetails> al = impI.viewAllScopeDetails();
                                                                        if(al!=null){
									Iterator itr = al.iterator();
									int sNo = 0;
									while (itr.hasNext()) {
										sNo++;

										ScopeDetails bean = (ScopeDetails)itr.next();
									%>
									<tr>
										<th scope="row"><%=sNo%></th>
										<td height="40px"
											width="40px"><%= bean.getSTATUS()%></td>
										<th scope="row"><%=bean.getTITLE() %></th>

										<td><%=bean.getABOUT() %></td>
										<td><%=bean.getELIGIBILITY() %></td>
										<td><%=bean.getJOBROLE() %></td>
										<td><%=bean.getSALARY() %></td>
										<td><%=bean.getSTUDYMATERIAL() %></td>
										<td><%=bean.getPROS() %></td>
										<td><%=bean.getCONS() %></td>
										<td><%=bean.getFAQ() %></td>

										<td><button type="button" class="btn btn-primary">
												<a href="admin-update-scopeDetails.jsp?sdId=<%= bean.getSCOPE_DETAIL_ID()%>">Update
											</button>
											<button type="button" class="btn btn-danger">
												<a href="DeleteCareerScopeDetails?sdId=<%= bean.getSCOPE_DETAIL_ID()%>">Delete
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