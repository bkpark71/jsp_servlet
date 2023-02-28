<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
<html>
<body>
<%
  String message = (String)request.getAttribute("err");
%>
<h2>Member 내용 출력</h2>
  <h2>회원가입</h2>
  <form action="/member" method="post">
    <p>아이디<input type="text" name="id"></p>
      <p>이름 <input type="text" name="name"></p>
      <p>암호1<input type="password" name="password1"></p>
      <p>암호2 <input type="password" name="password2"></p>
      <p><input type="submit"></p>
  </form>
  <p><%= message %></p>
<div>
</div>
</body>
</html>
