<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ngcha
  Date: 21/11/2023
  Time: 08:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="${pageContext.request.contextPath}/login" method="post">
    <form:input path="username" id="username"/>
</form:form>

</body>
</html>
