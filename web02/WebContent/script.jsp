<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%    
   //-- 스크립틀릿 
   //-- 자바주석문 
   /* 
       자바 여러줄 주석 
   */
   String name = "이종석"; 
   System.out.println(name + "을/를 호출하였습니다.(서버콘솔)");
   out.println(name + "을/를 호출하였습니다.(웹)");
   out.println(age + "살입니다.");
   
%>
<%!
   //-- jsp 선언문
   String age = "10";
%>
<br/><br/>
<%=age %> 살 입니다.  
<%=age %> == <% out.print(age); %>






</body>
</html>