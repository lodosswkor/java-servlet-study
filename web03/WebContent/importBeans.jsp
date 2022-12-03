<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="vo.MemberVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
사용자 정의 클래스를 사용하는 방법 1 : Import <br/>
<%
	MemberVO vo = new MemberVO(); 
	vo.setId("lodossw");
	vo.setName("이종석"); 
	
	//out.print(vo.getId()); 
%>

<h1> Welcome!! </h1><br/>
ID : <%=vo.getId() %><br/> 
NAME : <%=vo.getName() %><br/> 

</body>
</html>