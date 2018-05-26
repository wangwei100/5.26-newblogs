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
	<label>id</label>
	<input id="txt_id"type="text" value="${card.id}" />
	<label>chinese</label>
	<input id="txt_chinese" type="text" value="${card.chinese}" />
	<label>math</label>
	<input id="txt_math" type="text" value="${card.math}" />
	<label>english</label>
	<input id="txt_english" type="text" value="${card.english}" />
	<input id="btn_update" type="button" value="Go" />

</body>
<script type="text/javascript" src="/js/update.js"></script>
</html>