<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/7
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>loginPage</title>
</head>
<body>
<h1><fmt:message key="welcomeInfo"/></h1>
<form action="">
    <fmt:message key="userName"/>：<input name="userName" /><br/>
    <fmt:message key="password"/>：<input name="password" type="password"/><br/>
    <input type="submit" value="<fmt:message key="loginBtn"/>">
</form>
<fmt:message key="language"/>:
<a href="?locale=zh_CN">中文</a>
<a href="?locale=en_US">English</a><br/>
<fmt:message key="nowLocale"/>:: ${pageContext.response.locale}
</body>
</html>
