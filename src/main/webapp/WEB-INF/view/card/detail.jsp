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
	<%-- name is ${name}
	<br /> age is ${age}
	<br />

	<c:forEach items="${list}" var="item">
		<c:out value="${item}"></c:out>
	</c:forEach> --%>

	<input type="hidden" value="${card.id}" />
	<label>english<input type="text" value="${card.english}" /></label>
	<label>chinese</label>
	<input type="text" value="${card.chinese}" />
	<label for="txt_math">math</label>
	<input id="txt_math" type="text" value="${card.math}" />
	<input type="button" value="Go" />

</body>
</html>