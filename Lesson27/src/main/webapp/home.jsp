<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Categories</title>
    <meta charset="utf-8">
    <%--Данная строка необходима для того, чтобы ширина устройства, на котором открывается страница,
    правильно сопостовлялась с шириной, указанной в CSS.
    Она гарантирует, что пиксели устройства правильно сопоставляются с пикселями CSS,
    позволяя элементам и шрифтам корректно масштабироваться на мобильных устройствах.
    Без нее не будет гарантии, что веб-сайт будет выглядеть одинаково на разных мобильных устройствах, с разной
    диагональю экрана.
    Атрибут initial-scale определяет начальный масштаб страницы при загрузке, значение 1.0 означает, что
    масштаб будет 100% --%>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:set var="categories" value="${sessionScope.get('categories')}"/>
<h2>Popular categories</h2>

<div class="container-fluid">
    <c:if test="${not empty categories}">
        <div class="row">
            <c:forEach items="${categories}" var="category">
                <%-- w-25 настройка определяет ширину карты (25% от ширины родительского элемента, т.е. строки)
                Больше информации вот здесь https://getbootstrap.com/docs/4.1/utilities/sizing/
                m-1 означает внешинй отступ (margin) со всех 4 сторон.
                Измеряется специальной переменной $spacer, значение по умолчанию у которой
                равно 1rem (16px в большинстве браузеров).
                1 = $spacer * .25 = 16 * 0.25 = 4px--%>
                <div class="card w-25 m-1" type="category">
                    <div class="card-body">
                        <a>${category.getName()}</a>
                        <img class="card-img" style="width:150px;height:120px"
                             src="${contextPath}/images/${category.getImageName()}" alt="Card image">

                    </div>
                </div>
            </c:forEach>
        </div>
    </c:if>
</div>
</div>
</body>
</html>

