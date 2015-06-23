<%--
  Created by IntelliJ IDEA.
  User: Pxjw
  Date: 2015/5/27
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title>主页</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/main.css">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </head>
  <body>
    <header class="modal-header my-header">
      <h1>Miracle News Publish System</h1>
    </header>
    <!--
        内联式登录框

    <div id="con-login" class="modal fade" style="width: 400px">

      <form class="form-signin">
        <h2 class="form-signin-heading">欢迎登录</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me">记住密码
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form>

    </div> <!-- /container
    -->
    <div id="navbar" class="navbar-collapse collapse bg-info">
      <!--
      <ul class="nav navbar-nav">
        <li class="active"><a href="index.jsp">主页</a></li>
        <li><a href="catlog.jsp">新闻目录</a></li>
        <li><a href="classify.jsp">新闻分类</a></li>
        <li><a href="#">投稿</a></li>
        <li><a href="#">联系我</a></li>
      </ul>
      -->
      <ul class="nav navbar-nav navbar-right">
        <!--
          <li><a data-toggle="modal" href="#con-login">登录</a></li>
          -->
        <li><a href="login.jsp">登录</a></li>
        <li><a href="reg.jsp">注册</a></li>
      </ul>
    </div><!--/.nav-collapse -->



    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-4">
          <h2>国内新闻</h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div>
        <div class="col-md-4">
          <h2>国际新闻</h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div>
        <div class="col-md-4">
          <h2>本地新闻</h2>
          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div>
      </div>
    </div>

  </body>
</html>
