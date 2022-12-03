<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<%-- 
   page 디렉티브테그에 import가 없을 경우에는  
   pakage 포함 full class 경로를 사용해야한다. 
   ex) <%=new java.util.Date().toString() %> 
--%>
Second.jsp 실행시간 : <%=new Date().toString() %>