<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Hello World!</title>
    <meta name="viewport"
          content="width=device-width,user-scalable=no,maximum-scale=1.0,minimum-scale=1.0, initial-scale=1.0">
</head>
<body>
<h2>文件长传</h2>

<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data" >
    文件描述：<input name="desc" type="text"/>
    <input type="file" name="file">
    <input type="submit" value="上传">
</form>
</body>
</html>
