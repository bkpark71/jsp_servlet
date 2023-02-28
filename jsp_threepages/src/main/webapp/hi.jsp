<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" %>
<html>
<head><meta charset="UTF-8"/></head>
<title>인삿말 출력</title>
<body>
<%
  String name = (String)request.getAttribute("name");
%>

<h3>Hello, <%=name%></h3>

</body>
</html>
