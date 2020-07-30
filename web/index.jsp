<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/23
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>SpringMVC</title>
  </head>
  <body>
    <a href="index/hello">你好</a><br>
    <a href="index/error">错误</a><br>
    <a href="index/doSomething">do</a><br>
    <a href="index/helloPage">helloPage</a><br>
    <form action="index/updateBook">
      <label>书名：</label><input name="bookName" /><br>
      <label>作者：</label><input name="author" /><br>
      <label>价格：</label><input name="price" type="number"/><br>
      <label>库存：</label><input name="stock" type="number"/><br>
      <input type="submit" />
    </form>
    <a href="index/handlePlus">自定义解析器</a>
  </body>
</html>
