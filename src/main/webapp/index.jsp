<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>index</title>
</head>

	<body>
		<h1>Restful test</h1>
		<hr>
		<h2>查询英雄</h2>
		<form action="restful/user" method="get">
			用户名：<input type="text" name="uid">
			<input type="submit" value="提交">
			
		</form>
		<a href="restful/user?uid=45">提交</a>
		<br>
		
		<h2>增加英雄</h2>
		<form action="restful/user" method="post">
			<input type="text" name="name"/>
			<input type="text" name="password"/>
			<input type="submit" value="提交">
		</form>
		<br>
		
		<h2>删除英雄</h2>
		<form action="restful/user" method="post">
			<input type="text" name="name"/>
			<input type="submit" value="删除">
		</form>
		<br>
		
		<h2>修改英雄</h2>
		
	</body>
</html>
