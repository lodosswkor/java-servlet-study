<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 받는부분</title>
</head>
<body>
<%
   String web_id = request.getParameter("web_id"); // 아이디
   String web_pwd = request.getParameter("web_pwd"); // 비밀번호 
   String web_name = request.getParameter("web_name"); // 이름
   String web_cel1 = request.getParameter("web_cel1"); // 전화번호1 
   String web_cel2 = request.getParameter("web_cel2"); // 전화번호2
   String web_cel3 = request.getParameter("web_cel3"); // 전화번호3 
   String web_email_id = request.getParameter("web_email_id"); // 이메일아이디 
   String web_email_addr = request.getParameter("web_email_addr"); // 이메일 address 
   String web_introduce = request.getParameter("web_introduce"); // 자기소개 
%>
	 <h1>환영합니다!!</h1>
	 <p>아이디 : <%=web_id %></p>
	 <p>패스워드 : <%=web_pwd %></p>
	 <p>이름 : <%=web_name %></p>
	 <p>전화번호 : <%=web_cel1 %>-<%=web_cel2 %>-<%=web_cel3 %>
	 </p>
	 <p> 이메일 주소 : <%=web_email_id %>@<%=web_email_addr%></p>
	 <p><%=web_introduce %></p>

</body>
</html>