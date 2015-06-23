<%--
  Created by IntelliJ IDEA.
  User: Pxjw
  Date: 2015/5/28
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reg.css">
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <form class="form-signup" action="regcheck.jsp" method="post">
            <h2>欢迎注册</h2>
            <label>用户名(Email)</label>
            <input type="text" name="uname" id="uname" class="form-control">
            <label>密码:</label>
            <input type="password" name="password" id="password" class="form-control">
            <button class="btn btn-lg btn-primary" type="submit">注册</button>
            <button class="btn btn-lg btn-primary" type="reset">重置</button>
        </form>
    </div>
</body>
</html>
