<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Форма входа в систему</title>
</head>
<body>

<form name="form" action="<c:url value='/login' />" method="post" class="form-signin">
    <c:if test="${not empty error}">
        <font size="2" color="red"><b>Неправильный логин или пароль</b></font>
    </c:if>

    <table>
        <tr>
            <td align="right"><spring:message code="label.login"/></td>
            <td><input type="text" name="username" size="10"></td>
        </tr>
        <tr>
            <td align="right"><spring:message code="label.password"/></td>
            <td><input type="password" name="password" size="10"></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <input type="submit" value="Войти" />
                <input type="button" value="Регистрация" ONCLICK="register()"/>
            </td>
        </tr>
    </table>
    <input type="hidden" name="${_csrf.parameterName}"
           value="${_csrf.token}" />
</form>

<script LANGUAGE="JavaScript">
    <!--
    function enter()
    {
        location.href="/index"

    }
    function register()
    {
        location.href="/registration"
    }
    // -->
</script>

</body>
</html>