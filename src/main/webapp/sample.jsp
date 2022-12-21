<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<%@ page import="java.util.Date,java.text.SimpleDateFormat" %>    
<<%@ page import="java.util.Calendar" %>    
<<%@ page import="java.util.Date" %>    
<%
//コード4-3 P122
//運勢をランダムで決定
String[] luckArray = { "超スッキリ", "スッキリ", "最悪" };
int index = (int) (Math.random() * 3);
String luck = luckArray[index];

int index2 = (int) (Math.random() * 3);
String luck2 = luckArray[index2];

int index3 = (int) (Math.random() * 3);
String luck3 = luckArray[index3];

// 実行日を取得
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
String today = sdf.format(date);

Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
calendar.add(Calendar.DATE, 1);

date = calendar.getTime();
String tomorrow = sdf.format(date);

calendar.add(Calendar.DATE, 1);
date = calendar.getTime();
String dayAfterTomorrow = sdf.format(date);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>すっきり占い!運試し！</title>
</head>
<body>
<p><%= today %>の運勢は「<%= luck %>」です</p>
<p><%= tomorrow %>の運勢は「<%= luck2 %>」です</p>
<p><%= dayAfterTomorrow %>の運勢は「<%= luck3 %>」です</p>
</body>
</html>