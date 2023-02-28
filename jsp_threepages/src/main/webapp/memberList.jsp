<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import="java.util.ArrayList"
import="java.util.List" %>
<html>
<body>
<%
  List<String> aaa = new ArrayList<>();
  aaa.add("A");
  String[] members= {"A", "B", "C", "D", "E", "F", "G", "H"};
%>
<h2>Hello World!</h2>
<table>
<tr><th>Name</th>
<% for(String member : aaa) { %>
    <tr><td><%= member %></td></tr>
<% } %>
<div>
</div>
</body>
</html>
