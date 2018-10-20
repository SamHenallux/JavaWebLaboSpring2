<%@ include file="include/importTags.jsp"%>

<form:form id="inscription"
    method="post"
    action="/LaboSpring/form/userInscription"
    modelAttribute="userForm">
        <form:label path="magicKey">Magic Key</form:label>
        <form:input path="magicKey"/>
        <form:label path="zipCode">Zip Code</form:label>
        <form:input path="zipCode"/>
        <form:button>Submit</form:button>
        <c:if test = "${not empty message}">${message}</c:if>
</form:form>
