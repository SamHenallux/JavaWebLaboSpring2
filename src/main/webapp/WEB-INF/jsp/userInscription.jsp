<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp"%>


<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Inscription</title>
    <link rel="stylesheet" href="<spring:url value='/css/first.css' />" type="text/css">
</head>
<body>

<c:if test = "${not empty message}">${message}</c:if>
<p>The form return ${message}</p>


<form:form id="inscription"
           method="post"
           action="/LaboSpring/inscription/sendForm"
           modelAttribute="userForm">
    <form:label path="name">Name</form:label>
    <form:input path="name"/><br/>
    <form:errors path="name"/>
    <form:label path="age">Age</form:label>
    <form:input path="age"/><br/>
    <form:errors path="age"/><br/>
    <form:radiobutton path="male" value="true" label="boy" />
    <form:radiobutton path="male" value="false" label="female" />
    <form:errors path="male"/><br/>
    <form:select path="hobby">
        <form:options items="${hobbies}" itemValue="id" itemLabel="name"/>
    </form:select><br/>

    <form:button>Send</form:button>
    <c:if test = "${not empty message}">${message}</c:if>
</form:form>

</body>
</html>