<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Categories</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script>
        function productAddedToShoppingCartMsg() {
            window.confirm("Продукт добавлен в корзину!");
        }

    </script>

</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<h2>${product.getName()}</h2>

<div class="container-fluid mb-4">
    <div class="card w-25 m-1" type="product">
        <div class="card-body">
            <h4 class="card-title">${product.getName()}</h4>
            <h4 class="card-title">${product.getDescription()}</h4>
            <h4 class="card-title">${product.getPrice()}</h4>
        </div>
    </div>
</div>
<a href="${contextPath}/cart/add?product_id=${product.getId()}">
    <button id="addProductToCart" type="submit" onclick="productAddedToShoppingCartMsg()">Купить</button>
</a>

<a href="${contextPath}/cart/open">
    <button id="cartRedirect" type="submit">Корзина</button>
</a>


</body>
</html>
