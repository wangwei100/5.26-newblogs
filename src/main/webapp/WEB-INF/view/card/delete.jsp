<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
	<input id="txt_id" type="hidden" value="${card.id}" />
	<label>english<input type="text" value="${card.english}" /></label>
	<label>chinese</label>
	<input type="text" value="${card.chinese}" />
	<label for="txt_math">math</label>
	<input id="txt_math" type="text" value="${card.math}" />
	<input id="btn_deletes" type="button" value="Go" onclick="" />
</body>
<script type="text/javascript" src="/js/deletes.js"></script>
</html>