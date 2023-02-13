<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>

<html>

<head>
    <title>If Example</title>
</head>
<body>
<c:if test="${isVisible == true}">
    <p>Visible</p>
</c:if>
<c:if test="${isVisible == false}">
    <p>Invisible</p>
</c:if>
</body>
</html>
