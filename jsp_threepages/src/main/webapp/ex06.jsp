<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<html>
<head><meta charset="UTF-8"/></head>
<title>JSP최종예제</title>
<body>
<%!
    String[] members = {"A", "B", "C", "D", "E", "F", "G"};
    int num2 = 10;
    int calc(int num1){
        return num1 + num2;
    };
%>
<h2>Hello World!</h2>
<h3><%=calc(10)%></h3>
<%@ include file="index.jsp" %>
<% for (String member : members) {  %>
<li><%=member%></li>
<% } %>
</body>
</html>
