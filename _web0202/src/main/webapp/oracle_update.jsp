<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
String driver="oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
Connection conn = DriverManager.getConnection(url,"scott","tiger");
String sql = "update score set name = ? , kor =?, eng =?, math =? where num = ?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setInt(5, Integer.parseInt(request.getParameter("num")));
pstmt.setString(1, request.getParameter("name"));
pstmt.setInt(2, Integer.parseInt(request.getParameter("kor")));
pstmt.setInt(3, Integer.parseInt(request.getParameter("eng")));
pstmt.setInt(4, Integer.parseInt(request.getParameter("math")));

pstmt.executeUpdate();
response.sendRedirect("oracle_list.jsp");
%>
</body>
</html>