<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px">
		<tr>
			<th>id</th>
			<th>chinese</th>
			<th>math</th>
			<th>english</th>
			<td>操作</td>
		</tr>
		<c:forEach items="${cardList}" var="card">
			<tr>
				<td><c:out value="${card.id}" /></td>
				<td><c:out value="${card.chinese}" /></td>
				<td><c:out value="${card.math}" /></td>
				<td><c:out value="${card.english}" /></td>
				<td><a href="/card/detail?id=${card.id}">detail</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
					href="/card/update?id=${card.id}">update</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
					href="/card/insert?id=${card.id}">insert</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
					href="/card/delete?id=${card.id}">delete</a></td>
			</tr>
		</c:forEach>


	</table>

</body>
</html>