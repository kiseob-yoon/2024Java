<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
public static String print(){
	return "시작";
}
%>
<%=print()%>
<%
int sum = 0;
for(int i = 0; i < 20; i++){
	sum += i;
}
%>
<img src= https://imgnews.pstatic.net/image/009/2024/01/05/0005240422_001_20240105162501001.jpg?type=w647 ><%=""%>
<iframe width="560" height="315" src="https://www.youtube.com/embed/8BUQd6WjTxA?si=9A0DKzluSrRLrNsh" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe> <%=""%>
<h2><%=sum %></h2>
<%
Date now = new Date();
%>
<%=now %>
<h1>헬로</h1>
</body>
</html>