<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<%@ page errorPage="error.jsp" %>
<%@ page import="java.lang.*, java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
   
  String name = "이종석";
  String age = null; 
  out.print(name);
  out.print(age.toString()); // null point exception 발생

%>

</body>
</html>