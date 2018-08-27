<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<form action="../param/test6" method="post" >
		<table cellpadding="0" cellspacing="0">
			<tr>
				<td>序号</td>
				<td>商品</td>
				<td>单价</td>
				<td>数量</td>
			</tr>
			<tr>
				<td><input type="text" name="commodity[0].id" value="1"></td>
				<td><input type="text" name="commodity[0].name"></td>
				<td><input type="text" name="commodity[0].price"></td>
				<td><input type="text" name="commodity[0].amount"></td>
			</tr>
			<tr>
				<td><input type="text" name="commodity[1].id" value="2"></td>
				<td><input type="text" name="commodity[1].name"></td>
				<td><input type="text" name="commodity[1].price"></td>
				<td><input type="text" name="commodity[1].amount"></td>
			</tr>
			<tr>
				<td><input type="submit" value="购买" width="50px"></td>
			</tr>
		</table>
	</form>

</body>
</html>