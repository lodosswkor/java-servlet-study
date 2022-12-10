<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   
   <%-- http://localhost:9090/request01.jsp
   	    ? name=%EC%9D%B4%EC%A2%85%EC%84%9D & id=lodossw --%>
   <% 
   
       String name = request.getParameter("name"); 
   	   String id = request.getParameter("id"); 
   	   
   	   // 1. 삼항연산자 변수 자체의 값을 "" 이거나 id로 치환(무조건 String 객체화) 
   	   // id = id == null ? "" : id; 
   	   
   	   // 여기를 고쳐서 id 가 null 이라도 오류 안나게 해보세용 
   	   if(id != null && id.equals("lodossw")) { // 아이디가 lodossw 이면 환영메세지 출력
   		   out.print("<h1>어서오세요 " + id + "님 환영합니다.</h1><br/><br/>");
   	   }
   	   
   	      
   	   
   %>
   
   name : <%=name %><br/>
   id : <% out.print(id); %>


</body>
</html>