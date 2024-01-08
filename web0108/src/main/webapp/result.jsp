<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String str = request.getParameter("mmm"); //클라이언트에게서 받아온 데이터를 str에 저장
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>구구단을 외우자</h1>
<%
for(int i =1; i <= 9; i++){
%>
<h2><%=str %> X <%=i %> = <%=i*Integer.parseInt(str) %></h2>
<%} %>
</body>
</html>


