<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Главное меню</title>
</head>
<body>
<jsp:useBean id="messages" class="java.util.ArrayList" scope="request"/>

<table>
    <tbody>
    <tr>
        <th>ID</th>
        <th>От кого</th>
        <th>Кому</th>
        <th>Дата и время</th>
        <th>Тема</th>
        <th>Сообщение</th>
    </tr>
    <c:forEach items="${messages}" var="mess">
        <tr onclick="location.href='/login'">
            <td align="left">${mess.messId}</td>
            <td align="left">${mess.userFrom.login}</td>
            <td align="left">${mess.userTo.login}</td>
            <td align="center">${mess.date}</td>
            <td align="center">${mess.theme}</td>
            <td align="left">${mess.message}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<table>
    <tbody>
    <tr>
        <th>Друзья</th>
    </tr>
    <c:forEach items="${friends}" var="friend">
        <tr onclick="location.href='/login'">
            <td align="left">${friend.userFriend.login}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<%--<script LANGUAGE="JavaScript">--%>
    <%--<!----%>
    <%--function enter()--%>
    <%--{--%>
    <%--}--%>
    <%--function register()--%>
    <%--{--%>
    <%--}--%>
    <%--// -->--%>
<%--</script>--%>

</body>
</html>