<%@ include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!--
    <title></title>
    -->
    <link type="text/css" href="<spring:url value='/css/first.css' />" rel="Stylessheet">
</head>
<body>
<div>
    <p>début du template</p>
    <div>
        <tiles:insertAttribute name = "main-content" />
    </div>
    <p>Fin du template</p>
</div>
</body>
</html>