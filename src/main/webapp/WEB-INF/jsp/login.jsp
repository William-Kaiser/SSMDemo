<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title></title>
</head>

<body>
<h1>登录页面</h1>
<form:form action="/login" commandName="user" method="post">
    用户名：<form:input path="userName"/>
    密码：<form:password path="password"/>
    <form:button name="button">提交</form:button>
</form:form>
</body>
</html>