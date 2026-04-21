<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>                                                          
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.html" %>>
<%@include file="sidebar.html" %>>


<%
	 String msg=request.getParameter("msg");
	 if(msg!=null)
	 {%>
	<script type="text/javascript">
       alert("<%= msg%>");
    </script>
	<% }%>
</body>
</html>