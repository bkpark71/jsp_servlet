<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import="java.util.HashMap"
import="java.util.Map"
import="data.Member" %>
<html>
<body>
<%
  Map<String, Member> members = (HashMap)request.getAttribute("members");
%>
<h2>Hello World!</h2>
<table>
<tr><th>Id</th><th>Name</th></tr
<% for(Member member : members.values()) { %>
    <tr>
        <td><%= member.getId() %></td>
        <td><%= member.getName() %></td>
    </tr>
<% } %>
<div>
</div>
</body>
</html>
