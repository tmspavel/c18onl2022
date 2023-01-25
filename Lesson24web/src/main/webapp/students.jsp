<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <title>Таблица размеров обуви</title>
</head>
<body>
<table border="1">
    <caption>Таблица размеров обуви</caption>
    <tr>
        <th>Россия</th>
        <th>Великобритания</th>
        <th>Европа</th>
        <th>Длина ступни, см</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.param1}</td>
            <td>${user.param2}</td>
            <td>${user.param3}</td>
            <td>${user.param4}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>