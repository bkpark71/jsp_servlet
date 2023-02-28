<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<html>
<body>
<%
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    int res = 0;
    String op = request.getParameter("op");
    if (op.equals("+")) {
        res = num1 + num2;
      } else if (op.equals("-")) {
        res = num1 - num2;
      }
    String result = num1 + "" + op + "" + num2 + " = "+res;
%>
<h2>Hello World!</h2>
<div>
<p><%=result%></p>
</div>
</body>
</html>
