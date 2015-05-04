 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>迷你小网站</title>
    <style type="text/css">
<!--
.STYLE2 {font-size: 10px}
.STYLE3 {font-size: 36px; }
-->
    </style>
</head>
<body>
<center>
	
	<br>
	<br>
	<form action="dl-conf.jsp" method="post">
	<table width="404" height="193">
		<tr>
			<td width="109" height="30" colspan="1"><strong>用户登录</strong></td>
		</tr>
		<tr>
 		  <td>
 		  	<div align="left">用户名：</div></td>
		  	<td width="279"><input type="text" name="userName">
		  	<a href=""> 没有注册？ </a>
		  </td>
		<tr>
			<td><div align="left">密 码：</div></td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td colspan="3">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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