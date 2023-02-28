<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import="data.Member"%>
<html>
<body>
<%
  Member member = (Member)request.getAttribute("member");
  Member member2 = (Member)request.getAttribute("members");
%>
<h2>Member 내용 출력</h2>
<p><%= member.getId() %></p>
<p><%= member.getName() %></p>
<div>
</div>
</body>
</html>
