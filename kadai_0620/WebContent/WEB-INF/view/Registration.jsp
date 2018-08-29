<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登録</title>
</head>
<body>

<form action="/kadai_0620/RegistrationResult_Servlet" method="get">



		    id:<input type="text" name="id"><br>
	      name:<input type="text" name="name"><br>
	     price:<input type="text" name="price"><br>
	       day:<input type="text" name="day"><br>
	<input type="submit" value="登録">


<br>
<a href="/kadai_0620/Search_Servlet">検索</a>
<br>
<a href="/kadai_0620/Delete_Servlet">削除</a>


	</form>

</body>
</html>