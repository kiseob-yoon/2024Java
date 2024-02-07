<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.net.URLEncoder" %>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String value = request.getParameter("value");
	Cookie[] cookies = request.getCookies();
	if (cookies != null && cookies.length > 0) {
		for (Cookie ck : cookies) {
			if (ck.getName().equals(name)) {
				Cookie cookie = new Cookie(name,
					URLEncoder.encode(value, "utf-8"));
				response.addCookie(cookie);
			}
		}
	}
	response.sendRedirect("listCookies.jsp");
%>
<html>
<head><title>값 변경</title></head>
<body>
name 쿠키의 값을 변경합니다.
</body>
</html>
