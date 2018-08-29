
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>削除</title>
</head>
<body>

<form action="/kadai_0620/Delete_Result_Servlet" method="get">
	ID:<input type="text" name="id">
	<input type="submit" value="削除">
	</form>

<br>
<a href="/kadai_0620/Registration_Servlet">登録</a><br>
<a href="/kadai_0620/Search_Servlet">検索</a>


</body>
</html>