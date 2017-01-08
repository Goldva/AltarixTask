<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Форма регистрации</title>
</head>
<body>
<form:form method="post" action="addUser" commandName="user">

    <table>
        <tr>
            <td><form:label path="firstname">
                <spring:message code="label.firstname"/>
            </form:label></td>
            <td><form:input path="firstname"/></td>
        </tr>
        <tr>
            <td><form:label path="surname">
                <spring:message code="label.surname"/>
            </form:label></td>
            <td><form:input path="surname"/></td>
        </tr>
        <tr>
            <td><form:label path="middlename">
                <spring:message code="label.middlename"/>
            </form:label></td>
            <td><form:input path="middlename"/></td>
        </tr>
        <tr>
            <td><form:label path="email">
                <spring:message code="label.email"/>
            </form:label></td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td><form:label path="login">
                <spring:message code="label.login"/>
            </form:label></td>
            <td><form:input path="login"/></td>
        </tr>
        <tr>
            <td><form:label path="password">
                <spring:message code="label.password"/>
            </form:label></td>
            <td><form:input path="password"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="<spring:message code="label.addcontact"/>"/>
                <input type="button" value="<spring:message code="label.cancel"/>" ONCLICK="location.href='/login'"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>