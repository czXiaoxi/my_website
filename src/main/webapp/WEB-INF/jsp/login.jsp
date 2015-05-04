<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>迷你小网站</title>
</head>
<body>
<center>
<c:if test="${!empty error}">
    <font color="red"><c:out value="${error}"/></font>
</c:if>
<form action="<c:url value="/user/loginCheck"/>" method="post">
	<br>
	<br>
    <table>
		<tr>
			<td width="125" height="30" colspan="1"><strong>用户登入</strong></td>
		</tr>
		<tr>
 		  <td>
 		  	<div align="left">用户名：</div></td>
		  	<td width="279"><input type="text" name="userName">
		  	<a href="/user/register">没有注册？</a>
		  </td>
		<tr>
			<td><div align="left">密  码：</div></td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td colspan="3">
			<p align="center">
  <input type="submit" value="登陆">
  &nbsp;&nbsp;&nbsp;
  <input type="reset" value="重置">
			</td>
		</tr>
	</table>
</form>
</center>
</body>
</html>
