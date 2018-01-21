<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="student/toadd">添加</a>
	<form action="student/show" method="post">
		<p>
			姓名:<input type="text" name="name"/>
			<input type="submit" value="查询"/>
		</p>
	</form>
	<table border="1" cellpadding="0" cellspacing="0" width="50%">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="stu">
			<tr>
				<td>${stu.id }</td>
				<td>${stu.name }</td>
				<td>${stu.age }</td>
				<td>
					<a href="student/toupdate/${stu.id }">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>