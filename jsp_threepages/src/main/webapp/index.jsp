<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<html>
<body>
<%
    Object value = request.getAttribute("aaa");
%>
<h2>Hello World! -- index.jsp </h2>
<h3>value: <%= value %></h3>
</body>
</html>
