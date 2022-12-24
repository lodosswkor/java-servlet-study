<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	//1. mysql 드라이이버 로딩
    
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	Connection conn = null; 
	
    //2. connect 
    try {
    	
    	out.println("1.연결시도</br>");
    	
    	conn = DriverManager.getConnection(
    			"jdbc:mysql://ideatags.io:3306/web06_db?user=web06&password=12345" 
    			//"jdbc:mysql://주소:port/접속데이터베이스명?user=아이디&password=패스워드"  
    			// Connection String(연결문자열)
    	);
    	
    	out.println("2.로직실행</br>");
    	
    	Statement stmt = conn.createStatement(); 
    	String sql = "SELECT * FROM web06_user";
    	
    	//-- 결과셑(ResultSet) : 데이터가 엑셀형식으로 메모리에 로딩 
    	ResultSet rs = stmt.executeQuery(sql);
    	while(rs.next()) {
    		out.println(rs.getString(1) + " "); //-- 인덱스로 가져오는법 
    		out.println(rs.getString("user_name") + " "); //-- 컬럼명으로 가져오는법
    		out.println(rs.getString(3) + " "); 
    		out.println(rs.getString("insertDate") + "<br/>");
    		out.println("------------------------------------- <br/>");
    	}
    	
    	//-- 수정해보기 
    	//-- userName 컬럼이 2인것 
    	sql = "UPDATE web06_user SET user_name = 'angel'"; 
    	
    	//-- 실행 
    	int affected_rows = stmt.executeUpdate(sql); 
    	out.println("<br/> update에 영향받은 row 수 : " + affected_rows); 
    	
    	//-- 데이터 INSERT 
    	sql = "INSERT INTO web06_user (user_no,user_name,user_pwd) "; 
    	sql += " values (4,'lodossw','12121')"; 
    	
    	affected_rows = stmt.executeUpdate(sql); 
    	out.println("<br/> INSERT된 row 수 : " + affected_rows); 
    	
    	//-- 데이터 삭제 
    	sql = "DELETE FROM web06_user WHERE user_name = 'angel'";
    	affected_rows = stmt.executeUpdate(sql);
    	out.println("<br/> Delete된 row 수 : " + affected_rows); 
    	
    	stmt.close(); 
    	
    } catch(Exception ex) {
    	
    	out.println("예외가 발생하였습니다.<br/>");
    	out.println(ex.getMessage()); 
    	out.println(ex.getStackTrace().toString());
    	
    } finally {

    	out.println("<br/>3.연결해제</br>");
    	if(conn != null) conn.close(); 
    }
    
    
%>

</body>
</html>