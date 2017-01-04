<%@ page session="false" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<HTML>
<HEAD>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Форма входа в систему</title>
</HEAD>

<BODY>
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
            <tr>
                <td align="left">${mess.id}</td>
                <td align="left">${mess.fromWhomId}</td>
                <td align="left">${mess.toWhomId}</td>
                <td align="center">${mess.date}</td>
                <td align="center">${mess.theme}</td>
                <td align="left">${mess.message}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

<SCRIPT LANGUAGE="JavaScript">
    <!--
    function enter()
    {
    }
    function register()
    {
    }
    // -->
</SCRIPT>
</BODY>
</HTML>