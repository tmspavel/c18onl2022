<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>JSTL in JSP</title>
</head>
<body>
<c:choose>
    <c:when test="${val == 1}">
        <p>Equals to 1</p>
    </c:when>
    <c:when test="${val == 2}">
        <p>Equals to 2</p>
    </c:when>
    <c:otherwise>
        <p>Undefined</p>
    </c:otherwise>
</c:choose>
</body>
</html>