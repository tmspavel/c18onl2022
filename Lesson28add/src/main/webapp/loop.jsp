<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>JSTL Loop Example</title>
    <meta charset="utf-8">
</head>
<body>
<div class="container-fluid">
    <ul>
        <c:forEach var="name" items="${requestScope.get('usersNames')}">
            <li><c:out value="${name}"/></li>
        </c:forEach>
    </ul>
</div>
</div>
</body>
</html>

