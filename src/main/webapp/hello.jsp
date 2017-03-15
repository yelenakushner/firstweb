<%@ page import="lv.ctco.javaschool.User" %><%--
  Created by IntelliJ IDEA.
  User: yelena.krasnakova
  Date: 3/10/2017
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% User user = (User) session.getAttribute("user");%>
<h1>Hello, <%=user.getUserName()%> <%=user.getLastName()%>
</h1>
<h1>Phone number is, <%=user.getPhoneNumber()%>
</h1>

</body>
</html>
