<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login form example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
      span.error {
        color: red;
      }
    </style>
</head>
<body>

<div class="container">
    <div class="col-md-8 offset-md-4">
        <h2>Login</h2>
        <p>Please, enter your credentials</p>
        <form method="POST" action="${pageContext.request.contextPath}/login">
            <div class="form-group">
                <label for="email">Username:</label>
                <input type="text" class="form-control w-25" id="email" placeholder="Enter username" name="email">
                <span class="error">${emailError}</span>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="text" class="form-control w-25" id="password" placeholder="Enter password" name="password">
                <span class="error">${passwordError}</span>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>
</div>

</body>
</html>

