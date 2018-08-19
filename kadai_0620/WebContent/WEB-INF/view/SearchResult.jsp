<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="Dto.Dto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索結果</title>
</head>
<body>
		<%
		request.setCharacterEncoding("UTF-8");

		Dto list = (Dto)request.getAttribute("parameter");
		%>
		<p><%=list.getId() %><br>
			<%=list.getName() %><br>
			<%=list.getPrice() %><br>
<%=list.getDay() %></p>
</body>
</html>