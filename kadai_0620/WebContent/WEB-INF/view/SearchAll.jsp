<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="Dto.Dto" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;  charset=UTF-8">
<title>一覧表示</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	@SuppressWarnings("unchecked")
	ArrayList<Dto> list = (ArrayList<Dto>)request.getAttribute("param");
	%>

<p>
	<%for(int a=0; a<list.size(); a++){ %><br>

	<a>id    :</a>	 <%=list.get(a).getId() %><br>
	<a>name  :</a>	 <%=list.get(a).getName() %><br>
	<a>price :</a> <%=list.get(a).getPrice() %><br>
	<a>day   :</a>	 <%=list.get(a).getDay() %></p>

<%} %>




</body>
</html>
