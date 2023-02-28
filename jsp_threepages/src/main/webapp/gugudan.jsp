<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<html>
<body>
<%
    int dan = (int)request.getAttribute("dan");
    int limit = (int)request.getAttribute("limit");
%>
<h2>구구단 출력</h2>

<% for(int i = 1; i <= limit ; i++) { %>

<li><%= dan%> * <%= i%> = <%= i*dan %></li>

<% } %>

</body>
</html>
