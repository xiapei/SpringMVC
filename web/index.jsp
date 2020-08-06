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
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.3.1.min.js"></script>
  <body>
    <form action="index/hello" method="post">
      <input type="submit" value="你好呀" />
    </form>
    <a href="index/error">错误</a><br>
    <a id="doSomething">do</a><br>
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
  <script>
    $("#doSomething").click(function () {
      $.ajax({
        url:"index/doSomething",
        type:"GET",
        success: data => {
          console.log(data);
        }
      })
    })
  </script>
</html>
