<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<%-- <h2><%=request.getAttribute("message") %></h2> --%>
	<form action="/SpringMVC-demo/login" method="post">
		<span>用户名：<input type="text" name="username" /></span>
		<span>密码：<input type="password" name="pwd" /></span>
		<input type="submit" value="登录" />
	</form>
</body>
</html>