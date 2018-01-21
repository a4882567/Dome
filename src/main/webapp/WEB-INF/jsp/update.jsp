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
	<form action="student/update" method="post">
	<input type="hidden" name="id"  value="${student.id }"/>
		<p>
			用户名：<input type="text" name="name" value="${student.name }"/>
		</p>
		<p>
			年龄：<input type="text" name="age" value="${student.age }"/>
		</p>
		<p>
			<input type="submit" value="修改"/>
		</p>
	</form>
</body>
</html>