<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ex.*" %>
<% Employee emp = new Employee("0001", "森 雄大"); %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>練習２</title>
</head>
<body>
<% for(int i = 0; i < 10; i++){ %>
<% if(i % 3 == 0){ %>
<p style="color:red">
<% }else{ %>
<p>
<% } %>
IDは<%= emp.getId() %>、名前は<%= emp.getName() %>です。</p>
<% } %>
</body>
</html>