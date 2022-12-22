<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録もどき5-3 P150</title>
</head>
<body>
<form action="/example/FormSampleServlet" method="post">
名前:<br>
<input type="text" name="name"><br>
<br><br>
性別：<br>
男<input type="radio" name="gender" value="0">
女<input type="radio" name="gender" value="1">
回答しない<input type="radio" name="gender" value="2">
<br><br>
出身地方：<br>
<select name="pref">
	<option value="">選択してください</option>
	<option value="北海道">北海道</option>
	<option value="東北">東北</option>
	<option value="関東">関東</option>
	<option value="中部">中部</option>
	<option value="近畿">近畿</option>
	<option value="中国">中国</option>
	<option value="四国">四国</option>
	<option value="九州">九州</option>
</select>
<br><br>
<input type="submit" value="送信">
</form>
</body>
</html>
