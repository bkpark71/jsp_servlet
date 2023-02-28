<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<html>
<head><meta charset="UTF-8"/></head>
<title>배열 출력</title>
<body>
<%
  String[] nameArr = (String[])request.getAttribute("nameArr");
  int seq = 1;
%>
<h2>배열 출력</h2>

<% for(String name : nameArr) { %>

<li><%= seq++ %> : <%= name%></li>

<% } %>


</body>
</html>
