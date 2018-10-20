<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp"%>


<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome page</title>
    <link rel="stylesheet" href="<spring:url value='/css/first.css' />" type="text/css">
</head>
<body>

<h1>Welcome to our wonderful world! by samyD</h1>

<form:form id="loggin"
           method="post"
           action="/LaboSpring/hello/send"
           modelAttribute="magicKeyForm">
    <form:label path="magicKey">Magic Key</form:label>
    <form:input path="magicKey"/>
    <form:button>Send</form:button>
    <c:if test = "${not empty message}">${message}</c:if>
</form:form>



</body>
</html>