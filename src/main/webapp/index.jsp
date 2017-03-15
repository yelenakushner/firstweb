<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello, web</title>
</head>
<body>
<form method="post" action="/hello">
    <label for="userName">Enter your name: </label>
    <input id="userName" type="text" name="userName">

    <label for="lastName">Enter your last name: </label>
    <input id="lastName" type="text" name="lastName">

    <label for="phoneNumber">Enter your phone number: </label>
    <input id="phoneNumber" type="text" name="phoneNumber">

    <input type="submit" value="SEND!">
</form>
</body>
</html>
